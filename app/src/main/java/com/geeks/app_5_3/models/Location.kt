package com.geeks.app_5_3.models


import com.google.gson.annotations.SerializedName


data class Location(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)