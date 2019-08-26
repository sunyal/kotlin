// IGNORE_BACKEND: WASM
// WITH_RUNTIME
// CHECK_CASES_COUNT: function=bar count=3
// CHECK_IF_COUNT: function=bar count=0

import kotlin.test.assertEquals

enum class Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

fun bar(x : Season) : String {
    when (x) {
        Season.WINTER, Season.SPRING -> return "winter_spring"
        Season.SUMMER, Season.SPRING -> return "summer"
        else -> return "autumn"
    }
}

fun box() : String {
    assertEquals("winter_spring", bar(Season.WINTER))
    assertEquals("winter_spring", bar(Season.SPRING))
    assertEquals("summer", bar(Season.SUMMER))
    assertEquals("autumn", bar(Season.AUTUMN))

    return "OK"
}
