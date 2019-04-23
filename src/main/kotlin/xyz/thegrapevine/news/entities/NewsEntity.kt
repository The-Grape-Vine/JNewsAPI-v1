package xyz.thegrapevine.news.entities

data class NewsEntity (
    val status: String,
    val totalResult: Int,
    val articles: List<ArticleEntity>
)

data class ArticleEntity(
    val source: ArticleSourceEntity,
    val author: String?,
    val title: String,
    val description: String?,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String?
)

data class ArticleSourceEntity(
    val id: String?,
    val name: String
)