package domain

import data.Product
import data.ProductClasification
import java.util.*

class PlatinumProductController (product: Product): AbstractProductController(product) {

    override fun calcularMontoDeCompra(): Double {
        var purchaseDay = Calendar.DAY_OF_WEEK
        if(purchaseDay == 6 || purchaseDay == 7){
            return this.price * 1.03
        }else{
            return this.price * 1.0075
        }
    }

}