package com.zomercorporation.recyclerview


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import kotlinx.android.synthetic.main.note_item.view.*

class NoteListAdapter(private val notes: List<Note>,
                      private val context: Context) : Adapter<NoteListAdapter.ViewHolder>() {

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val note = notes[p1]
        p0.let {
            it.title.text = note.title
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.note_item, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.note_item_title
        fun bindView(note: Note) {
            val title = itemView.note_item_title
            title.text = note.title
        }
    }

}