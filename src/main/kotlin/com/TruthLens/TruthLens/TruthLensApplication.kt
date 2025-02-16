package com.TruthLens.TruthLens

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
@SpringBootApplication
@EntityScan(basePackages = ["com.TruthLens.TruthLens"]) // Specify the package where your entities are
class TruthLensApplication

fun main(args: Array<String>) {
	runApplication<TruthLensApplication>(*args)
}

