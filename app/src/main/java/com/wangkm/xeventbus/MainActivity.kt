package com.wangkm.xeventbus

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wangkm.xeventbus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.handler = this
    }


    fun sendMsgByPostValue() {
        Toast.makeText(this, "sendMsgByPostValue", Toast.LENGTH_SHORT).show()
    }

    fun sendMsgToForeverObserver() {
        Toast.makeText(this, "sendMsgToForeverObserver", Toast.LENGTH_SHORT).show()
    }

    fun sendMsgToStickyReceiver() {
        Toast.makeText(this, "sendMsgToStickyReceiver", Toast.LENGTH_SHORT).show()
    }

    fun startStickyActivity() {
    }

    fun startNewActivity() {
    }

    fun closeAll() {
    }

    fun postValueCountTest() {
    }

    fun testMessageSetBefore() {
    }

    fun sendMessageSetBefore() {
    }

    fun testObserverActiveLevel() {
    }

    fun testBroadcast() {
    }

    fun testBroadcastInApp() {
    }

    fun testBroadcastGlobal() {
    }

    fun testDelayLife() {
    }

    fun sendDemoEvent() {
    }
}