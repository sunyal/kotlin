/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package test.collections.js

import kotlin.test.*

class ArraysJsTest {
    @Test
    fun toTypedArrayIsObjectArray() {
        fun checkIsObjectArray(array: Any, arrayType: String) = assertTrue(array is Array<*>, "$arrayType.toTypedArray() is not Array<*>")
        checkIsObjectArray(intArrayOf(1).toTypedArray(), "IntArray")
        checkIsObjectArray(longArrayOf(1).toTypedArray(), "LongArray")
        checkIsObjectArray(charArrayOf('a').toTypedArray(), "CharArray")
        checkIsObjectArray(booleanArrayOf(false).toTypedArray(), "BooleanArray")
    }
}
