package com.example.wishlist

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var wishlist: List<Wishlist>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val wishlistRv = findViewById<RecyclerView>(R.id.wishlistRv)
        //gets id for buttons and inputs
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        val itemInput = findViewById<TextInputEditText>(R.id.itemInput)
        val priceInput = findViewById<TextInputEditText>(R.id.priceInput)
        val urlInput = findViewById<TextInputEditText>(R.id.urlInput)

        // Creates an empty wishlist
        wishlist = WishlistFetcher.createEmptyWishList()
        // Create adapter passing in the list of wishlists
        val adapter = WishlistAdapter(wishlist)
        // Attach the adapter to the RecyclerView to populate items
        wishlistRv.adapter = adapter
        // Set layout manager to position the items
        wishlistRv.layoutManager = LinearLayoutManager(this)

        //clicking the submit button will either give you a message to complete
        //all input fields or will add the inputs the user provides, updating the adapter
        submitBtn.setOnClickListener{
            if(itemInput.text.toString().isEmpty() || priceInput.text.toString().isEmpty()
                || urlInput.text.toString().isEmpty()){
                Toast.makeText(this, "Please do not leave any inputs empty",
                    Toast.LENGTH_LONG).show()
            }
            else{
                val wish = WishlistFetcher.getNextWish(itemInput.text.toString(), priceInput.text.toString(),
                    urlInput.text.toString())
                (wishlist as MutableList<Wishlist>).addAll(wish)
                adapter.notifyDataSetChanged()
            }
        }
    }
}