package com.bugrui.shape

import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.Px
import androidx.annotation.RequiresApi

/**
 * @Author:         BugRui
 * @Description:     GradientDrawable扩展，shape动态化
 * @CreateDate:     2021/1/16 3:41 PM
 * @UpdateUser:     更新者
 * @UpdateDate:     2021/1/16 3:41 PM
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */


/**
 * 获取View的GradientDrawable
 */
private fun View.getViewGradientDrawable(): GradientDrawable {
    if (this.background == null || this.background !is GradientDrawable) {
        this.background = GradientDrawable()
    }
    return this.background as GradientDrawable
}

/**
 * 设置shape类型
 * @param shape
 * GradientDrawable.RECTANGLE,
 * GradientDrawable.OVAL,
 * GradientDrawable.LINE,
 * GradientDrawable.RING
 */
fun View.setShapeType(shape: Int): View {
    getViewGradientDrawable().shape = shape
    return this
}

/**
 * 添加背景颜色
 * @param color 颜色
 */
fun View.setShapeBackgroundColor(@ColorInt color: Int): View {
    getViewGradientDrawable().setColor(color)
    return this
}



/**
 * 设置圆角
 */
fun View.setShapeCornerRadius(radius: Float): View {
    getViewGradientDrawable().cornerRadius = radius
    return this
}

/**
 * 设置圆角
 * @param radii 必须8个值
 * 为4个角中的每个角指定半径。对于每个角，数组*包含2个值，
 * 角是*有序的左上角，右上角，右下角，左下角。
 * 仅当形状的类型为{@link #RECTANGLE}时，才使用此属性*。
 * 更改此属性将影响从资源加载的可绘制对象的所有实例。建议在更改此属性之前调用* {@link #mutate（）}。
 * * * @param半径长度大于等于8的数组，包含4对X和Y *每个角的半径，以像素为单位指定*
 * * @see #mutate（）* @see #setShape（int）* @see #setCornerRadius（浮动）* /
 */
fun View.setShapeCornerRadii(vararg radii: Float): View {
    getViewGradientDrawable().cornerRadii = radii
    return this
}

fun View.setGradientCenter() {
    getViewGradientDrawable().setGradientCenter(90F, 90F)
}


/**
 * 添加边框
 * @param size 边框大小
 * @param color 边框颜色
 */
fun View.setShapeStroke(size: Int, @ColorInt color: Int): View {
    getViewGradientDrawable().setStroke(size, color)
    return this
}

/**
 * 设置线性渐变
 * @param gradient 渐变方式
 * （线性渐变）GradientDrawable.LINEAR_GRADIENT
 * （圆形渐变）GradientDrawable.RADIAL_GRADIENT
 * （扫描式渐变）GradientDrawable.SWEEP_GRADIENT
 */
fun View.setShapeGradientType(gradient: Int): View {
    getViewGradientDrawable().gradientType = gradient
    return this
}

/**
 * 设置渐变方向
 */
fun View.setShapeGradientOrientation(orientation: GradientDrawable.Orientation): View {
    getViewGradientDrawable().orientation = orientation
    return this
}

/**
 * 增加渐变效果,渐变颜色
 *  @param colors 多个渐变颜色
 */
fun View.setShapeGradientColors(colors: IntArray): View {
    getViewGradientDrawable().colors = colors
    return this
}


/**
 * 定义内容离边界的距离
 */
@RequiresApi(Build.VERSION_CODES.Q)
fun View.setShapePadding(@Px left: Int, @Px top: Int, @Px right: Int, @Px bottom: Int): View {
    getViewGradientDrawable().setPadding(left, top, right, bottom)
    return this
}