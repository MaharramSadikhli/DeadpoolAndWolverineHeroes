package com.smuarem.deadpoolandwolverineheros.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.smuarem.deadpoolandwolverineheros.ui.constant.ConstDimension


@Composable
fun HeroTopAppBar(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(
            top = dimensionResource(
                id = ConstDimension.PADDING_LARGE
            )
        ).fillMaxWidth()
    ) {
        TopAppBar()
    }
}