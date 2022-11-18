package com.vanphuc.sockerp.ui

import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.ui.setupWithNavController
import com.vanphuc.sockerp.R
import com.vanphuc.sockerp.databinding.ActivityMainBinding
import com.vanphuc.sockerp.extension.supportFindNavController
import com.vanphuc.sockerp.ui.common.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutId: Int
        get() = R.layout.activity_main

    override val viewModel: MainViewModel by viewModels()

    override val rootNav: NavController
        get() = supportFindNavController(R.id.fragment_container)

    override fun initView() {
        binding.navBottom.setupWithNavController(rootNav)
    }

    override fun initEvent() {}

}