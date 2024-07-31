package com.smuarem.deadpoolandwolverineheros.view.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.smuarem.deadpoolandwolverineheros.data.HeroesRepo
import com.smuarem.deadpoolandwolverineheros.ui.constant.ConstDimension


@Composable
fun HeroInfo (
    @StringRes heroName: Int,
    @StringRes heroActor: Int,
    modifier: Modifier = Modifier
) {

    val paddingSmall = dimensionResource(id = ConstDimension.PADDING_SMALL)
    val paddingMedium = dimensionResource(id = ConstDimension.PADDING_MEDIUM)

    Column(modifier = modifier.padding(paddingMedium).width(160.dp)) {
        HeroName(heroName = heroName, modifier.padding(bottom = paddingSmall))
        HeroActor(heroActor = heroActor)
    }

}


@Preview(showBackground = true)
@Composable
fun HeroInfoPreview() {
    val deadpool = HeroesRepo.heroes.first()
    HeroInfo(heroName = deadpool.heroName, heroActor = deadpool.heroActor)
}