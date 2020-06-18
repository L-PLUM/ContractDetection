# 工具使用说明

## 生成可视化抽象语法树和XML中间表示
###将智能合约生成抽象语法树

```bash
$ mvn exec:java@tree -Dexec.args="-p <path to the file>"
   eg:mvn exec:java@tree -Dexec.args="-p E:/solidityfile/overflow/overflow.sol"
```
### 生成XML中间表示

```bash
$ mvn exec:java@xml -Dexec.args="-t <path to save xml-tree> -s <path to the file>"
  eg:mvn exec:java@xml -Dexec.args="-t E:/solidityfile/overflow/overflow.xml -s E:/solidityfile/overflow/overflow.sol"
```

##  使用工具进行漏洞检测和分析
### 构建工具
本工具是一个 Maven 项目，可通过执行以下命令构建项目工具:

```bash
$ mvn clean package
```
### 执行命令，实现检测与分析

```bash
$ java -jar target/ContractDetection-1.0-SNAPSHOT-jar-with-dependencies.jar -p  <path to the file>
   eg: java -jar target/ContractDetection-1.0-SNAPSHOT-jar-with-dependencies.jar -p E:/solidityfile/overflow/overMint.sol
```


