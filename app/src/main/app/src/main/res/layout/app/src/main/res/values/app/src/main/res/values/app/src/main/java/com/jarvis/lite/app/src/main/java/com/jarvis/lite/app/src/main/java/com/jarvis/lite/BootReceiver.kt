package com.jarvis.lite

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            Toast.makeText(
                context,
                "Jarvis Lite restarted after boot",
                Toast.LENGTH_SHORT
            ).show()

            // Future improvement:
            // Read saved reminders from SharedPreferences/Room
            // and schedule them again using AlarmManager.
        }
    }
}
