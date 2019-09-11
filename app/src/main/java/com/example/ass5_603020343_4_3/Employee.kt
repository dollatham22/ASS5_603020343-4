package com.example.ass5_603020343_4_3

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee (val name: String, val gender: String, val mail: String, val salary: Int): Parcelable {
}