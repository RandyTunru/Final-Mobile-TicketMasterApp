package com.example.final_mobile.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.serialization.Serializable

@Serializable
data class Url(
    val url: String
) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString() ?: "")

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Url> {
        override fun createFromParcel(parcel: Parcel): Url {
            return Url(parcel)
        }

        override fun newArray(size: Int): Array<Url?> {
            return arrayOfNulls(size)
        }
    }
}
