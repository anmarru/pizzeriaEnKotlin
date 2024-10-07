package com.example.claseskotiln

import com.example.claseskotiln.modelo.IngredienteDTO
import com.example.claseskotiln.modelo.PizzaDTO
import com.example.claseskotiln.modelo.SIZE

fun main() {
    //INGREDIENTES
    val queso= IngredienteDTO(1,"queso", listOf("lactosa"))
    val pollo= IngredienteDTO(2,"pollo", emptyList())
    val pinia= IngredienteDTO(3,"pinia", listOf("bromelia", "histamina"))
    val bacon= IngredienteDTO(4,"bacon", listOf("gluten"))
    val cebolla= IngredienteDTO(5,"cebolla", listOf("profilinas"))
    val harinaDeTrigo= IngredienteDTO(6,"harina de trigo", listOf("gluten", "sulfitos", "levadura"))
    val jamon= IngredienteDTO(7, "jamon", listOf("nitritos"," gluten"))
    val setas= IngredienteDTO(8,"setas", emptyList())
    val anchoas= IngredienteDTO(9, "anchoas", listOf("pescado", "histamina"))
    val peperono= IngredienteDTO(10, "peperoni", listOf("proteina", "gluten"))
    val tomate= IngredienteDTO(11,"tomate", emptyList())

    //PIZZAS
    val pizzaCuatroQuesos= PizzaDTO(
        1,"Pizza cuantro quesos", 5.50f, SIZE.PEQUEÑO, listOf(harinaDeTrigo,queso,harinaDeTrigo,tomate)
    )
    val pizzaHawai= PizzaDTO(
        2, "Pizza Hawai", 14f,SIZE.GRANDE, listOf(harinaDeTrigo,queso, pinia)
    )
    val pizzaPeperoni = PizzaDTO(
        3, "Pizza Peperoni", 8.5f,SIZE.MEDIANO, listOf(harinaDeTrigo,queso, cebolla,peperono)
    )
    val pizzaPolloBacon= PizzaDTO(4,"Pizza de Pollo con cebolla y bacon",14.0f,SIZE.GRANDE,
        listOf(harinaDeTrigo, pollo,queso,cebolla, bacon)
    )
    val pizzaSetas= PizzaDTO(5,"Piza de setas",5.5f,SIZE.PEQUEÑO, listOf(harinaDeTrigo,tomate,queso,setas,anchoas))
    val pizzaJamon= PizzaDTO(6, "piza de jamon", 8.5f, SIZE.MEDIANO, listOf(harinaDeTrigo, tomate, queso, jamon))

    //LISTA DE PIZZAS E INGREDIENTES
    val controlador= Controlador()
    val listaPizzas= listOf(pizzaCuatroQuesos, pizzaHawai,pizzaPeperoni,pizzaPolloBacon,pizzaSetas, pizzaJamon)
    val listaIngredientes= listOf(queso, pollo, tomate, harinaDeTrigo, pinia, setas, cebolla, peperono, anchoas, jamon,bacon)

    // PIZZAS POR PRECIO ENTRE 7 Y 10
    println(controlador.filtradoDePizzas(listaPizzas, 7f, 10f))

    //PIZZAS QUE NO TENGAN GLUTEN
    println(controlador.filtradoDeIngredientes(listOf("gluten"),listaIngredientes))

    //PIZZAS POR PRECIO ASCENDENTE
    println(controlador.ordenarPizzasPorPrecio(listaPizzas,true))

    //PIZZAS POR PRECIO DESCENDENTES
    println(controlador.ordenarPizzasPorPrecio(listaPizzas, false))

    //PIZZAS CON POLLO
    println(controlador.contadordepizzas(listaPizzas, pollo))

    //PIZZAS CON QUESO
    println(controlador.contadordepizzas(listaPizzas, queso))
}

