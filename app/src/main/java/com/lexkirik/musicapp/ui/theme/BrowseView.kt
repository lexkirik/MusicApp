package com.lexkirik.musicapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import com.lexkirik.musicapp.R

@Composable
fun BrowseView(){
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")

    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories) {cat->
            BrowserItem(category = cat, drawable = R.drawable.baseline_apps_24)

        }
    }
}