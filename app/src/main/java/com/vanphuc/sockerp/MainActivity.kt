package com.vanphuc.sockerp

import com.vanphuc.sockerp.databinding.ActivityMainBinding
import com.vanphuc.sockerp.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutId: Int = R.layout.activity_main

    override fun initData() {

    }
}