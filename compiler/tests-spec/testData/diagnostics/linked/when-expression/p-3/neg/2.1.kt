// !WITH_BASIC_TYPES

/*
 * KOTLIN DIAGNOSTICS SPEC TEST (NEGATIVE)
 *
 * SECTIONS: when-expression
 * PARAGRAPH: 3
 * SENTENCE: [2] Each entry consists of a boolean condition (or a special else condition), each of which is checked and evaluated in order of appearance.
 * NUMBER: 1
 * DESCRIPTION: 'When' without bound value and with not boolean condition in 'when condition'.
 */

// TESTCASE NUMBER: 1
fun case_1(value_1: Int, value_2: String, value_3: _BasicTypesProvider): String {
    when {
        <!TYPE_MISMATCH!>.012f / value_1<!> -> return ""
        <!TYPE_MISMATCH!>"$value_2..."<!> -> return ""
        <!CONSTANT_EXPECTED_TYPE_MISMATCH!>'-'<!> -> return ""
        <!TYPE_MISMATCH!>{}<!> -> return ""
        <!TYPE_MISMATCH!>value_3.getAny()<!> -> return ""
        <!TYPE_MISMATCH!>-10..-1<!> -> return ""
    }

    return ""
}
