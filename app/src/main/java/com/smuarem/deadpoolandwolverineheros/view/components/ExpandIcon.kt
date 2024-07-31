package com.smuarem.deadpoolandwolverineheros.view.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.smuarem.deadpoolandwolverineheros.ui.theme.AppTheme


@Composable
fun ExpandIcon(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    IconButton(onClick = onClick, modifier = modifier) {
        Icon(
            imageVector = Icons.Filled.ExpandMore,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ExpandIconPreview() {
    AppTheme {
        ExpandIcon(expanded = true, onClick = {})
    }
}