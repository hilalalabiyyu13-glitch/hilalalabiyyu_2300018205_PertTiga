package com.hilalalabiyyu.post_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hilalalabiyyu.post_3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("nama")
        val username = intent.getStringExtra("username")
        val umur = intent.getStringExtra("umur")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")

        binding.hasilNama.text = "Full Name: $nama"
        binding.hasilUsername.text = "Username: $username"
        binding.hasilUmur.text = "Age: $umur"
        binding.hasilEmail.text = "Email: $email"
        binding.hasilGender.text = "Gender: $gender"
    }
}
