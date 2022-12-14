package com.example.registrationapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.registrationapp.R
import com.example.registrationapp.data.local.sharedpreferences.userdata.UserPreferencesData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userPreferencesData: UserPreferencesData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val graph = navController.navInflater.inflate(R.navigation.nav_graph)

        when{
            !userPreferencesData.isAuthorized -> {
                graph.setStartDestination(R.id.signFlowFragment)
            } else -> {
                graph.setStartDestination(R.id.mainFlowFragment)
            }
        }
        navController.graph = graph
    }
}