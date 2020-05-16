pragma solidity 0.4.24;

contract C {
    // <yes> <report> solidity_multiple_return_values res101
    function f1() internal returns(uint a, uint b) {
        a = 1;
        b = 2;
    }
    // <yes> <report> solidity_multiple_return_values res101
    function f2() private returns(uint a, uint b) {
        a = 1;
        b = 2;
    }

    function f5() external returns(uint a, uint b) {
        a = 1;
        b = 2;
    }

    function f6() returns(uint a) {
        a = 1;
    }

    function f7() public returns(uint a, uint b) {
        a = 1;
        b = 2;
    }
}