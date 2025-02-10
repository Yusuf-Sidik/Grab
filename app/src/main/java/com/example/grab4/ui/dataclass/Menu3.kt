package com.example.grab4.ui.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Menu3(
    val photo: Int,
    val name: String,
    val diskon: String,
    val description: String
) : Parcelable
