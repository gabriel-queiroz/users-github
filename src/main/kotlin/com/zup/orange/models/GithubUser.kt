package com.zup.orange.models

import io.micronaut.core.annotation.Introspected

@Introspected
data class GithubUser(val naome: String, val url: String)
