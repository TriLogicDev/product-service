package io.github.trilogicdev.productservice.extensions

import io.github.trilogicdev.productservice.utils.`$`
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class BigDecimalKtTest {

	@Test
	fun toMoney() {
		val money = BigDecimal.TEN.toMoney()

		assertEquals(`$`(10), money)
	}
}