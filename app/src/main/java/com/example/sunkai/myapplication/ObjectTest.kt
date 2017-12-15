package com.example.sunkai.myapplication

/**
 * 类——class关键字修饰
 * 单例——object关键字修饰
 * Created by sunkai on 2017/12/15.
 */
object ObjectTest:InterfaceTest {
    override fun interfaceMethod() {
        println("interfaceMethod did transfered by ObjectTest")
    }
}