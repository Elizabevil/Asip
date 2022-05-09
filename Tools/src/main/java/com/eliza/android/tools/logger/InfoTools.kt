package com.eliza.android.tools.logger


import android.content.Context
import android.util.Log
import android.widget.Toast


/*-*- coding:utf-8 -*-
 * @Author  : debi
 * @Time    : 4/2/22
 * @Software: Android Studio
 */
object InfoTools {
    @JvmStatic
    fun LogTools(TAG: Any, info: Any, level: Int? = null) {
        level ?: Log.d(TAG.toString(), info.toString())
        level?.let {
            when (level % 3) {
                0 -> Log.i(TAG.toString(), info.toString())
                1 -> Log.d(TAG.toString(), info.toString())
                2 -> Log.e(TAG.toString(), info.toString())
                else -> Log.d(TAG.toString(), info.toString())
            }
        }
    }

    @JvmStatic
    fun ToastTools(context: Context, info: Any) {
        Toast.makeText(context, info.toString(), Toast.LENGTH_SHORT).show()
    }



}