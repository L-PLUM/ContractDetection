pragma solidity 0.4.24;

contract C {
    // <yes> <report> solidity_returns_type rty101
    function remainBalanced1() public constant returns (uint256){
        uint a =1000;
    }
    // <yes> <report> solidity_returns_type rty101
    function remainBalanced2() public constant returns (uint a, uint256){
        a =1000;
    }
    // <yes> <report> solidity_returns_type rty102
    function execute(address _to, uint _value, bytes _data) returns (uint256 _r) {
        if (_to == address(0)) {
            revert();
        }    
    }
    // <yes> <report> solidity_returns_type rty102
    function execute1(address _to, uint _value, bytes _data) returns (uint256 _r) {
        _value = _r;
    }
    // <yes> <report> solidity_returns_type rty102
    function execute2(address _to, uint _value, bytes _data) returns (bool flag, uint256 _r) {
        flag = true;
        _value = balanceOf(address(_r));
    }

    function balanceOf(address who)public view returns (uint256);
    
    function remainBalanced() public constant returns (uint256){
        return balanceOf(this);
    }
    
    function balance(address who)public view returns (uint256 _r);

    function execute3(address _to, uint _value, bytes _data) returns (uint256 _r) {
        _r = balanceOf(_to);
    }    
    function execute4(address _to, uint _value, bytes _data) returns (uint256 _r) {
        return balanceOf(_to);
    }
}