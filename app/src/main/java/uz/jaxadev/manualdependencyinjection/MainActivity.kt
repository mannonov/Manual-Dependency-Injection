package uz.jaxadev.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.jaxadev.manualdependencyinjection.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appContainer = (application as MyApplication).appContainer

        val mainViewModel = appContainer.viewModelFactory.create(MainViewModel::class.java)


    }
}