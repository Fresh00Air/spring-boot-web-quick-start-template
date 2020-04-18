package top.fresh00air.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class ExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(ExampleApplication::class.java, *args)
}

