package com.zup.orange.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces


@Controller("hello")
class HelloWorldController {


    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String{
        return "Hello world com kotlin e micronaut"
    }
}