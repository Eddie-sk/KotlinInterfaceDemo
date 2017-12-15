package com.example.sunkai.myapplication

/**
 * 密封类，须指定子类类型
 * Created by sunkai on 2017/12/15.
 */
sealed class SealClass {
    class test1:SealClass()
    class test2:SealClass()
}