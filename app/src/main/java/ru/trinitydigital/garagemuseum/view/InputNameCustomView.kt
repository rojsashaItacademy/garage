package ru.trinitydigital.garagemuseum.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import ru.trinitydigital.garagemuseum.R

class InputNameCustomView(context: Context, attributeSet: AttributeSet) :
    ConstraintLayout(context, attributeSet) {

    init {
        View.inflate(context, R.layout.view_input_name, this)
    }
}