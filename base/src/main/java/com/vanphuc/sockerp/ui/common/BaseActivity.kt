package com.vanphuc.sockerp.ui.common

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavController

abstract class BaseActivity<VB : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity() {

    @get:LayoutRes
    protected abstract val layoutId: Int

    protected abstract val viewModel: VM

    protected open lateinit var binding: VB

    protected abstract val rootNav: NavController?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (::binding.isInitialized.not()) {
            binding = DataBindingUtil.setContentView(this, layoutId)
            binding.lifecycleOwner = this

            initView()
            initEvent()
        }
    }

    abstract fun initView()

    abstract fun initEvent()
}