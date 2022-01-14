package com.example.task17

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Draw2D(context: Context?) : View(context) {
    private val paint: Paint = Paint()
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        paint.apply {
            style = Paint.Style.FILL
            color = Color.WHITE
        }
        canvas?.drawPaint(paint)

        paint.apply {
            isAntiAlias = true
            color = Color.YELLOW
        }
        canvas?.drawCircle(950F, 100F, 80F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(150F, 150F, 80F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(700F, 160F, 70F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(580F, 130F, 60F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(380F, 160F, 120F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(170F, 220F, 80F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(710F, 220F, 70F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(599F, 260F, 60F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawCircle(430F, 200F, 120F, paint)

        paint.apply {
            isAntiAlias = true
            color = Color.BLUE
        }
        canvas?.drawOval(10F,300F, 800F, 80F, paint)

        paint.color = Color.GREEN
        canvas?.drawRect(0F, 2000F, 1400F, 1200F, paint)

        paint.apply {
            color = Color.BLUE
            style = Paint.Style.FILL
            isAntiAlias = true
            textSize = 50F
        }
        canvas?.drawText("Лужайка только для котов", 30F, 1190F, paint)
    }
}