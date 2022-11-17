package com.vanphuc.sockerp.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavController

abstract class BaseActivity<VB : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity() {

    @get:LayoutRes
    abstract val layoutId: Int

    abstract val viewModel: VM

//    abstract val navController: NavController?

    open lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (::binding.isInitialized.not()) {
            binding = DataBindingUtil.setContentView(this, layoutId)
        }

        initView()
        initEvent()
    }

    abstract fun initView()

    abstract fun initEvent()
}