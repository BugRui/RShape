package com.bugrui.shape

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.FrameLayout

/**
 * @Author:         BugRui
 * @Description:     能在XML直接配置Shape的FrameLayout
 * @CreateDate:     2021/2/2 10:55 AM
 * @UpdateUser:     更新者
 * @UpdateDate:     2021/2/2 10:55 AM
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class RShapeFrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    companion object {
        private const val DEF_VALUE_INT = -1
        private const val DEF_VALUE_INT_0 = 0
        private const val DEF_VALUE_FLOAT = -1F
    }


    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RShapeFrameLayout)

        val shapeTypeIndex = typedArray.getInt(R.styleable.RShapeFrameLayout_shapeFlType, DEF_VALUE_INT_0)
        val shapeBgColor = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlBgColor)
        val shapeStrokeSize = typedArray.getInt(R.styleable.RShapeFrameLayout_shapeFlStrokeSize, DEF_VALUE_INT)
        val shapeStrokeColor = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlStrokeColor)
        val shapeGradientTypeIndex = typedArray.getInt(R.styleable.RShapeFrameLayout_shapeFlGradientType, DEF_VALUE_INT)
        val shapeGradientOrientationIndex = typedArray.getInt(R.styleable.RShapeFrameLayout_shapeFlGradientOrientation, DEF_VALUE_INT)
        val shapeGradientColor1 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor1)
        val shapeGradientColor2 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor2)
        val shapeGradientColor3 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor3)
        val shapeGradientColor4 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor4)
        val shapeGradientColor5 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor5)
        val shapeGradientColor6 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor6)
        val shapeGradientColor7 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor7)
        val shapeGradientColor8 = typedArray.getColorStateList(R.styleable.RShapeFrameLayout_shapeFlGradientColor8)
        val shapeRadius = typedArray.getFloat(R.styleable.RShapeFrameLayout_shapeFlRadius, DEF_VALUE_FLOAT)
        val shapeLeftTopRadius = typedArray.getFloat(R.styleable.RShapeFrameLayout_shapeFlLeftTopRadius, DEF_VALUE_FLOAT)
        val shapeRightTopRadius = typedArray.getFloat(R.styleable.RShapeFrameLayout_shapeFlRightTopRadius, DEF_VALUE_FLOAT)
        val shapeLeftBottomRadius = typedArray.getFloat(R.styleable.RShapeFrameLayout_shapeFlLeftBottomRadius, DEF_VALUE_FLOAT)
        val shapeRightBottomRadius = typedArray.getFloat(R.styleable.RShapeFrameLayout_shapeFlRightBottomRadius, DEF_VALUE_FLOAT)
        typedArray.recycle()

        setShapeType(RShapeConstant.shapeTypeList[shapeTypeIndex])
        if (shapeBgColor != null)
            setShapeBackgroundColor(shapeBgColor.defaultColor)
        if (shapeStrokeSize != DEF_VALUE_INT && shapeStrokeColor!=null)
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
        get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, Resources.getSystem().displayMetrics)



}