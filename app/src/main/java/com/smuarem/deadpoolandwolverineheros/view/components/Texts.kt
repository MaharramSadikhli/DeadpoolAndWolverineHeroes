package com.smuarem.deadpoolandwolverineheros.view.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.smuarem.deadpoolandwolverineheros.ui.constant.ConstDimension
import com.smuarem.deadpoolandwolverineheros.ui.constant.ConstTypography

/**
 * Top App Bar Text.
 *
 * @param modifier Modifier to be applied to the layout
 */
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    Text(text = "Deadpool & Wolverine", style = ConstTypography.TOP_APP_BAR, color = MaterialTheme.colorScheme.background, modifier = modifier)
}


/**
 * Hero Name Text.
 *
 * @param modifier Modifier to be applied to the layout
 * @param heroName String resource ID for the hero's name
 */
@Composable
fun HeroName(@StringRes heroName: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = heroName),
        style = ConstTypography.HERO_NAME,
        color = MaterialTheme.colorScheme.background,
        modifier = modifier
    )
}


/**
 * Hero's Actor Name Text.
 *
 * @param modifier Modifier to be applied to the layout
 * @param heroActor String resource ID for the hero's actor name
 */
@Composable
fun HeroActor(@StringRes heroActor: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = heroActor),
        style = ConstTypography.HERO_ACTOR,
        color = MaterialTheme.colorScheme.outlineVariant,
        modifier = modifier
    )
}


/**
 * Hero Name Text.
 *
 * @param modifier Modifier to be applied to the layout
 * @param heroDescription String resource ID for the hero's super power
 */
@Composable
fun HeroDescription(@StringRes heroDescription: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = heroDescription),
        style = ConstTypography.DESCRIPTION,
        color = MaterialTheme.colorScheme.errorContainer,
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun HeroNamePreview() {
    Column {
        TopAppBar()
        HeroName(heroName = com.smuarem.deadpoolandwolverineheros.R.string.deadpool_name)
        HeroActor(heroActor = com.smuarem.deadpoolandwolverineheros.R.string.deadpool_actor)
        HeroDescription(heroDescription = com.smuarem.deadpoolandwolverineheros.R.string.deadpool_superpower)
    }
}