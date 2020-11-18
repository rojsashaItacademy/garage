package ru.trinitydigital.garagemuseum.ui.registration.inputName

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_input_name.*
import kotlinx.android.synthetic.main.view_input_name.view.*
import ru.trinitydigital.garagemuseum.R
import ru.trinitydigital.garagemuseum.base.BaseFragment


class InputNameFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_input_name

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        tvWriter.animateText("safdasfasfasd asdasdasd asdasdasdasd asdsadasdasd asdsasadasd sadsadasdasd sad123", 25)
    }

    private fun setupListeners() {
        viewInputName.etName.setOnEditorActionListener(TextView.OnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                Toast.makeText(requireContext(), viewInputName.etName.text, Toast.LENGTH_SHORT)
                    .show()
                openAgeScreen()
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun openAgeScreen() {
        findNavController().navigate(R.id.action_inputNameFragment_to_ageFragment)
    }
}