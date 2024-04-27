package com.example.listviewcustom

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


private var Any?.text: String?
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}

class DetailsActivity : AppCompatActivity() {
    lateinit var companyNm:TextView
    lateinit var companyLongDts:TextView
    lateinit var logo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        companyNm = findViewById(R.id.companyNm)
        companyLongDts = findViewById(R.id.companyLongDts)
        logo = findViewById(R.id.logo)

        var companyName = intent.getStringExtra("companyName")
        var companyDts = intent.getStringExtra("companyDts")
        var companyLogo = intent.getStringExtra("companyLogo")

        companyName.text = companyName
        companyDts.text = companyDts
        companyLogo.setImageResource(companyLogo)
    }
}

private fun CharSequence?.setImageResource(companyLogo: String?) {
    TODO("Not yet implemented")
}
