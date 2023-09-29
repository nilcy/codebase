package mvp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication class MvpApplication

fun main(args: Array<String>) {
    runApplication<MvpApplication>(*args)
}
