pragma solidity ^0.4.24;

contract DoWhileFalse {

    function doWhile() {
        // <yes> <report> solidity_use_continue dwc101
        do {
            continue;
        } while(false);
    }

    function doWhile_2() {
        do {
            while(false) {
                continue;
            }
        } while(false);

        do {
            for(uint i;i<10;i++) {
                continue;
            }
        } while(false);
        // <yes> <report> solidity_use_continue dwc101
        do {
            for(uint j;j<10;j++) {
                continue;
            }
            continue;
        } while(false);
    }
}