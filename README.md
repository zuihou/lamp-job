# lamp 快速开发平台

[![AUR](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg)](https://github.com/zuihou/lamp-cloud/blob/master/LICENSE)
[![](https://img.shields.io/badge/作者-zuihou-orange.svg)](https://github.com/zuihou)
[![](https://img.shields.io/badge/版本-3.2.2-brightgreen.svg)](https://github.com/zuihou/lamp-cloud)
[![GitHub stars](https://img.shields.io/github/stars/zuihou/lamp-cloud.svg?style=social&label=Stars)](https://github.com/zuihou/lamp-cloud/stargazers)
[![star](https://gitee.com/zuihou111/lamp-cloud/badge/star.svg?theme=white)](https://gitee.com/zuihou111/lamp-cloud/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/zuihou/lamp-cloud.svg?style=social&label=Fork)](https://github.com/zuihou/lamp-cloud/network/members)
[![fork](https://gitee.com/zuihou111/lamp-cloud/badge/fork.svg?theme=white)](https://gitee.com/zuihou111/lamp-cloud/members)


# lamp 项目名字由来

## 叙事版：

在一个夜黑风高的晚上，小孩吵着要出去玩，于是和`程序员老婆`一起带小孩出去放风，路上顺便讨论起项目要换个什么名字，在各自想出的名字都被对方一一否决后，大家陷入了沉思。 走着走着，在一盏路灯下，孩砸盯着路灯打破宁静，喊出：灯灯～
我和媳妇愣了一下，然后对视着一起说：哈哈，这个名字好～

## 解释版：

`灯灯`： 是我小孩学说话时会说的第一个词，也是我在想了很多项目名后，小孩一语点破的一个名字，灯灯象征着光明，给困境的我们带来希望，给加班夜归的程序员们指引前方～

`灯灯`(简称灯， 英文名：lamp)，他是一个项目的统称，包含以下几个子项目

## lamp 项目组成

注意： 请先下载lamp-util 代码并编译（mvn install） 到本地仓库，然后在编译（mvn install）lamp-cloud或lamp-boot项目， 最后编译（mvn install）lamp-job项目！！！

### 工具集 （lamp-util 项目必备，其他2个可选）

| 项目 | gitee | github | 备注 | 
| --- | --- | --- | --- |
| 工具集 | [lamp-util](https://gitee.com/zuihou111/lamp-util) | [lamp-util](https://github.com/zuihou/lamp-util) | 业务无关的工具集，cloud 和 boot 项目都依赖它 |
| 代码生成器 | [lamp-generator](https://gitee.com/zuihou111/lamp-generator) | [lamp-generator](https://github.com/zuihou/lamp-generator) | 给开发人员使用 |
| 定时调度器 | [lamp-job](https://gitee.com/zuihou111/lamp-job) | [lamp-job](https://github.com/zuihou/lamp-job) | 尚未开发 |

### 后端 （下面2个项目功能一致，任选其一即可）

| 项目 | gitee | github | 备注 |
| --- | --- | --- | --- |
| 微服务版(后端) | [lamp-cloud](https://gitee.com/zuihou111/lamp-cloud) | [lamp-cloud](https://github.com/zuihou/lamp-cloud) | SpringCloud 版 |
| 单体版(后端) | [lamp-boot](https://gitee.com/zuihou111/lamp-boot) | [lamp-boot](https://github.com/zuihou/lamp-boot) | SpringBoot 版(和 lamp-cloud 功能基本一致) |

### 前端 （下面3个项目功能一致，任选其一即可）

| 项目 | gitee | github | 备注 | 演示地址 |
| --- | --- | --- | --- | --- |
| 中后台管理系统 | [lamp-web](https://gitee.com/zuihou111/lamp-web) | [lamp-web](https://github.com/zuihou/lamp-web) | （全部功能已完成）基于 vue-admin-element | http://tangyh.top:10000 |
| 中后台管理系统 | [lamp-web-beautiful](https://gitee.com/zuihou111/lamp-web-beautiful) | [lamp-web-beautiful](https://github.com/zuihou/lamp-web-beautiful) | （正在开发...）基于 vue-admin-beautiful | http://tangyh.top:180 |
| 中后台管理系统 (强烈推荐！👏👏👏) | [lamp-web-beautiful](https://gitee.com/zuihou111/lamp-web-plus) | [lamp-web-beautiful](https://github.com/zuihou/lamp-web-plus) | （正在开发...）基于 vue-vben-admin （vue 3 + vite 2） | http://tangyh.top:3100 |

# lamp-job 简介

`lamp-job` 是基于xxl-job 2.3.0 改造， 主要改造内容， 其他跟xxl-job项目代码一致，所以不懂使用的的朋友，建议先学习xxl-job

- 依赖的版本调整为跟lamp项目保持一致
- xxl-job-admin
  - 新增JobInfoController#save接口
- xxl-job-core 无任何改动
- xxl-job-executor 删除官方提供的例子，并新建适配lamp项目的执行器。
  - lamp-base-executor： 处理base库相关定时任务的执行器
  - lamp-extend-executor： 处理extend库相关定时任务的执行器
- 若您使用的是lamp-boot项目，则无需使用lamp-extend-executor模块！

**切记:使用本项目之前，先下载并编译 [lamp-util](https://github.com/zuihou/lamp-util) ， 然后在编译 [lamp-cloud](https://github.com/zuihou/lamp-cloud)**

**切记:使用本项目之前，先下载并编译 [lamp-util](https://github.com/zuihou/lamp-util) ， 然后在编译 [lamp-cloud](https://github.com/zuihou/lamp-cloud)**

**切记:使用本项目之前，先下载并编译 [lamp-util](https://github.com/zuihou/lamp-util) ， 然后在编译 [lamp-cloud](https://github.com/zuihou/lamp-cloud)**

> 如何编译: mvn clean install


# 友情链接 & 特别鸣谢
* 微服务快速开发平台：[https://github.com/zuihou/lamp-cloud](https://github.com/zuihou/lamp-cloud)
* 单体快速开发平台：[https://github.com/zuihou/lamp-boot](https://github.com/zuihou/lamp-boot)
* MyBatis-Plus：[https://mybatis.plus/](https://mybatis.plus/)
* knife4j：[http://doc.xiaominfo.com/](http://doc.xiaominfo.com/)
* hutool：[https://hutool.cn/](https://hutool.cn/)
* xxl-job：[http://www.xuxueli.com/xxl-job/](http://www.xuxueli.com/xxl-job/)
* kkfileview：[https://kkfileview.keking.cn](https://kkfileview.keking.cn)
* vue-vben-admin： [https://github.com/anncwb/vue-vben-admin](https://github.com/anncwb/vue-vben-admin) lamp-web-plus
  基于本项目改造
* FEBS Cloud Web： [https://gitee.com/mrbirdd/FEBS-Cloud-Web](https://gitee.com/mrbirdd/FEBS-Cloud-Web)
  lamp-web 基于本项目改造， 感谢 [wuyouzhuguli](https://github.com/wuyouzhuguli)
* Cloud-Platform： [https://gitee.com/geek_qi/cloud-platform](https://gitee.com/geek_qi/cloud-platform)
  作者学习时接触到的第一个微服务项目
