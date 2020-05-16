package main
import(
   "fmt"
   "github.com/hyperledger/fabric/core/chaincode/shim"
   pb "github.com/hyperledger/fabric/protos/peer"
)
type BadCode struct {
  // <yes> <report> go_misuse_field_declaration fie101
      globalValue string  
   }
func(f *BadCode) Invoke (stub shim.ChaincodeStubInterface) peer.Response{
      f.globalValue = args[0]
      return shim.sucess([]byte(“success”))
   }

 func main() {
   	err := shim.Start(new(RandomChaincode))
   	if err != nil {
   		fmt.Printf("start chaincode err: %v\n", err)
   	}
   }