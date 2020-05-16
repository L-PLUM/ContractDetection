pragma solidity 0.4.24;

contract UpgradeTo050_1 {
    // <yes> <report> solidity_upgrade_to_new_version upg104
    function call(address token, bytes memory a, bytes b) public {
        // <yes> <report> solidity_upgrade_to_new_version upg101
        address(token).call();
        // <yes> <report> solidity_upgrade_to_new_version upg101
        token.call();
        // <yes> <report> solidity_upgrade_to_new_version upg101
        token.call(a,b);
        token.call(2+2);
        token.call(abi.encodePacked(a, b));
        // <yes> <report> solidity_upgrade_to_new_version upg101
        address(token).call(a,b);
        // <yes> <report> solidity_upgrade_to_new_version upg102
        bytes32 ab = keccak256(a, b);
        ab = keccak256(abi.encodePacked(a, b));
    }
    // <yes> <report> solidity_upgrade_to_new_version upg103
    function () private {
    }
}

contract UpgradeTo050_2 {
    struct User {
        uint a;
    }
    function numberZero(uint[] memory a) public {
    }
    function numberOne(uint[] storage a) internal {
    }
    // <yes> <report> solidity_upgrade_to_new_version upg104
    function numberTwo(uint[] a) public {
    }
    // <yes> <report> solidity_upgrade_to_new_version upg104
    function numberTwo0(bytes a, string b) public {
    }
    // <yes> <report> solidity_upgrade_to_new_version upg104
    function numberTwo1() public returns(uint[] a) {
    }
    function numberTwo2(User memory a) internal {
    }
    // <yes> <report> solidity_upgrade_to_new_version upg104
    function numberTwo3(User a) internal {
    }
    function numberThree(uint[] a) external {
    }
    // <yes> <report> solidity_upgrade_to_new_version upg103
    function () internal {
    }
}

contract UpgradeTo050_3 {
    uint[] intArray;
    function numberOne() external{
        // <yes> <report> solidity_upgrade_to_new_version upg105
        uint[] a;
        uint[] storage b = intArray;
        uint[] memory c = intArray;
        
    }
    function () external {
    }
}


contract UpgradeTo050_4 {
    struct User {
        uint a;
    }
    User userStruct;
    function numberOne() {
        // <yes> <report> solidity_upgrade_to_new_version upg105
        User a;
        User storage b = userStruct;
        User memory c = userStruct;
        
    }
    // <yes> <report> solidity_upgrade_to_new_version upg103
    function () public {
    }
}