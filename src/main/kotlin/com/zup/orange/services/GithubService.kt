package com.zup.orange.services

import com.zup.orange.configs.GithubConfiguration
import com.zup.orange.models.GithubUser
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.uri.UriBuilder
import jakarta.inject.Singleton
import java.net.URI


@Singleton
class GithubService(@param: Client(GithubConfiguration.PREFIX) private val httpClient: HttpClient, configuration: GithubConfiguration){

  private val uri: URI = UriBuilder.of("users").path(configuration.organization).build()

  fun getUser(): Any{
    val req: HttpRequest<*> = HttpRequest.GET<Any>(uri)
    return httpClient.retrieve(req, Argument.listOf(GithubUser::class.java))
  }

}
