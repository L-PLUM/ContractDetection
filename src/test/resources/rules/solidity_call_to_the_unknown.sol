pragma solidity 0.5.0;

contract ERC20 {
    function balanceOf(address _owner) public view returns (uint256 balance);
    function transfer(address _to, uint256 _value) public returns (bool success);
}

contract GLOLocker {

    uint public nth1 = 0;
    uint constant public max1 = 97;
	// <yes> <report> solidity_call_to_the_unknown  unk101
    ERC20 constant token = ERC20(0xC0e6737A29DE7a00e2f6011924eB257106CB082f);
	// <yes> <report> solidity_call_to_the_unknown  unk102
	address HBWallet = address(0xEc7ba74789694d0d03D458965370Dc7cF2FE75Ba);
    ERC20 public hbwalletToken = ERC20(HBWallet);
	ERC20 ora;
    ERC20 r;

    function() external {
        if(nth1 < max1){
            token.transfer(0x2EEabfdAe52e02C14126CbEb1706fcE16a63ba28,500000000000000000000);
            nth1++;
        }
	}

	 function lize() public {
        if(nth1 < max1){
			hbwalletToken.transfer(0xB13B4791B1dd41E6cf4D541D9e62bAD7744AEdF4,10000000000000000000000);
		    nth1++;
		}
	}

    function oraclize() public {
	// <yes> <report> solidity_call_to_the_unknown  unk103
        ora = ERC20(0x1d3B2638a7cC9f2CB3D298A3DA7a90B67E5506ed);
        if(nth1 < max1){
			ora.transfer(0xd585265Cd9377870e77a94a1EABb302278257CA3,10000000000000000000000);
			nth1++;
		}
	}

	function () external{
	// <yes> <report> solidity_call_to_the_unknown  unk104
       r = ERC20(0xc03A2615D5efaf5F49F60B7BB6583eaec212fdf1);
        if(nth1 < max1){
			r.transfer(0x236e3428EFEf787DA7B82045B88C26021CE6a199,1676040000000000000000);
			nth1++;
		}
}
