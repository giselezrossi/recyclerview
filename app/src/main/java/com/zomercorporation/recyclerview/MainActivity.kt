package com.zomercorporation.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.title = "aula"
        val recyclerView = note_list_recyclerview

//        recyclerView.adapter = NoteListAdapter(notes(), this)
//        val layoutManager = LinearLayout(this)
//        recyclerView.layoutManager = layoutManager
    }

    private fun notes(): List<Note> {
        return listOf(
            Note("\"Teste 1 \""),
            Note("\"Teste 2\""),
            Note("\"Teste 3\""),
            Note("\"Teste 4\""),
            Note("\"Teste 5\""),
            Note("\"Teste 6\""),
            Note("\"Teste 7\""),
            Note("\"Teste 8\""),
            Note("\"Teste 9\""),
            Note("\"Teste 10\""),
            Note("\"Teste 11\""),
            Note("\"Teste 12\""),
            Note("\"Teste 13\""))
    }
}
