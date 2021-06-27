package com.brianperin.imdb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaAuditing
@ServletComponentScan
class ImdbApplication

fun main(args: Array<String>) {
	runApplication<ImdbApplication>(*args)
}
