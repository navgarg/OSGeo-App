package com.example.osgeo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri

class MainActivity : AppCompatActivity() {

    fun sendIntent(webURL : String){
        val openURL = Intent(android.content.Intent.ACTION_VIEW)
        openURL.data = Uri.parse(webURL)
        startActivity(openURL)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        geoserver.setOnClickListener {
            sendIntent("https://www.osgeo.org/projects/geoserver/")
        }
        geonode.setOnClickListener {
            sendIntent("https://www.osgeo.org/projects/geonode/")
        }
        geo_network.setOnClickListener {
            sendIntent("https://www.osgeo.org/projects/geonetwork/")
        }
        geomoose.setOnClickListener {
            sendIntent("https://www.osgeo.org/projects/geomoose/")
        }
        gdal.setOnClickListener {
            sendIntent("https://www.osgeo.org/projects/gdal/")
        }
        deegree.setOnClickListener {
            sendIntent("https://www.osgeo.org/projects/deegree/")
        }

    }



}
