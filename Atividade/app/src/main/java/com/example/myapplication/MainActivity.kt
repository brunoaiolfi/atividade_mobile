package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.Models.CarrinhoDeCompras
import com.example.myapplication.Models.Cliente
import com.example.myapplication.Models.Loja
import com.example.myapplication.Models.Produto
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier ) {
    // Criando produtos
    Column (
        modifier
    ) {
        val produto1 = Produto(1, "Notebook", 4500.0, 5)
        val produto2 = Produto(2, "Mouse Gamer", 250.0, 10)
        // Criando cliente
        val cliente = Cliente(1, "Ana", 5000.0)
        // Criando carrinho e loja
        val carrinho = CarrinhoDeCompras()
        val loja = Loja(listOf(produto1, produto2))
        // Adicionando produtos ao carrinho
        carrinho.exibirCarrinho()
        carrinho.adicionarProduto(produto1, 1)
        carrinho.adicionarProduto(produto2, 2)
        // Exibindo o carrinho
        carrinho.exibirCarrinho()
        // Tentando finalizar a compra
        loja.finalizarCompra(cliente, carrinho)
        carrinho.exibirCarrinho()
        produto1.exibirDetalhes()
        produto2.exibirDetalhes()
    }

}
