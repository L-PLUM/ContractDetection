package main

import (
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	"math/rand"
	"strconv"
)

type RandomChaincode struct {
}

func (c *RandomChaincode) Init(stub shim.ChaincodeStubInterface, function string, args []string) ([]byte, error) {
	// <yes> <report> go_generation_random_number ran101
	return nil, stub.PutState("random", []byte(strconv.Itoa(rand.Intn(100))))
}

func (c *RandomChaincode) Invoke(stub shim.ChaincodeStubInterface, function string, args []string) ([]byte, error) {
	r, err := stub.GetState("random")
	if err != nil {
		return nil, err
	}
	fmt.Printf("get r: %v\n", r)

	return nil, stub.PutState("random", []byte("100"))

}

func (c *RandomChaincode) Query(stub shim.ChaincodeStubInterface, function string, args []string) ([]byte, error) {
	return stub.GetState("random")
}

func main() {
	err := shim.Start(new(RandomChaincode))
	if err != nil {
		fmt.Printf("start chaincode err: %v\n", err)
	}
}
