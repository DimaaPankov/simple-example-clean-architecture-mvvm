package ru.skillbranch.notesmvp.presenter

import android.content.Context

class MainPresenter(val View:ViewApi, var model:DataApi) {
    private var context: Context? = null
    fun init(_view: Context){
        context = _view
        View.showData()
        View.clickButtonGet()
        View.clickBattonSave()
    }




    fun distroy(){
        context = null
    }

    fun saveData(text:String){
        model.saveData(text)
    }
    fun getData():String = model.getData()


}