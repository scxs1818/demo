1.该工程分5个部分，各部分介绍如下：
demo-common：该工程主要存放公共方法代码
demo-domain:该工程主要存放数据库映射bean
demo-mapper:该工程主要用于对象持久化映射，mapper下包含两级目录,
			其中base包下存放通用mapper(只需继承Mapper接口，实现对单表的增删改查)，
			mapper包下为复杂sql交互
demo-service:该工程只要是业务类代码
demo-web: 该工程负责对外提供接口,该工程为所有工程唯一入口。