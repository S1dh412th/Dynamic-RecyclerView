package com.example.dynamicrecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.dynamicrecyclerview.compose.DisplayLayout
import com.example.dynamicrecyclerview.ui.theme.DynamicRecyclerViewTheme

class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DynamicRecyclerViewTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DisplayLayout() {
                        Toast.makeText(this, it, Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }
}
