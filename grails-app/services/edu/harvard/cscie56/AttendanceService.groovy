package edu.harvard.cscie56

import java.util.Date;

import grails.transaction.Transactional

@Transactional
class AttendanceService {

    def saveAttendance(AttendanceCommand cmd) {
        //def serviceDate = new Date().parseToStringDate(sdate)
       // println serviceDate
		def attendanceInstance = new Attendance(service:cmd.service,serviceDate:cmd.serviceDate,memberNumber:cmd.memberNumber,guestNumber:cmd.guestNumber,
									childrenNumber:cmd.childrenNumber,adultsNumber:cmd.adultsNumber)
		attendanceInstance.save(flush:true)
                assert attendanceInstance !=null
        return attendanceInstance		
    }
	
	def updateAttendance(Attendance attendanceInstance,AttendanceCommand cmd){
            attendanceInstance.properties['service','serviceDate','memberNumber','guestNumber','childrenNumber','adultsNumber'] = cmd.properties
			attendanceInstance.save(flush:true)
		return attendanceInstance
	}

        
    def searchAttendance(AttendanceCommand cmd){
        def attendance = Attendance.findByServiceDate(cmd.serviceDate)
        return attendance
    }
    
     def getGuest(Long id){
         def attendanceInstance = Attendance.get(id)
         def guestInstance = Guest.createCriteria().listDistinct {
			 eq('attendance',attendanceInstance)
		 }
         
        return guestInstance
    }
}
