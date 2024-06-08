package com.example.flutter_screen_open_from_android_intent_1

//class FullScreenAlarmActivity { }

import android.content.Context
import android.content.Intent
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.plugin.common.MethodChannel

class FullScreenAlarmActivity : FlutterActivity() {
    private val CHANNEL = "com.example.flutter_screen_open_from_android_intent_1/alarm"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Get the singleton FlutterEngine
        val flutterEngine = FlutterEngineSingleton.getFlutterEngine(this)

        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).invokeMethod("openAlarmPage", mapOf(
            "title" to intent.getStringExtra("title"),
            "body" to intent.getStringExtra("body")
        ))

        // Ensure the activity doesn't stay in the back stack
        //finish()
    }

    override fun provideFlutterEngine(context: Context): FlutterEngine? {
        return FlutterEngineSingleton.getFlutterEngine(context)
    }
}


//class FullScreenAlarmActivity : FlutterActivity() {
//    private val CHANNEL = "com.example.flutter_screen_open_from_android_intent_1/alarm"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Extract the extras from the intent
//        val title = intent.getStringExtra("title")
//        val body = intent.getStringExtra("body")
//
//        // Pass the extracted data to the Flutter side
//        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).invokeMethod("openAlarmPage", mapOf("title" to title, "body" to body))
//
//        // Close this activity to avoid keeping it in the back stack
//        //finish()
//    }
//}

