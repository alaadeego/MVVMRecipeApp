package com.example.mvvmrecipeapp.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    val id: Int? = null,
    val title: String? = null,
    val publisher: String? = null,
    val featuredImage: String? = null ,
    val rating:Int? = 0 ,
    val sourceUrl: String? = null,
    /* val recipeType: RecipeType*/
    val description: String? = null,
    val cookingInstructions: String? = null,
    val ingredients: List<String> = listOf(),
    val dateAdded: String? = null,
    val dateUpdated: String? = null,
) : Parcelable

/**
 * sealed class RecipeType {
 *   object Original: RecipeType()
 *   data Copied(sourceUrl: String): RecipeType()
 * }
 * */

/*** ahmed here
 * Domain models typically shouldn't have nullable properties. This is because in a
 * domain-driven design we usually include only the fields we are really interested in,
 * and thus it will be there 99% of the time.
 *
 * Even for fields that may be absent, we can represent that absence using a sealed class
 * for better undertsanding.
 * */

/*
{
"name": ...,
"metadata": {
   "author": ...,
   "dateAdded": ...
 }
}
* */



/*
 - this core business model
- we  can use orEmpty() instead listOf()
 what diff between
kotlinx android parcel
&
kotlinx parcelize
 */
