package com.example.tesweek10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tesweek10.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigasi.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.action_playing -> replaceFragment(Playing())
                R.id.action_theater -> replaceFragment(Theater())
                R.id.action_upcoming -> replaceFragment(UpComing())
                R.id.action_akun -> {
                    // Check if the intent contains the "USERNAME" extra
                    val username = intent.getStringExtra("USERNAME")
                    if (username != null) {
                        val fragment = Akun()
                        val args = Bundle()
                        args.putString("USERNAME", username)
                        fragment.arguments = args
                        replaceFragment(fragment)
                    }
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragment)
        fragmentTransaction.commit()
    }
}