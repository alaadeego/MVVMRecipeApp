package com.example.mvvmrecipeapp
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentManager
import com.example.mvvmrecipeapp.ui.theme.MVVMRecipeAppTheme

class MainActivity : AppCompatActivity() {
    //: ComponentActivity()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, RecipeListFragment())
            .commit()*/

    }
}
