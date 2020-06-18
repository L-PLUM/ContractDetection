package main

import (
	"bytes"
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	pb "github.com/hyperledger/fabric/protos/peer"
	// <yes> <report> go_call_external_library lib101
	a "github.com/pavva91/assets"
	// <yes> <report> go_call_external_library lib101
	gen "github.com/pavva91/generalcc"
	"strconv"
    // <yes> <report> go_call_external_library lib101
	in "github.com/pavva91/invokeapi"
)

type SimpleChaincode struct {
}

func main() {

	err := shim.Start(new(SimpleChaincode))
	if err != nil {
		fmt.Printf("Error starting chaincode: %s", err)
	}

}
