package com.example.mvvmrecipeapp.repository

import com.example.mvvmrecipeapp.domain.model.Recipe

interface RecipeRepository {
    suspend fun search(token: String, page: Int, query: String): List<Recipe>
    suspend fun get(token: String, id: Int): Recipe

}

/*
    // return Recipe not Recipe Dto
- UI should never see Dto or entity it just see business model object

Network <----Dto---- Repository <-----Recipe(business model)------ UI
 */


