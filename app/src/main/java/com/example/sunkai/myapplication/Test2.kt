package com.example.sunkai.myapplication

/**
 * Created by sunkai on 2017/12/15.   代理实现
 */
class Test2:InterfaceTest by Test1() {

    override fun interfaceMethod() {
        println("interfaceMethod will transfer by Test2")

        Test1().interfaceMethod()

        println("interfaceMethod transfered by Test2")
    }

}