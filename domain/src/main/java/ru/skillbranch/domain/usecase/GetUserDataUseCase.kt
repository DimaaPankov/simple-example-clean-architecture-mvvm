package ru.skillbranch.notesmvp.domain.usecase

import ru.skillbranch.notesmvp.domain.models.GetUserData
import ru.skillbranch.notesmvp.domain.repository.DataApi

class GetUserDataUseCase(val data:DataApi) {

    fun execute():GetUserData{
        return data.getData()
    }
}