pragma solidity 0.4.24;

contract Addoverflow{
function batch(uint256 _value) public returns (bool) {
uint  cnt = _receivers.length;
 // <yes> <report> solidity_integer_addition_overflow add101
uint256  amount = uint256(cnt) + _value;
        Transfer(msg.sender, _value);
    }
    return true;
 }
 function bat(uint256 _value) public returns (bool) {
 uint  cnt = _receivers.length;
 uint256  amount = uint256(cnt) + _value;
 require(amount >= _value, "SafeMath: addtion overflow");
         Transfer(msg.sender, _value);
     }
     return true;
  }
 function ba(uint256 _value) public returns (bool) {
   uint  cnt = _receivers.length;
   require(cnt + _value >= _value, "SafeMath: addtion overflow");
   uint256  amount = uint256(cnt) + _value;
           Transfer(msg.sender, _value);
       }
       return true;
    }
 }

 contract Addoverflow2{
 uint256  amount;
 function batch1(uint256 _value) public returns (bool) {
 uint  cnt = _receivers.length;
 // <yes> <report> solidity_integer_addition_overflow add102
 amount = uint256(cnt) + _value;
         Transfer(msg.sender, _value);
     }
     return true;
  }
  function bat1(uint256 _value) public returns (bool) {
  uint  cnt = _receivers.length;
  amount = uint256(cnt) + _value;
  require(amount >= _value, "SafeMath: addtion overflow");
          Transfer(msg.sender, _value);
      }
      return true;
   }
   function bat2(uint256 _value) public returns (bool) {
     uint  cnt = _receivers.length;
     require(cnt + _value >= _value, "SafeMath: addtion overflow");
     amount = uint256(cnt) + _value;
             Transfer(msg.sender, _value);
         }
         return true;
      }
  }

contract Addoverflow3{
uint256 amount;
function t(uint256 _value) public returns (bool) {
	// <yes> <report> solidity_integer_addition_overflow add103
	amount = amount + _value;
    msg.sender.transfer(amount);
    return true;
	}
	function t1(uint256 mint) public returns (bool) {
    uint256 _amount;
	require(_amount + mint >= _amount );
	_amount = _amount + mint;
    msg.sender.transfer(_amount);
    return true;
	}
 }

contract Addoverflow4{
mapping(address => uint256) balances;
function f(address _to, uint256 _value) public returns (bool) {
    require(_to != address(0));
	require(_value + balances[_to]>= balances[_to]);
    balances[_to] = balances[_to]+_value;
	msg.sender.transfer(balances[_to]);
    return true;
	}
	function f1(address _from, uint256 msgValue) public returns (bool) {
	require(_from != address(0));
	// <yes> <report> solidity_integer_addition_overflow add104
    balances[_from] = balances[_from] + msgValue;
	msg.sender.transfer(balances[_from]);
    return true;
	}
 }

contract Addoverflow5{
mapping(address => uint256) balances;
function s(uint256 _value) public returns (bool) {
    // <yes> <report> solidity_integer_addition_overflow add105
    balances[msg.sender] = balances[msg.sender]+_value;
    msg.sender.transfer(_value);
    return true;
	}
function s1(uint256 tr) public returns (bool) {
	require(balances[msg.sender]+tr >= balances[msg.sender]);
    balances[msg.sender] = balances[msg.sender]+tr;
    msg.sender.transfer(tr);
    return true;
	}
 }

contract Addoverflow6{
mapping (address => mapping (address => uint256)) allowed;
function ff(address _to, uint256 _value) public returns (bool) {
    require(_to != address(0));
	require(allowed[_to][msg.sender]+_value >= _value);
	allowed[_to][msg.sender] = allowed[_to][msg.sender]+ _value;
    msg.sender.transfer(_value);
    return true;
	}
function ff1(address _spend, uint256 _value) public returns (bool) {
    require(_spend != address(0));
    // <yes> <report> solidity_integer_addition_overflow add106
	allowed[_spend][msg.sender] = allowed[_spend][msg.sender]+ _value;
    msg.sender.transfer(_value);
    return true;
	}
 }

