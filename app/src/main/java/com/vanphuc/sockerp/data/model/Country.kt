package com.vanphuc.sockerp.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Country(
    @Json(name = "country_id") val countryId: String,
    @Json(name = "country_logo") val countryLogo: String,
    @Json(name = "country_name") val countryName: String
) : Parcelable
