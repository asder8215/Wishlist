package com.example.wishlist

class WishlistFetcher {
    companion object {
        //creates an intial empty mutable list of wishlists
        fun createEmptyWishList(): MutableList<Wishlist> {
            var wishlist : MutableList<Wishlist> = ArrayList()
            return wishlist
        }
        // records the new wish based on inputs provided
        fun getNextWish(item: String, price: String, url: String): MutableList<Wishlist> {
            var newWishList : MutableList<Wishlist> = ArrayList()
            val wishes = Wishlist(item, price, url)
            newWishList.add(wishes)
            return newWishList
        }
    }
}