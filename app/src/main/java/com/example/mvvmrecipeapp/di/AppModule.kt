package com.example.mvvmrecipeapp.di

import android.content.Context
import com.example.mvvmrecipeapp.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton // live  as long as the app live
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }


    @Singleton
    @Provides
    fun provideRandomString(): String {
        return "Hey look a random String !!"
        /*
              Provides dependency
           explain meaning of that every time i inject this type in any class like  :
              @Inject
            lateinit var someRandomString: String
     */
    }

}

/*
@InstallIn

this where you define component you install in


object for singleton
 */

/*

this component scooped to diff life cycle of the application
-scope mean the life time of the dependency

SingletonComponent	Application :
 scooped to application live as long the app is life

ViewModelComponent	ViewModel :

 will exist as long as the ViewModel who hold that dependency is  a live
 if i  build ViewModel i inject some dependency to it ,
 so this dependency will live as long as the ViewModel live

ActivityComponent  Activity :
 if i inject dependency  in the activity this dependency  will live as long as
 the activity  a live

ActivityRetainedComponent :
 and if i rotate the screen  the dependency get destroyed and recreated the activity

 and so on





 */