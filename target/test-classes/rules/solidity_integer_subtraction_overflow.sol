pragma solidity 0.4.24;

contract Suboverflow{
function sub(uint256 _value) public returns (bool) {
uint  cnt = _receivers.length;
 // <yes> <report> solidity_integer_subtraction_overflow sub101
uint256  amount = uint256(cnt) - _value;
        Transfer(msg.sender, _value);
    }
    return true;
 }
 function bat(uint256 _value) public returns (bool) {
 uint  cnt = _receivers.length;
 uint256  amount = uint256(cnt) + _value;
 require(cnt >= _value);
         Transfer(msg.sender, _value);
     }
     return true;
  }
 }

 contract Suboverflow1{
  uint256  amount;
  function sub1(uint256 _value) public returns (bool) {
  uint  cnt = _receivers.length;
  // <yes> <report> solidity_integer_subtraction_overflow sub101
  amount = uint256(cnt) - _value;
          Transfer(msg.sender, _value);
      }
      return true;
   }
   function bat1(uint256 _value) public returns (bool) {
   uint  cnt = _receivers.length;
   amount = uint256(cnt) - _value;
   require(cnt >= _value);
           Transfer(msg.sender, _value);
       }
       return true;
    }
   }
   contract Overflow2{
   mapping(address => uint256) balances;
   mapping (address => mapping (address => uint256)) allowed;
   uint256 amount;
   event Transfer(address indexed from, address indexed to, uint256 value);
   function transfer(address _to, uint256 _value) public returns (bool) {
       require(_to != address(0));
   	// <yes> <report> solidity_integer_subtraction_overflow sub102
   	   amount = amount - _value;
       Transfer(msg.sender, _to, _value);
       return true;
   	}
   	function transfer1(address _to, uint256 _value) public returns (bool) {

        require(_to != address(0));
       	require(amount >= _value);
       	amount = amount - _value;
       	// <yes> <report> solidity_integer_subtraction_overflow sub103
        balances[_to] = balances[_to]-_value;
        Transfer(msg.sender, _to, _value);
        return true;
       	}
     function transfer2(address _to, uint256 _value) public returns (bool) {
            require(_to != address(0));
        	require(amount >= _value);
        	require(balances[_to] >= _value);
        	require(allowed[_to][msg.sender] >= _value);
        	amount = amount - _value;
            // <yes> <report> solidity_integer_subtraction_overflow sub104
            balances[msg.sender] = balances[msg.sender]-_value;
            balances[_to] = balances[_to]-_value;
        	allowed[_to][msg.sender] = allowed[_to][msg.sender]- _value;
            Transfer(msg.sender, _to, _value);
            return true;
        	}
     function transfer3(address _to, uint256 _value) public returns (bool) {
                 require(_to != address(0));
              	require(amount >= _value);
              	require(balances[_to] >= _value);
              	require( balances[msg.sender] >= _value);
              	amount = amount - _value;
                balances[msg.sender] = balances[msg.sender]-_value;
                balances[_to] = balances[_to]-_value;
                // <yes> <report> solidity_integer_subtraction_overflow sub105
              	allowed[_to][msg.sender] = allowed[_to][msg.sender]- _value;
                  Transfer(msg.sender, _to, _value);
                  return true;
              	}
    }

contract Overflow3{
 uint256 _totalSupply = 21000000 * 10**8;
 address public seller;
 mapping(address => uint256) balances;
 mapping(address => mapping (address => uint256)) allowed;
 event Approval(address indexed _owner, address indexed _spender, uint256 _value);
 function approve(address _spender, uint256 _amount) returns (bool success) {
         require(_totalSupply >= _amount);
         _totalSupply -=_amount;
         require(balances[_spender] >= _amount);
		 balances[_spender] -= _amount;
		 // <yes> <report> solidity_integer_subtraction_overflow sub116
		 balances[msg.sender] -= _amount;
		 require(allowed[seller][_spender] >= _amount);
		 allowed[seller][_spender] -= _amount;
		 Approval(msg.sender, _spender, _amount);
         return true;
     }
 function approve1(address _spender, uint256 _amount) returns (bool success) {
        require(balances[msg.sender] >= _amount);
         balances[msg.sender] -= _amount;
         // <yes> <report> solidity_integer_subtraction_overflow sub115
         balances[_spender] -= _amount;
         // <yes> <report> solidity_integer_subtraction_overflow sub117
         allowed[msg.sender][_spender] -= _amount;
         // <yes> <report> solidity_integer_subtraction_overflow sub117
		 allowed[seller][_spender] -= _amount;
         // <yes> <report> solidity_integer_subtraction_overflow sub114
		_totalSupply -=_amount;
		 Approval(msg.sender, _spender, _amount);
         return true;
     }
  }


