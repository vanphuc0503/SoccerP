package com.vanphuc.sockerp

import androidx.activity.viewModels
import com.vanphuc.sockerp.databinding.ActivityMainBinding
import com.vanphuc.sockerp.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutId = R.layout.activity_main
    override val viewModel: MainViewModel by viewModels()

    override fun initData() {

    }
}