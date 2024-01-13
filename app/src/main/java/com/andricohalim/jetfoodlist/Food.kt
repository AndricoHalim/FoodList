package com.andricohalim.jetfoodlist

data class Food(val name: String, val imageResourceId: Int)

val foodList = listOf(
    Food("Rendang", R.drawable.rendang),
    Food("Sate", R.drawable.sate),
    Food("Rawon", R.drawable.rawon),
    Food("Gado-Gado", R.drawable.gadogado ),
    Food("Pecel", R.drawable.pecel),
    Food("Martabak", R.drawable.martabak)
)
