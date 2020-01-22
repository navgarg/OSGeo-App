package com.example.osgeo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.about_osgeo.*
import kotlinx.android.synthetic.main.community_activity.*

class Community : AppCompatActivity() {

    private fun sendIntent(webURL : String){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(webURL)
        startActivity(openURL)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.community_activity)

        welcome.setOnClickListener{
            sendIntent("https://www.osgeo.org/community/welcome/")
        }
        getting_started.setOnClickListener{
            sendIntent("https://www.osgeo.org/community/getting-started-osgeo/")
        }
        local_chapters.setOnClickListener{
            sendIntent("https://www.osgeo.org/local-chapters/")
        }
        code_of_conduct.setOnClickListener{
            sendIntent("https://www.osgeo.org/code_of_conduct/")
        }
        events.setOnClickListener{
            sendIntent("https://www.osgeo.org/events/")
        }
        news.setOnClickListener{
            sendIntent("https://www.osgeo.org/community-news/")
        }
        communications.setOnClickListener{
            sendIntent("https://www.osgeo.org/community/communications/")
        }
        members.setOnClickListener{
            sendIntent("https://www.osgeo.org/community/members/")
        }
        service_providers.setOnClickListener{
            sendIntent("https://www.osgeo.org/service-providers/")
        }
        awards.setOnClickListener{
            sendIntent("https://www.osgeo.org/community/awards/")
        }


    }
}