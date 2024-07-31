package com.smuarem.deadpoolandwolverineheros.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.smuarem.deadpoolandwolverineheros.data.HeroesRepo.heroes
import com.smuarem.deadpoolandwolverineheros.ui.constant.ConstDimension
import com.smuarem.deadpoolandwolverineheros.ui.theme.AppTheme
import com.smuarem.deadpoolandwolverineheros.view.components.HeroCard
import com.smuarem.deadpoolandwolverineheros.view.components.HeroTopAppBar


@Composable
fun HeroApp(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = { HeroTopAppBar() }
    ) { padding ->
        LazyColumn(contentPadding = padding, modifier = Modifier.background(MaterialTheme.colorScheme.secondaryContainer)) {
            items(heroes) {
                var expanded by remember { mutableStateOf(false) }
                val paddingSmall = dimensionResource(id = ConstDimension.PADDING_SMALL)

                HeroCard(
                    heroName = it.heroName,
                    heroActor = it.heroActor,
                    heroImage = it.heroImage,
                    expanded = expanded,
                    onClick = { expanded = !expanded },
                    heroDescription = it.heroSuperpower,
                    modifier = Modifier
                        .padding(paddingSmall)
                        .fillParentMaxWidth()
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HeroAppPreview() {
    AppTheme {
        HeroApp()
    }
}