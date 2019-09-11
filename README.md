# Brownies Smart Shop
Brownies Smart Shop project for Spring Boot

## 🌱 Usage

### ⭐ View all menu
URL : `/menus`

Method : `GET`

**Response**

Code : `200`

Example response :

```json
[
	{
		"name": "Set A",
		"details": "A swirl brownies set include Tahini swirl, Condensed milk and Jam.",
		"brownies": [
			{ "id": 1, "topping": "Tahini swirl" },
			{ "id": 2, "topping": "Condensed milk" },
			{ "id": 3, "topping": "Jam" }
		],
		"price": 89.0
	},
	...
	{
		"name": "Set E",
		"details": "A 12 brownies set include all topping.",
		"brownies": [
			{ "id": 1, "topping": "Tahini swirl" },
			{ "id": 2, "topping": "Condensed milk" },
			{ "id": 3, "topping": "Jam" },
			{ "id": 4, "topping": "Peppermint patties" },
			{ "id": 5, "topping": "Ritz crackers" },
			{ "id": 6, "topping": "Oreos" },
			{ "id": 7, "topping": "Chocolate streusel" },
			{ "id": 8, "topping": "Peanut butter cookie dough" },
			{ "id": 9, "topping": "Black bottom" },
			{ "id": 10, "topping": "Salted caramel" },
			{ "id": 11, "topping": "Matcha glaze" },
			{ "id": 12, "topping": "Nutella fudge" }
		],
		"price": 349.0
	}
]
```

### ⭐ View menu by ID
URL : `/menus/{id}`

Method : `GET`

**Response**

Code : `200`

Example response :

```json
{
	"name": "Set B",
	"details": "A sprinkle brownies set include Peppermint patties, Ritz crackers and Oreos.",
	"brownies": [
		{ "id": 4,"topping": "Peppermint patties" },
		{ "id": 5,"topping": "Ritz crackers" },
		{ "id": 6,"topping": "Oreos" }
	],
	"price": 89
}
```

### ⭐ Add menu to cart
URL : `/menus/{id}`

Method : `POST`

**Response**

Code : `200`

Example body :

`No body required`

Example response :

`"Set C" has been added to the cart.`

### ⭐ View cart
URL : `/cart`

Method : `GET`

**Response**

Code : `200`

Example response :

`Total number of items in cart is 1 ("Set C", ). Total price is 89.00`

### ⭐ View orders

URL : `/orders`

Method : `GET`

**Response**

Code : `200`

Example response :

```json
[
	{
		"id": 1,
		"customerName": "Passawit",
		"cart": [
			{
				"name": "Set D",
				"details": "A swoosh brownies set include Salted caramel, Matcha glaze and Nutella fudge.",
				"brownies": [
					{ "id": 10, "topping": "Salted caramel" },
					{ "id": 11, "topping": "Matcha glaze" },
					{ "id": 12, "topping": "Nutella fudge" } ],
				"price": 89.0
			},
		],
		"totalPrice": 89.0
	},
	...
]
```

### ⭐ View order by ID
URL : `/orders/{id}`

Method : `GET`

**Response**

Code : `200`

Example response :

```json
{
	"id": 1,
	"customerName": "Passawit",
	"cart": [
		{
			"name": "Set D",
			"details": "A swoosh brownies set include Salted caramel, Matcha glaze and Nutella fudge.",
			"brownies": [
				{ "id": 10, "topping": "Salted caramel" },
				{ "id": 11, "topping": "Matcha glaze" },
				{ "id": 12, "topping": "Nutella fudge" } ],
			"price": 89.0
		},
	],
	"totalPrice": 89.0
}
```

### ⭐ Create order
URL : `/orders`

Method : `POST`

**Response**

Code : `200`

Example body :

`Passawit`

Example response :

`Order 73 has been placed.`

### ⭐ Delete order
URL : `/orders`

Method : `DELETE`

**Response**

Code : `202`

Example body :

`No body required`

Example response :

`Order 73 has been cancelled.`

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
