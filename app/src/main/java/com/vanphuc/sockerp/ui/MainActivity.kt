package com.vanphuc.sockerp.ui

import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.ui.setupWithNavController
import com.vanphuc.sockerp.R
import com.vanphuc.sockerp.databinding.ActivityMainBinding
import com.vanphuc.sockerp.extension.findNavigationController
import com.vanphuc.sockerp.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutId = R.layout.activity_main

//    override var navController: NavController =
//        supportFragmentManager.findNavigationController(R.id.fragment_container)

    override val viewModel: MainViewModel by viewModels()

    override fun initView() {
        val ds = supportFragmentManager.findNavigationController(R.id.fragment_container)
        binding.navBottom.setupWithNavController(ds)
    }

    override fun initEvent() {}
}