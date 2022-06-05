package ru.skillbranch.notesmvp.presenter

interface DataApi {
    fun getData():String
    fun saveData(data:String)
}