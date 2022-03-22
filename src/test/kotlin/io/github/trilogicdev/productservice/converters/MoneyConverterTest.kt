package io.github.trilogicdev.productservice.converters

import io.github.trilogicdev.productservice.utils.`$`
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal.TEN

internal class MoneyConverterTest {

	@Test
	fun convertToDatabaseColumn() {
		val moneyConverter = MoneyConverter()
		val money = `$`(10)

		assertEquals(TEN.setScale(2), moneyConverter.convertToDatabaseColumn(money))
	}

	@Test
	fun convertToEntityAttribute() {
		val moneyConverter = MoneyConverter()

		assertEquals(`$`(10), moneyConverter.convertToEntityAttribute(TEN))
	}
}