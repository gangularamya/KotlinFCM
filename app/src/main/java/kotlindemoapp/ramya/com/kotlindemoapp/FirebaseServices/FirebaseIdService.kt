package kotlindemoapp.ramya.com.kotlindemoapp.FirebaseServices

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

/**
 * Created by prashanth on 8/12/17.
 */
class FirebaseIdService:FirebaseInstanceIdService() {
    
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        val refreshedToken = FirebaseInstanceId.getInstance().token
        sendRegistrationToServer(refreshedToken!!) //will return a non null value
    }

    private fun  sendRegistrationToServer(refreshedToken: String) {
        Log.d("DEBUG", refreshedToken)
    }

}