package com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations

import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import java.util.logging.Logger

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
@Repository
class StudentDB {

    private val logger = Logger.getLogger(StudentDB::class.java.name)

    fun saveStudent() {
        logger.info("Student is saved in the database!")
    }
}