package com.yesude.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.yesude.app.R
import com.yesude.app.appcomponents.base.BaseActivity
import com.yesude.app.databinding.ActivityHomepageBinding
import com.yesude.app.modules.homepage.`data`.viewmodel.HomepageVM
import com.yesude.app.modules.mainpage.ui.MainPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageActivity : BaseActivity<ActivityHomepageBinding>(R.layout.activity_homepage) {
  private val viewModel: HomepageVM by viewModels<HomepageVM>()

  private val REQUEST_CODE_MAIN_PAGE_ACTIVITY: Int = 106

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHomepageOne.setOnClickListener {
      val destIntent = MainPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MAIN_PAGE_ACTIVITY)
      this.overridePendingTransition(R.anim.slide_up ,R.anim.slide_down )
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
