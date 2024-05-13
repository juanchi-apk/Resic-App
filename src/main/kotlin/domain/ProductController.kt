package domain

import data.ProductClasification
import data.ProductType
import data.Product


import interfaces.BronzeInterface
import interfaces.GoldInterface
import interfaces.PlatinumInterface
import interfaces.SilverInterface
import java.util.*

class ProductController(product: Product): BronzeInterface, GoldInterface,PlatinumInterface, SilverInterface {
    private var id: Long = product.id
    private var name: String = product.name
    private var type:ProductType = product.type
    private var clasification:ProductClasification = product.clasification
    private var releasedDate: String = product.releasedDate
    private var category: String = product.category
    private var stars: Double= product.stars
    private var price: Double =product.price
    private var logo: String =product.logo
    private var author: String = product.author;
    private var purchaseHour = Calendar.HOUR_OF_DAY;
    private var purchaseMinutes = Calendar.MINUTE;
    private var purchaseDay = Calendar.DAY_OF_WEEK

    fun calcularMontoDeCompra():Double{
        when (clasification){
            ProductClasification.GOLD -> return calcularMontoGold(this.price)
            ProductClasification.BRONZE -> return calcularMontoBronze(this.price)
            ProductClasification.SILVER -> return calcularMontoSilver(this.price, this.purchaseHour, this.purchaseMinutes)
            ProductClasification.PLATINUM ->return calcularMontoPlatinum(this.price, this.purchaseDay)
        }
    }
}