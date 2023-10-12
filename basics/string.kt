package com.example.kotlin.basics

fun main(){
    var myStr:String = "Hello World"
    print(myStr)
    print("\n")
    print("First character in myStr = " + myStr[0])
    print("\n")
    for(i in myStr){
        print(i)
    }

    var myStr1 = "Mohd Ajlal"
//    myStr.lowercase()
    print("\n"+myStr1.uppercase())
}