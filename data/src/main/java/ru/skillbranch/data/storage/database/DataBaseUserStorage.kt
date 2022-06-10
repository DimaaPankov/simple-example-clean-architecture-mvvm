package ru.skillbranch.notesmvp.data.storage.database

import ru.skillbranch.notesmvp.data.storage.UserStorage
import ru.skillbranch.notesmvp.data.storage.models.DataBaseModel

class DataBaseUserStorage : UserStorage {
    var _data = DataBaseModel("null")

    override fun save(data: DataBaseModel) {
        _data = data
    }

    override fun get(): DataBaseModel =  _data

}