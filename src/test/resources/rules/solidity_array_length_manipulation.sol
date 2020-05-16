pragma solidity 0.4.24;

contract dataStorage {
    uint[] public data;

    function badPractice(uint[] _data) external {
        for(uint i = 0; i < _data.length; i++) {
        // <yes> <report> solidity_array_length_manipulation alm102
            data.length++;
            data[i]=_data[i];
        }
        // <yes> <report> solidity_array_length_manipulation alm101
        data.length = 10;
        // <yes> <report> solidity_array_length_manipulation alm101
        data.length--;
        // <yes> <report> solidity_array_length_manipulation alm101
        data.length *= 2;
        // <yes> <report> solidity_array_length_manipulation alm101
        data.length -= 2;
        // <yes> <report> solidity_array_length_manipulation alm101
        data.length += 2;
        // <yes> <report> solidity_array_length_manipulation alm101
        data.length /= 2;
    }

    function goodPractice(uint[] _data) external {
        for(uint i = 0; i < _data.length; i++) {
            data.push(_data[i]);
        }
        uint a;
        if(data.length == 10) {
            a = data.length;
            a /= data.length;
            a *= data.length;
            a += data.length;
            a -= data.length;
        }
    }
}