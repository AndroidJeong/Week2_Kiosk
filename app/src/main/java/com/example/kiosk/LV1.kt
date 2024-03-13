package com.example.kiosk

class LV1 {
    val startMenu = """ 아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.

    [ MENU ]
    1. Burgers         | 매장에서 만든 버거
    2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림
    3. Drinks          | 매장에서 직접 만드는 음료
    0. 종료            | 프로그램 종료
    """
    val burgerMenu = """
     [ Burgers MENU ]
     1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
     2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
     3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
     4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
     5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
     0. 뒤로가기      | 뒤로가기   
    """
    val forzenMenu = """
     [ Forzen MENU ]
     1. ShackForzen   | W 4.9 | 쉑 아이스크림
     2. SmokeForzen    | W 6.9 | 스모크 아이스크림
     3. ShroomForzen | W 7.4 | 버섯 아이스크림
     4. CheeseForzen  | W 4.9 | 치즈 아이스크림
     5. Hamburger     | W 3.4 | 기본 아이스크림
     0. 뒤로가기      | 뒤로가기   
    """
    val drinksMenu = """
     [ Drinks MENU ]
     1. ShackDrinks   | W 5.9 | 쉑 음료
     2. SmokeDrinks    | W 7.9 | 스모크 음료
     3. ShroomDrinks | W 8.4 | 버섯 음료
     4. CheeseDrinks  | W 5.9 | 치즈 음료
     0. 뒤로가기      | 뒤로가기   
    """
    var num1 = ""

    fun printMenu() {

        while (true) {
            println(startMenu)
            num1 = readLine()!!
            when (num1) {
                "1" -> {
                    println(burgerMenu)
                    detailMenu()
                }

                "2" -> {
                    println(forzenMenu)
                    detailMenu()
                }

                "3" -> {
                    println(drinksMenu)
                    detailMenu()
                }

                "0" -> {
                    println("프로그램을 종료합니다.")
                    break
                }

                else -> {
                    println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요")
                    num1 = readLine()!!
                }
            }
        }
    }

    fun detailMenu() {
        while (num1 != "0") {
            num1 = readLine()!!
            println("${num1}번 메뉴에 대한 상세한 설명입니다")
            println("다음 번호를 입력해주세요")
        }

    }
}

fun main() {
    var example = LV1()
    example.printMenu()
}