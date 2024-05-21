package com.yesude.app.modules.homepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yesude.app.modules.homepage.`data`.model.HomepageModel
import org.koin.core.KoinComponent

class HomepageVM : ViewModel(), KoinComponent {
  val homepageModel: MutableLiveData<HomepageModel> = MutableLiveData(HomepageModel())

  var navArguments: Bundle? = null
}
