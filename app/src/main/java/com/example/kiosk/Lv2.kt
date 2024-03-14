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

    override var name: ArrayList<String>
        get() = super.name
        set(value) {}

    override var price: ArrayList<Int>
        get() = super.price
        set(value) {}

    val burgerMenu = arrayListOf<String>("버거1", "버거2", "버거3")
    val burgerPrice = arrayListOf<Int>(1, 2, 3)

    init {
        for (i in burgerMenu) {
            name.add(i)
        }
        // name = burgerMenu
        // name = arrayListOf<String>("버거1","버거2","버거3")
        for (i in burgerPrice) {
            price.add(i)
        }
        // price.add(listOf(burgerPrice))
    }

    override fun detailMenu(num: Int) {
        super.detailMenu(num)
    }
}


fun main() {
    val list = Burger()
    for (i in 0..list.name.count() - 1) {
        println("${list.name[i]}의 가격은 ${list.price[i]}입니다")
        list.detailMenu(i)
    }

}