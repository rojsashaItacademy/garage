package ru.trinitydigital.garagemuseum.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import ru.trinitydigital.garagemuseum.utils.startCoroutinesTimer

class WriterTextView(context: Context, attributeSet: AttributeSet) :
    AppCompatTextView(context, attributeSet) {

    private val scope = MainScope()
    private var position = 0
    private var text = ""

    fun animateText(text: String, delay: Long = 40) {
        startCoroutinesTimer(delay, text.length.toLong(), scope) {
            val newText = "${this.text}${text[position]}"
            this.text = newText
            setText(this.text)
            position++
        }
    }

    override fun onDetachedFromWindow() {
        scope.cancel()
        super.onDetachedFromWindow()
    }
}