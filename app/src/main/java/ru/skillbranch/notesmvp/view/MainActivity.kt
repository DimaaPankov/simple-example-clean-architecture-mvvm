package ru.skillbranch.notesmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.skillbranch.notesmvp.R
import ru.skillbranch.notesmvp.data.repository.Data
import ru.skillbranch.notesmvp.data.storage.database.DataBaseUserStorage
import ru.skillbranch.notesmvp.databinding.ActivityMainBinding
import ru.skillbranch.notesmvp.domain.models.GetUserData
import ru.skillbranch.notesmvp.domain.usecase.GetUserDataUseCase
import ru.skillbranch.notesmvp.domain.usecase.SaveUserUseCase


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val dataBase = Data(DataBaseUserStorage())
    val getdata = GetUserDataUseCase(dataBase)
    val saveData = SaveUserUseCase(dataBase)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Bget.setOnClickListener {
            binding.textView.text = getdata.execute().stringData
        }
        binding.Bsave.setOnClickListener {
            saveData.execute(GetUserData(binding.editText.text.toString()))
        }
    }




}