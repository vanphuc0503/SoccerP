package com.vanphuc.sockerp.ui.setting

import androidx.fragment.app.viewModels
import com.vanphuc.sockerp.R
import com.vanphuc.sockerp.databinding.FragmentSettingsBinding
import com.vanphuc.sockerp.ui.common.BaseFragment
import com.vanphuc.sockerp.ui.common.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment : BaseFragment<FragmentSettingsBinding, BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_settings

    override val viewModel: BaseViewModel by viewModels()

    override fun initView() {

    }

    override fun initData() {

    }
}