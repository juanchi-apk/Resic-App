package domain
import data.User
import repositories.UserRepository

class UserController private constructor (user:User){
    private var id: Long = user.id
    private var nickName:String = user.nickName
    private var shoppingCart:ShopCartController = ShopCartController()
    private var password: String= user.password
    private var name: String=user.name
    private var surname: String=user.surname
    private var money: Double=user.money
    private var createdDate: String =user.createdDate
    private var isLogged:Boolean = true

        fun getNickName():String{
            return this.nickName
        }
        fun getId():Long{
            return this.id
        }
        fun getShoppingCartInstance(): ShopCartController{
            return this.shoppingCart
        }
        companion object{
            private val userRepository:UserRepository = UserRepository
            private var instance:UserController? = null

            fun loginUser(nickName:String, password:String) : UserController ? {
                try {
                    val userData:User? = this.userRepository.login(nickName, password)
                    if(userData!=null){
                        instance = UserController(userData)
                    }
                }catch (e:Exception){
                    throw Exception("Usuario o contraseña incorrecta")
                }
                return instance
            }
        }

}