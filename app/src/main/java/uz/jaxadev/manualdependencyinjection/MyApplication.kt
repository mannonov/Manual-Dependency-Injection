package uz.jaxadev.manualdependencyinjection

import android.app.Application

class MyApplication : Application() {

    val appContainer = AppContainer()

}