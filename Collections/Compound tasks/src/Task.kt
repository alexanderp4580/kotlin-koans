// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? =
        orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }


// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.flatMap { it.getOrderedProducts() }.filter { it == product }.count()
}

fun Customer.getOrderedProducts(): List<Product> {
    return orders.flatMap { it.products }
}
