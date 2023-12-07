package secure.app

class Product {

    String name
    Double price

    static constraints = {
        name blank: false
        price:0.00.. 1000.00
    }
}
