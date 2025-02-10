package com.example.grab4.ui.dataclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Menu2(
    val photo: Int,
    val name: String,
    val description: String
) : Parcelable