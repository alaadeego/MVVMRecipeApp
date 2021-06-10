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
    // return recipeService.search(token, page, query).recipes.map(mapper::mapToDomainModel) //ahmed pattern
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}

/*
 in mapper i can use RecipeDtoMapper or  DomainMapper<RecipeDto , Recipe>

 ------------


 You should avoid passing the Mapper class as a constructor params and think on making it a member variable.
  Because

1. We don't want someone accidentally passing some other
implementation of this Mapper class here and eventually messing up the implementations
 details of the repository.
2. Also we will always have only one mapper implementation for conversion between any two
models throughout the app.

-----------------------------------------------

 but it would be awesome to also see some error handling / retry logic.
 Like how errors are processed and shown to the user (and if error handling can be consolidated
 into something like a helper class rather than being implemented in each API call),
 logic for when/how to retry loading data after an error and such. Anyway,
 I'm looking forward to check it out, especially how you implement caching and use cases!

 */

/*
DI
something
you prebuild classes(instantiate object) which called (dependency )
 for other classes inject them into classes.

what the benifit of adding addition layer of complexity into the code:

testability
wht testing with di easier



 */