package domain

import data.Product

class ShopCartController {
    private val cartList = mutableListOf<Product>();

    fun addToCart(product:Product):Unit{
        cartList.add(product);
    }
    fun listCartItems():Unit{
        for(cartProduct in cartList){
            println(cartProduct);
        }
    }
    fun getCartSize():Int{
        return cartList.size
    }
    fun clearCart():Unit{
        cartList.removeAll(cartList);
    }
    fun removeFromCart(product:Product):Unit{
        cartList.remove(product)
    }
    fun confirmAllProducts():List<Product>{
        return this.cartList
    }
}