package com.zup.orange

import io.micronaut.runtime.Micronaut.*


fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.orange.foundation.jvm", "com.zup.orange")
		.start()
}

