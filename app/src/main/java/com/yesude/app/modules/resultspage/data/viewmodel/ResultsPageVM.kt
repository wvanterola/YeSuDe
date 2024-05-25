package com.yesude.app.modules.resultspage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yesude.app.modules.resultspage.`data`.model.ResultsPageModel
import org.koin.core.KoinComponent

class ResultsPageVM : ViewModel(), KoinComponent {
  val resultsPageModel: MutableLiveData<ResultsPageModel> = MutableLiveData(ResultsPageModel())

  var navArguments: Bundle? = null
}
