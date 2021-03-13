package alaiz.hashim.foodrecipes

import alaiz.hashim.foodrecipes.data.Repository
import android.app.Application
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel

class MainViewModel @ViewModelInject constructor(
        private val repository: Repository,
        application: Application
) : AndroidViewModel(application) {

}