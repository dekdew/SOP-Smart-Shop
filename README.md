# Brownies Smart Shop
Smart Shop project for Spring Boot


## ⚙️ Service

### ⭐ View all menu

    http://localhost:8080/menus

Responses:

    [
	    {
		    "name": "Set A",
		    "details": "A swirl brownies set include Tahini swirl, Condensed milk and Jam.",
		    "brownies": [{"id": 1,"topping": "Tahini swirl"},{"id": 2,"topping": "Condensed milk"},{"id": 3,"topping": "Jam"}],
		    "price": 89
	    },
	    ...
	    {
		    "name": "Set E",
		    "details": "A 12 brownies set include all topping.",
		    "brownies": [{"id": 1,"topping": "Tahini swirl"},{"id": 2,"topping": "Condensed milk"},{"id": 3,"topping": "Jam"},{"id": 4,"topping": "Peppermint patties"},{"id": 5,"topping": "Ritz crackers"},{"id": 6,"topping": "Oreos"},{"id": 7,"topping": "Chocolate streusel"},{"id": 8,"topping": "Peanut butter cookie dough"},{"id": 9,"topping": "Black bottom"},{"id": 10,"topping": "Salted caramel"},{"id": 11,"topping": "Matcha glaze"},{"id": 12,"topping": "Nutella fudge"}],
		    "price": 349}
    ]

### ⭐ View menu by ID

    http://localhost:8080/menu/{id}

Example:

    http://localhost:8080/menu/1

Responses:

    {
	    "name": "Set B",
	    "details": "A sprinkle brownies set include Peppermint patties, Ritz crackers and Oreos.",
	    "brownies": [{"id": 4,"topping": "Peppermint patties"},{"id": 5,"topping": "Ritz crackers"},{"id": 6,"topping": "Oreos"}],
	    "price": 89
    }

### ⭐ Add menu to cart

    http://localhost:8080/menu/{id}/add

Example:

    http://localhost:8080/menu/2/add

Responses:

    "Set C" has been added to the cart.

### ⭐ View cart

    http://localhost:8080/cart

Responses:

    Total number of items in cart is 2 ("Set B", "Set C", ) Total: 178.00

### ⭐ Cart checkout

    http://localhost:8080/checkout

Responses:

    Order has been received. Total price is 178.0


## 👨‍💻 Author
|![](https://avatars3.githubusercontent.com/u/32861458?s=150&v=4)|
|:-:|
|60070073|
|Passawit Riewthong|
|[@dekdew](https://github.com/dekdew)|

---
06016325 SERVICE-ORIENTED PROGRAMMING

Faculty of Information Technology

King Mongkut's Institute of Technology Ladkrabang
