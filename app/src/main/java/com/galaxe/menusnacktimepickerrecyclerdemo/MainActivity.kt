package com.galaxe.menusnacktimepickerrecyclerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.selection_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.timePicker-> {
                intent = Intent(this, TimePicker::class.java )
                startActivity(intent)
            }
            R.id.recycler -> {
                intent = Intent(this, RecycledFamily::class.java )
                startActivity(intent)
            }
            R.id.exit -> finish()
        }
        return true
    }
}