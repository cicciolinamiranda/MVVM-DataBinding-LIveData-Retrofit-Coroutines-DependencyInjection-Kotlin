package com.example.firozhasan.retrofitkotlinexample.viewModel

import android.util.Log
import android.view.View
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firozhasan.retrofitkotlinexample.model.modelClass.Country
import com.example.firozhasan.retrofitkotlinexample.model.repos.FindCountryRepository
import com.example.firozhasan.retrofitkotlinexample.util.Coroutines

class FindCountryViewModel(private val repository : FindCountryRepository)
    : ViewModel() {

    val countryFullInfo: LiveData<List<Country>>
        get() = repository.findCountryFullInfo

    val country: LiveData<String>
        get() = repository.findCountryName

    @Bindable
    val editTextCountryName = MutableLiveData<String>()

    fun onChangeFindCountryClick(view: View) {
        Log.d("hellohello", "find er view model e asche outside ")
//why courutines?????????????????????????????????????????????????????????????????????
        Coroutines.main {
            Log.d("hellohello", "find er view model e asche inside ")
            repository.findCountryByCapital(editTextCountryName.value.toString())
        }
    }



}