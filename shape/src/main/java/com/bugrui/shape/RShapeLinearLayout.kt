package com.bugrui.shape

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.LinearLayout

/**
 * @Author:         BugRui
 * @Description:     能在XML直接配置Shape的LinearLayout
 * @CreateDate:     2021/2/2 10:29 AM
 * @UpdateUser:     更新者
 * @UpdateDate:     2021/2/2 10:29 AM
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class RShapeLinearLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    companion object {
        private const val DEF_VALUE_INT = -1
        private const val DEF_VALUE_INT_0 = 0
        private const val DEF_VALUE_FLOAT = -1F
    }


    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RShapeLinearLayout)

        val shapeTypeIndex = typedArray.getInt(R.styleable.RShapeLinearLayout_shapeLlType, DEF_VALUE_INT_0)
        val shapeBgColor = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlBgColor)
        val shapeStrokeSize = typedArray.getInt(R.styleable.RShapeLinearLayout_shapeLlStrokeSize, DEF_VALUE_INT)
        val shapeStrokeColor = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlStrokeColor)
        val shapeGradientTypeIndex = typedArray.getInt(R.styleable.RShapeLinearLayout_shapeLlGradientType, DEF_VALUE_INT)
        val shapeGradientOrientationIndex = typedArray.getInt(R.styleable.RShapeLinearLayout_shapeLlGradientOrientation,DEF_VALUE_INT)
        val shapeGradientColor1 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor1)
        val shapeGradientColor2 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor2)
        val shapeGradientColor3 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor3)
        val shapeGradientColor4 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor4)
        val shapeGradientColor5 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor5)
        val shapeGradientColor6 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor6)
        val shapeGradientColor7 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor7)
        val shapeGradientColor8 = typedArray.getColorStateList(R.styleable.RShapeLinearLayout_shapeLlGradientColor8)
        val shapeRadius = typedArray.getFloat(R.styleable.RShapeLinearLayout_shapeLlRadius, DEF_VALUE_FLOAT)
        val shapeLeftTopRadius = typedArray.getFloat(R.styleable.RShapeLinearLayout_shapeLlLeftTopRadius, DEF_VALUE_FLOAT)
        val shapeRightTopRadius = typedArray.getFloat(R.styleable.RShapeLinearLayout_shapeLlRightTopRadius, DEF_VALUE_FLOAT)
        val shapeLeftBottomRadius = typedArray.getFloat(R.styleable.RShapeLinearLayout_shapeLlLeftBottomRadius, DEF_VALUE_FLOAT)
        val shapeRightBottomRadius = typedArray.getFloat(R.styleable.RShapeLinearLayout_shapeLlRightBottomRadius, DEF_VALUE_FLOAT)
        typedArray.recycle()

        setShapeType(RShapeConstant.shapeTypeList[shapeTypeIndex])
        if (shapeBgColor != null)
            setShapeBackgroundColor(shapeBgColor.defaultColor)
        if (shapeStrokeSize != DEF_VALUE_INT&& shapeStrokeColor!=null)
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