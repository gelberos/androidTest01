package com.test.gelberos.androidtest01.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout

import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarDrawerToggle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.test.gelberos.androidtest01.R
import com.test.gelberos.androidtest01.adapter.GalleryPagerAdapter
import com.test.gelberos.androidtest01.helper.MovieHelper
import java.util.logging.Logger

class GalleryFragmentActivity : FragmentActivity() {

//    companion object {
//        fun newInstance() = GalleryFragmentActivity()
//    }

    //private lateinit var viewModel: GalleryViewModel

    private var mViewPagerTop: ViewPager? = null
    private var mViewPagerBottom: ViewPager? = null
    private var mViewPagerPageChangeListener: ViewPager.OnPageChangeListener? = null
    private var counter = 0

    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: GalleryPagerAdapter
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.gallery_activity)
        Log.d("Gallery","counter " + counter++ )

        val movies = MovieHelper.getMoviesFromJson("movies.json", this?.applicationContext)

        viewPager = findViewById(R.id.viewpager_Top)
        tabLayout = findViewById(R.id.tabLayout)

        pagerAdapter = GalleryPagerAdapter(supportFragmentManager, movies) // crash

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
