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

Because MultiTypeLayout only USES compileOnly internally and relies on appCompat, you need to add the following dependencies to your project otherwise compileOnly will not pass

```
 implementation "androidx.appcompat:appcompat:latest.integration"
```




