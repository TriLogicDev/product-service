package io.github.trilogicdev.productservice.models

import io.github.trilogicdev.productservice.converters.MoneyConverter
import io.github.trilogicdev.productservice.utils.`$`
import javax.persistence.Convert
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "products")
data class Product(
	@Id @GeneratedValue(strategy = IDENTITY) var id: Long? = null,

	var title: String? = null,

	var description: String? = null,

	@Convert(converter = MoneyConverter::class)
	var price: `$`? = `$`(0),

	var quantity: Long? = null,
)
