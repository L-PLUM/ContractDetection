pragma solidity ^0.4.11;

contract SolidityTxOrigin {
    function dangerousWithdraw() returns (bool) {
        address owner;
        // <yes> <report> solidity_use_tx_origin txo101
        if (tx.origin == owner) {
            return true;
        }
        var origin = "foo";
        if (msg.sender != tx.origin) {
            throw;
        }
        require(tx.origin == msg.sender);
        // <yes> <report> solidity_use_tx_origin txo101
        owner = tx.origin;
    }
}
