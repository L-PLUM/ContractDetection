pragma solidity 0.4.24;

contract ERC20Token {
    function transfer(address to, uint value) returns(bool);
}

contract TransferInCycle {
    mapping(address => uint) balances;
	uint n;

    function distribute(address[] _addr, uint amount) public {
     // <yes> <report> solidity_gaslimit_transfer_in_loops for101
    for (uint i = 0; i < _addr.length; i++) {
            _addr[i].transfer(balances[_addr[i]]);
        }
	// <yes> <report> solidity_gaslimit_transfer_in_loops for101
	 for (uint i = 0; i < _addr.length; i++) {
            transferToken(_addr[i], balances[_addr[i]]);
        }
     // <yes> <report> solidity_gaslimit_transfer_in_loops for101
	 for (uint i = 0; i < _addr.length; i++) {
            ERC20Token(token).transferToken(_addr[i], balances[_addr[i]]);
        }
    }

	 function distribute1(address[] _addr, uint amount) public {
         uint i = 0;
         uint m = _addr.length;
         // <yes> <report> solidity_gaslimit_transfer_in_loops whi101
        while ( i <m) {
            _addr[i].transfer(balances[_addr[i]]);
			 i++;
        }
    }

	 function distribute2(address[] _addr, uint amount) public {

        uint i = 0;
        n= _addr.length;
        // <yes> <report> solidity_gaslimit_transfer_in_loops dow101
        do{
		     _addr[i].transfer(balances[_addr[i]]);
			 i++;
        }while ( i < n);

    }
}