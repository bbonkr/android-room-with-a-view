package kr.bbon.roomwordsample

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface WordDao {
    @Query("select * from word_table order by word asc")
    fun getAlphabetizedWords(): Flow<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("delete from word_table")
    suspend fun deleteAll()
}