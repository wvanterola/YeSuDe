package com.yesude.app.modules.resultspage.`data`.model

import com.yesude.app.R
import com.yesude.app.appcomponents.di.MyApp
import kotlin.String

data class ResultsPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChancethat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_chance_that_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXx: String? = MyApp.getInstance().resources.getString(R.string.lbl_xx)

)
