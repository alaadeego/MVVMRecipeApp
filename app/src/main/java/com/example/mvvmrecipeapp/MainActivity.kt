package com.example.mvvmrecipeapp

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.example.mvvmrecipeapp.domain.model.Recipe
import com.example.mvvmrecipeapp.network.model.RecipeDto
import com.example.mvvmrecipeapp.network.model.RecipeDtoMapper

class MainActivity : AppCompatActivity() {
    //: ComponentActivity()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  supportFragmentManager.beginTransaction()
              .replace(R.id.main_container, RecipeListFragment())
              .commit()*/


        val mapper = RecipeDtoMapper()
        val recipe = Recipe()
        val networkEntity: RecipeDto = mapper.mapToDomainModel(recipe)
    }
}


/*

-this we call it Data Structure
kotlin-android-extensions deprecated
 instead use
kotlin-parcelize

there is mechanism exist in room to automatically do Mapper in room(type converter )

*/