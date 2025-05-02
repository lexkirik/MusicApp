package com.lexkirik.musicapp

import androidx.annotation.DrawableRes

data class DummyData(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<DummyData>(
    DummyData(R.drawable.baseline_apps_24, "aaaa"),
    DummyData(R.drawable.baseline_queue_music_24, "ssss"),
    DummyData(R.drawable.baseline_library_music_24, "xxxx"),
    DummyData(R.drawable.baseline_person_add_alt_1_24, "nnnn"),
)
