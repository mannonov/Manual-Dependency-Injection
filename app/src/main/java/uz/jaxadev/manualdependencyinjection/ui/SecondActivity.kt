package uz.jaxadev.manualdependencyinjection.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.jaxadev.manualdependencyinjection.AppContainer
import uz.jaxadev.manualdependencyinjection.MyApplication
import uz.jaxadev.manualdependencyinjection.R
import uz.jaxadev.manualdependencyinjection.SecondContainer
import uz.jaxadev.manualdependencyinjection.viewmodel.SecondViewModel

class SecondActivity : AppCompatActivity() {

    private lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        appContainer = (application as MyApplication).appContainer

        appContainer.secondContainer = SecondContainer(appContainer.repository)

        val secondContainer = appContainer.secondContainer

        if (secondContainer != null) {
            secondContainer.viewModelFactory.create(SecondViewModel::class.java)
        }

    }

    override fun onDestroy() {

        appContainer.apply {
            secondContainer = null
        }

        super.onDestroy()
    }
}