package com.example.mvvmrecipeapp.network.model

import com.google.gson.annotations.SerializedName

class RecipeNetworkEntity(
    @SerializedName("pk")
    var pk: Int? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("publisher")
    var publisher: String? = null,

    @SerializedName("featured_image")
    var featuredImage: String? = null,

    @SerializedName("rating")
    var rating: Int? = 0,

    @SerializedName("source_url")
    var sourceUrl: String? = null,

    @SerializedName("description")
    var description: String? = null,

    @SerializedName("cooking_instructions")
    var cookingInstructions: String? = null,

    @SerializedName("ingredients")
    var ingredients: List<String>? = null,

    @SerializedName("date_added")
    var dateAdded: String? = null,

    @SerializedName("date_updated")
    var dateUpdated: String? = null,

    )


/*

Network keyword refer to Network layer
Entity Keywork refer to this model from other layer
-----------
 Please name your model
   (RecipeDto for network)
   (RecipeEntity for database)
   (Recipe for domain).

 --------------------
 why we need to make two classes for same fields?
   Typically the fields will not be the same and
   you should keep the entity models separate from your core business model

//-----------------

 MVI pattern kotlin & IR Compiler
upps, wrong link (https://kotlinlang.org/docs/reference/migrating-multiplatform-project-to-14.html),
 I'm investigating MVI pattern beyond android, thats is on desktop and also on server,
 all writing with kotlin with mpp. If you are interested you can see https://arkivanov.github.io/MVIKotlin/,
  https://github.com/arkivanov/Decompose and
   https://github.com/JetBrains/compose-jb


   Joaquín Sánchez
5 months ago (edited)
 @CodingWithMitch  I have found the link for IR Compiler from google: https://android-developers.googleblog.com/2020/08/new-language-features-and-more-in.html,
 see "Compiler improvements" entry. It is similar to java bytecode to run on multiple platforms,
 but to compile intermediate kotlin "bytecode" to be used from ios, js,
  jvm server target modules ans so make its "compilation" portable to distinct targets (mpp).
  Then you can compile kotlin compiled "jars" to be used as dependencies in targets that doesn't have this concept of jar dependecy,
   it is like an internal unified "kotlin dependency" that can be "recompiled" to the target language (ios, js, jvm).



Joaquín Sánchez
Joaquín Sánchez
5 months ago
To use jetpack compose with kotlin coroutines it is required to use this new IR compiler,
 if not, then you cannot use coroutines inside  compose.

Joaquín Sánchez
Joaquín Sánchez
5 months ago
and here a sample project with compose and coroutines using IR compiler:  https://coroutinedispatcher.com/posts/get_started_with_compose/

Joaquín Sánchez
Joaquín Sánchez
5 months ago
the sample project on github here: https://github.com/coroutineDispatcher/cats_compose_sample

//----------------------------------
mapper discuess
modeling for diff layer

Shehram Jamil
5 months ago
Suppose I have a network model and after receiving the data from retrofit ,
I want to add this into my room database and for this I have to map it from network to database model.
Now for accessing the room, I will get the data in a database model which is with the annotation @entity,
now again I have to convert my room data model to domain model.
My question is, how to get rid of this mapping again and again.
What if we use our room database model for UI/RecyclerAdapters.



CodingWithMitch
CodingWithMitch
5 months ago
I would have a mapper for each layer.
One to map network entity to domain model and one to map cache entity to domain model



Shehram Jamil
Shehram Jamil
5 months ago
 @CodingWithMitch  and one to map network to cache.
In case of applying the single source of truth concept,  network to cache mapping is usually required.
So I believe three mappers would be enough




 */


/*
Naming Convention

-common pattern in software world

DAO  --> for database caching or data  access object like in room persistance

entities --> for model for local database room persistance



From Wikipedia:
The difference between data transfer objects(DTO) and business objects or data access objects(DAO)
 is that a DTO does not have any behavior except for storage, retrieval,
 serialization and deserialization of its own data.
 I think this description fits out network layer quite nicely.
 The RecipeDto's job is to serialize the data coming from retrofit.
 */