package com.mikehardinapps.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mikehardinapps.swoosh.Model.Player
import com.mikehardinapps.swoosh.R
import com.mikehardinapps.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

         player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        val league = player.league
        val skill = player.skill

        SearchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you..."

    }




}
