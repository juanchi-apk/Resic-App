package interfaces

interface SilverInterface {

    fun calcularMontoSilver(price: Double ,purchaseHour:Int, purchaseMinutes:Int): Double{
        if((purchaseHour in 15..21)||(purchaseHour == 22 && purchaseMinutes <=30)){
            return price * 1.01
        }else{
            return price * 1.03
        }
    }
}