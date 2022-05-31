package com.c22_ce02.awmonitorapp.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.c22_ce02.awmonitorapp.BuildConfig
import com.c22_ce02.awmonitorapp.R
import com.c22_ce02.awmonitorapp.data.preference.CheckHelper
import com.c22_ce02.awmonitorapp.data.preference.CheckPreference
import com.c22_ce02.awmonitorapp.databinding.FragmentSecondSlideBinding
import com.c22_ce02.awmonitorapp.databinding.FragmentThirdSlideBinding
import com.c22_ce02.awmonitorapp.ui.activity.HomeActivity
import com.c22_ce02.awmonitorapp.utils.showToast

class ThirdSlideFragment : Fragment(), View.OnClickListener {

    private lateinit var binding : FragmentThirdSlideBinding
    private lateinit var checkHelper: CheckHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkHelper = CheckHelper()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdSlideBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnFinish = binding.btnFinish
        btnFinish.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_finish){
            val intent = Intent(requireContext(), HomeActivity::class.java)
            startActivity(intent)
            savePref()
            activity?.finish()
        }
    }
    private fun savePref() {
        val checkPreference = CheckPreference(requireContext())
        checkHelper.isLogin = true
        checkPreference.setCheck(checkHelper)
        if (BuildConfig.DEBUG) {
            showToast("Selamat Datang")
        }
    }

}