package ru.skillbranch.notesmvp.data.repository

import ru.skillbranch.notesmvp.data.storage.models.DataBaseModel
import ru.skillbranch.notesmvp.data.storage.UserStorage
import ru.skillbranch.notesmvp.domain.models.GetUserData
import ru.skillbranch.notesmvp.domain.repository.DataApi

class Data(val storage: UserStorage): DataApi {

    private var _data:GetUserData? = null

    override fun getData():GetUserData  = GetUserData(storage.get().Data)

    override fun saveData(data: GetUserData) {
        storage.save(DataBaseModel( data.stringData))
     _data = GetUserData(storage.get().Data)

    }

}