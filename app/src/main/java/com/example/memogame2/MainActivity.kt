package com.example.memogame2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Game()

    }

    //val button = findViewById<Button>(points)
    var point = 0
    var numOn =1

    // 1-15 2-14 3-12 4-13 5-16 6-10 7-11 8-9
    private fun Game(){
        val c1 = arrayListOf(points)
        val c2 = arrayListOf(points)

        fun solution(){
            Card1.text = "1"; Card15.text = "1"
            Card2.text = "2"; Card14.text = "2"
            Card3.text = "3"; Card12.text = "3"
            Card4.text = "4"; Card13.text = "4"
            Card5.text = "5"; Card16.text = "5"
            Card6.text = "6"; Card10.text = "6"
            Card7.text = "7"; Card11.text = "7"
            Card8.text = "8"; Card9.text = "8"
        }
        solution()

        fun check(){
            if(c1[0].text == c2[0].text) {
                c1[0].text = ""; c2[0].text = ""; point++; points.text = "Points: ${point}"
            }
            else{
                Handler().postDelayed({c1[0].setBackgroundResource(R.drawable.cardback2); c2[0].setBackgroundResource(R.drawable.cardback2)}, 400)
            }
                Handler().postDelayed({c1.remove(c1[0]); c2.remove(c2[0])}, 400)

            if (point == 8) {
                Handler().postDelayed({Game()}, 1000)
            }
        }

        c1.remove(c1[0]) ; c2.remove(c2[0])

        // 1-15 2-14 3-12 4-13 5-16 6-10 7-11 8-9
        Card1.setOnClickListener { Card1.setBackgroundResource(R.drawable.i1); if (Card1.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card1); } else if (c1[0] != Card1) { c2.add(Card1); check(); numOn = 1; } } }
        Card2.setOnClickListener { Card2.setBackgroundResource(R.drawable.i2); if (Card2.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card2); } else if (c1[0] != Card2) { c2.add(Card2); check(); numOn = 1; } } }
        Card3.setOnClickListener { Card3.setBackgroundResource(R.drawable.i3); if (Card3.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card3); } else if (c1[0] != Card3) { c2.add(Card3); check(); numOn = 1; } } }
        Card4.setOnClickListener { Card4.setBackgroundResource(R.drawable.i4); if (Card4.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card4); } else if (c1[0] != Card4) { c2.add(Card4); check(); numOn = 1; } } }
        Card5.setOnClickListener { Card5.setBackgroundResource(R.drawable.i5); if (Card5.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card5); } else if (c1[0] != Card5) { c2.add(Card5); check(); numOn = 1; } } }
        Card6.setOnClickListener { Card6.setBackgroundResource(R.drawable.i6); if (Card6.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card6); } else if (c1[0] != Card6) { c2.add(Card6); check(); numOn = 1; } } }
        Card7.setOnClickListener { Card7.setBackgroundResource(R.drawable.i7); if (Card7.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card7); } else if (c1[0] != Card7) { c2.add(Card7); check(); numOn = 1; } } }
        Card8.setOnClickListener { Card8.setBackgroundResource(R.drawable.i8); if (Card8.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card8); } else if (c1[0] != Card8) { c2.add(Card8); check(); numOn = 1; } } }
        Card9.setOnClickListener { Card9.setBackgroundResource(R.drawable.i8); if (Card9.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card9); } else if (c1[0] != Card9) { c2.add(Card9); check(); numOn = 1; } } }
        Card10.setOnClickListener { Card10.setBackgroundResource(R.drawable.i10); if (Card10.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card10); } else if (c1[0] != Card10) { c2.add(Card10); check(); numOn = 1; } } }
        Card11.setOnClickListener { Card11.setBackgroundResource(R.drawable.i7); if (Card11.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card11); } else if (c1[0] != Card11) { c2.add(Card11); check(); numOn = 1; } } }
        Card12.setOnClickListener { Card12.setBackgroundResource(R.drawable.i3); if (Card12.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card12); } else if (c1[0] != Card12) { c2.add(Card12); check(); numOn = 1; } } }
        Card13.setOnClickListener { Card13.setBackgroundResource(R.drawable.i4); if (Card13.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card13); } else if (c1[0] != Card13) { c2.add(Card13); check(); numOn = 1; } } }
        Card14.setOnClickListener { Card14.setBackgroundResource(R.drawable.i2); if (Card14.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card14); } else if (c1[0] != Card14) { c2.add(Card14); check(); numOn = 1; } } }
        Card15.setOnClickListener { Card15.setBackgroundResource(R.drawable.i1); if (Card15.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card15); } else if (c1[0] != Card15) { c2.add(Card15); check(); numOn = 1; } } }
        Card16.setOnClickListener { Card16.setBackgroundResource(R.drawable.i5); if (Card16.text != "") { if (numOn == 1) { numOn = 2; c1.add(Card16); } else if (c1[0] != Card16) { c2.add(Card16); check(); numOn = 1; } } }
    }
}