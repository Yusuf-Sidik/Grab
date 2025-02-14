package com.example.grab4.ui.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pembayaran1(
    val aktifkan: String,
    val nama: String
) : Parcelable
