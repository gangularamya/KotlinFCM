package kotlindemoapp.ramya.com.kotlindemoapp.FirebaseServices

import android.content.Intent
import android.support.v4.content.LocalBroadcastManager
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import kotlindemoapp.ramya.com.kotlindemoapp.Config.Config

/**
 * Created by prashanth on 8/12/17.
 */
class MyFirebaseMessagingService : FirebaseMessagingService(){
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        handleNotification(remoteMessage!!.notification.body)
    }

    private fun  handleNotification(body: String?) {
        val pushNotification = Intent(Config.STR_PUSH)
        pushNotification.putExtra("message", body)
        LocalBroadcastManager.getInstance(this).sendBroadcast(pushNotification)
    }
}