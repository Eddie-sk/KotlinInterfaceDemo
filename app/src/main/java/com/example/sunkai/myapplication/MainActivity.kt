package com.example.sunkai.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.math.BigInteger

const val Pai = 3.1415926f

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val s = test(8)
//        this ->
        println("------------------>" + s)
        val lists = listOf(1,2,4,5,6,7)
        for ((i,e) in lists.withIndex()) {
            println("$i + $e")
        }
        val map = mutableMapOf<String,String>()
        map["11"] = "One Two Thee"
        println(map["11"])
        val nums = 1 ..100
        var result = 0;
        for (num in nums) {
            result += num;
        }
        println("result -> ${result}")
        val aaa = aaaa(b1=12.0f)
        println("ttttt -> ${aaa}")

        var fac = BigInteger("8")
        println("factorial:"+fact(fac))

        var result1 = 0
        println("结果为："+oll(100,result1))

        //接口反映的是事物的能力
        //抽象类反映的是事物的本质

        val test2 = Test2()
        test2.interfaceMethod()

        val objTest = ObjectTest
        println("objTest = ${objTest}")
        val testObj = TestObject()
        testObj.interfaceMethod()
        val sealedClass:SealClass = SealClass.test1()

        var n = 2
        println("++n = "+ n++)

        val names = listOf("ni","wo","ta")
        names.forEach {
            println("他是谁呢："+it)
        }

    }

    enum class Week {
        星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
    }

    fun test(num:Int):String {
        when(num){
            10 -> return "ten"
            9 -> return "nine"
            else -> return  "none"
        }
    }

    fun aaaa(a1:Float = Pai, b1: Float):Float {
        return a1 * b1 * Pai
    }

    fun fact(num:BigInteger):BigInteger {
        if (num == BigInteger.ONE) {
            return BigInteger.ONE
        } else {
            return num * fact(num - BigInteger.ONE)
        }
    }

    private tailrec  fun oll(num:Int, result:Int):Int {
        println("第${num}计算，结果:${result}")
        if (num == 1) return 1 else {
            return num + oll(num - 1, result + num)
        }
    }
}
