package domain
import data.Purchase
import data.Product
import repositories.ProductRepository
import repositories.PurchaseRepository
import java.util.*

class StoreController( user:UserController) {
    private val productList : ProductRepository = ProductRepository
    private val purchaseList : PurchaseRepository = PurchaseRepository
    private val user: UserController = user

    fun listAllProducts():Unit {
        for(product in productList.get()){
         println(product);
        }
    }
    fun seeShoppingCart(): Unit {
        if(user.getShoppingCartInstance().getCartSize()>0){
            user.getShoppingCartInstance().listCartItems()
        }else(println("El carrito está vacio"))
    }
    fun addProductToCart(){
        println("Ingrese el id del producto que quiere comprar:")
        var productId:Long = readln().toLong();
        user.getShoppingCartInstance().addToCart(productList.getById(productId));
        println("Producto Agregado Correctamente!!")
    }
    fun dropCart(){
        user.getShoppingCartInstance().clearCart()
    }
    fun dropProductFromCart(){
        println("Inserte el Id del producto a Eliminar:\n")
        var productId:Long = readln().toLong();
        user.getShoppingCartInstance().removeFromCart(productList.getById(productId));
        println("Producto Eliminado Correctamente!!")
    }
    fun confirmPurchase(){
        val cartProductsList:List<Product> =  user.getShoppingCartInstance().confirmAllProducts();
        val c:Calendar = Calendar.getInstance()
        for(cartProduct in cartProductsList){
            val productActions:ProductController = ProductController(cartProduct);
            val id : Long = purchaseList.getNewId()
            val userId: Long = this.user.getId()
            val productId: Long = cartProduct.id
            val amount: Double = productActions.calcularMontoDeCompra()
            val createdDate: String = "${c.get(Calendar.YEAR)}/${c.get(Calendar.MONTH)}/${c.get(Calendar.DAY_OF_MONTH)}"
            purchaseList.add(Purchase(id, userId, productId, amount, createdDate))
        }
        this.dropCart()
    }
    fun listAllUserPurchases(): Unit{
        for(purchasesData in purchaseList.get()){
            if(purchasesData.userId == user.getId()){
                println(purchasesData)
            }
        }
    }

}