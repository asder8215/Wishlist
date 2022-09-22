package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishlistAdapter(private val wishlist: List<Wishlist>) : RecyclerView.Adapter<WishlistAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Your holder should contain a member variable for any view that will be set as you render
        // a row
        val item: TextView
        val price: TextView
        val url: TextView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            item = itemView.findViewById(R.id.itemDisplay)
            price = itemView.findViewById(R.id.priceDisplay)
            url = itemView.findViewById(R.id.urlDisplay)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val wishView = inflater.inflate(R.layout.wishlist_items, parent, false)
        // Return a new holder instance
        return ViewHolder(wishView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val wishlist = wishlist.get(position)
        // Set item views based on views and data model
        holder.item.text = wishlist.item
        holder.price.text = wishlist.price
        holder.url.text = wishlist.url
    }

    override fun getItemCount(): Int {
        return wishlist.size
    }
}