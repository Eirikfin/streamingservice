package demo.src.main.kotlin.com.example.api.models

data class Show(
     val title: String,
    val dir_path: String,
    val episodes: List<Episode> = emptyList()
)

