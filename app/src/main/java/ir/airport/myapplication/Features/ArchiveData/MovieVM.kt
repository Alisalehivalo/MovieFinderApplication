package ir.airport.myapplication.Features.ArchiveData

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import ir.airport.myapplication.DB.MovieClass
import ir.airport.myapplication.DB.MovieDao
import ir.airport.myapplication.DB.MovieDataBase
import kotlinx.coroutines.launch
import javax.inject.Inject


class MovieVM (val database: MovieDao,application: Application) : AndroidViewModel(application)  {


}
