package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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