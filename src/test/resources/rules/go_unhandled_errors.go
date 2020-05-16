package main

import (
	"encoding/json"
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	pb "github.com/hyperledger/fabric/protos/peer"
	"strings"
)

type MessageStore struct{}

func main() {
	if err := shim.Start(new(MessageStore)); err != nil {
		fmt.Printf("Main: Error starting MessageStore chaincode: %s", err)
	}
}

func (cc *MessageStore) read(stub shim.ChaincodeStubInterface, args []string){

   key := “keyString”
   // <yes> <report> go_unhandled_errors err101
   ret , _ := stub.GetState(key)
   ret, err := stub.GetState(key)
   if err != nil{
        fmt.Print(Error_is_happened._%s, err)
    }
}