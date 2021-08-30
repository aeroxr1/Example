package com.aeroxr1.multiplepopupusecase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aeroxr1.multiplepopupusecase.ui.mainfragment2.MainFragment2

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity3)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment2.newInstance())
                .commitNow()
        }
    }
}