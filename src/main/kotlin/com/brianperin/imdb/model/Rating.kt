package com.brianperin.imdb.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Rating(
    @JsonProperty("Source")
    val source: String,
    @JsonProperty("Value")
    val value: String
)