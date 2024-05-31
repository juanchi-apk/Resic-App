import domain.UserController
import repositories.UserRepository.login
import data.User
import domain.StoreController

fun main(args: Array<String>) {

    println("Prueba de que un usuario registrado se puede loguear\n\n")
    val storeUser:UserController = launchLogin()
    val storeInstance = StoreController(storeUser)
    var optionSelected : Int
    do {
        println("---- Menú ----")
        println("1. Mostrar Productos")
        println("2. Agregar al Carrito")
        println("3. Mostrar Carrito De Compras")
        println("4. Vaciar Carrito De Compras")
        println("5. Eliminar Producto Del Carrito De Compras")
        println("6. Confirmar Compra")
        println("7. Mis Compras")
        println("8.  Salir")
        print("Ingrese su opción: ")

        optionSelected = readln().toIntOrNull()?:0

        when(optionSelected){
            1 -> storeInstance.listAllProducts()
            2 -> storeInstance.addProductToCart()
            3 -> storeInstance.seeShoppingCart()
            4 -> storeInstance.dropCart()
            5 -> storeInstance.dropProductFromCart()
            6 -> storeInstance.confirmPurchase()
            7 -> storeInstance.listAllUserPurchases()
            8 -> break
        }

    } while (true)



}



