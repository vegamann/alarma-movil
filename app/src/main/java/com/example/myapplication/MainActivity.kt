package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.ingresar).setOnClickListener(){
            setContentView(R.layout.activity_main2)
            val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)
            val navController = findNavController(R.id.nav_host_fragment_activity_main2)
            bottomNavigationView.setupWithNavController(navController)

        }
    }
}