package com.example.wishlist

import android.widget.TextView

class WishlistFetcher {
    companion object {
        fun getWish(item: String, price: String, url: String): MutableList<Wishlist> {
            var wishlist : MutableList<Wishlist> = ArrayList()
            val list = Wishlist(item, price, url)
            wishlist.add(list)
            return wishlist
        }

        fun getNextWish(item: String, price: String, url: String): MutableList<Wishlist> {
            var newWishList : MutableList<Wishlist> = ArrayList()
            val wishes = Wishlist(item, price, url)
            newWishList.add(wishes)
            return newWishList
        }
    }
}