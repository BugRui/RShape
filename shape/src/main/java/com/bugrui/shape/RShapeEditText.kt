package com.bugrui.shape

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.util.AttributeSet
import android.util.TypedValue.applyDimension
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

/**
 * @Author:         BugRui
 * @Description:     能在XML直接配置Shape的EditText
 * @CreateDate:     2021/1/16 6:12 PM
 * @UpdateUser:     更新者
 * @UpdateDate:     2021/1/16 6:12 PM
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class RShapeEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatEditText(context, attrs) {

    companion object {
        private const val DEF_VALUE_INT = -1
        private const val DEF_VALUE_INT_0 = 0
        private const val DEF_VALUE_FLOAT = -1F
    }


    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RShapeEditText)
        val shapeTypeIndex =
            typedArray.getInt(R.styleable.RShapeEditText_shapeEtType, DEF_VALUE_INT_0)
        val shapeBgColor = typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtBgColor)
        val shapeStrokeSize = typedArray.getInt(R.styleable.RShapeEditText_shapeEtStrokeSize, DEF_VALUE_INT)
        val shapeStrokeColor = typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtStrokeColor)
        val shapeGradientTypeIndex =
            typedArray.getInt(R.styleable.RShapeEditText_shapeEtGradientType, DEF_VALUE_INT)
        val shapeGradientOrientationIndex =
            typedArray.getInt(R.styleable.RShapeEditText_shapeEtGradientOrientation, DEF_VALUE_INT)
        val shapeGradientColor1 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor1)
        val shapeGradientColor2 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor2)
        val shapeGradientColor3 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor3)
        val shapeGradientColor4 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor4)
        val shapeGradientColor5 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor5)
        val shapeGradientColor6 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor6)
        val shapeGradientColor7 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor7)
        val shapeGradientColor8 =
            typedArray.getColorStateList(R.styleable.RShapeEditText_shapeEtGradientColor8)
        val shapeRadius =
            typedArray.getFloat(R.styleable.RShapeEditText_shapeEtRadius, DEF_VALUE_FLOAT)
        val shapeLeftTopRadius =
            typedArray.getFloat(R.styleable.RShapeEditText_shapeEtLeftTopRadius, DEF_VALUE_FLOAT)
        val shapeRightTopRadius =
            typedArray.getFloat(R.styleable.RShapeEditText_shapeEtRightTopRadius, DEF_VALUE_FLOAT)
        val shapeLeftBottomRadius =
            typedArray.getFloat(R.styleable.RShapeEditText_shapeEtLeftBottomRadius, DEF_VALUE_FLOAT)
        val shapeRightBottomRadius = typedArray.getFloat(
            R.styleable.RShapeEditText_shapeEtRightBottomRadius,
            DEF_VALUE_FLOAT
        )
        typedArray.recycle()

        setShapeType(RShapeConstant.shapeTypeList[shapeTypeIndex])
        if (shapeBgColor != null)
            setShapeBackgroundColor(shapeBgColor.defaultColor)
        if (shapeStrokeSize != DEF_VALUE_INT && shapeStrokeColor != null)
            setShapeStroke(shapeStrokeSize, shapeStrokeColor.defaultColor)
        if (shapeGradientTypeIndex != DEF_VALUE_INT)
            setShapeGradientType(RShapeConstant.gradientTypeList[shapeGradientTypeIndex])
        if (shapeGradientOrientationIndex != DEF_VALUE_INT)
            setShapeGradientOrientation(RShapeConstant.gradientOrientationList[shapeGradientOrientationIndex])

        val gradientStartColors = mutableListOf<Int>()
        if (shapeGradientColor1 != null) {
            gradientStartColors.add(shapeGradientColor1.defaultColor)
        }
        if (shapeGradientColor2 != null) {
            gradientStartColors.add(shapeGradientColor2.defaultColor)
        }
        if (shapeGradientColor3 != null) {
            gradientStartColors.add(shapeGradientColor3.defaultColor)
        }
        if (shapeGradientColor4 != null) {
            gradientStartColors.add(shapeGradientColor4.defaultColor)
        }
        if (shapeGradientColor5 != null) {
            gradientStartColors.add(shapeGradientColor5.defaultColor)
        }
        if (shapeGradientColor6 != null) {
            gradientStartColors.add(shapeGradientColor6.defaultColor)
        }
        if (shapeGradientColor7 != null) {
            gradientStartColors.add(shapeGradientColor7.defaultColor)
        }
        if (shapeGradientColor8 != null) {
            gradientStartColors.add(shapeGradientColor8.defaultColor)
        }
        if (!gradientStartColors.isNullOrEmpty()) {
            setShapeGradientColors(gradientStartColors.toIntArray())
        }

        if (shapeRadius != DEF_VALUE_FLOAT) setShapeCornerRadius(shapeRadius.dp)

        if (shapeLeftTopRadius != DEF_VALUE_FLOAT
            || shapeRightTopRadius != DEF_VALUE_FLOAT
            || shapeLeftBottomRadius != DEF_VALUE_FLOAT
            || shapeRightBottomRadius != DEF_VALUE_FLOAT
        ) {
            setShapeCornerRadii(
                shapeLeftTopRadius.dp, shapeLeftTopRadius.dp,
                shapeRightTopRadius.dp, shapeRightTopRadius.dp,
                shapeLeftBottomRadius.dp, shapeLeftBottomRadius.dp,
                shapeRightBottomRadius.dp, shapeRightBottomRadius.dp
            )
        }
    }

    /**
     * 转dp
     */
    private val Float.dp: Float
        get() = applyDimension(
            android.util.TypedValue.COMPLEX_UNIT_DIP,
            this,
            Resources.getSystem().displayMetrics
        )

}