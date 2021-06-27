package com.brianperin.imdb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ImdbApplication

fun main(args: Array<String>) {
	runApplication<ImdbApplication>(*args)
}
