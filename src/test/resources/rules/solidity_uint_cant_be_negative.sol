pragma solidity 0.4.24;

contract UnderFlow {
    uint8 a;

    function foo_1() {
        uint b;
        int c = 1;
    // <yes> <report> solidity_uint_cant_be_negative  ucn101 <yes> <report> solidity_uint_cant_be_negative  ucn102
        for (uint i=100; i >= 0; i--) {
        }
        for (uint j=0; j <= 0; j--) {
        }
        for (uint k=100; k >= 1; k--) {
        }
    // <yes> <report> solidity_uint_cant_be_negative  ucn102
        require(a >= 0);
        require(a <= 0);
    // <yes> <report> solidity_uint_cant_be_negative  ucn102
        require(b >= 0);
        require(b >= 7);
        require(c >= 0);
    }

    struct Mystruct {
        uint a1;
        int a2;
    }

    function foo_2(Mystruct str) internal {
    // <yes> <report> solidity_uint_cant_be_negative  ucn102
        require(str.a1 >= 0);
        require(str.a2 >= 0);
    }

    mapping(address => uint) balances;
    mapping(address => int) ibalances;

    function foo_3(address user) {
    // <yes> <report> solidity_uint_cant_be_negative  ucn103
        require(balances[user] >= 0);
        require(ibalances[user] >= 0);
    }

    function foo_4() {
        uint i;
    // <yes> <report> solidity_uint_cant_be_negative  ucn101 <yes> <report> solidity_uint_cant_be_negative  ucn102
        while(i >= 0) {
            i--;
        }
        do {
            i--;
    // <yes> <report> solidity_uint_cant_be_negative  ucn101 <yes> <report> solidity_uint_cant_be_negative  ucn102
        } while(i >=0);

        for (uint i=100; i <= 0; i++) {
    // <yes> <report> solidity_uint_cant_be_negative  ucn101 <yes> <report> solidity_uint_cant_be_negative  ucn102
            for (uint i=100; i >= 0; i--) {
            }
        }
    }
}