contract addoverflow17{
uint public presaleSoldTokens = 0;
uint public icoSoldTokens = 0;
uint public totalSoldTokens = 0;
uint public constant PRESALE_PRICE = 30000;
uint public constant ICO_PRICE1 = 40000;
uint public constant TOTAL_LIMIT = 50000;
mapping (address => uint256) public balances;
mapping (address => mapping (address => uint256)) public allowance;
function buyTokensPresale() public payable
    {
		require(msg.value * PRESALE_PRICE /msg.value == PRESALE_PRICE);
        uint newTokens = msg.value * PRESALE_PRICE;
		require(presaleSoldTokens + newTokens >= newTokens);
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
		require( balances[msg.sender] + newTokens >=  balances[msg.sender]);
        balances[msg.sender] =balances[msg.sender]+ newTokens;
        presaleSoldTokens= presaleSoldTokens+newTokens;
    }
	function buyTokensPresale1() public payable
    {
        uint newTokens = msg.value * PRESALE_PRICE;
		require(newTokens/msg.value == PRESALE_PRICE);
		 // <yes> <report> solidity_integer_addition_overflow add135
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
         // <yes> <report> solidity_integer_addition_overflow add109
        balances[msg.sender] =balances[msg.sender]+ newTokens;
         // <yes> <report> solidity_integer_addition_overflow add107
        presaleSoldTokens= presaleSoldTokens+newTokens;
    }

    function buyTokensICO(address _to) public payable onlyInState(State.ICORunning)
    {
        require(msg.value * getPrice()/msg.value == getPrice());
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
        totalSoldTokens+= newTokens1;
		require( balances[_to] + newTokens1 >=  balances[_to]);
		balances[_to] =balances[_to]+ newTokens1;
		require( allowance[msg.sender][_to] + newTokens1 >= allowance[msg.sender][_to]);
		allowance[msg.sender][_to]=allowance[msg.sender][_to]+newTokens1;
    }
	 function buyTokensICO1(address _to) public payable onlyInState(State.ICORunning)
    {
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1/msg.value == getPrice());
        require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
        totalSoldTokens+= newTokens1;
        // <yes> <report> solidity_integer_addition_overflow add108
		balances[_to] =balances[_to]+ newTokens1;
		// <yes> <report> solidity_integer_addition_overflow add110
		allowance[msg.sender][_to]=allowance[msg.sender][_to]+newTokens1;
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

contract addoverflow21 is addoverflow17{
function buyPresale() public payable
    {
		require(msg.value * PRESALE_PRICE /msg.value == PRESALE_PRICE);
        uint newTokens = msg.value * PRESALE_PRICE;
		require(presaleSoldTokens + newTokens >= newTokens);
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
		require( balances[msg.sender] + newTokens >=  balances[msg.sender]);
        balances[msg.sender] += newTokens;
        presaleSoldTokens += newTokens;
    }
	function buyPresale1() public payable
    {

        uint newTokens = msg.value * PRESALE_PRICE;
		require(newTokens/msg.value == PRESALE_PRICE);
		// <yes> <report> solidity_integer_addition_overflow add135
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
        // <yes> <report> solidity_integer_addition_overflow add121
        balances[msg.sender] += newTokens;
        // <yes> <report> solidity_integer_addition_overflow add119
        presaleSoldTokens += newTokens;
    }

    function buyICO(address _to) public payable onlyInState(State.ICORunning)
    {
        require(msg.value * getPrice()/msg.value == getPrice());
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
        totalSoldTokens+= newTokens1;
		require( balances[_to] + newTokens1 >=  balances[_to]);
		balances[_to] += newTokens1;
		require( allowance[msg.sender][_to] + newTokens1 >= allowance[msg.sender][_to]);
		allowance[msg.sender][_to]+=newTokens1;
    }
	 function buyICO1(address _to) public payable onlyInState(State.ICORunning)
    {
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1/msg.value == getPrice());
        require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
        totalSoldTokens+= newTokens1;
        // <yes> <report> solidity_integer_addition_overflow add120
		balances[_to]+= newTokens1;
		// <yes> <report> solidity_integer_addition_overflow add122
		allowance[msg.sender][_to]+=newTokens1;
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

    function issue_noVesting(address _to, uint _value)  public
    {
        require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
		uint tokens = _value * zeroAfterDecimal;
        // <yes> <report> solidity_integer_addition_overflow add132
        require(maxSupply_SeedBlock >= issueToken_SeedBlock + tokens);
        // <yes> <report> solidity_integer_addition_overflow add112
        balances[_to] = balances[_to]+ tokens;
        // <yes> <report> solidity_integer_addition_overflow add111
        issueToken_Total = issueToken_Total+ tokens;
        // <yes> <report> solidity_integer_addition_overflow add111
        issueToken_SeedBlock = issueToken_SeedBlock+ tokens;

        emit Issue_SeedBlock(_to, tokens);
    }
	function issue_noVesting1(address _to, uint _value)  public
    {
        require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
		uint tokens = _value * zeroAfterDecimal;
        // <yes> <report> solidity_integer_addition_overflow add131
        require(issueToken_SeedBlock + tokens <= maxSupply_SeedBlock );
        // <yes> <report> solidity_integer_addition_overflow add124
        balances[_to] += tokens;
        // <yes> <report> solidity_integer_addition_overflow add123
        issueToken_Total += tokens;
       // <yes> <report> solidity_integer_addition_overflow add123
        issueToken_SeedBlock += tokens;

        emit Issue_SeedBlock(_to, tokens);
    }
     function issue(address _to, uint _value)  public
    {
        require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
		uint tokens = _value * zeroAfterDecimal;
        // <yes> <report> solidity_integer_addition_overflow add134
		require(this.balance >= issueToken_SeedBlock + tokens);
        // <yes> <report> solidity_integer_addition_overflow add113
        balances[msg.sender] = balances[msg.sender] + tokens;
        // <yes> <report> solidity_integer_addition_overflow add114
        allowed[_to][msg.sender] =  allowed[_to][msg.sender]  + tokens;
        emit Issue_SeedBlock(_to, tokens);
    }
    function issue1(address _to, uint _value)  public
    {
        require( _value * zeroAfterDecimal/ _value == zeroAfterDecimal);
		uint tokens = _value * zeroAfterDecimal;
       // <yes> <report> solidity_integer_addition_overflow add133
		require(issueToken_SeedBlock + tokens <= this.balance);
       // <yes> <report> solidity_integer_addition_overflow add125
        balances[msg.sender] += tokens;
       // <yes> <report> solidity_integer_addition_overflow add126
        allowed[_to][msg.sender] += tokens;
       // <yes> <report> solidity_integer_addition_overflow add123
        issueToken_SeedBlock += tokens;
        emit Issue_SeedBlock(_to, tokens);
    }

}



contract Addoverflow11{
    mapping (address => uint256) public balanceOf;
    mapping (address => mapping (address => uint256)) public allowance;
	uint256 public amount;
	event Transfer(address indexed from, address indexed to, uint256 value);
function mintToken(address target, uint256 mintedAmount) onlyOwner {
        // <yes> <report> solidity_integer_addition_overflow add115
        amount += mintedAmount;
        require(balanceOf[target] + mintedAmount >= balanceOf[target]);
		balanceOf[target] += mintedAmount;
		// <yes> <report> solidity_integer_addition_overflow add117
		balanceOf[msg.sender] += mintedAmount;
		require(allowance[msg.sender][target] + mintedAmount >= mintedAmount);
		allowance[msg.sender][target] += mintedAmount;
        Transfer(msg.sender, target, mintedAmount);
    }
function mintToken1(address to, uint256 minted) onlyOwner {
        require(amount + minted >= amount);
        amount += minted;
        // <yes> <report> solidity_integer_addition_overflow add116
		balanceOf[to] += minted;
		require(balanceOf[msg.sender] + minted >= balanceOf[msg.sender]);
		balanceOf[msg.sender] += minted;
		// <yes> <report> solidity_integer_addition_overflow add118
		allowance[msg.sender][to] += minted;
        Transfer(msg.sender, to, minted);
    }
}


contract Addoverflow7{
uint256 public totalSupply;
uint256 public tokenLimit;
uint256 constant onePercent = 181415052000000;
uint256 constant HOLDERS_AMOUNT  =  60 * onePercent;
modifier icoOnly { require(msg.sender == ico); _; }
function mint(uint256 _value) external icoOnly {
    require(_holder != address(0));
    require(_value != 0);
	require(totalSupply + _value >= _value);
    require(totalSupply + _value <= tokenLimit);
    totalSupply += _value;
  }
  function mint1(address _to, uint256 _v) external icoOnly {
    require(_to != address(0));
    require(_v != 0);
    // <yes> <report> solidity_integer_addition_overflow add127
    require(totalSupply + _v <= tokenLimit);
    // <yes> <report> solidity_integer_addition_overflow add116
    balances[_to] += _v;
    // <yes> <report> solidity_integer_addition_overflow add115
    totalSupply += _v;
  }
  function mint2(address _from, uint256 _amount) external icoOnly {
    require(_from != address(0));
    require(_amount != 0);
    // <yes> <report> solidity_integer_addition_overflow add127
    require(totalSupply + _amount <= HOLDERS_AMOUNT);
     // <yes> <report> solidity_integer_addition_overflow add116
    balances[_from] += _amount;
    // <yes> <report> solidity_integer_addition_overflow add115
    totalSupply += _amount;
  }
}

contract Addoverflow8{
uint256 public totalSupply1;
uint256 public tokenLimit1;
uint256 constant AMOUNT  =  60 * 181415052000000;
modifier icoOnly { require(msg.sender == ico); _; }
function m(uint256 _value) external icoOnly {
    require(_holder != address(0));
    require(_value != 0);
	require(totalSupply1 + _value >= _value);
    require(tokenLimit1 >= totalSupply1 + _value);
    totalSupply1 += _value;
  }
  function mint1(address _to, uint256 _v) external icoOnly {
    require(_v != 0);
    // <yes> <report> solidity_integer_addition_overflow add128
    require(tokenLimit1>=totalSupply1 + _v );
    // <yes> <report> solidity_integer_addition_overflow add115
    totalSupply += _v;
  }
  function mint2(uint256 _amount) external icoOnly {
    require(_from != address(0));
    require(_amount != 0);
    // <yes> <report> solidity_integer_addition_overflow add128
    require(AMOUNT >= totalSupply1 + _amount);
    // <yes> <report> solidity_integer_addition_overflow add115
    totalSupply1 += _amount;
  }
}

contract Addoverflow15{
uint256 public totalSupply;
modifier icoOnly { require(msg.sender == ico); _; }
function mint(uint256 _value) external icoOnly {
    require(_value != 0);
	require(totalSupply + _value >= _value);
    require(totalSupply + _value <= this.balance);
    totalSupply += _value;
  }
  function mint1(address _to, uint256 _v) external icoOnly {
    require(_to != address(0));
    require(_v != 0);
    // <yes> <report> solidity_integer_addition_overflow add129
    require(totalSupply + _v <= this.balance);
    // <yes> <report> solidity_integer_addition_overflow add116
    balances[_to] += _v;
    // <yes> <report> solidity_integer_addition_overflow add115
    totalSupply += _v;
  }
  function mint2(address _from, uint256 _amount) external icoOnly {
    require(_from != address(0));
    require(_amount != 0);
    // <yes> <report> solidity_integer_addition_overflow add130
    require(this.balance >= totalSupply + _amount);
     // <yes> <report> solidity_integer_addition_overflow add116
    balances[_from] += _amount;
    // <yes> <report> solidity_integer_addition_overflow add115
    totalSupply += _amount;
  }
  function mint3(uint256 _amount) external icoOnly {
    require(_amount != 0);
	require(totalSupply + _amount >= _amount);
    require(this.balance >= totalSupply + _amount);
    totalSupply += _amount;
  }
}

contract Addoverflow9{
uint public presaleSoldTokens = 0;
uint public icoSoldTokens = 0;
uint public totalSoldTokens = 0;
uint public constant PRESALE_PRICE = 30000;
uint public constant ICO_PRICE1 = 40000;
uint public constant TOTAL_LIMIT = 50000;
function buyTokensPresale() public payable
    {
		require(msg.value * PRESALE_PRICE /msg.value == PRESALE_PRICE);
        uint newTokens = msg.value * PRESALE_PRICE;
		// <yes> <report> solidity_integer_addition_overflow add135
        require(presaleSoldTokens + newTokens <= TOTAL_LIMIT);
        // <yes> <report> solidity_integer_addition_overflow add121
        balances[msg.sender] += newTokens;
        // <yes> <report> solidity_integer_addition_overflow add119
        presaleSoldTokens+= newTokens;
    }
    function buyTokensICO() public payable onlyInState(State.ICORunning)
    {
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1/msg.value == getPrice());
        require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= TOTAL_LIMIT);
        totalSoldTokens+= newTokens1;
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

contract Addoverflow10 is Addoverflow9{
  function buyICO() public payable onlyInState(State.ICORunning)
    {
		uint newTokens2 = msg.value * getPrice();
		require(newTokens2/msg.value == getPrice());
       // <yes> <report> solidity_integer_addition_overflow add136
        require(TOTAL_LIMIT >=totalSoldTokens + newTokens2);
        // <yes> <report> solidity_integer_addition_overflow add119
        totalSoldTokens+= newTokens2;
    }
}

contract Addoverflow37{
uint public presaleSoldTokens = 0;
uint public icoSoldTokens = 0;
uint public totalSoldTokens = 0;
uint public constant PRESALE_PRICE = 30000;
uint public constant ICO_PRICE1 = 40000;
uint public constant TOTAL_LIMIT = 50000;
function buyTokensPresale() public payable
    {
		require(msg.value * PRESALE_PRICE /msg.value == PRESALE_PRICE);
        uint newTokens = msg.value * PRESALE_PRICE;
		// <yes> <report> solidity_integer_addition_overflow add137
        require(presaleSoldTokens + newTokens <= this.balance);
        // <yes> <report> solidity_integer_addition_overflow add119
        presaleSoldTokens+= newTokens;
    }
    function buyTokensICO() public payable onlyInState(State.ICORunning)
    {
		uint newTokens1 = msg.value * getPrice();
		require(newTokens1/msg.value == getPrice());
        require(newTokens1 <= totalSoldTokens + newTokens1  );
        require(totalSoldTokens + newTokens1 <= this.balance);
        totalSoldTokens+= newTokens1;
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

contract Addoverflow38 is Addoverflow37{
  function buyICO() public payable onlyInState(State.ICORunning)
    {
		uint newTokens2 = msg.value * getPrice();
		require(newTokens2/msg.value == getPrice());
       // <yes> <report> solidity_integer_addition_overflow add138
        require(this.balance >=totalSoldTokens + newTokens2);
		// <yes> <report> solidity_integer_addition_overflow add119
        totalSoldTokens+= newTokens2;
    }
}