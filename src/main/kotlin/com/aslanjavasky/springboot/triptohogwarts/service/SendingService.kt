package com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations

import com.aslanjavasky.springboot.triptohogwarts.CustomProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */

@Service
class SendingService(
    @Autowired val tripToHogwarts:TripToHogwarts,
//    @Autowired val studentName:String,
    @Autowired val props:CustomProperties,
    @Autowired @Qualifier("SendingStudentToSchool") val sendable: Sendable,
    @Autowired val repo:StudentDB

) {

//    @Value("\${service.student_name}")
//    lateinit var studentName:String

    fun sendStudent(){
        sendable.sendStudent(props.studentName)
        repo.saveStudent()
    }
}