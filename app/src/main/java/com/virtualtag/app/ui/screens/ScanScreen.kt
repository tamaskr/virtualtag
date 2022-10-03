package com.virtualtag.app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.virtualtag.app.viewmodels.CardViewModel

@Composable
fun ScanScreen(model: CardViewModel, viewCard: (id: Int) -> Unit, goBack: () -> Unit) {
  Scaffold(
    topBar = {
      TopAppBar(
        title = { Text("Scan") },
        navigationIcon = { IconButton(onClick = goBack) { Icon(Icons.Filled.ArrowBack, null) } }
      )
    }
  ) {
    Surface(modifier = Modifier
      .padding(it)
      .fillMaxSize()) {
      Column(modifier = Modifier.fillMaxWidth()) {
        Text("Scan new cards here")
      }
    }
  }
}
