package com.zj.core.view.base


import android.annotation.SuppressLint
import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.ConvertUtils
import com.eliza.android.tools.R
import com.zj.core.util.showToast
import com.zj.core.view.base.lce.DefaultLceImpl
import com.zj.core.view.base.lce.ILce
import java.lang.ref.WeakReference
/**
 * 在Activity或Fragment中初始化需要的函数。
 *
 */
interface BaseInit {

    fun initData()

    fun initView()

}

interface BaseActivityInit : BaseInit {

    fun getLayoutView(): View

}

interface BaseFragmentInit : BaseInit {

    fun getLayoutView(inflater: LayoutInflater, container: ViewGroup?, attachToRoot: Boolean): View

}