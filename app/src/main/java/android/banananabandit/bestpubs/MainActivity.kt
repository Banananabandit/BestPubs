package android.banananabandit.bestpubs

import android.banananabandit.bestpubs.databinding.ActivityMainBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAddPub.setOnClickListener {
            val intent = Intent(this, AddPubActivity::class.java)
            startActivity(intent)
        }
    }

}