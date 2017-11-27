package com.mikehardinapps.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mikehardinapps.swoosh.Utilities.EXTRA_LEAGUE
import com.mikehardinapps.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){

        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else {
            Toast.makeText(this,"Please Choose a League",Toast.LENGTH_SHORT).show()
        }
    }
    fun onMensClicked(view: View){
        selectedLeague = "Mens"

        womensBtn.isChecked = false
        coedBtn.isChecked = false

    }

    fun onWomensClicked(view: View){
        selectedLeague = "Womens"

        mensBtn.isChecked = false
        coedBtn.isChecked = false
    }

    fun onCoedClicked(view: View){
        selectedLeague = "Coed"

        womensBtn.isChecked = false
        mensBtn.isChecked = false
    }
}
