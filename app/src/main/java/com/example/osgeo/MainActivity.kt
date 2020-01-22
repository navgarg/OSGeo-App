package com.example.osgeo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity  : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_activity, menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
//            R.id.projects -> {
//                startActivity(Intent(this, ProjectsActivity::class.java))
//            }
            R.id.resources -> {
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.osgeo.org/resources")
                startActivity(openURL)
            }

            R.id.about_osgeo -> {
                startActivity(Intent(this, AboutOSGeo::class.java))
            }
            R.id.initiatives -> {
                startActivity(Intent(this, Initiatives::class.java))
            }
            R.id.community -> {
                startActivity(Intent(this, Community::class.java))
            }

        }
        return true
    }




}