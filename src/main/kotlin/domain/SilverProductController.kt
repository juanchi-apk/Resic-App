package domain

import data.Product
import data.ProductClasification
import java.util.*

class SilverProductController (product: Product): AbstractProductController(product) {

    override fun calcularMontoDeCompra(): Double {
        var purchaseHour = Calendar.HOUR_OF_DAY;
        var purchaseMinutes = Calendar.MINUTE;

        if( (purchaseHour in 15..21) || (purchaseHour == 22 && purchaseMinutes <=30)){
            return this.price * 1.01
        }else{
            return this.price * 1.03
        }
    }


}