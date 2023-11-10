package com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import java.util.logging.Logger

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
@Component
@Qualifier("SendByTrain")
class SendingStudentByTrain : Sendable {

    private val logger= Logger.getLogger(SendingStudentByTrain::class.java.name)

    override fun sendStudent(studentName:String) {
        logger.info("$studentName sent to Hogwarts school by train")
    }
}