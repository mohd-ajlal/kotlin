package com.example.kotlin.basics

fun main(){
    var age = readln().toInt()
    if(age<18){
        print("Child")
    }else if (age in 18..60){
        print("Adult")
    }else{
        print("Old")
    }
}