package com.brianperin.imdb.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Movie(
    @JsonProperty("Actors")
    val actors: String,
    @JsonProperty("Awards")
    val awards: String,
    @JsonProperty("BoxOffice")
    val boxOffice: String,
    @JsonProperty("Country")
    val country: String,
    @JsonProperty("DVD")
    val dVD: String,
    @JsonProperty("Director")
    val director: String,
    @JsonProperty("Genre")
    val genre: String,
    @JsonProperty("imdbID")
    val imdbID: String,
    @JsonProperty("imdbRating")
    val imdbRating: String,
    @JsonProperty("imdbVotes")
    val imdbVotes: String,
    @JsonProperty("Language")
    val language: String,
    @JsonProperty("Metascore")
    val metascore: String,
    @JsonProperty("Plot")
    val plot: String,
    @JsonProperty("Poster")
    val poster: String,
    @JsonProperty("Production")
    val production: String,
    @JsonProperty("Rated")
    val rated: String,
    @JsonProperty("Ratings")
    val ratings: List<Rating>,
    @JsonProperty("Released")
    val released: String,
    @JsonProperty("Response")
    val response: String,
    @JsonProperty("Runtime")
    val runtime: String,
    @JsonProperty("Title")
    val title: String,
    @JsonProperty("Type")
    val type: String,
    @JsonProperty("Website")
    val website: String,
    @JsonProperty("Writer")
    val writer: String,
    @JsonProperty("Year")
    val year: String
)