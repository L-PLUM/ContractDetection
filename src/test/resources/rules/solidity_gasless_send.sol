pragma solidity 0.4.24;

contract SoliditySend {

    function payOut() {
        uint i=50;
        while ( i < 100 && msg.gas > 200000) {
            msg.sender.send(msg.value);
            i++;
        }

        function payOut1() {
// <yes> <report> solidity_gasless_send sen101
        if (!msg.sender.send(1)) { revert();}
         balances[msg.sender] = 0;
        }

        function payOut() {
// <yes> <report> solidity_gasless_send sen101
        if (!msg.sender.send(1)) { throw;}
         balances[msg.sender] = 0;
        }

        function payOut() {
// <yes> <report> solidity_gasless_send sen101
        require(msg.sender.send(msg.value));
             balances[msg.sender] = 0;
         }

         function payOut() {
// <yes> <report> solidity_gasless_send sen101
        assert(msg.sender.send(msg.value));
         balances[msg.sender] = 0;
    }
}