package com.example.mygametracker

import android.app.Application
import com.example.mygametracker.data.games
import com.example.mygametracker.repositories.GameRepository

class GameReviewerApplication : Application() {

    val gameRepository : GameRepository by lazy {
        GameRepository(games)
    }
}