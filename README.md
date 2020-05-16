# Instruction

## 
###converting code(solidity...) to parse tree in a graphical form

```bash
$ mvn exec:java@tree -Dexec.args="-p <path to the file>"
   eg:mvn exec:java@tree -Dexec.args="-p E:/solidityfile/overflow/overflow.sol"
```
### converting parse tree as XML

```bash
$ mvn exec:java@xml -Dexec.args="-t <path to save xml-tree> -s <path to the file>"
  eg:mvn exec:java@xml -Dexec.args="-t E:/solidityfile/overflow/overflow.xml -s E:/solidityfile/overflow/overflow.sol"
```

##  security vulnerability analysis and dection
### Building the project
The project uses Maven. To build it, execute in the project directory:

```bash
$ mvn clean package
```
### Start the analysis and dection

```bash
$ java -jar target/ContractDetection-1.0-SNAPSHOT-jar-with-dependencies.jar -p  <path to the file>
   eg: java -jar target/ContractDetection-1.0-SNAPSHOT-jar-with-dependencies.jar -p E:/solidityfile/overflow/overMint.sol
```


mvn exec:java@tree -Dexec.args="-p E:/solidityfile/overflow/overflow.sol"
mvn exec:java@xml -Dexec.args="-t E:/solidityfile/overflow/overflow.xml -s E:/solidityfile/overflow/overflow.sol"
java -jar target/ContractDetection-1.0-SNAPSHOT-jar-with-dependencies.jar -p E:/solidityfile/overflow/overMint.sol
 java -jar target/ContractDetection-1.0-SNAPSHOT-jar-with-dependencies.jar -p E:/contractCrawler/smartcontract/etherscan/ethercontract1/

mvn exec:java@tree -Dexec.args="-p E:/gofile/misuseFieldDecl.go"
mvn exec:java@xml -Dexec.args="-t E:/gofile/misuseFieldDecl.xml -s E:/gofile/misuseFieldDecl.go"
java -jar target/ContractDetection-1.0-SNAPSHOT-jar-with-dependencies.jar -p E:/gofile/misuseFieldDecl.go
