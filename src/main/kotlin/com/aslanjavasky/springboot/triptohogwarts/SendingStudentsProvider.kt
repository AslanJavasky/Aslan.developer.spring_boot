package com.aslanjavasky.springboot.triptohogwarts

import com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations.SendingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
@Component
class SendingStudentsProvider(
    @Autowired
    private val service:SendingService
) : CommandLineRunner{


    override fun run(vararg args: String?) {
        service.sendStudent()
    }

}

