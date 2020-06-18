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
type EstateBookContract struct {
}


func (s *EstateBookContract) queryByBookID(APIstub shim.ChaincodeStubInterface, args []string) peer.Response {
	if len(args) != 1 {
		return shim.Error("Incorrect number of arguments. Expecting 1 ")
	}
	queryString := fmt.Sprintf("{\"selector\":{\"bookid\":\"%s\"}}", args[0])
	// <yes> <report> go_range_query_risk que101
	qis, err := APIstub.GetQueryResult(queryString)
	if err != nil {
		return shim.Error("queryByBookID error:" + err.Error())
	}
	defer qis.Close()
	var buffer bytes.Buffer
	buffer.WriteString("[")
	bArrayMemberAlreadyWritten := false
	for qis.HasNext() {
		queryResponse, err := qis.Next()
		if err != nil {
			return shim.Error(err.Error())
		}
		if bArrayMemberAlreadyWritten == true {
			buffer.WriteString(",")
		}
		buffer.WriteString(string(queryResponse.Value))
		bArrayMemberAlreadyWritten = true
	}
	buffer.WriteString("]")
	return shim.Success(buffer.Bytes())
}

