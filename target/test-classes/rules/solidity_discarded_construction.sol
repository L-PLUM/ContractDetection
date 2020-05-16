pragma solidity 0.4.24;

contract C {
    function kill() {
    // <yes> <report> solidity_discarded_construction  sui101
        suicide(0x0);
    }
    function hashingsha3 (string s)   returns  (bytes32 hash){
     // <yes> <report> solidity_discarded_construction  sha102
        return sha3(s);
    }
    function delegatecallSetN(address _e, uint _n) {
    // <yes> <report> solidity_discarded_construction thr103
        if (_e != address(0)) throw;
    }
    function killer() {
        uint r;
        assembly {
            // <yes> <report> solidity_discarded_construction  sha102
            r := sha3('','')
            // <yes> <report> solidity_discarded_construction  sui101
            suicide(0x0)
        }
    }
    // <yes> <report> solidity_discarded_construction con104
    function returnSenderBalance(uint a) constant returns (uint){
            return a;
    }

    function usingYears() returns(uint) {
    // <yes> <report> solidity_discarded_construction yea105
        return 100 years;
    }
}