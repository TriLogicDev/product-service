package io.github.trilogicdev.productservice.extensions

import com.pauloelienay.productservice.utils.`$`
import java.math.BigDecimal

fun BigDecimal.toMoney() = `$`(this)