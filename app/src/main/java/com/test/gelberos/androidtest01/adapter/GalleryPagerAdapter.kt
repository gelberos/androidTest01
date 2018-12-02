package com.test.gelberos.androidtest01.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.util.Log
import com.test.gelberos.androidtest01.model.Movie
import com.test.gelberos.androidtest01.ui.gallery.MovieFragment

class GalleryPagerAdapter (fragmentManager: FragmentManager?, private val movies: ArrayList<Movie>) :
    FragmentStatePagerAdapter(fragmentManager)  {

    override fun getItem(position: Int): Fragment {
        return MovieFragment.newInstance(movies[position])
    }

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.v("galleryadapter", "getCount "+movies.size)
        return movies.size
    }
}