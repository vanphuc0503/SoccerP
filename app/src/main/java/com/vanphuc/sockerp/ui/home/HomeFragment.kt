package com.vanphuc.sockerp.ui.home

import androidx.fragment.app.viewModels
import com.vanphuc.sockerp.R
import com.vanphuc.sockerp.databinding.FragmentHomeBinding
import com.vanphuc.sockerp.ui.base.BaseFragment
import com.vanphuc.sockerp.ui.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, BaseViewModel>() {

    override val layoutId = R.layout.fragment_home
    override val viewModel: BaseViewModel by viewModels()

    override fun initView() {

    }

    override fun initData() {

    }
}