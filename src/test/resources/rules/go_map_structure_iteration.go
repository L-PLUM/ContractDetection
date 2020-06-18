package main

import (
	"errors"
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
)


type SimpleChaincode struct {
}

 func m() {

        m := make(map[int] string)
        m[1] = "lioney"
        m[2] = "carlos"
        m[3] = "tom"
        delete(m, 3)

        fmt.Println("len=", len(m))
        // <yes> <report> go_map_structure_iteration map101
        for k, v := range m {
            fmt.Println("key=", k, "value=", v)
        }
        // <yes> <report> go_map_structure_iteration map101
		for m.Next() {
        fmt.Printf("n: %d\n", iter.Value())
    }
    }

func main() {

	err := shim.Start(new(SimpleChaincode))
	if err != nil {
		fmt.Printf("Error starting chaincode: %s", err)
	}

}
