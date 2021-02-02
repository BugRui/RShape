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
class ShapeFrameLayout @JvmOverloads constructor(
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
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ShapeFrameLayout)

        val shapeTypeIndex = typedArray.getInt(R.styleable.ShapeFrameLayout_shapeFlType, DEF_VALUE_INT_0)
        val shapeBgColor = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlBgColor, DEF_VALUE_INT)
        val shapeStrokeSize = typedArray.getInt(R.styleable.ShapeFrameLayout_shapeFlStrokeSize, DEF_VALUE_INT)
        val shapeStrokeColor = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlStrokeColor, DEF_VALUE_INT_0)
        val shapeGradientTypeIndex = typedArray.getInt(R.styleable.ShapeFrameLayout_shapeFlGradientType, DEF_VALUE_INT)
        val shapeGradientOrientationIndex = typedArray.getInt(R.styleable.ShapeFrameLayout_shapeFlGradientOrientation, DEF_VALUE_INT)
        val shapeGradientColor1 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor1, DEF_VALUE_INT)
        val shapeGradientColor2 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor2, DEF_VALUE_INT)
        val shapeGradientColor3 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor3, DEF_VALUE_INT)
        val shapeGradientColor4 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor4, DEF_VALUE_INT)
        val shapeGradientColor5 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor5, DEF_VALUE_INT)
        val shapeGradientColor6 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor6, DEF_VALUE_INT)
        val shapeGradientColor7 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor7, DEF_VALUE_INT)
        val shapeGradientColor8 = typedArray.getColor(R.styleable.ShapeFrameLayout_shapeFlGradientColor8, DEF_VALUE_INT)
        val shapeRadius = typedArray.getFloat(R.styleable.ShapeFrameLayout_shapeFlRadius, DEF_VALUE_FLOAT)
        val shapeLeftTopRadius = typedArray.getFloat(R.styleable.ShapeFrameLayout_shapeFlLeftTopRadius, DEF_VALUE_FLOAT)
        val shapeRightTopRadius = typedArray.getFloat(R.styleable.ShapeFrameLayout_shapeFlRightTopRadius, DEF_VALUE_FLOAT)
        val shapeLeftBottomRadius = typedArray.getFloat(R.styleable.ShapeFrameLayout_shapeFlLeftBottomRadius, DEF_VALUE_FLOAT)
        val shapeRightBottomRadius = typedArray.getFloat(R.styleable.ShapeFrameLayout_shapeFlRightBottomRadius, DEF_VALUE_FLOAT)
        typedArray.recycle()

        setShapeType(ShapeConstant.shapeTypeList[shapeTypeIndex])
        if (shapeBgColor != DEF_VALUE_INT)
            setShapeBackgroundColor(shapeBgColor)
        if (shapeStrokeSize != DEF_VALUE_INT)
            setShapeStroke(shapeStrokeSize, shapeStrokeColor)
        if (shapeGradientTypeIndex != DEF_VALUE_INT)
            setShapeGradientType(ShapeConstant.gradientTypeList[shapeGradientTypeIndex])
        if (shapeGradientOrientationIndex != DEF_VALUE_INT)
            setShapeGradientOrientation(ShapeConstant.gradientOrientationList[shapeGradientOrientationIndex])

        val gradientStartColors = mutableListOf<Int>()
        if (shapeGradientColor1 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor1)
        }
        if (shapeGradientColor2 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor2)
        }
        if (shapeGradientColor3 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor3)
        }
        if (shapeGradientColor4 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor4)
        }
        if (shapeGradientColor5 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor4)
        }
        if (shapeGradientColor6 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor4)
        }
        if (shapeGradientColor7 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor4)
        }
        if (shapeGradientColor8 != DEF_VALUE_INT) {
            gradientStartColors.add(shapeGradientColor8)
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