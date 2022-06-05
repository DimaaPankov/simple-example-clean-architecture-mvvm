package ru.skillbranch.notesmvp.model

import ru.skillbranch.notesmvp.presenter.DataApi

class Model:DataApi {
    var _data = ""
    override fun getData():String {
       return _data
    }

    override fun saveData(data: String) {
     _data = data
    }

}