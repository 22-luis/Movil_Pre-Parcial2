package com.example.mygametracker.repositories

import com.example.mygametracker.data.model.GameModel

class GameRepository (private val games: MutableList<GameModel>){

    fun getGames() = games

    fun setGames(game:GameModel) = games.add(game)

}