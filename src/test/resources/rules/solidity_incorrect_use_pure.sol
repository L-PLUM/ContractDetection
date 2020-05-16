pragma solidity ^0.4.16;

contract C {
    address f;
// <yes> <report> solidity_incorrect_use_pure pur101
    function returnsenderbalance() pure returns (uint){
         return msg.sender.balance;
    }
// <yes> <report> solidity_incorrect_use_pure pur101
    function returnsenderbalance() pure returns (uint){
        if (f < this.balance) x.send(10);
        return t;
    }
// <yes> <report> solidity_incorrect_use_pure pur101
    function returnsenderbalance() pure returns (uint){
        y=msg.value;
        o=block.timestamp;
        return t;
    }
    // <yes> <report> solidity_incorrect_use_pure pur101
    function returnsenderbalance() pure returns (uint){
        y=msg.value;
        o=block.timestamp;
        selfdestruct(f);
        return t;
    }
    function returnsenderbalance() pure returns (uint){
        return t;
    }
    function returnsenderbalance() returns (uint){
        y=msg.value;
        o=block.timestamp;
        return t;
    }
}
contract Math {
    function Mul(uint a, uint b) pure internal returns (uint) {
      uint c = a * b;
      //check result should not be other wise until a=0
      assert(a == 0 || c / a == b);
      return c;
    }
}