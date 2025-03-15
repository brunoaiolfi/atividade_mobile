package com.example.myapplication.Models

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class CarrinhoDeCompras{
    val produtosLista = mutableListOf<Produto>()

    fun adicionarProduto(p: Produto, quantidade: Int){
        for (i in 1..quantidade){
            produtosLista.add(p)
        }
    }

    fun removerProduto(p: Produto){
        produtosLista.remove(p)
    }

    @Composable
    fun exibirCarrinho(){
        if (produtosLista.isEmpty()) {
            Text(text="carrinho vazio")
        }
        else{
            Text(text="exibindo carrinho: ")
            produtosLista.forEach {
                it.exibirDetalhes()
            }
        }
    }

    fun calcularTotal(): Double{
        var total = 0.0
        produtosLista.forEach { total += it.preco }
        //println("O total do carrinho é: $total")
        return total
    }
}