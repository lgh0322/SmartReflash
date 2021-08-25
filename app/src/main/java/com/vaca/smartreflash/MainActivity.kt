package com.vaca.smartreflash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.listener.OnRefreshListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fuck:SmartRefreshLayout=findViewById(R.id.refreshLayout)
        fuck.setOnRefreshListener(object :OnRefreshListener{
            override fun onRefresh(refreshLayout: RefreshLayout) {
               Log.e("fuck","fuck")
                fuck.finishRefresh(2000)
            }

        })
    }
}