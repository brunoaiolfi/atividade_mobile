package com.example.myapplication.Models

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Produto(
    val id: Int,
    val nome: String,
    val preco: Double,
    var estoque: Int
) {
    @Composable
    fun exibirDetalhes(){
        Text(
            text="$id\t$nome\t$preco\t$estoque"
        )
    }
}
