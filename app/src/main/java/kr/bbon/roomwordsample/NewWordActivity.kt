package kr.bbon.roomwordsample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText

class NewWordActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editWordView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        editWordView = findViewById(R.id.edit_word)

        val saveButton: Button = findViewById(R.id.button_save)
        saveButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
             R.id.button_save -> {
                 var replyIntent = Intent()
                 if(TextUtils.isEmpty(editWordView.text)) {
                    setResult(Activity.RESULT_CANCELED, replyIntent)
                 }else{
                     val word = editWordView.text.toString()
                     replyIntent.putExtra(EXTRA_REPLY, word)
                     setResult(Activity.RESULT_OK, replyIntent)
                 }
                 finish()
             }
        }
    }

    companion object{
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }

}