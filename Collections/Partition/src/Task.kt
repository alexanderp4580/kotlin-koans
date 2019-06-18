// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
            val (delivered, notDelivered) = it.orders.partition { order -> order.isDelivered }
            notDelivered.size > delivered.size
        }.toSet()
