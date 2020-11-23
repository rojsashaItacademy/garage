package ru.trinitydigital.garagemuseum.ui.registration.age

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.fragment_age.*
import ru.trinitydigital.garagemuseum.R
import ru.trinitydigital.garagemuseum.base.BaseFragment
import ru.trinitydigital.garagemuseum.utils.AnimationUtils
import ru.trinitydigital.garagemuseum.utils.setSeekBarChangeListener

class AgeFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_age
    private var lastScale = 0f

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews()
        setupListeners()
    }

    private fun setupViews() {
        tvAgeDesc.animateText(getString(R.string.age_desc))
    }

    private fun setupListeners() {
        seekBar.setSeekBarChangeListener {
            tvAge.text = if (it == 15) "16+" else (it + 1).toString()
            AnimationUtils.animateScale(imgRedMan, lastScale, it.toFloat())
            lastScale = it.toFloat()
        }
    }
}