package com.example.grab4.ui.dataclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Menu1(
    val photo:Int,
    val name: String
): Parcelable