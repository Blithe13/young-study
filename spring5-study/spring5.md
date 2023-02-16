# young-study-spring5
## spring课程介绍
1. Spring概念
2. IOC容器
3. AOP面向切面编程
4. JdbcTemplate
5. 事务管理
6. Spring5新特性
## 一、spring框架概述
1. Spring是轻量级（引入框架所需的jar包非常小）的开源的JavaEE框架。
2. Spring可以解决企业应用开发的复杂性。
3. Spring有两个核心部分：IOC和AOP。
   1. IOC：控制反转，把创建对象过程交给Spring进行管理。
   2. AOP：面向切面，不修改源代码进行功能增强。
4. 特点
   1. 方便解耦，简化开发。
   2. Aop编程支持
   3. 方便程序测试
   4. 方便和其他各种框架整合
   5. 方便进行事务操作
   6. 降低API开发难度
## 二、入门案例
   
## 三、IOC容器
1. IOC概念和原理
（1） 什么是IOC
 - 控制反转，吧对象创建哥对象之间的调用过程，交给Spring进行管理
 - 使用IOC目的：为了减低耦合度
 - 做入门案例就是IOC实现
2. IOC底层原理
（1）xml解析、工厂模式、反射
（2）IOC解耦过程：
- xml配置文件，配置创建的对象
```xml
<bean id="dao" class="com.a"></bean>
- ```
- 有service类和dao类，创建工厂类
```java
class UserFactory {
    public static UserDao getDao() {
        String classValue = "class属性";//xml解析
        //通过反射创建对象
       Class clazz = Class.forName(classValue);//通过反射创建对象
       return (UserDao) clazz.newInstance();
    }
}
```
3. IOC接口（BeanFactory）
- IOC思想基于IOC容器完成，IOC容器底层原理就是对象工厂。
- Spring底层IOC容器实现两种方式，（两个接口）
  - BeanFactory:IOC容器基本实现，是Spring内部的使用接口。不敌同开发人员进行使用。
    - 加载配置文件时不会创建对象，在获取对象（使用）才去创建对象。
  - ApplicationContext：BeanFactory接口的子接口，提供更多更强大的功能，一般由开发人员进行使用。
    - 加载配置文件时就会把在配置文件中的对象进行创建。
- ApplicationContext接口实现类
  - 
4. IOC操作bean管理（xml方式）
