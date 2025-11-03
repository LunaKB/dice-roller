package com.cmoncrieffe.dice

import java.util.ArrayList

object DiceRoller {

    fun roll0Based(size: DiceSize) : Int {
        return (Math.random() * size.size).toInt()
    }

    fun roll1Based(size: DiceSize) : Int {
        return roll0Based(size) + 1
    }

    fun roll0Based(size: DiceSize, amount: Int) : List<Int> {
        val results = ArrayList<Int>()
        for(count in 1..amount)
            results.add(roll0Based(size))
        return results
    }

    fun roll1Based(size: DiceSize, amount: Int) : List<Int> {
        return roll0Based(size, amount)
            .stream()
            .map { integer -> integer + 1 }
            .toList()
    }
}