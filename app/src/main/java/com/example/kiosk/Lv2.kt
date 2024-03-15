package com.example.kiosk

import java.util.Arrays

//레벨2,3

open class Food {
    open var name = ArrayList<String>()
    open var price = ArrayList<Int>()

    open fun detailMenu(num: Int) {
        println("${name[num]}메뉴의 자세한 설명입니다.")
    }

}

class Burger : Food() {

    val burgerMenu = arrayListOf<String>("버거1", "버거2", "버거3")
    val burgerPrice = arrayListOf<Int>(1, 2, 3)

    init {
        name = burgerMenu
        price = burgerPrice
    }

    override fun detailMenu(num: Int) {
        println("${name[num]}의 가격은 ${price[num]}입니다")
    }
}


fun main() {
    val list = Burger()
    for (i in 0..list.name.count() - 1) {
        list.detailMenu(i)
    }

}