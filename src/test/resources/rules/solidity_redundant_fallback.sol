pragma solidity 0.4.24;

contract C1 {
    // <yes> <report> solidity_redundant_fallback rfk101
    function() payable {
        throw;
    }
}
contract C2 {
    // <yes> <report> solidity_redundant_fallback rfk101
    function() {
        revert();
    }
}
contract C3 {
    function() payable {
        if(msg.sender == address(0)) {
            revert();
        }
    }
}
contract C4 {
    address a;
    function() payable {
        a = msg.sender;
        revert();
    }
}
