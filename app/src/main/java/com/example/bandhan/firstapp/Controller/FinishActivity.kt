package com.example.bandhan.firstapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bandhan.firstapp.R
import com.example.bandhan.firstapp.Utilities.EXTRA_PEOPLE
import com.example.bandhan.firstapp.model.People
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val people = intent.getParcelableExtra<People>(EXTRA_PEOPLE)
        search.text = "Looking for ${people.selected} ${people.grp} near you.."
    }
}
