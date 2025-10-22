package com.hilalalabiyyu.post_3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hilalalabiyyu.post_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            val nama = binding.namapanjang.text.toString()
            val username = binding.username.text.toString()
            val umur = binding.umur.text.toString()
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            val confirm = binding.confirmpassword.text.toString()
            val gender = if (binding.laki.isChecked) "Laki-laki" else "Perempuan"

            if (nama.isEmpty() || username.isEmpty() || umur.isEmpty() || email.isEmpty() ||
                password.isEmpty() || confirm.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirm) {
                Toast.makeText(this, "Password dan Confirm Password harus sama!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("username", username)
            intent.putExtra("umur", umur)
            intent.putExtra("email", email)
            intent.putExtra("gender", gender)
            startActivity(intent)
        }
    }
}
