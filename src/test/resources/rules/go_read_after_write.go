package main

import (
	"encoding/json"
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	pb "github.com/hyperledger/fabric/protos/peer"
	"strings"
)

type MessageStore struct{}

func (cc *MessageStore) write(stub shim.ChaincodeStubInterface, args []string) {

   value := 1  //初始状态时{key: "key", value:0}
   err := stub.PutState("key", value) //将value的值从0更新为1
   if err != nil {
      fmt.Printf(Error_is_happened._%s, err)
    }
     // <yes> <report> go_read_after_write raw101
  ret, err := stub.GetState("key") //不支持RAW，仍然返回0
  if err !=nil {
      fmt.Printf(“Error_is_happenend._%s”, err)
   }

 }