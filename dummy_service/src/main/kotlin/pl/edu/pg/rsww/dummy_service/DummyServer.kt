package pl.edu.pg.rsww.dummy_service

import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.amqp.rabbit.annotation.Queue
import org.springframework.beans.factory.annotation.Value


public class DummyServer {
    @RabbitListener(queuesToDeclare = [Queue("#{queueConfig.requests}")])
    fun requestHandler(request: String): String {
        val request = Json.decodeFromString<RequestMessage>(request)
        val resp = ResponseMessage(200, emptyMap(), "Hello, World!")
        val rawResp = Json.encodeToString(resp)
        return rawResp
    }
}
