package ru.skillbranch.notesmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import ru.skillbranch.notesmvp.R
import ru.skillbranch.notesmvp.data.repository.Data
import ru.skillbranch.notesmvp.data.storage.database.DataBaseUserStorage
import ru.skillbranch.notesmvp.databinding.ActivityMainBinding
import ru.skillbranch.notesmvp.domain.models.GetUserData
import ru.skillbranch.notesmvp.domain.usecase.GetUserDataUseCase
import ru.skillbranch.notesmvp.domain.usecase.SaveUserUseCase
import ru.skillbranch.notesmvp.viewmodel.MainViewModel
import ru.skillbranch.notesmvp.viewmodel.MainViewModelFactory


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val viewmodel by lazy { ViewModelProvider(this,MainViewModelFactory()).get(MainViewModel::class.java) }
    val dataBase = Data(DataBaseUserStorage())
    val getdata = GetUserDataUseCase(dataBase)
    val saveData = SaveUserUseCase(dataBase)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewmodel.resultLive.observe(this,{
            binding.textView.text = it
        })

        binding.Bget.setOnClickListener {
            viewmodel.load()
        }
        binding.Bsave.setOnClickListener {
            viewmodel.save(binding.editText.text.toString())
        }



    }




}