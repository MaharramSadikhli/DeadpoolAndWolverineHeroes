package com.smuarem.deadpoolandwolverineheros.view.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.smuarem.deadpoolandwolverineheros.R
import com.smuarem.deadpoolandwolverineheros.ui.constant.ConstDimension

/**
 * Composable that displays a photo of a hero.
 *
 * @param image is the resource ID for the image of the hero
 * @param heroName is the resource ID for the name of the hero
 * @param modifier modifiers to set to this composable
 */
@Composable
fun HeroImage(@DrawableRes image: Int, @StringRes heroName: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = image),
        contentDescription = stringResource(id = heroName),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(dimensionResource(id = ConstDimension.IMAGE_SIZE))
            .padding(dimensionResource(id = ConstDimension.PADDING_SMALL))
            .clip(MaterialTheme.shapes.small)
    )
}


@Preview(showBackground = true)
@Composable
fun HeroImagePreview() {
    HeroImage(image = R.drawable.deadpool1, heroName = R.string.deadpool_name)
}