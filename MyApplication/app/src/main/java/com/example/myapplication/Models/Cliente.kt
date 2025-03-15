package com.example.myapplication.Models

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Cliente(val id: Int, val nome: String, var saldo: Double){
    fun adicionarSaldo(valor: Double){
        saldo += valor
    }
    @Composable
    fun exibirDetalhes() {
        Text(text="$id\t$nome\tR$$saldo")
    }
}