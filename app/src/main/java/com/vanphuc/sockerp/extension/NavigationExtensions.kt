package com.vanphuc.sockerp.extension

import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

fun FragmentManager.findNavigationController(layoutId: Int): NavController =
    (findFragmentById(layoutId) as NavHostFragment).navController