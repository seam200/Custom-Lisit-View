package com.example.listviewcustom

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val companyName = arrayOf<String>(
        "Niyamat Enterprise",
        "Niyamat IT",
        "Niyamat B2B",
        "Niyamat Courier Service",
        "Niyamat Transport",
        "Niyamat Builders",
        "Niyamat Unity",
        "Ahosan Chowdhury "
    )
    val companyDts = arrayOf<String>(
        "Only Import Business",
        "IT Clients Service",
        "Wholesale Market Place",
        "Coming Soon",
        "One By One Service",
        "Coming Soon",
        "Only For Management",
        "Founder and Director"
    )

    val companyLongDts = arrayOf(
        "RO, UV, UC Water Filter Set up .",
        "Web Development, Software Development, Digital Marketing, Boost, Promote, Seo, Smart Business Easy And Better Solutions.",
        "100% Original Products are Wholesale Here. All Kinds of Branded Products are available here.",
        "Documents are Processing",
        "Dore to Dore Service",
        "Documents are Processing",
        "Our All Company Management Badge",
        "Over All Company Founder and Director. Ahosan Chowdhury"
    )

    val companyLogo = arrayOf<Int>(
        R.drawable.niyamatonline,
        R.drawable.niyamatit,
        R.drawable.b2b,
        R.drawable.courier,
        R.drawable.transport,
        R.drawable.niyamatbuilder,
        R.drawable.niyamatunity,
        R.drawable.ahosan

    )
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        val myAdapter = MyAdapter(this,companyName, companyDts, companyLogo)

        listView.adapter = myAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked At ${parent.getItemAtPosition(position)}", android.widget.Toast.LENGTH_SHORT).show()
            var Intent = Intent(this, DetailsActivity::class.java)
            Intent.putExtra("companyName", companyName[position])
            Intent.putExtra("companyDts", companyDts[position])
            Intent.putExtra("companyLongDts", companyLongDts[position])
            Intent.putExtra("companyLogo", companyLogo[position])
            startActivity(Intent)
        }
    }
}