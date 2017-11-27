package com.mikehardinapps.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mikehardinapps.swoosh.Model.Player
import com.mikehardinapps.swoosh.R
import com.mikehardinapps.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player:Player


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


    }


    fun onBeginnerClicked(view: View) {
        ballerBtn.isChecked = false
        player.skill = "Beginner"
    }

    fun onBallerClicked(view: View){
        beginnerBtn.isChecked = false
        player.skill = "Baller"
    }

    fun onSkillFinishClicked(view: View){
        if (player.skill != ""){
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else {
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }

}
