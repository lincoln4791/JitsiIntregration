package com.example.jitsidemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import org.jitsi.meet.sdk.JitsiMeetActivity
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions
import java.net.URL


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnJitsi).setOnClickListener{
           /* JitsiMeetConferenceOptions.setDefaultOptions(
                JitsiMeetConferenceOptions.Builder()
                    .setServerURL(JitsiMeetUtils.buildURL()) // Replace with your Jitsi server URL
                    .setWelcomePageEnabled(false) // Disable the welcome page
                    .build()
            )*/

            val options: JitsiMeetConferenceOptions = JitsiMeetConferenceOptions.Builder()
                .setServerURL(URL("https://meet.jit.si"))
                .setRoom("test123")
                .setAudioMuted(false)
                .setVideoMuted(false)
                .setAudioOnly(false)
                //.setWelcomePageEnabled(false)
                .setConfigOverride("requireDisplayName", true)
                .build()

            // Start a Jitsi Meet conference
            val intent = Intent(this, JitsiMeetActivity::class.java)
            intent.action = "org.jitsi.meet.CONFERENCE"
            //intent.putExtra("JitsiMeetConferenceOptions", JitsiMeetConferenceOptions.Builder().build())
            intent.putExtra("JitsiMeetConferenceOptions", options)
            startActivity(intent)
        }

    }
}