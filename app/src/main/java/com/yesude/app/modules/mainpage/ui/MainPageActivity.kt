package com.yesude.app.modules.mainpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.yesude.app.R
import com.yesude.app.appcomponents.base.BaseActivity
import com.yesude.app.databinding.ActivityMainPageBinding
import com.yesude.app.modules.mainpage.`data`.viewmodel.MainPageVM
import kotlin.String
import kotlin.Unit

class MainPageActivity : BaseActivity<ActivityMainPageBinding>(R.layout.activity_main_page) {
  private val viewModel: MainPageVM by viewModels<MainPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MAIN_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
