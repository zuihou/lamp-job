# 如何使用本项目？

1. 先编译 lamp-util-pro 
```
mvn clean install
```
2. 在编译 lamp-cloud-pro-datasource-column 或 lamp-cloud-pro-column 或 lamp-boot-pro-datasource-column 或 lamp-boot-pro-column 或 lamp-boot-pro-none 或 lamp-boot-pro-none
```
mvn clean install
```
3. lamp-datasource-executor 和 lamp-column-executor 不能同时使用
   - 若用 lamp-cloud-pro-datasource-column，则定时执行器需要使用 lamp-datasource-executor
   ```
   # 修改 xxl-job-executor/pom.xml
   <modules>
       <module>lamp-datasource-executor</module>
   </modules>
   ```
   - 若用 lamp-cloud-pro-column，则定时执行器需要使用 lamp-column-executor
   ```
   # 修改 xxl-job-executor/pom.xml
   <modules>
       <module>lamp-column-executor</module>
   </modules>
   ```
   - 若用 lamp-cloud-pro-none，则定时执行器需要使用 lamp-none-executor
   ```
   # 修改 xxl-job-executor/pom.xml
   <modules>
       <module>lamp-none-executor</module>
   </modules>
   ```
