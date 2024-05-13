package domain
import data.Product

class BronzeProductController (product: Product): AbstractProductController(product) {

    override fun calcularMontoDeCompra(): Double {
        return this.price
    }
}