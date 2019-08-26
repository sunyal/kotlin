// IGNORE_BACKEND: WASM
enum class A {
    OK
}

enum class B {
    FAIL
}

fun f() = A.OK

fun box(): String {
    return when (f()) {
        B.FAIL -> "fail"
        A.OK -> "OK"
    }
}
