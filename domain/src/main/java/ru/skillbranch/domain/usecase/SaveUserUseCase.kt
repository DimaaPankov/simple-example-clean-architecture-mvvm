package ru.skillbranch.notesmvp.domain.usecase

import ru.skillbranch.notesmvp.domain.models.GetUserData
import ru.skillbranch.notesmvp.domain.repository.DataApi

class SaveUserUseCase(val data:DataApi) {
    fun execute(getUserData: GetUserData){
           data.saveData(getUserData)
    }
}