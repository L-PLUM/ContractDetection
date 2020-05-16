package main

import (
	"errors"
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	"strconv"
	"time"
)


type SimpleChaincode struct {
}

func (t *SimpleChaincode) Init(stub shim.ChaincodeStubInterface, function string, args []string) ([]byte, error) {
// <yes> <report> go_unchecked_input_arguments uia101
ret, err :=stub.GetState(args[0])
if len(args) != 2{
      return shim.Error(“Incorrect_number_of_arguments_Expecting_2”)
  }
  ret, err := stub.GetState(args[0])
   return shim.Success(nil)
}