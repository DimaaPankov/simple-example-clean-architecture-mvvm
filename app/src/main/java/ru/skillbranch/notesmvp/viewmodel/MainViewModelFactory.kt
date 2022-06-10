package ru.skillbranch.notesmvp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.skillbranch.notesmvp.data.repository.Data
import ru.skillbranch.notesmvp.data.storage.database.DataBaseUserStorage
import ru.skillbranch.notesmvp.domain.usecase.GetUserDataUseCase
import ru.skillbranch.notesmvp.domain.usecase.SaveUserUseCase

class MainViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val data = Data(DataBaseUserStorage())
        return MainViewModel(GetUserDataUseCase(data), SaveUserUseCase(data)) as T
    }
}