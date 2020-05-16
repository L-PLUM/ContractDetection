pragma solidity 0.4.24;
contract MyTreasure {
    address public myAddr;
    uint public price;

    constructor() public {
       myAddr = msg.sender;
     }

    modifier onlyOwner() {
        require(msg.sender == myAddr);
        _;
    }
	modifier onlyRole(address _add){
       require(msg.sender == _add);
       _;
    }


    function setPrice(uint _price) public onlyOwner {
        price = _price;
    }
	function setPrice(uint _price) public onlyRole(myAddr) {
        price = _price;
    }

    function initNewPrice(uint _price) public {
        require(msg.sender == myAddr);
        price = _price;
    }
	// <yes> <report> solidity_unrestricted_write_operation uwo101
    function setNewPrice(uint _price) public {
        price = _price;
    }

    function setMy(uint _price) public {
        myAddr.transfer(this.balance);
    }
}