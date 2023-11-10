package com.aslanjavasky.springboot.triptohogwarts.service

import com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations.Sendable
import com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations.SendingStudentByTrain
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import java.util.logging.Logger

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
@Component("SendingStudentToSchool")
@Profile("Durmstrang")
@ConditionalOnProperty(value=["my.studentName"], havingValue = "Ron Weasley")//, matchIfMissing = true)
class SendingStudentToDurmstrang : Sendable {

    private val logger= Logger.getLogger(SendingStudentByTrain::class.java.name)

    override fun sendStudent(studentName:String) {
        logger.info("$studentName sent to Durmstrang school by train")
    }
}