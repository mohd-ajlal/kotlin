package com.example.kotlin.basics

fun main(){
    var age = readln().toInt()
    if(age>=18){
        print("You can vote\n")
    }else{
        print("You can't vote\n")
    }

    var name = readln()
    print(name)
}