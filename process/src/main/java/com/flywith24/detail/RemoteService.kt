package com.flywith24.detail

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * @author yyz (杨云召)
 * @date   2020/11/6
 * time   9:53
 * description
 */
class RemoteService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null
}