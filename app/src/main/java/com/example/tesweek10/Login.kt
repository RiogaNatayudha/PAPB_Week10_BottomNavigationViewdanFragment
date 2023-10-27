package com.example.tesweek10

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tesweek10.databinding.FragmentLoginBinding

class Login : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Referensi ke elemen UI seperti EditText dan tombol
        val usernameEditText = binding.edtUsername
        val passwordEditText = binding.edtPassword
        val loginButton = binding.btnLogin  // Change this to the correct button ID

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Logika validasi login
            if (username == "Yogs" && password == "123") {
                // Jika benar, buat Intent untuk pindah ke HomeActivity
                val intent = Intent(requireContext(), Playing::class.java)


                // Tambahkan username sebagai extra
                intent.putExtra("USERNAME", username)

                // Start the MainActivity using the intent
                startActivity(intent)
            } else {
                // Jika salah, tampilkan pesan error
                Toast.makeText(requireContext(), "Username atau Password salah!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
