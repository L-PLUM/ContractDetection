pragma solidity 0.4.24;

contract TimestampDependence {

    function doSomething() {
        uint startTime = now;
        // <yes> <report> solidity_timestamp_dependency tim101
        if ( startTime + 1 minutes == block.timestamp) {}
        // <yes> <report> solidity_timestamp_dependency tim101
        if ( startTime + 1 minutes != now) {}
        require(true == ICOisEnd(now));
        // <yes> <report> solidity_timestamp_dependency tim102
        require(now < startTime - 1 minutes);
        // <yes> <report> solidity_timestamp_dependency tim103
        require(now < startTime );
    }

    function ICOisEnd(uint _time) returns(bool) {
        return _time > 1000000000;
    }
}