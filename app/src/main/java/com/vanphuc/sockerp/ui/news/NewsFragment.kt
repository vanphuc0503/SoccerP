package com.vanphuc.sockerp.ui.news

import androidx.fragment.app.viewModels
import com.vanphuc.sockerp.R
import com.vanphuc.sockerp.databinding.FragmentNewsBinding
import com.vanphuc.sockerp.ui.common.BaseFragment
import com.vanphuc.sockerp.ui.common.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsFragment : BaseFragment<FragmentNewsBinding, NewsViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_news

    override val viewModel: NewsViewModel by viewModels()

    override fun initView() {

    }

    override fun initData() {
        super.initData()
    }
}