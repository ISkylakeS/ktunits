[![Build Status](https://travis-ci.org/sargunster/KtUnits.svg?branch=master)](https://travis-ci.org/sargunster/KtUnits)
[![Download](https://api.bintray.com/packages/sargunster/maven/KtUnits/images/download.svg) ](https://bintray.com/sargunster/maven/KtUnits/_latestVersion)

# KtUnits

Simple unit conversion library for Kotlin.

## Usage

### Conversion

You can convert units easily:

```Kotlin
fun foo() {
  val m = 100.minutes.toMilliseconds // magic
  println("100 minutes equal $m milliseconds")
}
```

### Parameters

You can take a value as an argument without worrying about the units, and convert to the units you want when you use it.

```Kotlin
fun wait(time: TimeValue) {
  Thread.sleep(time.toMilliseconds)
}

fun bar() {
  wait(5.seconds)
  wait(10.days)
}
```

### Supported units

The library currently supports time (from nanoseconds to days) and memory (from bits to pebibytes).

## Download

Just put this in your `build.gradle` or `Build.kt`. Replace `<version>` with the version shown in the badge at the top of this `README.md`.

```Kotlin
dependencies {
  compile("me.sargunvohra.lib:KtUnits:<version>")
}
```
