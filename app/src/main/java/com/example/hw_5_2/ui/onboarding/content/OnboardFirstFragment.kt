package com.example.hw_5_2.ui.onboarding.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_5_2.R

class OnboardFirstFragment : Fragment() {

//    private lateinit var animationView: LottieAnimationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //        animationView = view.findViewById(R.id.animationOne)
        return inflater.inflate(R.layout.fragment_onboard_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        animationView.playAnimation()  work without setting?*
    }
}