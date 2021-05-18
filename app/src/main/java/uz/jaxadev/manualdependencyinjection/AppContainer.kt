package uz.jaxadev.manualdependencyinjection

import retrofit2.Retrofit
import uz.jaxadev.manualdependencyinjection.repository.MainRepository
import uz.jaxadev.manualdependencyinjection.viewmodel.MainViewModelFactory

class AppContainer {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://mars.udacity.com")
        .build()

    val repository = MainRepository(retrofit)

    val viewModelFactory = MainViewModelFactory(repository)

    var secondContainer: SecondContainer? = null

}

class SecondContainer(val repository: MainRepository) {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://mars.udacity.com")
        .build()

    val viewModelFactory = MainViewModelFactory(repository)

}