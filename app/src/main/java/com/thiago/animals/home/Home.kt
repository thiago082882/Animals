package com.thiago.animals.home


import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.thiago.animals.data.AnimalsDataSource

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun Home(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    onPetClick: (Int) -> Unit
) {
    val petList = AnimalsDataSource.animalList
    Scaffold(
        topBar = {
        },
        modifier = modifier
    ) { paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            itemsIndexed(petList) { index, animals ->
                AnimalsInfoItem(
                    animals = animals,
                    sharedTransitionScope = sharedTransitionScope,
                    animatedVisibilityScope = animatedVisibilityScope
                ) {
                    onPetClick(index)
                }
            }
        }
    }

}
