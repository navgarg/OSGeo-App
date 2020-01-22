package com.example.osgeo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.project_activity.*
import android.content.Intent
import android.net.Uri
import android.view.Menu
import android.view.MenuItem


class ProjectsActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_activity, menu)
        return true
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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_activity)

        projects.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.osgeo.org/projects")
            startActivity(openURL)
        }

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
            startActivity(Intent(this, LoginTrac::class.java))
        }

        geo_tools.setOnClickListener {
            startActivity(Intent(this, LoginTrac::class.java))
        }


    }



}
