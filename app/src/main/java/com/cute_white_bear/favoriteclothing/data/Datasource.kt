package com.cute_white_bear.favoriteclothing.data

import com.cute_white_bear.favoriteclothing.R
import com.cute_white_bear.favoriteclothing.model.*

class Datasource {
    companion object {
        fun returnPants(): List<Pants> {
            return listOf(
                Pants(R.string.pants, R.drawable.pants_1, 38.1),
                Pants(R.string.pants, R.drawable.pants_2, 43.26),
                Pants(R.string.pants, R.drawable.pants_3, 35.80),
                Pants(R.string.pants, R.drawable.pants_4, 50.90),
                Pants(R.string.pants, R.drawable.pants_5, 83.26),
                Pants(R.string.pants, R.drawable.pants_6, 83.26),
            )
        }
        fun returnShoes(): List<Shoes> {
            return listOf(
                Shoes(R.string.shoes, R.drawable.shoes_1, 34.1),
                Shoes(R.string.shoes, R.drawable.shoes_2, 43.28),
                Shoes(R.string.shoes, R.drawable.shoes_3, 53.28),
                Shoes(R.string.shoes, R.drawable.shoes_4, 53.28),
                Shoes(R.string.shoes, R.drawable.shoes_5, 53.28),
            )
        }
        fun returnHoodies(): List<Hoodie> {
            return listOf(
                Hoodie(R.string.hoodie, R.drawable.hoodie_1, 46.00),
                Hoodie(R.string.hoodie, R.drawable.hoodie_2, 46.00),
                Hoodie(R.string.hoodie, R.drawable.hoodie_3, 46.00),
                Hoodie(R.string.hoodie, R.drawable.hoodie_4, 46.00),
                Hoodie(R.string.hoodie, R.drawable.hoodie_5, 46.00),
            )
        }
        fun returnTShirt(): List<TShirt> {
            return listOf(
                TShirt(R.string.t_shirt, R.drawable.t_shirt_1, 99.00),
                TShirt(R.string.t_shirt, R.drawable.t_shirt_2, 99.00),
                TShirt(R.string.t_shirt, R.drawable.t_shirt_3, 99.00),
                TShirt(R.string.t_shirt, R.drawable.t_shirt_4, 99.00),
                TShirt(R.string.t_shirt, R.drawable.t_shirt_5, 99.00),
            )
        }
        fun returnAccessory(): List<Accessory> {
            return listOf(
                Accessory(R.string.accessory, R.drawable.accessory_1, 9.99),
                Accessory(R.string.accessory, R.drawable.accessory_2, 9.99),
                Accessory(R.string.accessory, R.drawable.accessory_3, 9.99),
                Accessory(R.string.accessory, R.drawable.accessory_4, 9.99),
                Accessory(R.string.accessory, R.drawable.accessory_5, 9.99),
                Accessory(R.string.accessory, R.drawable.accessory_6, 9.99),
                Accessory(R.string.accessory, R.drawable.accessory_7, 9.99),
                Accessory(R.string.accessory, R.drawable.accessory_8, 9.99),
            )
        }
    }
}