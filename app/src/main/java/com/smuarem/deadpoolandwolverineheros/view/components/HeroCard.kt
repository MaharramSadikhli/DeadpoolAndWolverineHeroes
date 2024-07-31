package com.smuarem.deadpoolandwolverineheros.view.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.smuarem.deadpoolandwolverineheros.data.HeroesRepo
import com.smuarem.deadpoolandwolverineheros.ui.constant.ConstDimension
import com.smuarem.deadpoolandwolverineheros.ui.theme.AppTheme


@Composable
fun HeroCard(
    @StringRes heroName: Int,
    @StringRes heroActor: Int,
    @DrawableRes heroImage: Int,
    expanded: Boolean,
    @StringRes heroDescription: Int,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            HeroImage(image = heroImage, heroName = heroName)
            HeroInfo(heroName = heroName, heroActor = heroActor)
            ExpandIcon(expanded = true, onClick = { /*TODO*/ })
        }
        if (expanded) {
            HeroDescription(
                heroDescription = heroDescription, modifier = Modifier.padding(
                    dimensionResource(id = ConstDimension.PADDING_MEDIUM)
                )
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HeroCardPreview() {
    val deadpool = HeroesRepo.heroes.first()
    AppTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            HeroCard(
                heroName = deadpool.heroName,
                heroActor = deadpool.heroActor,
                heroImage = deadpool.heroImage,
                expanded = true,
                heroDescription = deadpool.heroSuperpower
            )
            HeroCard(
                heroName = deadpool.heroName,
                heroActor = deadpool.heroActor,
                heroImage = deadpool.heroImage,
                expanded = true,
                heroDescription = deadpool.heroSuperpower
            )
        }
    }

}