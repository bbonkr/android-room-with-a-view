package kr.bbon.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "word")
    val word: String
    )
//{
//    @PrimaryKey(autoGenerate = true)
//    val id: Int
//}