package com.example.flutter_screen_open_from_android_intent_1


import android.content.Context
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister

object FlutterEngineManager {
    private var flutterEngine: FlutterEngine? = null

    fun getFlutterEngine(context: Context): FlutterEngine {
        if (flutterEngine == null) {
            flutterEngine = FlutterEngine(context).apply {
                dartExecutor.executeDartEntrypoint(
                    DartExecutor.DartEntrypoint.createDefault()
                )
                GeneratedPluginRegister.registerGeneratedPlugins(this)
                // Register the engine with an ID
                FlutterEngineCache
                    .getInstance()
                    .put("my_engine_id", this)
            }
        }
        return flutterEngine!!
    }
}

//object FlutterEngineManager {
//    private var flutterEngine: FlutterEngine? = null
//
//    fun getFlutterEngine(context: Context): FlutterEngine {
//        if (flutterEngine == null) {
//            flutterEngine = FlutterEngine(context).apply {
//                dartExecutor.executeDartEntrypoint(
//                    DartExecutor.DartEntrypoint.createDefault()
//                )
//                // Register the engine with an ID
//                FlutterEngineCache
//                    .getInstance()
//                    .put("my_engine_id", this)
//            }
//        }
//        return flutterEngine!!
//    }
//}



//object FlutterEngineManager {
//    private var flutterEngine: FlutterEngine? = null
//
//    fun getFlutterEngine(context: Context): FlutterEngine {
//        if (flutterEngine == null) {
//            flutterEngine = FlutterEngine(context).apply {
//                dartExecutor.executeDartEntrypoint(
//                    DartExecutor.DartEntrypoint.createDefault()
//                )
//                GeneratedPluginRegister.registerGeneratedPlugins(this)
//                // Register the engine with an ID
//                FlutterEngineCache
//                    .getInstance()
//                    .put("my_engine_id", this)
//            }
//        }
//        return flutterEngine!!
//    }
//}


//object FlutterEngineManager {
//    private var flutterEngine: FlutterEngine? = null
//
//    fun getFlutterEngine(context: Context): FlutterEngine {
//        if (flutterEngine == null) {
//            flutterEngine = FlutterEngine(context).apply {
//                dartExecutor.executeDartEntrypoint(
//                    DartExecutor.DartEntrypoint.createDefault()
//                )
//                GeneratedPluginRegister.registerGeneratedPlugins(this)
//                // Register the engine with an ID
//                FlutterEngineCache
//                    .getInstance()
//                    .put("my_engine_id", this)
//            }
//        }
//        return flutterEngine!!
//    }
//}




//object FlutterEngineManager {
//    private var flutterEngine: FlutterEngine? = null
//
//    fun getFlutterEngine(context: Context): FlutterEngine {
//        if (flutterEngine == null) {
//            flutterEngine = FlutterEngine(context).apply {
//                dartExecutor.executeDartEntrypoint(
//                    DartExecutor.DartEntrypoint.createDefault()
//                )
//                // Register the engine with an ID
//                FlutterEngineCache
//                    .getInstance()
//                    .put("my_engine_id", this)
//            }
//        }
//        return flutterEngine!!
//    }
//}





//object FlutterEngineManager {
//    private var flutterEngine: FlutterEngine? = null
//
//    fun getFlutterEngine(context: Context): FlutterEngine {
//        if (flutterEngine == null) {
//            flutterEngine = FlutterEngine(context)
//            flutterEngine!!.dartExecutor.executeDartEntrypoint(
//                DartExecutor.DartEntrypoint.createDefault()
//            )
//        }
//        return flutterEngine!!
//    }
//}
