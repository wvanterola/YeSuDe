package com.yesude.app.modules.mainpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yesude.app.modules.mainpage.`data`.model.MainPageModel
import org.koin.core.KoinComponent

class MainPageVM : ViewModel(), KoinComponent {
  val mainPageModel: MutableLiveData<MainPageModel> = MutableLiveData(MainPageModel())

  var navArguments: Bundle? = null
}
