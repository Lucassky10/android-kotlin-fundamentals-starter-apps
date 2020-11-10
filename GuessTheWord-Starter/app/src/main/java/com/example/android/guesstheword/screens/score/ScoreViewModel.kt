package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {
    var score = finalScore
    init {
        Log.i("Score View Model", "Final score is $finalScore")
    }


}