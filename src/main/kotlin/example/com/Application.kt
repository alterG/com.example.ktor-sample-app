package example.com

import example.com.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    //io.ktor.server.netty.EngineMain.main(args)
    embeddedServer(
        Netty,
        port = 8092,
        host= "0.0.0.0",
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureRouting()
}
