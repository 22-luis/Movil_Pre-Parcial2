package com.example.mygametracker.data

import com.example.mygametracker.data.model.GameModel

var name = "The witcher"
var gender = "RPG"
var developer = "CD Project RED"
var year = 2008

var name2 = "LOL"
var gender2 = "Moba"
var developer2 = "Riot"
var year2 = 2009

var games = mutableListOf(
    GameModel(name, gender, developer, year),
    GameModel(name2, gender2, developer2, year2)
)