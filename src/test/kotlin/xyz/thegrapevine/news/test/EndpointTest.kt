package xyz.thegrapevine.news.test

import io.kotlintest.matchers.types.shouldNotBeNull
import io.kotlintest.specs.StringSpec
import xyz.thegrapevine.news.NewsClientBuilder

class EndpointTest : StringSpec({
    val _client = NewsClientBuilder("bb554838724b452fb14adf8661be7646").build()

    "first top headline article about bitcoin should not be null" {
        val tH = _client.getTopHeadlines("bitcoin")

        tH.articles[0].shouldNotBeNull()
    }

    "first source ID should not be null" {
        val lS = _client.getSources()

        lS.sources[0].id.shouldNotBeNull()
    }

    "first \"everything\" article about android should not be null" {
        val ev = _client.getEverything("android")

        ev.articles[0].shouldNotBeNull()
    }

})