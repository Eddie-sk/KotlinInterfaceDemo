package com.example.sunkai.myapplication

/**
 * Created by sunkai on 2017/12/15.
 */
class TestObject:InterfaceTest by ObjectTest {
    override fun interfaceMethod() {
        println("interfaceMethod will transfer by TestObject")
        ObjectTest.interfaceMethod()
        println("objTest = ${ObjectTest}")
        println("interfaceMethod did transfered by TestObject")
    }
}