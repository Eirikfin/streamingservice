package demo.src.main.kotlin.com.example.api.models

data class Episodes(
    val id: Int,
    val title: String,
    val seasonNumber: Int,
    val episodeNumber: Int,
    val filePath: String
)