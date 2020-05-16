pragma solidity 0.4.24;

contract MsgValue {

    constructor() public {
        require(msg.value == 0);
    }

    function myFunc() public returns(uint) {
        // <yes> <report> solidity_meaningless_msgvalue_check msg101
        require(msg.value == 0);
        // <yes> <report> solidity_meaningless_msgvalue_check msg101
        if(msg.value == 0) {
            return(1);
        }
        // <yes> <report> solidity_meaningless_msgvalue_check msg101
        assert(msg.value == 0);
    }

    function() {
         // <yes> <report> solidity_meaningless_msgvalue_check msg101
        require(msg.value == 0);
    }
}

contract MsgValue2 {

    function MsgValue2() {
        require(msg.value == 0);
    }
}