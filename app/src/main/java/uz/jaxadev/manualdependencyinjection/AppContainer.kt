package uz.jaxadev.manualdependencyinjection

import retrofit2.Retrofit
import uz.jaxadev.manualdependencyinjection.repository.MainRepository
import uz.jaxadev.manualdependencyinjection.viewmodel.MainViewModelFactory

class AppContainer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://mars.udacity.com")
        .build()

    private val repository = MainRepository(retrofit)

    val viewModelFactory = MainViewModelFactory(repository)





}