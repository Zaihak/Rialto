package com.stylingandroid.rialto.fonts

import android.graphics.Typeface
import android.text.TextPaint
import android.text.style.MetricAffectingSpan

internal class CustomTypefaceSpan(private val font: Typeface?) : MetricAffectingSpan() {

    override fun updateMeasureState(textPaint: TextPaint) = update(textPaint)

    override fun updateDrawState(textPaint: TextPaint) = update(textPaint)

    private fun update(textPaint: TextPaint) {
        textPaint.typeface = Typeface.create(font, textPaint.typeface?.style ?: 0)
    }
}
