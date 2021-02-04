# RShape. View可在xml或者代码里面配置shape  [![version](https://jitpack.io/v/BugRui/RShape.svg)](https://jitpack.io/#BugRui/RShape/1.0.0)
 
### 集成
#### Step 1. Add the JitPack repository to your build file
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
#### Step 2. Add the dependency
```
dependencies {
	implementation 'com.github.BugRui:RShape:1.0.0'
}
```
因为RShape只在内部使用compileOnly，并且依赖于appCompat，所以需要将以下依赖项添加到自己的项目中，否则compileOnly将无法通过打包

Because RShape only USES compileOnly internally and relies on appCompat, you need to add the following dependencies to your project otherwise compileOnly will not pass

```
implementation "androidx.appcompat:appcompat:latest.integration"
```

xml配置
```

 <!-- ShapeTextView,xml快速配置Shape -->
    <declare-styleable name="RShapeTextView">

        <!-- shape类型 -->
        <attr name="shapeTvType" format="integer">
            <enum name="RECTANGLE" value="0" />
            <enum name="OVAL" value="0" />
            <enum name="LINE" value="0" />
            <enum name="RING" value="0" />
        </attr>

        <!-- shape背景颜色 -->
        <attr name="shapeTvBgColor" format="color" />

        <!-- shape边框大小 -->
        <attr name="shapeTvStrokeSize" format="integer" />

        <!-- shape边框颜色 -->
        <attr name="shapeTvStrokeColor" format="color" />

        <!-- shape gradientType 渐变类型-->
        <attr name="shapeTvGradientType" format="integer">
            <enum name="linear" value="0" />
            <enum name="radial" value="1" />
            <enum name="sweep" value="2" />
        </attr>

        <!-- shape Orientation 渐变方向 -->
        <attr name="shapeTvGradientOrientation" format="integer">
            <enum name="TOP_BOTTOM" value="0" />
            <enum name="TR_BL" value="1" />
            <enum name="RIGHT_LEFT" value="2" />
            <enum name="BR_TL" value="3" />
            <enum name="BOTTOM_TOP" value="4" />
            <enum name="BL_TR" value="5" />
            <enum name="LEFT_RIGHT" value="6" />
            <enum name="TL_BR" value="7" />
        </attr>

        <!-- shape渐变颜色1 -->
        <attr name="shapeTvGradientColor1" format="color" />

        <!-- shape渐变颜色2 -->
        <attr name="shapeTvGradientColor2" format="color" />

        <!-- shape渐变颜色3 -->
        <attr name="shapeTvGradientColor3" format="color" />

        <!-- shape渐变颜色4 -->
        <attr name="shapeTvGradientColor4" format="color" />

        <!-- shape渐变颜色5 -->
        <attr name="shapeTvGradientColor5" format="color" />

        <!-- shape渐变颜色6 -->
        <attr name="shapeTvGradientColor6" format="color" />

        <!-- shape渐变颜色7 -->
        <attr name="shapeTvGradientColor7" format="color" />

        <!-- shape渐变颜色8 -->
        <attr name="shapeTvGradientColor8" format="color" />

        <!-- shape圆角 -->
        <attr name="shapeTvRadius" format="float" />

        <!-- shape左上圆角 -->
        <attr name="shapeTvLeftTopRadius" format="float" />

        <!-- shape右上圆角 -->
        <attr name="shapeTvRightTopRadius" format="float" />

        <!-- shape左下圆角 -->
        <attr name="shapeTvLeftBottomRadius" format="float" />

        <!-- shape右下圆角 -->
        <attr name="shapeTvRightBottomRadius" format="float" />

    </declare-styleable>

    <!-- ShapeEditText,xml快速配置Shape -->
    <declare-styleable name="RShapeEditText">

        <!-- shape类型 -->
        <attr name="shapeEtType" format="integer">
            <enum name="RECTANGLE" value="0" />
            <enum name="OVAL" value="0" />
            <enum name="LINE" value="0" />
            <enum name="RING" value="0" />
        </attr>

        <!-- shape背景颜色 -->
        <attr name="shapeEtBgColor" format="color" />

        <!-- shape边框大小 -->
        <attr name="shapeEtStrokeSize" format="integer" />

        <!-- shape边框颜色 -->
        <attr name="shapeEtStrokeColor" format="color" />

        <!-- shape gradientType 渐变类型-->
        <attr name="shapeEtGradientType" format="integer">
            <enum name="linear" value="0" />
            <enum name="radial" value="1" />
            <enum name="sweep" value="2" />
        </attr>

        <!-- shape Orientation 渐变方向 -->
        <attr name="shapeEtGradientOrientation" format="integer">
            <enum name="TOP_BOTTOM" value="0" />
            <enum name="TR_BL" value="1" />
            <enum name="RIGHT_LEFT" value="2" />
            <enum name="BR_TL" value="3" />
            <enum name="BOTTOM_TOP" value="4" />
            <enum name="BL_TR" value="5" />
            <enum name="LEFT_RIGHT" value="6" />
            <enum name="TL_BR" value="7" />
        </attr>

        <!-- shape渐变颜色1 -->
        <attr name="shapeEtGradientColor1" format="color" />

        <!-- shape渐变颜色2 -->
        <attr name="shapeEtGradientColor2" format="color" />

        <!-- shape渐变颜色3 -->
        <attr name="shapeEtGradientColor3" format="color" />

        <!-- shape渐变颜色4 -->
        <attr name="shapeEtGradientColor4" format="color" />

        <!-- shape渐变颜色5 -->
        <attr name="shapeEtGradientColor5" format="color" />

        <!-- shape渐变颜色6 -->
        <attr name="shapeEtGradientColor6" format="color" />

        <!-- shape渐变颜色7 -->
        <attr name="shapeEtGradientColor7" format="color" />

        <!-- shape渐变颜色8 -->
        <attr name="shapeEtGradientColor8" format="color" />

        <!-- shape圆角 -->
        <attr name="shapeEtRadius" format="float" />

        <!-- shape左上圆角 -->
        <attr name="shapeEtLeftTopRadius" format="float" />

        <!-- shape右上圆角 -->
        <attr name="shapeEtRightTopRadius" format="float" />

        <!-- shape左下圆角 -->
        <attr name="shapeEtLeftBottomRadius" format="float" />

        <!-- shape右下圆角 -->
        <attr name="shapeEtRightBottomRadius" format="float" />

    </declare-styleable>


    <!-- ShapeLinearLayout,xml快速配置Shape -->
    <declare-styleable name="RShapeLinearLayout">

        <!-- shape类型 -->
        <attr name="shapeLlType" format="integer">
            <enum name="RECTANGLE" value="0" />
            <enum name="OVAL" value="0" />
            <enum name="LINE" value="0" />
            <enum name="RING" value="0" />
        </attr>

        <!-- shape背景颜色 -->
        <attr name="shapeLlBgColor" format="color" />

        <!-- shape边框大小 -->
        <attr name="shapeLlStrokeSize" format="integer" />

        <!-- shape边框颜色 -->
        <attr name="shapeLlStrokeColor" format="color" />

        <!-- shape gradientType 渐变类型-->
        <attr name="shapeLlGradientType" format="integer">
            <enum name="linear" value="0" />
            <enum name="radial" value="1" />
            <enum name="sweep" value="2" />
        </attr>

        <!-- shape Orientation 渐变方向 -->
        <attr name="shapeLlGradientOrientation" format="integer">
            <enum name="TOP_BOTTOM" value="0" />
            <enum name="TR_BL" value="1" />
            <enum name="RIGHT_LEFT" value="2" />
            <enum name="BR_TL" value="3" />
            <enum name="BOTTOM_TOP" value="4" />
            <enum name="BL_TR" value="5" />
            <enum name="LEFT_RIGHT" value="6" />
            <enum name="TL_BR" value="7" />
        </attr>

        <!-- shape渐变颜色1 -->
        <attr name="shapeLlGradientColor1" format="color" />

        <!-- shape渐变颜色2 -->
        <attr name="shapeLlGradientColor2" format="color" />

        <!-- shape渐变颜色3 -->
        <attr name="shapeLlGradientColor3" format="color" />

        <!-- shape渐变颜色4 -->
        <attr name="shapeLlGradientColor4" format="color" />

        <!-- shape渐变颜色5 -->
        <attr name="shapeLlGradientColor5" format="color" />

        <!-- shape渐变颜色6 -->
        <attr name="shapeLlGradientColor6" format="color" />

        <!-- shape渐变颜色7 -->
        <attr name="shapeLlGradientColor7" format="color" />

        <!-- shape渐变颜色8 -->
        <attr name="shapeLlGradientColor8" format="color" />

        <!-- shape圆角 -->
        <attr name="shapeLlRadius" format="float" />

        <!-- shape左上圆角 -->
        <attr name="shapeLlLeftTopRadius" format="float" />

        <!-- shape右上圆角 -->
        <attr name="shapeLlRightTopRadius" format="float" />

        <!-- shape左下圆角 -->
        <attr name="shapeLlLeftBottomRadius" format="float" />

        <!-- shape右下圆角 -->
        <attr name="shapeLlRightBottomRadius" format="float" />

    </declare-styleable>


    <!-- ShapeFrameLayout,xml快速配置Shape -->
    <declare-styleable name="RShapeFrameLayout">

        <!-- shape类型 -->
        <attr name="shapeFlType" format="integer">
            <enum name="RECTANGLE" value="0" />
            <enum name="OVAL" value="0" />
            <enum name="LINE" value="0" />
            <enum name="RING" value="0" />
        </attr>

        <!-- shape背景颜色 -->
        <attr name="shapeFlBgColor" format="color" />

        <!-- shape边框大小 -->
        <attr name="shapeFlStrokeSize" format="integer" />

        <!-- shape边框颜色 -->
        <attr name="shapeFlStrokeColor" format="color" />

        <!-- shape gradientType 渐变类型-->
        <attr name="shapeFlGradientType" format="integer">
            <enum name="linear" value="0" />
            <enum name="radial" value="1" />
            <enum name="sweep" value="2" />
        </attr>

        <!-- shape Orientation 渐变方向 -->
        <attr name="shapeFlGradientOrientation" format="integer">
            <enum name="TOP_BOTTOM" value="0" />
            <enum name="TR_BL" value="1" />
            <enum name="RIGHT_LEFT" value="2" />
            <enum name="BR_TL" value="3" />
            <enum name="BOTTOM_TOP" value="4" />
            <enum name="BL_TR" value="5" />
            <enum name="LEFT_RIGHT" value="6" />
            <enum name="TL_BR" value="7" />
        </attr>

        <!-- shape渐变颜色1 -->
        <attr name="shapeFlGradientColor1" format="color" />

        <!-- shape渐变颜色2 -->
        <attr name="shapeFlGradientColor2" format="color" />

        <!-- shape渐变颜色3 -->
        <attr name="shapeFlGradientColor3" format="color" />

        <!-- shape渐变颜色4 -->
        <attr name="shapeFlGradientColor4" format="color" />

        <!-- shape渐变颜色5 -->
        <attr name="shapeFlGradientColor5" format="color" />

        <!-- shape渐变颜色6 -->
        <attr name="shapeFlGradientColor6" format="color" />

        <!-- shape渐变颜色7 -->
        <attr name="shapeFlGradientColor7" format="color" />

        <!-- shape渐变颜色8 -->
        <attr name="shapeFlGradientColor8" format="color" />

        <!-- shape圆角 -->
        <attr name="shapeFlRadius" format="float" />

        <!-- shape左上圆角 -->
        <attr name="shapeFlLeftTopRadius" format="float" />

        <!-- shape右上圆角 -->
        <attr name="shapeFlRightTopRadius" format="float" />

        <!-- shape左下圆角 -->
        <attr name="shapeFlLeftBottomRadius" format="float" />

        <!-- shape右下圆角 -->
        <attr name="shapeFlRightBottomRadius" format="float" />

    </declare-styleable>


```




