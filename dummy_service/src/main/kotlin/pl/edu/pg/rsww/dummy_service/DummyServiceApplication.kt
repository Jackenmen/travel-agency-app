package pl.edu.pg.rsww.dummy_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class DummyServiceApplication

fun main(args: Array<String>) {
	runApplication<DummyServiceApplication>(*args)
}
