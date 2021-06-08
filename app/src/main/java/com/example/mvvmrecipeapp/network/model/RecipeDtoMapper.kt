package com.example.mvvmrecipeapp.network.model

import com.example.mvvmrecipeapp.domain.model.Recipe
import com.example.mvvmrecipeapp.domain.util.DomainMapper

class RecipeDtoMapper : DomainMapper<RecipeDto, Recipe> {
    override fun mapFromDomainModel(model: RecipeDto): Recipe {

        return Recipe(
            id = model.pk,
            title = model.title,
            publisher = model.publisher,
            featuredImage = model.featuredImage,
            rating = model.rating,
            sourceUrl = model.sourceUrl,
            description = model.description,
            cookingInstructions = model.cookingInstructions,
            ingredients = model.ingredients ?: listOf(),
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated
        )
    }

    override fun mapToDomainModel(domainModel: Recipe): RecipeDto {
        return RecipeDto(
            pk = domainModel.id,
            title = domainModel.title,
            publisher = domainModel.publisher,
            featuredImage = domainModel.featuredImage,
            rating = domainModel.rating,
            sourceUrl = domainModel.sourceUrl,
            description = domainModel.description,
            cookingInstructions = domainModel.cookingInstructions,
            ingredients = domainModel.ingredients ?: listOf(),
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated
        )
    }

    fun fromEntityList(initial: List<RecipeDto>): List<Recipe> {
        return initial.map { mapFromDomainModel(it) }
    }

    fun toEntityList(initial: List<Recipe>): List<RecipeDto> {
        return initial.map { mapToDomainModel(it) }
    }
}

// this class name was RecipeNetworkMapper
/*

-we call it RecipeNetworkMapper
because there maybe a cache layer too

- we may have multiple Network layer
-
 */