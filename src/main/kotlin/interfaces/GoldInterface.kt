package interfaces

interface GoldInterface {
    fun calcularMontoGold(price: Double): Double{
        return price * 1.02
    }
}