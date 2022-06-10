package ru.skillbranch.notesmvp.domain.repository

import ru.skillbranch.notesmvp.domain.models.GetUserData

interface DataApi {
    fun getData(): GetUserData
    fun saveData(data:GetUserData)
}