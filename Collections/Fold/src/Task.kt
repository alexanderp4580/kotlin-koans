// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val arrayOfOrders: List<List<Product>> = customers.map { it.orders.flatMap { order -> order.products } }
    val firstCustomerProducts = arrayOfOrders.first().toSet()
    return arrayOfOrders.fold(firstCustomerProducts) { acc, e -> acc.intersect(e) }
}
