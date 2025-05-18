package com.example.jetgym.Model

import android.icu.text.CaseMap.Title
import androidx.compose.ui.graphics.Path
import java.io.Serializable
import kotlin.time.Duration

data class Workout(
    val title: String,
    val description: String,
    val picPath: String,
    val kcal: Int,
    val duration: String,
    var lessions: List<Lession>
) : Serializable
