package com.example.mvvmrecipeapp.repository

import com.example.mvvmrecipeapp.domain.model.Recipe
import com.example.mvvmrecipeapp.network.RecipeService
import com.example.mvvmrecipeapp.network.model.RecipeDtoMapper

class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
) : RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        /*   val result = recipeService.search(token , page , query).recipes
           return mapper.toDomainList(result)

         */
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)

    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}

/*
 in mapper i can use RecipeDtoMapper or  DomainMapper<RecipeDto , Recipe>
 */