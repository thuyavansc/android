package com.example.flutter_screen_open_from_android_intent_1

import io.flutter.embedding.android.FlutterActivity

//class MainActivity: FlutterActivity()
import android.content.Intent
import android.os.Bundle
import android.util.Log
//import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.dart.DartExecutor
import io.flutter.plugin.common.MethodChannel
import io.flutter.embedding.engine.FlutterEngineCache

class MainActivity : FlutterActivity() {
    private val CHANNEL = "your_channel_name"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up the MethodChannel to listen for method calls from Flutter
        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
            if (call.method == "startFullScreenActivity") {
                val title = call.argument<String>("title")
                val body = call.argument<String>("body")
                startFullScreenAlarmActivity(title, body)
                result.success(null)
            } else {
                result.notImplemented()
            }
        }
    }

    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
            putExtra("title", title)
            putExtra("body", body)
        }
        startActivity(intent)
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
            if (call.method == "startFullScreenActivity") {
                val title = call.argument<String>("title")
                val body = call.argument<String>("body")
                startFullScreenAlarmActivity(title, body)
                result.success(null)
            } else {
                result.notImplemented()
            }
        }
    }
}

//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Initialize the Flutter engine
//        val engine = FlutterEngine(this)
//        engine.dartExecutor.executeDartEntrypoint(
//            DartExecutor.DartEntrypoint.createDefault()
//        )
//        MethodChannel(engine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        }
//        startActivity(intent)
//    }
//}



//
//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Get the cached Flutter engine
//        val flutterEngine = FlutterEngineManager.getFlutterEngine(this)
//
//        // Set up the MethodChannel
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//        }
//        startActivity(intent)
//    }
//}
//


//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Initialize and cache the Flutter engine
//        val flutterEngine = FlutterEngine(this)
//        flutterEngine.dartExecutor.executeDartEntrypoint(
//            DartExecutor.DartEntrypoint.createDefault()
//        )
//        FlutterEngineCache.getInstance().put("my_engine_id", flutterEngine)
//
//        // Set up the MethodChannel in onCreate
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//        }
//        startActivity(intent)
//    }
//}




//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Initialize and cache the Flutter engine
//        val flutterEngine = FlutterEngine(this)
//        flutterEngine.dartExecutor.executeDartEntrypoint(
//            DartExecutor.DartEntrypoint.createDefault()
//        )
//        FlutterEngineCache.getInstance().put("my_engine_id", flutterEngine)
//
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//        }
//        startActivity(intent)
//    }
//}




//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Set up the MethodChannel to listen for method calls from Flutter
//        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//        }
//        startActivity(intent)
//    }
//
//    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
//        super.configureFlutterEngine(flutterEngine)
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//}



//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Initialize the Flutter engine
//        val engine = FlutterEngine(this)
//        engine.dartExecutor.executeDartEntrypoint(
//            DartExecutor.DartEntrypoint.createDefault()
//        )
//        MethodChannel(engine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        }
//        startActivity(intent)
//    }
//}





//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Initialize the Flutter engine
//        FlutterEngineManager.getFlutterEngine(this)
//
//        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        }
//        startActivity(intent)
//    }
//
//    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
//        super.configureFlutterEngine(flutterEngine)
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//}


//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Initialize the Flutter engine
//        FlutterEngineManager.getFlutterEngine(this)
//
//        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        }
//        startActivity(intent)
//    }
//
//    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
//        super.configureFlutterEngine(flutterEngine)
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//}


//class MainActivity : FlutterActivity() {
//    private val CHANNEL = "your_channel_name"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//    private fun startFullScreenAlarmActivity(title: String?, body: String?) {
//        Log.d("MainActivity", "startFullScreenAlarmActivity")
//        val intent = Intent(this, FullScreenAlarmActivity::class.java).apply {
//            putExtra("title", title)
//            putExtra("body", body)
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        }
//        startActivity(intent)
//    }
//
//    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
//        super.configureFlutterEngine(flutterEngine)
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "startFullScreenActivity") {
//                val title = call.argument<String>("title")
//                val body = call.argument<String>("body")
//                startFullScreenAlarmActivity(title, body)
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//}
