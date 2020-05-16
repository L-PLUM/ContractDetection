pragma solidity 0.4.23;

contract SolidityVisibility1 {

   // <yes> <report> solidity_visibility vis104
    uint x;
    uint private y;

   // <yes> <report> solidity_visibility vis102
    function transfer() {
        x=0;
    }

    function isServer(address sender) public constant returns (bool) {
        return sender == msg.sender;
    }

    function transfernew() external {
    }

    function transfernew2() private {
    }

    function internalAction() internal {
    }

  // <yes> <report> solidity_visibility vis103
    function () private {
    }
}


contract SolidityVisibility2 {

    // <yes> <report> solidity_visibility vis102
    constructor () {
        address owner = msg.sender;
    }
   // <yes> <report> solidity_visibility vis105
    constructor () external {
        address owner = msg.sender;
    }
   // <yes> <report> solidity_visibility vis105
    constructor () private {
        address owner = msg.sender;
    }
   // <yes> <report> solidity_visibility vis102
    function AccessManager(address _server, address _guardian) returns(address){
        return _server;
    }

   // <yes> <report> solidity_visibility vis102
    function () {
    }
}


interface SolidityVisibility3 {

    // <yes> <report> solidity_visibility vis102
    function noVisibility1 ();

   // <yes> <report> solidity_visibilityy vis101
    function noVisibility2 () public;

   // <yes> <report> solidity_visibility vis101
    function noVisibility3 () private;

   // <yes> <report> solidity_visibility vis101
    function noVisibility4 () internal;

    function noVisibility5 () external;

    function () external;

} 


contract SolidityVisibility4 {

    function () public {
    }
}


contract SolidityVisibility5 {

    function () external {
    }
}


contract SolidityVisibility6 {

// <yes> <report> solidity_visibility vis103
    function () internal {
    }
}

interface SolidityVisibility7 {
// <yes> <report> solidity_visibility vis101
    function () public;
} 


interface SolidityVisibility8 {
// <yes> <report> solidity_visibility vis102
    function ();
} 


interface SolidityVisibility9 {
// <yes> <report> solidity_visibility vis101
    function () private;
} 


library LibraryVisibility {
// <yes> <report> solidity_visibility vis102
    function noVisibility () {
    }

    function withVisibility () public {
    }
}