# lamp 快速开发平台

[![Language](https://img.shields.io/badge/langs-Java%20%7C%20SpringCloud%20%7C%20Vue3%20%7C%20...-red?style=flat-square&color=42b883)](https://github.com/zuihou/lamp-cloud)
[![License](https://img.shields.io/github/license/zuihou/lamp-cloud?color=42b883&style=flat-square)](https://github.com/zuihou/lamp-cloud/blob/master/LICENSE)
[![Author](https://img.shields.io/badge/作者-zuihou-orange.svg)](https://github.com/zuihou)
[![Version](https://img.shields.io/badge/版本-3.8.1-brightgreen.svg)](https://github.com/zuihou/lamp-cloud)
[![Star](https://img.shields.io/github/stars/zuihou/lamp-cloud?color=42b883&logo=github&style=flat-square)](https://github.com/zuihou/lamp-cloud/stargazers)
[![Fork](https://img.shields.io/github/forks/zuihou/lamp-cloud?color=42b883&logo=github&style=flat-square)](https://github.com/zuihou/lamp-cloud/network/members)
[![Star](https://gitee.com/zuihou111/lamp-cloud/badge/star.svg?theme=gray)](https://gitee.com/zuihou111/lamp-cloud/stargazers)
[![Fork](https://gitee.com/zuihou111/lamp-cloud/badge/fork.svg?theme=gray)](https://gitee.com/zuihou111/lamp-cloud/members)

# lamp 项目名字由来

## 叙事版：

在一个夜黑风高的晚上，小孩吵着要出去玩，于是和`程序员老婆`一起带小孩出去放风，路上顺便讨论起项目要换个什么名字，在各自想出的名字都被对方一一否决后，大家陷入了沉思。 走着走着，在一盏路灯下，孩砸盯着路灯打破宁静，喊出：灯灯～
我和媳妇愣了一下，然后对视着一起说：哈哈，这个名字好～

## 解释版：

`灯灯`： 是我小孩学说话时会说的第一个词，也是我在想了很多项目名后，小孩一语点破的一个名字，灯灯象征着光明，给困境的我们带来希望，给加班夜归的程序员们指引前方～

`灯灯`(简称灯， 英文名：lamp)，他是一个项目的统称，包含以下几个子项目

## lamp 项目组成

注意： 请先下载lamp-util 代码并编译（mvn install） 到本地仓库，然后在编译（mvn install）lamp-cloud或lamp-boot项目， 最后编译（mvn install）lamp-job项目！！！

## 工具集

| 项目 | gitee | github | 备注 |
| --- | --- | --- | --- |
| lamp-util | [lamp-util](https://gitee.com/zuihou111/lamp-util) | [lamp-util](https://github.com/zuihou/lamp-util) | 核心工具集 |
| lamp-generator | [lamp-generator](https://gitee.com/zuihou111/lamp-generator) | [lamp-generator](https://github.com/zuihou/lamp-generator) | 代码生成器 |
| lamp-job | [lamp-job](https://gitee.com/zuihou111/lamp-job) | [lamp-job](https://github.com/zuihou/lamp-job) | 分布式定时调度器 |

## 后端

| 项目 | gitee | github | 备注 |
| --- | --- | --- | --- |
| lamp-cloud | [lamp-cloud](https://gitee.com/zuihou111/lamp-cloud) |  [lamp-cloud](https://github.com/zuihou/lamp-cloud) | SpringCloud(微服务)版 |
| lamp-boot | [lamp-boot](https://gitee.com/zuihou111/lamp-boot) |  [lamp-boot](https://github.com/zuihou/lamp-boot) | SpringBoot(单体)版 |
| 微服务版示例 | [lamp-samples](https://github.com/zuihou/lamp-samples) | [lamp-samples](https://github.com/zuihou/lamp-samples) | 常用示例 |

## 前端

| 项目 | gitee | github | 备注 | 演示地址 |
| --- | --- | --- | --- | --- |
| lamp-web | [lamp-web](https://gitee.com/zuihou111/lamp-web) | [lamp-web](https://github.com/zuihou/lamp-web) | 基于 vue-admin-element (element-ui) | https://tangyh.top |
| lamp-web-plus(强烈推荐！👏👏👏) | [lamp-web-plus](https://gitee.com/zuihou111/lamp-web-plus) | [lamp-web-plus](https://github.com/zuihou/lamp-web-plus) | 基于 vue-vben-admin （vue 3 + ant design vue 2） | https://tangyh.top/lamp-web |
| lamp-web-beautiful(停更) | [lamp-web-beautiful](https://gitee.com/zuihou111/lamp-web-beautiful) | [lamp-web-beautiful](https://github.com/zuihou/lamp-web-beautiful) | 基于 vue-admin-beautiful | 无 |


# 会员版演示地址
- 后端使用lamp-cloud-plus，前端使用lamp-web-plus。演示地址： https://tangyh.top
- 后端使用lamp-cloud-plus，前端使用lamp-web。演示地址： https://tangyh.top/lamp-web
- 后端使用lamp-boot-plus， 前端使用lamp-web-plus。演示地址： https://boot.tangyh.top
- 后端使用lamp-boot-plus， 前端使用lamp-web。演示地址： https://boot.tangyh.top/lamp-web

# 演示账号
- 以下内置账号仅限于内置的0000租户
- 平台管理员： lamp_pt/lamp (内置给公司内部运营人员使用)
- 超级管理员： lamp/lamp
- 普通管理员： general/lamp
- 普通账号： normal/lamp


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

http://localhost:8767/xxl-job-admin/static/adminlte/dist/js/adminlte.min.js
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