contract suboverflow18{
uint public presaleSoldTokens = 0;
uint public amount = 8000000*10**8;
uint public icoSoldTokens = 0;
uint public totalSoldTokens = 0;
uint public constant PRESALE_PRICE = 30000;
uint public constant ICO_PRICE1 = 40000;
uint public constant TOTAL_LIMIT = 50000;
mapping (address => uint256) public balances;
mapping (address => mapping (address => uint256)) public allowance;
function sellTokensPresale() public payable
    {
		require(msg.value * PRESALE_PRICE /msg.value == PRESALE_PRICE);
        uint newTokens = msg.value * PRESALE_PRICE;
		require(presaleSoldTokens + newTokens >= newTokens);
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
		require( balances[msg.sender] >= newTokens);
        balances[msg.sender] =balances[msg.sender]- newTokens;
		require(amount  >= newTokens);
        amount= amount - newTokens;
    }
	function sellTokensPresale1() public payable
    {
        uint newTokens = msg.value * PRESALE_PRICE;
		require(newTokens/msg.value == PRESALE_PRICE);
		require(presaleSoldTokens + newTokens >= newTokens);
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
         // <yes> <report> solidity_integer_subtraction_overflow sub108
        balances[msg.sender] =balances[msg.sender]- newTokens;
         // <yes> <report> solidity_integer_subtraction_overflow sub106
        amount= amount - newTokens;
    }

    function sellTokensICO(address _to) public payable onlyInState(State.ICORunning)
    {
        require(msg.value * getPrice()/msg.value == getPrice());
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
		require( balances[_to] >= newTokens1);
		balances[_to] =balances[_to]- newTokens1;
		require( allowance[msg.sender][_to] >= newTokens1);
		allowance[msg.sender][_to]=allowance[msg.sender][_to]-newTokens1;
    }
	 function sellTokensICO1(address _to) public payable onlyInState(State.ICORunning)
    {
        require(msg.value * getPrice()/msg.value == getPrice());
		uint newTokens1 = msg.value * getPrice();
        require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
         // <yes> <report> solidity_integer_subtraction_overflow sub107
		balances[_to] =balances[_to]- newTokens1;
		 // <yes> <report> solidity_integer_subtraction_overflow sub109
		allowance[msg.sender][_to]=allowance[msg.sender][_to]-newTokens1;
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

contract suboverflow22 is suboverflow18{
function sellPresale() public payable
    {
		require(msg.value * PRESALE_PRICE /msg.value == PRESALE_PRICE);
        uint newTokens = msg.value * PRESALE_PRICE;
		require(presaleSoldTokens + newTokens >= newTokens);
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
		require( balances[msg.sender] >= newTokens);
        balances[msg.sender] -= newTokens;
		require(amount  >= newTokens);
        amount -= newTokens;

    }
	function sellresale1() public payable
    {

        uint newTokens = msg.value * PRESALE_PRICE;
		require(newTokens/msg.value == PRESALE_PRICE);
		require(presaleSoldTokens + newTokens >= newTokens);
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
         // <yes> <report> solidity_integer_subtraction_overflow sub120
        balances[msg.sender] -= newTokens;
         // <yes> <report> solidity_integer_subtraction_overflow sub118
         amount -= newTokens;
    }

    function sellICO(address _to) public payable onlyInState(State.ICORunning)
    {
        require(msg.value * getPrice()/msg.value == getPrice());
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
		require( balances[_to] >= newTokens1);
		balances[_to] -= newTokens1;
		require( allowance[msg.sender][_to] >= newTokens1);
		allowance[msg.sender][_to]-=newTokens1;
    }
	 function sellICO1(address _to) public payable onlyInState(State.ICORunning)
    {
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1/msg.value == getPrice());
        require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
        totalSoldTokens+= newTokens1;
         // <yes> <report> solidity_integer_subtraction_overflow sub119
		balances[_to]-= newTokens1;
		 // <yes> <report> solidity_integer_subtraction_overflow sub121
		allowance[msg.sender][_to]-=newTokens1;
    }
}

contract LINIX_Seedblock
{
    string public name;
    string public symbol;
    uint public decimals;
    uint constant private zeroAfterDecimal = 10**18;
    uint constant public maxSupply  = 2625000 * zeroAfterDecimal;
    uint constant public maxSupply_SeedBlock =   2625000 * zeroAfterDecimal;
    uint public issueToken_Total;
    uint public issueToken_SeedBlock;
    mapping (address => uint) public balances;
    mapping (address => mapping ( address => uint )) public allowed;
    event Burn(address indexed _from, uint _value);
    event Issue_SeedBlock(address indexed _to, uint _tokens);
    event TokenUnLock(address indexed _to, uint _tokens);

    constructor() public
    {
        name        = "LNXSB";
        decimals    = 18;
        symbol      = "LNSB";

        issueToken_Total      = 0;
        issueToken_SeedBlock     = 0;
        require(maxSupply == maxSupply_SeedBlock);

    }

    function burnToken(uint _value)  public
    {
        require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
		uint tokens = _value * zeroAfterDecimal;
         // <yes> <report> solidity_integer_subtraction_overflow sub112
        balances[msg.sender] = balances[msg.sender] - tokens;
         // <yes> <report> solidity_integer_subtraction_overflow sub110
        issueToken_Total = issueToken_Total- tokens;

        emit Burn(msg.sender, tokens);
    }
    function burnToken1(uint _value)  public
    {
	    require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
        uint tokens = _value * zeroAfterDecimal;
         // <yes> <report> solidity_integer_subtraction_overflow sub124
        balances[msg.sender] -= tokens;
         // <yes> <report> solidity_integer_subtraction_overflow sub122
        issueToken_Total -= tokens;

        emit Burn(msg.sender, tokens);
    }
	  function burnToken2(address _to,uint _value)  public
    {
        require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
		uint tokens = _value * zeroAfterDecimal;
         // <yes> <report> solidity_integer_subtraction_overflow sub111
        balances[_to] = balances[_to] - tokens;
         // <yes> <report> solidity_integer_subtraction_overflow sub113
		allowed[_to][msg.sender] = allowed[_to][msg.sender] - tokens;
         // <yes> <report> solidity_integer_subtraction_overflow sub110
        issueToken_Total = issueToken_Total- tokens;

        emit Burn(msg.sender, tokens);
    }
	  function burnToken3(address _to,uint _value)  public
    {
        require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
		uint tokens = _value * zeroAfterDecimal;
         // <yes> <report> solidity_integer_subtraction_overflow sub123
        balances[_to] -= tokens;
       // <yes> <report> solidity_integer_subtraction_overflow sub125
		allowed[_to][msg.sender] -=tokens;
       // <yes> <report> solidity_integer_subtraction_overflow sub122
        issueToken_Total -=  tokens;

        emit Burn(msg.sender, tokens);
    }

}

contract Suboverflow10{
uint256 _totalSupply = 21000000 * 10**8;
uint256 public constant TOTAL = 10000000* 10**8;
address public owner;
mapping(address => uint256) balances;
mapping(address => mapping (address => uint256)) allowed;
event Transfer(address indexed _from, address indexed _to, uint256 _value);

function distributeBTR(address[] addresses) onlyOwner {
         for (uint i = 0; i < addresses.length; i++) {
            require(balances[owner] >= 2000 * 10**8);
			balances[owner] -= 2000 * 10**8;
			// <yes> <report> solidity_integer_subtraction_overflow sub128
			balances[msg.sender] -= 2000 * 10**8;
			// <yes> <report> solidity_integer_subtraction_overflow sub126
		    _totalSupply -= 2000 * 10**8;
			 require(allowed[owner][msg.sender] >= 2000 * 10**8);
			allowed[owner][msg.sender] -= 2000 * 10**8;
             balances[addresses[i]] += 2000 * 10**8;
             Transfer(owner, addresses[i], 2000 * 10**8);
         }
     }
function distributeBTR1(address[] addresses) onlyOwner {
         for (uint i = 0; i < addresses.length; i++) {
           // <yes> <report> solidity_integer_subtraction_overflow sub127
            balances[owner] -= 2000 * 10**8;
			require(balances[msg.sender] >= 2000 * 10**8);
			balances[msg.sender] -= 2000 * 10**8;
			require(_totalSupply >= 2000 * 10**8);
		    _totalSupply -= 2000 * 10**8;
		    // <yes> <report> solidity_integer_subtraction_overflow sub129
			allowed[owner][msg.sender] -= 2000 * 10**8;
             balances[addresses[i]] += 2000 * 10**8;
             Transfer(owner, addresses[i], 2000 * 10**8);
         }
     }
function distributeBTR2(address[] addresses) onlyOwner {
         for (uint i = 0; i < addresses.length; i++) {
			 require(balances[owner] >= TOTAL);
			 balances[owner] -= TOTAL;
			 // <yes> <report> solidity_integer_subtraction_overflow sub132
			 balances[msg.sender] -= TOTAL;
			 require(_totalSupply >= TOTAL);
			 _totalSupply -= TOTAL;
			 // <yes> <report> solidity_integer_subtraction_overflow sub133
			 allowed[owner][msg.sender] -= TOTAL;
             balances[addresses[i]] += TOTAL;
             Transfer(owner, addresses[i], TOTAL);
         }
     }
function distributeBTR3(address[] addresses) onlyOwner {
         for (uint i = 0; i < addresses.length; i++) {
			 // <yes> <report> solidity_integer_subtraction_overflow sub131
			 balances[owner] -= TOTAL;
			 require(balances[msg.sender] >= TOTAL);
			 balances[msg.sender] -= TOTAL;
			 // <yes> <report> solidity_integer_subtraction_overflow sub130
			 _totalSupply -= TOTAL;
			 require(allowed[owner][msg.sender] >= TOTAL);
			 allowed[owner][msg.sender] -= TOTAL;
             balances[addresses[i]] += TOTAL;
             Transfer(owner, addresses[i], TOTAL);
         }
     }
}