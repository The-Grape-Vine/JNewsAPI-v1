package xyz.thegrapevine.news.entities

/**
 * The main object for articles.
 *
 * @param status The API/endpoint status
 * @param totalResult Amount of results aggregated
 * @param articles A list of article objects.
 * @see ArticleEntity
 */
data class NewsEntity (
    val status: String,
    val totalResult: Int,
    val articles: List<ArticleEntity>
)

/**
 * The entity for the articles.
 *
 * @param source Data about the source
 * @param author Name of the author
 * @param title Title of the article
 * @param description Short description of the article
 * @param url Direct link to the article
 * @param urlToImage Direct link to the article's image
 * @param publishedAt IS0-8601 formatted date on when it was published
 * @param content The content of the article
 *
 * @see ArticleSourceEntity
 */
data class ArticleEntity(
    val source: ArticleSourceEntity,
    val author: String?,
    val title: String,
    val description: String?,
    val url: String,
    val urlToImage: String?,
    val publishedAt: String,
    val content: String?
)

/**
 * Data about the article's source
 * @param id Identifier of the source
 * @param name Name of the source
 */

data class ArticleSourceEntity(
    val id: String?,
    val name: String
)