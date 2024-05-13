package data

data class Product(
    val id: Long,
    val name: String,
    val type: ProductType,
    val clasification: ProductClasification,
    val releasedDate: String,
    val category: String,
    val stars: Double,
    val price: Double,
    val logo: String,
    val author: String
){
    override fun toString(): String {
        return "id: $id\n" +
                "name: $name\n" +
                "type: $type\n" +
                "clasification: $clasification\n" +
                "releasedDate: $releasedDate\n" +
                "category: $category\n" +
                "stars: $stars\n" +
                "price: $price\n" +
                "author: $author\n"+
                "------------------------------------"
    }
}