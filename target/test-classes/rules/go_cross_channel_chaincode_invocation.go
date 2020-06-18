package main

 import (
 	"bytes"
 	"encoding/json"
 	"fmt"
 	"github.com/hyperledger/fabric/core/chaincode/shim"
 	peer "github.com/hyperledger/fabric/protos/peer"
 	"strconv"
 )

 // Define the Smart Contract structure
 type PassthruChaincode struct {
 }


 func (p *PassthruChaincode) iq(stub shim.ChaincodeStubInterface, function string,
     args []string) pb.Response {
     if function == "" {
         return shim.Error("Chaincode ID not provided")
     }
     chaincodeID := function
  // <yes> <report> go_cross_channel_chaincode_invocation ach101
     return stub.InvokeChaincode(chaincodeID, args, stub.TxID)
 }


 func (p *PassthruChaincode) Invoke(stub shim.ChaincodeStubInterface) pb.Response {
     function, args := stub.GetFunctionAndParameters()
     return p.iq(stub, function, args)
 }