package com.example.grab4.ui.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pembayaran2(
    val photo: Int,
    val name: String,
    val description: String
) : Parcelable
