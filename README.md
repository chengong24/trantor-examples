# Trantor Examples

![Trantor](trantor.png)

![Trantor 0.13.0](https://img.shields.io/badge/Trantor-0.13.0-brightgreen.svg)
![JDK 1.8](https://img.shields.io/badge/JDK-1.8-orange.svg)



Trantor特性使用示例，已简单、易懂为标准。将每个概念、特性已Trantor模块的方式罗列出来。帮助新同学快速掌握基于Trantor来开发中后台系统。

> 编译运行当前Examples工程时，请将maven的settings配置为当前工程下的settings.xml

[Trantor Docs](https://trantor-docs.app.terminus.io/)

## 工程结构说明

Trantor 应用为标准 maven 工程，通常包含api和server两个子模块。
**api** 主要放置`模块声明`、`模型`、`字典`、`service interface` 、`DTO` 等可能会被其他模块依赖的内容。
**server** 主要放置逻辑实现并且是真实启动。

```
trantor-example
├── example-api
│   ├── pom.xml
|		└── src
│       ├── main
│       │   ├── java
│       │   │   └── io
│       │   │       └── terminus
│       │   │           └── trantor
│       │   │               └── example
│       │   │                   └── dictionary
│       │   │                   │   └── dictClass.java
│       │   │                   └── model
│       │   │                       └── modelClass.java
│       │   └── resources
│       │       └── trantor.yml
├── example-server
│   ├── pom.xml
|		└── src
│       ├── main
│       │   ├── java
│       │   │   └── io
│       │   │       └── terminus
│       │   │           └── trantor
│       │   │               └── example
│       │   │                   └── Application.java
│       │   └── resources
│       │       └── application.yml
└── pom.xml
```
