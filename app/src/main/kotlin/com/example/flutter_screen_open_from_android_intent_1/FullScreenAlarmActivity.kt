package com.example.flutter_screen_open_from_android_intent_1

//class FullScreenAlarmActivity { }

import android.content.Intent
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugin.common.MethodChannel

class FullScreenAlarmActivity : FlutterActivity() {
    private val CHANNEL = "com.example.flutter_screen_open_from_android_intent_1/alarm"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Extract the extras from the intent
        val title = intent.getStringExtra("title")
        val body = intent.getStringExtra("body")

        // Pass the extracted data to the Flutter side
        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).invokeMethod("openAlarmPage", mapOf("title" to title, "body" to body))

        // Close this activity to avoid keeping it in the back stack
        //finish()
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
//        finish()
//    }
//}



//class FullScreenAlarmActivity : FlutterActivity() {
//    private val CHANNEL = "com.example.flutter_screen_open_from_android_intent_1/alarm"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Get the cached Flutter engine
//        val flutterEngine = FlutterEngineManager.getFlutterEngine(this)
//
//        // Extract the extras from the intent
//        val title = intent.getStringExtra("title")
//        val body = intent.getStringExtra("body")
//
//        // Pass the extracted data to the Flutter side
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).invokeMethod("openAlarmPage", mapOf("title" to title, "body" to body))
//
//        // Close this activity to avoid keeping it in the back stack
//        finish()
//    }
//}

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
//        finish()
//    }
//}



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
//        finish()
//    }
//}


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



//class FullScreenAlarmActivity : FlutterActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Extract the extras from the intent
//        val title = intent.getStringExtra("title")
//        val body = intent.getStringExtra("body")
//
//        // Start FlutterActivity with the cached Flutter engine and specified route
//        val flutterIntent = FlutterActivity
//            .withCachedEngine("my_engine_id")
//            .build(this)
//            .apply {
//                putExtra("title", title)
//                putExtra("body", body)
//            }
//
//        startActivity(flutterIntent)
//        finish() // Optional: Close this activity to avoid keeping it in the back stack
//    }
//}





//class FullScreenAlarmActivity : FlutterActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Extract the extras from the intent
//        val title = intent.getStringExtra("title")
//        val body = intent.getStringExtra("body")
//
//        // Start FlutterActivity with the existing Flutter engine and specified route
//        val flutterIntent = FlutterActivity
//            .withCachedEngine("my_engine_id")
//            .build(this)
//            .apply {
//                putExtra("title", title)
//                putExtra("body", body)
//            }
//
//        startActivity(flutterIntent)
//        finish() // Optional: Close this activity to avoid keeping it in the back stack
//    }
//}


//class FullScreenAlarmActivity : FlutterActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Extract the extras from the intent
//        val title = intent.getStringExtra("title")
//        val body = intent.getStringExtra("body")
//
//        // Pass the extracted data to the Flutter screen
//        val flutterIntent = withNewEngine().initialRoute("/FullScreenAlarmPage?title=$title&body=$body").build(this)
//
//        startActivity(flutterIntent)
//        //finish() // Optional: Close this activity to avoid keeping it in the back stack
//    }
//}