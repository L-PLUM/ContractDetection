pragma solidity 0.4.24;

contract Power{

 bool public isFinalized = false;
 address public owner;
 
 constructor() public {
       owner = msg.sender;
     }

    modifier onlyOwner() {
        require(msg.sender == owner);
        _;
    }
 // <yes> <report> solidity_super_power_manager spm101
 function finalize() public{
     require(msg.sender == owner);
	 isFinalized == true;
  }
  // <yes> <report> solidity_super_power_manager spm101
  function finalize1() public onlyOwner{
	 isFinalized == true;
  }
  
  
  function transfer(address _to, uint _value) returns (bool){
      require(isFinalized);
	  super.transfer(_to, _value);
  }
}