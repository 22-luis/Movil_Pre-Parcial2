package com.example.mygametracker.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mygametracker.GameReviewerApplication
import com.example.mygametracker.data.model.GameModel
import com.example.mygametracker.repositories.GameRepository

class GameViewModel(private val repository: GameRepository): ViewModel() {

    //Declaring variables
    val name = MutableLiveData("")
    val gender = MutableLiveData("")
    val developer = MutableLiveData("")
    val year = MutableLiveData("")

    fun getGame() = repository.getGames()

    private fun addGame(game : GameModel) = repository.setGames(game)

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val gameRepositoryApp = (this[APPLICATION_KEY] as GameReviewerApplication).gameRepository

                GameViewModel(gameRepositoryApp)
            }
        }
    }

    fun setSelectedGame(game: GameModel) {
        name.value = game.name
        gender.value = game.gender
        developer.value = game.developer
        year.value = game.year.toString()


    }

}