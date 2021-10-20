package com.reshadev.xylaphone

import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.media.SoundPool
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var mCSoundId1: Int = 0
    var mCSoundId2: Int = 0
    var mCSoundId3: Int = 0
    var mCSoundId4: Int = 0
    var mCSoundId5: Int = 0
    var mCSoundId6: Int = 0
    var mCSoundId7: Int = 0
    lateinit var mSoundPool: SoundPool
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manageKeys()
        mSoundPool = SoundPool.Builder().setMaxStreams(5).build()
        mCSoundId1 = mSoundPool.load(this, R.raw.note1_c, 1)
        mCSoundId2 = mSoundPool.load(this, R.raw.note2_d, 1)
        mCSoundId3 = mSoundPool.load(this, R.raw.note3_e, 1)
        mCSoundId4 = mSoundPool.load(this, R.raw.note4_f, 1)
        mCSoundId5 = mSoundPool.load(this, R.raw.note5_g, 1)
        mCSoundId6 = mSoundPool.load(this, R.raw.note6_a, 1)
        mCSoundId7 = mSoundPool.load(this, R.raw.note7_b, 1)
    }
    private fun manageKeys() {
        red_button.setOnClickListener() {
            mSoundPool.play(mCSoundId1, 1.0f, 1.0f, 1, 0, 1.0f)

        }
        orange_button.setOnClickListener() {
            mSoundPool.play(mCSoundId2, 1.0f, 1.0f, 1, 0, 1.0f)

        }
        yellow_button.setOnClickListener() {

            mSoundPool.play(mCSoundId3, 1.0f, 1.0f, 1, 0, 1.0f)

        }
        green_button.setOnClickListener() {
            mSoundPool.play(mCSoundId4, 1.0f, 1.0f, 1, 0, 1.0f)

        }
        blue_button.setOnClickListener() {
            mSoundPool.play(mCSoundId5, 1.0f, 1.0f, 1, 0, 1.0f)

        }
        dark_blue_button.setOnClickListener() {
            mSoundPool.play(mCSoundId6, 1.0f, 1.0f, 1, 0, 1.0f)

        }
        purple_button.setOnClickListener() {
            mSoundPool.play(mCSoundId7, 1.0f, 1.0f, 1, 0, 1.0f)

        }
    }


}