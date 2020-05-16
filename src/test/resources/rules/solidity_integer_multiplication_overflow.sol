pragma solidity 0.4.24;

contract Muloverflow{
mapping(address => uint256) balances;

function batchTransfer(address[] _receivers, uint256 _value) public returns (bool) {
uint  cnt = _receivers.length;
// <yes> <report> solidity_integer_multiplication_overflow mul101
uint256  amount = uint256(cnt) * _value;
    require(cnt > 0 && cnt <= 20);
    require(_value > 0 && balances[msg.sender] >= amount);
    balances[msg.sender] = balances[msg.sender].sub(amount);
    for (uint i = 0; i < cnt; i++) {
        balances[_receivers[i]] = balances[_receivers[i]].add(_value);
        Transfer(msg.sender, _receivers[i], _value);
    }
    return true;
 }

 function batch(address[] _receivers, uint256 _value) public returns (bool) {
 uint  cnt = _receivers.length;
 uint256  amount = uint256(cnt) * _value;
 require(amount /cnt == _value, "SafeMath: multiplication overflow");
     require(cnt > 0 && cnt <= 20);
     require(_value > 0 && balances[msg.sender] >= amount);
     balances[msg.sender] = balances[msg.sender].sub(amount);
     for (uint i = 0; i < cnt; i++) {
         balances[_receivers[i]] = balances[_receivers[i]].add(_value);
         Transfer(msg.sender, _receivers[i], _value);
     }
     return true;
  }

 function bat2(address[] _receivers, uint256 _value) public returns (bool) {
 uint  c = _receivers.length;
 require(c*_value /c == _value, "SafeMath: multiplication overflow");
 uint256  a = uint256(c) * _value;
     require(_value > 0 && balances[msg.sender] >= a);
     balances[msg.sender] = balances[msg.sender].sub(a);
     for (uint i = 0; i < cnt; i++) {
         balances[_receivers[i]] = balances[_receivers[i]].add(_value);
         Transfer(msg.sender, _receivers[i], _value);
     }
     return true;
  }

 }


contract Muloverflow2{
mapping(address => uint256) balances;
uint256  amount;
function batchTransfer2(address[] _receivers, uint256 _value) public returns (bool) {
uint  cnt = _receivers.length;
// <yes> <report> solidity_integer_multiplication_overflow mul102
amount = uint256(cnt) * _value;
    require(cnt > 0 && cnt <= 20);
    require(_value > 0 && balances[msg.sender] >= amount);
    balances[msg.sender] = balances[msg.sender].sub(amount);
    for (uint i = 0; i < cnt; i++) {
        balances[_receivers[i]] = balances[_receivers[i]].add(_value);
        Transfer(msg.sender, _receivers[i], _value);
    }
    return true;
 }
 function batch2(address[] _receivers, uint256 _value) public returns (bool) {
 uint  cnt = _receivers.length;
 amount = uint256(cnt) * _value;
 require(amount /cnt == _value, "SafeMath: multiplication overflow");
     require(cnt > 0 && cnt <= 20);
     require(_value > 0 && balances[msg.sender] >= amount);
     balances[msg.sender] = balances[msg.sender].sub(amount);
     for (uint i = 0; i < cnt; i++) {
         balances[_receivers[i]] = balances[_receivers[i]].add(_value);
         Transfer(msg.sender, _receivers[i], _value);
     }
     return true;
  }
  function batch3(address[] _receivers, uint256 _value) public returns (bool) {
   uint  cn = _receivers.length;
   require(cn*_value /cn == _value, "SafeMath: multiplication overflow");
   uint256  a1 = uint256(cn) * _value;
       require(_value > 0 && balances[msg.sender] >= a1);
       balances[msg.sender] = balances[msg.sender].sub(a1);
       for (uint i = 0; i < cnt; i++) {
           balances[_receivers[i]] = balances[_receivers[i]].add(_value);
           Transfer(msg.sender, _receivers[i], _value);
       }
       return true;
    }
 }

contract Muloverflow3{
uint public constant PRESALE_PRICE = 30000;
uint public constant ICO_PRICE1 = 40000;
modifier onlyInState(State state) {require(state==currentState); _; }
function b() public onlyInState(State.PresaleRunning)
    {
        uint newTokens = msg.value * PRESALE_PRICE;
		require(newTokens/msg.value == PRESALE_PRICE);


    }

    function b1() public  onlyInState(State.ICORunning)
    {

		// <yes> <report> solidity_integer_multiplication_overflow mul103
		uint newTokens2 = msg.value * getPrice();
		// <yes> <report> solidity_integer_multiplication_overflow mul103
		uint newTokens3 = msg.value * PRESALE_PRICE;

    }
    function b3() public onlyInState(State.PresaleRunning)
        {
    		require(msg.value * getPrice()/msg.value == getPrice());
            uint newTokens1 = msg.value * getPrice();

        }

    function getPrice()constant returns(uint)
    {
        if(currentState==State.ICORunning){
             if(icoSoldTokens<(200000000 * (1 ether / 1 wei))){
                  return ICO_PRICE1;
             }else
             return PRESALE_PRICE;
        }
    }
	}

