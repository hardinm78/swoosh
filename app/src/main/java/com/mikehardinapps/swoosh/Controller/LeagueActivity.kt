package com.mikehardinapps.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mikehardinapps.swoosh.Model.Player
import com.mikehardinapps.swoosh.R
import com.mikehardinapps.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Player("","")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){

        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else {
            Toast.makeText(this,"Please Choose a League",Toast.LENGTH_SHORT).show()
        }
    }
    fun onMensClicked(view: View){
        player.league = "Mens"

        womensBtn.isChecked = false
        coedBtn.isChecked = false

    }

    fun onWomensClicked(view: View){
        player.league = "Womens"

        mensBtn.isChecked = false
        coedBtn.isChecked = false
    }

    fun onCoedClicked(view: View){
        player.league = "Coed"

        womensBtn.isChecked = false
        mensBtn.isChecked = false
    }
}
