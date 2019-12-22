package com.example.osgeo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.github_login.*

class MainActivity : AppCompatActivity() {

    fun sendIntent(webURL : String){
        val openURL = Intent(android.content.Intent.ACTION_VIEW)
        openURL.data = Uri.parse(webURL)
        startActivity(openURL)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        osgeolive.setOnClickListener {
            startActivity(Intent(this, LoginGithub::class.java))
        }
        deegree.setOnClickListener {
            startActivity(Intent(this, LoginGithub::class.java))
        }
        open_layers.setOnClickListener {
            startActivity(Intent(this, LoginGithub::class.java))
        }
        grass.setOnClickListener {
            startActivity(Intent(this, LoginTrac::class.java))
        }
        qgis.setOnClickListener {
            startActivity(Intent(this, LoginGithub::class.java))
        }
        istsos.setOnClickListener {
            startActivity(Intent(this, LoginGithub::class.java))
        }
        pgRouting.setOnClickListener {
            startActivity(Intent(this, LoginGithub::class.java))
        }
        gdal.setOnClickListener {
            startActivity(Intent(this, LoginTrac::class.java))        }
        geo_tools.setOnClickListener {
            startActivity(Intent(this, LoginTrac::class.java))
        }


    }



}
