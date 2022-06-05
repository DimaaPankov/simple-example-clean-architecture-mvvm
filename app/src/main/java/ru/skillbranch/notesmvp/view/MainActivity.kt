package ru.skillbranch.notesmvp.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.skillbranch.notesmvp.R
import ru.skillbranch.notesmvp.databinding.ActivityMainBinding
import ru.skillbranch.notesmvp.model.Model
import ru.skillbranch.notesmvp.presenter.MainPresenter
import ru.skillbranch.notesmvp.presenter.ViewApi

class MainActivity : AppCompatActivity(), ViewApi {
    lateinit var binding: ActivityMainBinding
    val presenter = MainPresenter(this,Model())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.init(this)

    }



    override fun onDestroy() {
        super.onDestroy()
        presenter.distroy()
    }

    override fun showData(){
        binding.textView.text = presenter.getData()
    }

    override fun clickBattonSave(){
      binding.Bsave.setOnClickListener{
          presenter.saveData(binding.editText.text.toString())
      }}

        override fun clickButtonGet(){
            binding.Bget.setOnClickListener {
                binding.textView.text =  presenter.getData()


            }


      }



}