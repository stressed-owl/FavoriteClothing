package com.cute_white_bear.favoriteclothing.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

open class Clothing(
    @StringRes val type: Int,
    @DrawableRes val image: Int,
    val price: Double,
)

