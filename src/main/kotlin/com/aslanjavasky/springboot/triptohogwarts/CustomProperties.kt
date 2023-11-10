package com.aslanjavasky.springboot.triptohogwarts

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "my")
data class CustomProperties(
    var studentName:String="Hermione Granger"
)
