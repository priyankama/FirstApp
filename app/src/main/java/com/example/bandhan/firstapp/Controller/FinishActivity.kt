package com.example.bandhan.firstapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bandhan.firstapp.R
import com.example.bandhan.firstapp.Utilities.EXTRA_GRP
import com.example.bandhan.firstapp.Utilities.EXTRA_SELECTION
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val select = intent.getStringExtra(EXTRA_SELECTION)
        val grp = intent.getStringExtra(EXTRA_GRP)
        search.text = "Looking for $select $grp near you.."
    }
}