contract Muloverflow4 is Muloverflow3{
uint newTokens;
uint newTokens1;
uint newTokens2;
uint newTokens3;
function b() public onlyInState(State.PresaleRunning)
    {
        newTokens = msg.value * PRESALE_PRICE;
		require(newTokens/msg.value == PRESALE_PRICE);


    }

    function b1() public  onlyInState(State.ICORunning)
    {

		// <yes> <report> solidity_integer_multiplication_overflow mul104
		 newTokens2 = msg.value * getPrice();
		// <yes> <report> solidity_integer_multiplication_overflow mul104
		 newTokens3 = msg.value * PRESALE_PRICE;

    }
    function b3() public onlyInState(State.PresaleRunning)
        {
    		require(msg.value * getPrice()/msg.value == getPrice());
            newTokens1 = msg.value * getPrice();

        }

    function getPrice()constant returns(uint)
    {
        if(currentState==State.ICORunning){
             if(icoSoldTokens<(200000000 * (1 ether / 1 wei))){
                  return ICO_PRICE1;
             }else
             return PRESALE_PRICE;
        }
    }
	}

contract Muloverflow5{
  uint256 public sellPrice;
  function sell(uint256 amount) {
        // <yes> <report> solidity_integer_multiplication_overflow mul105
        require(this.balance >= amount * sellPrice);
        msg.sender.transfer(amount * sellPrice);
    }
     function sell2(uint256 _amount) {
            require(_amount * sellPrice /sellPrice == _amount);
            require(this.balance >= _amount * sellPrice);
            msg.sender.transfer(_amount * sellPrice);
        }
  }

contract Muloverflow6{
  uint256 public buyPrice;
  function buy(uint256 total) {
       // <yes> <report> solidity_integer_multiplication_overflow mul106
        require( total * buyPrice <= this.balance);
        msg.sender.transfer(total * buyPrice);
    }
   function buy2(uint256 _total) {
          require(_total * buyPrice /_total == buyPrice);
          require( _total * buyPrice <= this.balance);
          msg.sender.transfer(_total * buyPrice);
      }
  }

contract Muloverflow7{
  uint256 public sellPrice;
  uint256 public tokenLimit;
  function sell(uint256 amount) {
        // <yes> <report> solidity_integer_multiplication_overflow mul107
        require(tokenLimit >= amount * sellPrice);
        msg.sender.transfer(amount * sellPrice);
    }
     function sell2(uint256 _amount) {
            require(_amount * sellPrice /sellPrice == _amount);
            require(tokenLimit >= _amount * sellPrice);
            msg.sender.transfer(_amount * sellPrice);
        }
  }

contract Muloverflow8 is Muloverflow7{
  uint256 public buyPrice;
  function buy(uint256 total) {
       // <yes> <report> solidity_integer_multiplication_overflow mul108
        require( total * buyPrice <= tokenLimit);
        msg.sender.transfer(total * buyPrice);
    }
   function buy2(uint256 _total) {
          require(_total * buyPrice /_total == buyPrice);
          require( _total * buyPrice <= tokenLimit);
          msg.sender.transfer(_total * buyPrice);
      }
  }

contract Muloverflow9{
    mapping (address => uint256) public balanceOf;
    mapping (address => mapping (address => uint256)) public allowance;
	uint256 public amount;
	event Transfer(address indexed from, address indexed to, uint256 value);
function mintToken(address target, uint256 mintedAmount) onlyOwner {
        // <yes> <report> solidity_integer_multiplication_overflow mul109
        amount *= mintedAmount;
        require(balanceOf[target] * mintedAmount /mintedAmount == balanceOf[target]);
		balanceOf[target] *= mintedAmount;
		// <yes> <report> solidity_integer_multiplication_overflow mul111
		balanceOf[msg.sender] *= mintedAmount;
		require(allowance[msg.sender][target] * mintedAmount / allowance[msg.sender][target] == mintedAmount);
		allowance[msg.sender][target] *= mintedAmount;
        Transfer(msg.sender, target, mintedAmount);
    }
function mintToken1(address to, uint256 minted) onlyOwner {
        require(amount * minted /minted == amount);
        amount *= minted;
        // <yes> <report> solidity_integer_multiplication_overflow mul110
		balanceOf[to] *= minted;
		require(balanceOf[msg.sender] * minted /minted == balanceOf[msg.sender]);
		balanceOf[msg.sender] *= minted;
		// <yes> <report> solidity_integer_multiplication_overflow mul112
		allowance[msg.sender][to] *= minted;
        Transfer(msg.sender, to, minted);
    }
}
