package pl.edu.pg.rsww.dummy_service

import org.springframework.context.annotation.Configuration
import org.springframework.boot.context.properties.ConfigurationProperties

@Configuration
@ConfigurationProperties(prefix = "app.queue")
public class QueueConfig {
    lateinit var base: String
    val requests get() = "${base}.requests"
}
