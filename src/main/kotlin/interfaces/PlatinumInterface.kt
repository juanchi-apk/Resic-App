package interfaces

interface PlatinumInterface {
    fun calcularMontoPlatinum(price: Double, purchaseDay:Int): Double{
        if(purchaseDay == 6 || purchaseDay == 7){
            return price * 1.03
        }else{
            return price * 1.0075
        }
        return 0.0
    }
}