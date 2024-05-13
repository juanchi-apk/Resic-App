package domain

import data.Product


class GoldProductController (product: Product): AbstractProductController(product) {

    override fun calcularMontoDeCompra(): Double {
        return this.price * 1.02
    }
}