package io.github.trilogicdev.productservice.converters

import io.github.trilogicdev.productservice.extensions.toMoney
import io.github.trilogicdev.productservice.utils.`$`
import java.math.BigDecimal
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class MoneyConverter : AttributeConverter<`$`, BigDecimal> {
	override fun convertToDatabaseColumn(attribute: `$`?): BigDecimal = attribute!!.toBigDecimal()

	override fun convertToEntityAttribute(dbData: BigDecimal?): `$` = dbData!!.toMoney()

}