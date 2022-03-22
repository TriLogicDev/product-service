package io.github.trilogicdev.productservice.extensions

import io.github.trilogicdev.productservice.utils.`$`
import java.math.BigDecimal

fun BigDecimal.toMoney() = `$`(this)