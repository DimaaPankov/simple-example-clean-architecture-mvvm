package ru.skillbranch.notesmvp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import ru.skillbranch.notesmvp.domain.models.GetUserData
import ru.skillbranch.notesmvp.domain.usecase.GetUserDataUseCase
import ru.skillbranch.notesmvp.domain.usecase.SaveUserUseCase

class MainViewModel(val getData : GetUserDataUseCase, val saveData : SaveUserUseCase):ViewModel() {
    private val _resultLive = MutableLiveData<String>()
    val resultLive = _resultLive

    init{

    }
    override fun onCleared() {
        super.onCleared()

    }

    fun save(text:String) {
         saveData.execute(GetUserData(text))
    }

    fun load() { _resultLive.value = getData.execute().stringData}


}