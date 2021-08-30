package com.muayid.my_kash


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_ambulance.*

/**
 * A simple [Fragment] subclass.
 */
class Ambulance : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ambulance, container, false)


    }




}
