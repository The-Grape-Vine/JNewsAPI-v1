package xyz.thegrapevine.news.entities

/**
 * The entity providing source data.
 *
 * @param status API/endpoint status
 * @param sources A list of source data
 * @see SourceObject
 */
data class SourceEntity(
    val status: String,
    val sources: List<SourceObject>
)

/**
 * Object of each source.
 *
 * @param id Identifier of the source
 * @param name Name of the source
 * @param description Short description of the source
 * @param url Direct link to the source's website
 * @param category The main category that the source does
 * @param language Language the source uses
 * @param country The source's country of origin
 */

data class SourceObject(
    val id: String,
    val name: String,
    val description: String,
    val url: String,
    val category: String,
    val language: String,
    val country: String
)