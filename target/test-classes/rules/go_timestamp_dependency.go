package main

import (
	"fmt"
	"encoding/json"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	pb "github.com/hyperledger/fabric/protos/peer"
	"time"
	"strconv"
)

type BillChaincode struct {
}


func (a *BillChaincode) LinkContractClose(stub shim.ChaincodeStubInterface, args []string) pb.Response {

	if len(args)!=1 {
		res := getRetString(0,1000,"AlgobluChaincode Invoke LinkContractClose args != 1")
		return shim.Error(res)
	}


	arg :=[]byte(args[0])
	billclose := &BillClose{}
	err := json.Unmarshal(arg, billclose)
	if err != nil {
		res := getRetString(0,2000,"AlgobluChaincode Invoke LinkContractClose unmarshal failed")
		fmt.Println(res)
		return shim.Error(res)
	}


	err = stub.PutState(billclose.ContractCode, arg)
	if err!=nil {
		return shim.Error("ChainnovaChaincode Invoke LinkContractClose putdata failed!")
	}


	bill,existbl := a.getBill(stub, billclose.ContractCode)
	if !existbl {
		res := getRetString(0,1000,"AlgobluChaincode Invoke LinkContractClose failed : the ContractCode does not exist")
		return shim.Error(res)
	}


	if billclose.UserCode != bill.PurchaserUserCode {
		res := getRetString(0,1000,"AlgobluChaincode Invoke LinkContractClose failed : invalid UserCode")
		return shim.Error(res)
	}

	bill.ContractStatus = billclose.ContractStatus
	bill.CloseTime = billclose.CloseTime
	bill.VersionId = stub.GetTxID()
	// <yes> <report> go_timestamp_dependency tim101
	t := time.Now()
	fmt.Println(t)
	timestamp := t.Unix()
	fmt.Println(timestamp)
	bill.VersionTime = strconv.FormatInt(timestamp, 10)
	_,bl := a.putBill(stub,bill)
	if !bl {
		return shim.Error("AlgobluChaincode Invoke LinkContractClose close failed!")
	}
	fmt.Println(bill)
	res := getRetByte(1,0,"invoke LinkContractClose success")
	return shim.Success(res)
}

func (a *BillChaincode) LinkContractClose1(stub shim.ChaincodeStubInterface, args []string) pb.Response {

	if len(args)!=1 {
		res := getRetString(0,1000,"AlgobluChaincode Invoke LinkContractClose args != 1")
		return shim.Error(res)
	}


	arg :=[]byte(args[0])
	billclose := &BillClose{}
	err := json.Unmarshal(arg, billclose)
	if err != nil {
		res := getRetString(0,2000,"AlgobluChaincode Invoke LinkContractClose unmarshal failed")
		fmt.Println(res)
		return shim.Error(res)
	}


	err = stub.PutState(billclose.ContractCode, arg)
	if err!=nil {
		return shim.Error("ChainnovaChaincode Invoke LinkContractClose putdata failed!")
	}


	bill,existbl := a.getBill(stub, billclose.ContractCode)
	if !existbl {
		res := getRetString(0,1000,"AlgobluChaincode Invoke LinkContractClose failed : the ContractCode does not exist")
		return shim.Error(res)
	}


	if billclose.UserCode != bill.PurchaserUserCode {
		res := getRetString(0,1000,"AlgobluChaincode Invoke LinkContractClose failed : invalid UserCode")
		return shim.Error(res)
	}

	bill.ContractStatus = billclose.ContractStatus
	bill.CloseTime = billclose.CloseTime
	bill.VersionId = stub.GetTxID()
	// <yes> <report> go_timestamp_dependency tim102
	t := stub.GetTxTimestamp()
	fmt.Println(t)
	timestamp := t.Unix()
	fmt.Println(timestamp)
	bill.VersionTime = strconv.FormatInt(timestamp, 10)
	_,bl := a.putBill(stub,bill)
	if !bl {
		return shim.Error("AlgobluChaincode Invoke LinkContractClose close failed!")
	}
	fmt.Println(bill)
	res := getRetByte(1,0,"invoke LinkContractClose success")
	return shim.Success(res)
}

func main() {

	err := shim.Start(new(BillChaincode))
	if err != nil {
		fmt.Printf("Error starting chaincode: %s", err)
	}

}
