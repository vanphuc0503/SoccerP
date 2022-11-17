package com.vanphuc.sockerp.ui.news

import androidx.fragment.app.viewModels
import com.vanphuc.sockerp.R
import com.vanphuc.sockerp.databinding.FragmentHomeBinding
import com.vanphuc.sockerp.databinding.FragmentNewsBinding
import com.vanphuc.sockerp.ui.base.BaseFragment
import com.vanphuc.sockerp.ui.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsFragment : BaseFragment<FragmentNewsBinding, BaseViewModel>() {

    override val layoutId = R.layout.fragment_news
    override val viewModel: BaseViewModel by viewModels()

    override fun initView() {

    }

    override fun initData() {

    }
}