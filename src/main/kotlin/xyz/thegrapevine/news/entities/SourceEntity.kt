package xyz.thegrapevine.news.entities

data class SourceEntity(
    val status: String,
    val sources: List<SourceObject>
)

data class SourceObject(
    val id: String,
    val name: String,
    val description: String,
    val url: String,
    val category: String,
    val language: String,
    val country: String
)