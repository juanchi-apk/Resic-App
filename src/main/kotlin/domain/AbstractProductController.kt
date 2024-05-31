package domain

import data.Product
import data.ProductType
import java.util.*

abstract class AbstractProductController (product:Product) {

    private var id: Long = product.id
    private var name: String = product.name
    private var type: ProductType = product.type
    private var releasedDate: String = product.releasedDate
    private var category: String = product.category
    private var stars: Double= product.stars
    protected var price: Double =product.price
    private var logo: String =product.logo
    private var author: String = product.author;


    abstract fun calcularMontoDeCompra():Double
}