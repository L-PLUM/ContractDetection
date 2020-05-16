pragma solidity 0.4.24;

contract GasInLoops {
    uint[] xx;
    uint m = l;

	function test_while() public {
        uint y = xx.length;
        uint i = 0;
        // <yes> <report> solidity_gas_costly_patterns whi101
        while (i < y) {
        }
    }
	function test_while(address[] _addr, uint amount) public {
	    i = 0;
		 // <yes> <report> solidity_gas_costly_patterns whi101
        while (i < m) {
        }
		uint k ;
		 // <yes> <report> solidity_gas_costly_patterns whi101
		while( k < _addr.length) {
        }
	}

	function test_for(address[] _addr, uint amount) public {
	 // <yes> <report> solidity_gas_costly_patterns for101
        for (uint i = 0; i < m; i++) {
            _updateLandData(data);
        }
	}

    function test_for2(address[] _addr, uint amount) public {
        uint n = _addr.length;
        // <yes> <report> solidity_gas_costly_patterns for101
        for (uint i = 0; i < n; i++) {
             _updateLandData(data);
        }

        // <yes> <report> solidity_gas_costly_patterns for101
        for (uint k ; k < _addr.length; k++) {
            _updateLandData(data);
        }
        // <yes> <report> solidity_gas_costly_patterns for102
        for (uint h = _addr.length; h > 0 ; h--){
           _updateLandData(data);
        }
    }
}