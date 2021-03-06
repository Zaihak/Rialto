package androidx.appcompat.app

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import com.stylingandroid.rialto.androidx.widget.RialtoEditText
import com.stylingandroid.rialto.androidx.widget.RialtoTextView

internal class RialtoViewInflater : AppCompatViewInflater() {

    override fun createTextView(context: Context, attrs: AttributeSet?): AppCompatTextView {
        return RialtoTextView(context, attrs)
    }

    override fun createEditText(context: Context, attrs: AttributeSet?): AppCompatEditText {
        return RialtoEditText(context, attrs)
    }
}
