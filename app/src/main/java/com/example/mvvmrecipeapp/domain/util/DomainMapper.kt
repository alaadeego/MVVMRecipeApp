package com.example.mvvmrecipeapp.domain.util

interface DomainMapper<T, DomainModel> {
// T --> mean like Entity
    fun mapFromDomainModel(model: T): DomainModel
    fun mapToDomainModel(domainModel: DomainModel): T   // we use it we want post data for example in Retrofit,publish for network
}

/*
variable types

can use any number of Entity and any number of DomainModel
so we build it generic

Entity like RecipeNetworkEntity
DomainModel like Recipe
-------------------

DtoMapper<Dto,Model> for net
- EntityMapper<Entity,Model> for database(local)


-RecipeDtoMapper implements DtoMapper, RecipeEntityMapper implements EntityMapper,
 and so on. What is your idea?

-e careful dude, some of these already are in use.
I've never seen Entity refer to network models but I have seen it refer to database classes
and even sometimes the domain classes.

-----------------
I also prefer custom mapper mechanism to the automatic one,
 but I prefer to do the map as extensions functions on business and network entities.
 -----------------
It's also a part of the Domain Driven Design concept to have "bounded co texts" like these.



 */

// Setup Cache Layer
// Setup persistance Layer