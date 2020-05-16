pragma solidity 0.4.24;

contract HoneyPot {
    
    bytes internal constant ID = hex"60203414600857005B60008080803031335AF100";
    
    constructor () public payable {
        bytes memory contract_identifier = ID;
        // <yes> <report> solidity_assembly_return_in_constructor arc101
        assembly { return(add(0x20, contract_identifier), mload(contract_identifier)) }
    }
    
    function withdraw() public payable {
        require(msg.value >= 1 ether);
        msg.sender.transfer(address(this).balance);
    }
}

contract HoneyPotOldSchool {

    bytes internal constant ID = hex"60203414600857005B60008080803031335AF100";

    function HoneyPotOldSchool() public payable {
        bytes memory contract_identifier = ID;
        // <yes> <report> solidity_assembly_return_in_constructor arc102
        assembly { return(add(0x20, contract_identifier), mload(contract_identifier)) }
    }

    function withdraw() public payable {
        require(msg.value >= 1 ether);
        msg.sender.transfer(address(this).balance);
    }
}