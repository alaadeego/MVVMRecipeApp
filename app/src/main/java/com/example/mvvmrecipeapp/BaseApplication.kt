package com.example.mvvmrecipeapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication:Application(){
}

/*
HiltAndroidApp
- that will generate top level of component
app component
retain component
activity component
fragment component
service component ....

generate it automatically
and define modules  , install dependencies

 */