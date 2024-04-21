package com.example.afinal.util

import com.example.afinal.model.Met

object Constants {


    fun getListOfMetModel(): MutableList<Met> {

        val metList = mutableListOf<Met>()

        val metItemOne = Met(
            1,
            metImage = "https://images.metmuseum.org/CRDImages/ad/original/130480.jpg",
            metImageTitle = "Andiron",
        )
        metList.add(metItemOne)

        val metItemTwo = Met(
            2,
            metImage = "https://images.metmuseum.org/CRDImages/ad/original/DP258638.jpg",
            metImageTitle = "Bread Plate",
        )
        metList.add(metItemTwo)

        val metItemThree = Met (
            3,
            metImage = "https://images.metmuseum.org/CRDImages/ad/original/3936.jpg",
            metImageTitle = "Chest of Drawers"
        )
        metList.add(metItemThree)

        val metItemFour = Met (
            4,
            metImage = "https://images.metmuseum.org/CRDImages/ad/original/186563.jpg",
            metImageTitle = "Egg Cup"
        )
        metList.add(metItemFour)

        val metItemFive = Met (
            5,
            metImage = "https://images.metmuseum.org/CRDImages/ad/original/112937.jpg",
            metImageTitle = "Fragment"
        )
        metList.add(metItemFive)

        return metList
    }



}