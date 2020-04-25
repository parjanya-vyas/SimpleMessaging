package com.parjanya.permissionsplusplus.example.simplemessaging.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "message_table")
data class Message(@PrimaryKey(autoGenerate = true) val messageId: Int = 0, val sender: String, val date: Long, val body: String) : Parcelable