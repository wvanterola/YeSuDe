package com.yesude.app.modules.resultspage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.yesude.app.R
import com.yesude.app.appcomponents.base.BaseActivity
import com.yesude.app.databinding.ActivityResultsPageBinding
import com.yesude.app.modules.resultspage.`data`.viewmodel.ResultsPageVM
import kotlin.String
import kotlin.Unit

class ResultsPageActivity : BaseActivity<ActivityResultsPageBinding>(R.layout.activity_results_page)
    {
  private val viewModel: ResultsPageVM by viewModels<ResultsPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resultsPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RESULTS_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResultsPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
