package ru.trinitydigital.garagemuseum.ui.registration.onboard

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_onboard.*
import ru.trinitydigital.garagemuseum.R
import ru.trinitydigital.garagemuseum.base.BaseFragment
import ru.trinitydigital.garagemuseum.data.TimeBroadcastReceiver

class OnBoardFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_onboard

    private val receiver = TimeBroadcastReceiver()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        requireContext().registerReceiver(receiver, IntentFilter("android.intent.action.TIME_TICK"))
    }

    private fun setupListeners() {
        button.setOnClickListener {
//            findNavController().navigate(R.id.action_onBoardFragment_to_inputNameFragment)
            sendBroadcast1()
        }
    }


    private fun sendBroadcast1() {
//        val intent = Intent(requireContext(), MyFirstBroadcastReceiver::class.java)
        val intent = Intent("ru.trinitydigital.garagemuseum.TEST")
        requireActivity().sendBroadcast(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        requireContext().unregisterReceiver(receiver)
    }
}