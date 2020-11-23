package ru.trinitydigital.garagemuseum.data

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class TimeBroadcastReceiver : BroadcastReceiver( ) {

    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context, "YAHOOO", Toast.LENGTH_LONG).show()
    }
}