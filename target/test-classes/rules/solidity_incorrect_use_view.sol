pragma solidity ^0.4.11;

contract SolidityUncheckedSend {
// <yes> <report> solidity_incorrect_use_view vie101
    function unseatKing(address a, uint w) view returns (uint){
        selfdestruct(a);
        }

// <yes> <report> solidity_incorrect_use_view vie101
    function unseatKing(address a, uint w) view returns (uint){
        suicide(a);
        }

    // <yes> <report> solidity_incorrect_use_view vie101
    function unseatKing(address a, uint w) view returns (uint){
        x.transfer(10);
        }

    // <yes> <report> solidity_incorrect_use_view vie101
    function unseatKing(address a, uint w) view returns (uint){
        x.send(10);
        }

    function unseatKing(address a, uint w) returns (uint){
        x.job(10);
        }
    // <yes> <report> solidity_incorrect_use_view vie101
    function unseatKing(address a, uint w) view returns (uint){
        namReg.call.gas(1000000)("register", "MyName");
        }
    // <yes> <report> solidity_incorrect_use_view vie101
    function at(address _addr) view returns (uint) {
        assembly{
            let
            size := extcodesize(_addr)
            extcodecopy(_addr, add(o_code, 0x20), 0, size)
            }
        }
}