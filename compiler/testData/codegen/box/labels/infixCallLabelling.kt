// IGNORE_BACKEND: WASM
fun test(x: Int): Int {
    x myMap {
        return@myMap
    }

    return 0
}

fun myMap(x: Int): Int {
    x myMap {
        return@myMap
    }

    return 0
}

infix fun Int.myMap(x: () -> Unit) {}

fun box(): String {
    test(0)
    myMap(0)

    return "OK"
}