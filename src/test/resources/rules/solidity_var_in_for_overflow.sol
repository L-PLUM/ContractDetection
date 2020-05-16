pragma solidity ^0.4.11;

contract SolidityUncheckedSend {
    function unseatKing(address a, uint w) view returns (uint){
    // <yes> <report> solidity_var_in_for_overflow vil101
        for (var i = 0; i < 257; i++) {
            a=0;
        }
        for (var i = 0; i < 4; i++) {
            a=0;
        }
        for (var i = 1000; i > 400; i--) {
            a=0;
        }
    }
}