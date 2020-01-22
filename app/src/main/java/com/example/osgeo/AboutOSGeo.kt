package com.example.osgeo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.about_osgeo.*

class AboutOSGeo : AppCompatActivity() {

    private fun sendIntent(webURL : String){
        val openURL = Intent(android.content.Intent.ACTION_VIEW)
        openURL.data = Uri.parse(webURL)
        startActivity(openURL)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_osgeo)

        about.setOnClickListener{
            sendIntent("https://www.osgeo.org/about/")
        }
        open_source.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/what-is-open-source/")
        }
        board.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/board/")
        }
        charter_members.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/charter-members")
        }
        committees.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/committees/")
        }
        sponsors.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/sponsors/")
        }
        partners.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/partners")
        }
        branding_material.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/branding-material")
        }
        contact.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/contact")
        }
        faq.setOnClickListener {
            sendIntent("https://www.osgeo.org/about/faq")
        }

    }
}