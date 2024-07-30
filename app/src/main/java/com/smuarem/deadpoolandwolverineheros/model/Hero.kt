package com.smuarem.deadpoolandwolverineheros.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val heroName: Int,
    @StringRes val heroActor: Int,
    @StringRes val heroSuperpower: Int,
    @DrawableRes val heroImage: Int
)
