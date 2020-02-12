package com.example.soba

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.google.android.gms.maps.MapFragment


class YonabaruStore : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.soba.R.layout.activity_yonabaru_store)
/*    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 */
        // MapFragmentの生成
        val mapFragment = MapFragment.newInstance()
        // MapViewをMapFragmentに変更する
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.mapView, mapFragment)
        fragmentTransaction.commit()
        mapFragment.getMapAsync(this)
    }

}
