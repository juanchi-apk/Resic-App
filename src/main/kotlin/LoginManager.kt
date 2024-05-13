import domain.UserController

fun launchLogin(): UserController {
    var loggedUser : UserController? = null

    println("---- Login ----")
    do {
        println("Ingrese su nombre de usuario")
        var nickName:String = readln()
        println("Ingrese su contraseña")
        var password:String = readln()

        loggedUser = UserController.loginUser(nickName,password);

        if (loggedUser != null) {
            println("¡Inicio de sesión exitoso! Bienvenido, ${loggedUser.getNickName()}")
            return loggedUser
        } else {
            println("Nombre de usuario o contraseña incorrectos. Inténtelo de nuevo.")
            println("----     ----")
        }

    } while (loggedUser==null)
    return loggedUser;
}