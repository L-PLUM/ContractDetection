pragma solidity ^0.4.11;

contract SolidityVarZero {
    function foo1() {
        // <yes> <report> solidity_use_var var101
        for (var i = 0; i < a.length; i ++) { a[i] = i; }
    }
    function foo2() {
        for (uint16 i = 0; i < a.length; i ++) { a[i] = i; }
    }
    function foo3() {
        // <yes> <report> solidity_use_var var102
        var a;
        // <yes> <report> solidity_use_var var101
        var minIdx = 0; /* inferred to uint8 */
        for (var i = minIdx; i < a.length; i++) { a[i] = i; }

    }
}
