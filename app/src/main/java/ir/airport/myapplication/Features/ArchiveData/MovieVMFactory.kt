package ir.airport.myapplication.Features.ArchiveData

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.airport.myapplication.DB.MovieDao
import java.lang.IllegalArgumentException

class MovieVMFactory(private val movieDao: MovieDao,private val application: Application) :ViewModelProvider.Factory {
    @Suppress("Unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieVM::class.java)){
            return MovieVM(movieDao,application) as T
        }
        throw IllegalArgumentException("Unknown VM class")
    }

}