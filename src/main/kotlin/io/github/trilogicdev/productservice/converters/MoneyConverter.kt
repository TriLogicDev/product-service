package io.github.trilogicdev.productservice.converters

import io.github.trilogicdev.productservice.extensions.toMoney
import io.github.trilogicdev.productservice.utils.Money
import java.math.BigDecimal
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class MoneyConverter : AttributeConverter<Money, BigDecimal> {
	override fun convertToDatabaseColumn(attribute: Money?): BigDecimal = attribute!!.toBigDecimal()

	override fun convertToEntityAttribute(dbData: BigDecimal?): Money = dbData!!.toMoney()

}