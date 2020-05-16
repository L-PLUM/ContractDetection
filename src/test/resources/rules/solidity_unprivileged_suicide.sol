pragma solidity 0.4.24;
contract Unprivigled {
    address public owner;
    constructor() public payable{
       owner = msg.sender;
     }

    modifier onlyOwner() {
        require(msg.sender == owner);
        _;
    }

    function kill(address _add) public onlyOwner {
        selfdestruct(_add);
    }
	
	function kill(address _add) public {
	    require(msg.sender == owner);
        selfdestruct(_add);
    }
    // <yes> <report> solidity_unprivileged_suicide unp101
	function kill(address _add) public  {
        selfdestruct(_add);
    }
}