package com.example.radiolab5.utils

import com.example.radiolab5.R
import com.example.radiolab5.model.Radio

object constants {

    fun getRadioList(): MutableList<Radio> {
        val radioList = mutableListOf<Radio>()

        val radioOne = Radio(
            1,
            "Drake",
            R.drawable.drake,
            "http://quasar.shoutca.st:8015/stream"
        )
        radioList.add(radioOne)

        val radioTwo = Radio(
            2,
            "Martin Garrix",
            R.drawable.martingarrix,
            "http://live.prodjradio.net:8000/"
        )
        radioList.add(radioTwo)

        val radioThree = Radio(
            3,
            "EDM",
            R.drawable.edm,
            "https://audiotainment-sw.streamabc.net/atsw-edm-aacplus-64-9077764?sABC=66087065%230%23207os67o547n5ooqq8624qp43n249p4n%23&aw_0_1st.playerid=&amsparams=playerid:;skey:1711829093"
        )
        radioList.add(radioThree)

        val radioFour = Radio(
            4,
            "Rihanna",
            R.drawable.rihanna,
            "https://mp3.planetradio.de/plrchannels/hqstars05.mp3?amsparams=playerid:RTFFHTunein;skey:1711828914"
        )
        radioList.add(radioFour)

        val radioFive = Radio(
            5,
            "2010 Hits",
            R.drawable.download,
            "https://audiotainment-sw.streamabc.net/atsw-exkl2010er-mp3-192-6351488?sABC=66086sqo%230%23207os67o547n5ooqq8624qp43n249p4n%23&aw_0_1st.playerid=&amsparams=playerid:;skey:1711828955"
        )
        radioList.add(radioFive)

        return radioList
    }



}