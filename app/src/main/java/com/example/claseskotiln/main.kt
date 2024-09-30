package com.example.claseskotiln

import com.example.claseskotiln.modelo.IngredienteDTO
import com.example.claseskotiln.modelo.PizzaDTO

class Controlador{

    fun filtradoDePizzas(pizzas: List<PizzaDTO>,min: Float=7f, max : Float=10f): List<PizzaDTO> = pizzas.filter { it.precio in min ..max }

    fun filtradoDeIngredientes(alergenos :List<String>, ingredientes: List<IngredienteDTO>): List<IngredienteDTO> =
        ingredientes.filter { it.alergenos.none(){alergeno-> alergenos.contains(alergeno)} }


}