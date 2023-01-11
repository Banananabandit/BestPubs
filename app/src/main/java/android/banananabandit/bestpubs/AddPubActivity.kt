package android.banananabandit.bestpubs

import android.banananabandit.bestpubs.databinding.ActivityAddPubBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddPubActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddPubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAddPub)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarAddPub.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}