package com.example.penyewaan_papan_surfing
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SurfboardAdapter(private val surfboardList: List<Surfboard>) : RecyclerView.Adapter<SurfboardAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val brandTextView: TextView = view.findViewById(R.id.brandTextView)
        val modelTextView: TextView = view.findViewById(R.id.modelTextView)
        val descriptionTextView: TextView = view.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_surfboard, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val surfboard = surfboardList[position]
        holder.brandTextView.text = surfboard.brand
        holder.modelTextView.text = surfboard.model
        holder.descriptionTextView.text = surfboard.description
    }

    override fun getItemCount(): Int = surfboardList.size
}





