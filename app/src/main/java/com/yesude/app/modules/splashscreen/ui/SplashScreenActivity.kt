package com.yesude.app.modules.splashscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.yesude.app.R
import com.yesude.app.appcomponents.base.BaseActivity
import com.yesude.app.databinding.ActivitySplashScreenBinding
import com.yesude.app.modules.homepage.ui.HomepageActivity
import com.yesude.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {
  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
      this.overridePendingTransition(R.anim.slide_up ,R.anim.slide_down )
      finish()
      }, 1000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

    }
  }
