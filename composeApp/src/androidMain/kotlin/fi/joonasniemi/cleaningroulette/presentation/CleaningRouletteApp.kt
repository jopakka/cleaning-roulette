package fi.joonasniemi.cleaningroulette.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import fi.joonasniemi.cleaningroulette.ui.theme.CleaningRouletteTheme
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CleaningRouletteApp(
    viewModel: CleaningRouletteViewModel = koinViewModel(),
) {
    val tasks by viewModel.tasks.collectAsStateWithLifecycle()

    CleaningRouletteTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        ) { innerPadding ->
            Column(Modifier.padding(innerPadding)) {
                Text("Hello roulette. Viewmodel says: ${viewModel.hello()}")

                Text("Tasks:")
                LazyColumn {
                    items(tasks) {
                        Text(it.name)
                    }
                }
            }
        }
    }
}