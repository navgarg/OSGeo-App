package com.example.osgeo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.initiatives_activity.*

class Initiatives : AppCompatActivity() {

    private fun sendIntent(webURL: String) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(webURL)
        startActivity(openURL)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.initiatives_activity)

        geo_for_all.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/geo-for-all/")
        }
        foss4g.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/foss4g/")
        }
        foss4g_travel_grants.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/foss4g-travel-grant-program/")
        }
        open_geoscience.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/open-geoscience/")
        }
        un_initiative.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/un-initiative/")
        }
        gsoc.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/gsoc/")
        }
        osgeolive.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/osgeo-live-initiative/")
        }
        meta_crs.setOnClickListener {
            sendIntent("https://www.osgeo.org/initiatives/meta-crs-initiative/")
        }
    }
}
