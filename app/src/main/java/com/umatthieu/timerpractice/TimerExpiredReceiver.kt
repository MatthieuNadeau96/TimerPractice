package com.umatthieu.timerpractice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.umatthieu.timerpractice.util.NotificationUitil
import com.umatthieu.timerpractice.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUitil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
