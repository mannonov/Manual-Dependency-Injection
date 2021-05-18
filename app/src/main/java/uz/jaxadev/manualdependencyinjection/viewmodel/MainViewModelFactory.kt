package uz.jaxadev.manualdependencyinjection.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.jaxadev.manualdependencyinjection.repository.MainRepository

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory(private val mainRepository: MainRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(mainRepository = mainRepository) as T
        }

        throw IllegalArgumentException("Not unknown ViewModel class")


    }

}