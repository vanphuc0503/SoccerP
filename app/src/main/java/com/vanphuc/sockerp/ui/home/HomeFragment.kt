package com.vanphuc.sockerp.ui.home

import androidx.fragment.app.viewModels
import com.vanphuc.sockerp.R
import com.vanphuc.sockerp.databinding.FragmentHomeBinding
import com.vanphuc.sockerp.ui.common.BaseFragment
import com.vanphuc.sockerp.ui.common.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_home

    override val viewModel: BaseViewModel by viewModels()

    override fun initView() {

    }

    override fun initData() {

    }
}