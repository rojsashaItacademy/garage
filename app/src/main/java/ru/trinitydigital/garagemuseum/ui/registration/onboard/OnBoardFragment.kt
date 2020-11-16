package ru.trinitydigital.garagemuseum.ui.registration.onboard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_onboard.*
import ru.trinitydigital.garagemuseum.R
import ru.trinitydigital.garagemuseum.base.BaseFragment

class OnBoardFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_onboard

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        button.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardFragment_to_inputNameFragment)
        }
    }

}