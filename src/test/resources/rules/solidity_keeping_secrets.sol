pragma solidity 0.5.0;
contract Privation{
    using SafeMath for uint256;
    address _creator;
    // <yes> <report> solidity_keeping_secrets pri101
    address private _transmuteSource1;

    constructor() public {
        _creator = msg.sender;
    }

    function setTransmuteSources1(address transmuteSource1) public {
        require(msg.sender == _creator);
        _transmuteSource1 = transmuteSource1;
    }

    function transmute(uint256 amount, uint256 transmuteType) public {
			require(_transmuteSource1 != address(0), "EtheleToken: Cannot transmute this.");
    		EtheleToken(_transmuteSource1).burnFrom(msg.sender, amount);
    		_mint(msg.sender, amount);
    }
}

