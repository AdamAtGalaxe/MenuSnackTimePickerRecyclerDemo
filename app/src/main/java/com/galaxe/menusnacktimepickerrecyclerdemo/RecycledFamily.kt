package com.galaxe.menusnacktimepickerrecyclerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycledFamily : AppCompatActivity(), CustomAdapter.OnItemClickListener {
    lateinit var data: ArrayList<MyCard>
    lateinit var pic: ImageView
    lateinit var text: TextView
    lateinit var sublayer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycled_family)

        val recyclerView = findViewById<RecyclerView>(R.id.myRecycler)
        //var sublayer = findViewById<LinearLayout>(R.id.display)

        recyclerView.layoutManager = LinearLayoutManager(this)
        var imgs = arrayOf(R.drawable.me,R.drawable.amanda,R.drawable.kathlyn,R.drawable.quinn,R.drawable.mom,R.drawable.dad,R.drawable.ryan,R.drawable.jason,R.drawable.dawn);
        var imgDes = arrayOf("Adam (me)", "Amanda (wife)", "Kathlyn (daughter)", "Quinn (daughter)", "Peggy (mom)","Tony (dad)","Ryan (brother)","Jason (brother)","Dawn (not really dead, just to me)")
        data = ArrayList<MyCard>()
        for (i in 0..8) {
            data.add(MyCard(imgs[i], imgDes[i]))
        }
        val adapter = CustomAdapter(data, this)


        recyclerView.adapter = adapter

    }

    override fun onItemClick(position: Int) {

        val clickedItem = data[position]
//        text.setText(clickedItem.text)
//        clickedItem.image
//        pic.setImageResource(clickedItem.image)
//        text.visibility = View.VISIBLE
//        pic.visibility = View.VISIBLE
        Toast.makeText(this, "${clickedItem.text}", Toast.LENGTH_LONG).show()

    }
}