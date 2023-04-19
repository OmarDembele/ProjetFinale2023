package com.esmt.projetAndroid2023.presentation

import com.learnandroid.projetAndroid2023.R


sealed class NavigationItem(var route: String, var icon: Int, var title: String)
{
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
    object Settings : NavigationItem("settings", R.drawable.ic_settings, "Settings")
    object Share : NavigationItem("share", R.drawable.ic_share, "Share")
    object Contact : NavigationItem("contact", R.drawable.ic_contact, "Contact")
}
