package com.bugrui.shape

import android.graphics.drawable.GradientDrawable

/**
 * @Author:         BugRui
 * @Description:     Shape常量
 * @CreateDate:     2021/2/2 10:37 AM
 * @UpdateUser:     更新者
 * @UpdateDate:     2021/2/2 10:37 AM
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
object ShapeConstant {


    val shapeTypeList = listOf(
        GradientDrawable.RECTANGLE,
        GradientDrawable.OVAL,
        GradientDrawable.LINE,
        GradientDrawable.RING
    )


    val gradientTypeList = listOf(
        GradientDrawable.LINEAR_GRADIENT,
        GradientDrawable.RADIAL_GRADIENT,
        GradientDrawable.SWEEP_GRADIENT
    )

    val gradientOrientationList = listOf(
        /** draw the gradient from the top to the bottom */
        GradientDrawable.Orientation.TOP_BOTTOM,
        /** draw the gradient from the top-right to the bottom-left */
        GradientDrawable.Orientation.TR_BL,
        /** draw the gradient from the right to the left */
        GradientDrawable.Orientation.RIGHT_LEFT,
        /** draw the gradient from the bottom-right to the top-left */
        GradientDrawable.Orientation.BR_TL,
        /** draw the gradient from the bottom to the top */
        GradientDrawable.Orientation.BOTTOM_TOP,
        /** draw the gradient from the bottom-left to the top-right */
        GradientDrawable.Orientation.BL_TR,
        /** draw the gradient from the left to the right */
        GradientDrawable.Orientation.LEFT_RIGHT,
        /** draw the gradient from the top-left to the bottom-right */
        GradientDrawable.Orientation.TL_BR
    )

}