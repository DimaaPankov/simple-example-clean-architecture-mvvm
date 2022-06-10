package ru.skillbranch.notesmvp.data.storage

import ru.skillbranch.notesmvp.data.storage.models.DataBaseModel

interface UserStorage {

    fun save(save: DataBaseModel)

    fun get () : DataBaseModel

}