package uk.co.referencepoint.introslider

import android.os.Bundle
import android.view.View
import com.github.paolorotolo.appintro.AppIntro
import com.github.paolorotolo.appintro.AppIntroFragment
import com.github.paolorotolo.appintro.model.SliderPage

class MainActivity : AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sliderPageX = SliderPage()
        sliderPageX.title = "Welcome To Vircarda"
        sliderPageX.imageDrawable = R.drawable.vircarda_logo
        sliderPageX.description = "An app for carry your cards on your phone"
        addSlide(AppIntroFragment.newInstance(sliderPageX))

        val sliderPage = SliderPage()
        sliderPage.title = "Download Your Card"
        sliderPage.imageDrawable = R.drawable.demo_card
        sliderPage.description = "Enter your unique Registration number and PIN to download your card"
        addSlide(AppIntroFragment.newInstance(sliderPage))

        val sliderPage2 = SliderPage()
        sliderPage2.title = "View Card"
        sliderPage2.imageDrawable = R.drawable.gosmart_intro
        sliderPage2.description = "Your card contains details about you, including and qualifications awarded within your scheme"
        addSlide(AppIntroFragment.newInstance(sliderPage2))

        val sliderPage3 = SliderPage()
        sliderPage3.title = "Read Your Card"
        sliderPage3.imageDrawable = R.drawable.info_graphic_nfc_read
        sliderPage3.description = "Get access to work sites by showing your unique QR code to a registered Vircarda reader (Go Smart or Checarda)"
        addSlide(AppIntroFragment.newInstance(sliderPage3))

        val sliderPage4 = SliderPage()
        sliderPage4.title = "View Card Activity"
        sliderPage4.imageDrawable = R.drawable.card_read_list
        sliderPage4.description = "View all card read activity from within the app, as well as a map detailing the exact location where the read took place"
        addSlide(AppIntroFragment.newInstance(sliderPage4))

        val sliderPage5 = SliderPage()
        sliderPage5.title = "Always Up To Date"
        sliderPage5.imageDrawable = R.drawable.gosmart_intro
        sliderPage5.description = "Your card will be updated with any new qualifications as soon as they are awarded"
        addSlide(AppIntroFragment.newInstance(sliderPage5))

        hideSystemUI()
    }

    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }
}
