package com.example.myapplication.Models

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Loja(val produtos: List<Produto>){
    @Composable
    fun finalizarCompra(cliente: Cliente, carrinho: CarrinhoDeCompras){
        val total = carrinho.calcularTotal()
        if (cliente.saldo >= total){
            Text(text="Compra realizada")

            // Atualizar saldo e estoque
            cliente.saldo -= total
            carrinho.produtosLista.forEach{ it.estoque -=1 }
            carrinho.produtosLista.clear()
        }
        else{
            Text(text="Saldo insuficiente")
        }
    }
}