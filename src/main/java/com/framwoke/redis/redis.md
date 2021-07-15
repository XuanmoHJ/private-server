

## MAC 下安装
```shell
# 安装redis
brew install redis

#启动服务方式一
brew services start redis

#启动服务方式二 通过配置文件路径启动 如：redis-server /opt/homebrew/etc/redis.conf
redis-server path

#客户端链接 远程链接[redis-cli -h host -p post -a password]
redis-cli

#验证是否链接成功
127.0.0.1:6379> ping
PONG

#关闭redis服务
127.0.0.1:6379> shutdown
not connected>

#重新开启服务
brew services restart redis

```

> 当服务关闭之后，再次链接客户端会报无法连接错误，因为服务端已经关闭掉。
> 解决方案有种：
>- 修改redis.conf 配置文件中的[daemonize no]为yes，这样redis服务将以守护线程的方式在后台运行
>- 使用重新启动命令[restart],如果使用的是启动命令[start],会报已经启动的提示，但实际上客户端依旧是不可用的，故需要使用[restart]命令


## redis配置
>两种方式：
> - 配置文件[redis.conf] 
> - config命令 
>  - 查看所有配置信息[config get *]
>  - 查看具体配置信息[config get name]
>  - 设置配置信息[config set name value]

redis-units:
> 1k: 1000 bytes  
> 1kb: 1024 bytes  
> 1m: 1000000 bytes  
> 1mb: 1024 * 1024 bytes  
> 1g: 1000 * 1000 * 1000 bytes  
> 1gb: 1024 * 1024 * 1024 bytes  

具体配置：
* daemonize no ：默认前台运行，yes则是守护线程后台运行
* rdbchecksum yes ：rdb文件校验，默认开启，在文件末尾添加一个CRC64校验，使得格式耐攻击，但存储和读取文件会有10%的性能损耗。关闭时，文件添加0校验位，以便跳过检查。
* io-threads-do-reads no： 读操作时是否开启多线程。实际上因为redis使用的是单路IO复用技术，在读取时并没有性能瓶颈。6。0版本后之前的多线程，是值网络IO读写的多线程化，主要用在请求完成后返回结果集的过程，也就是socket写操作。
* io-threads 1 : 线程数配置

## 数据类型
redis 数据类型主要有五种：string(字符串) ,hash（哈希） , list（列表） , set（集合） , zset（有序集合）
* string：字符串类型，二进制安全，可存储任何数据，长度范围512Mb
```shell
#命令 set|get key value
127.0.0.1:6379> set demo_key demo_value
OK
127.0.0.1:6379> get demo_key
"demo_value"
127.0.0.1:6379>
```
* hash:散列表键值对，是一个String类型的field和value的映射表，适合存储对象，长度范围2^32
```shell
# 命令 [hset key field value] | [hget key field] | [hgetall key]
hset demo:user sex boy heigh 180 weigh 65
hget demo:user sex 
hgetall demo:user
```
* list:列表，可实现队列和栈，栈顶在左边，长度2^32
* set: 无序集合，基于hash
* zset ：有序集合，不可重复，有分数（score）概念


# 单机模式切换集群模式
1. 放开配置中[cluster-enabled yes]，然后重启服务器
2. 使用[redis-cli]客户端时会报 "CLUSTERDOWN Hash slot not served"错误，此时需要对哈希槽进行修复分配，命令[redis-cli --cluster fix 127.0.0.1:6379]
3. cluster 模式下客户端无法使用命令[shutdown]



# redis 变慢

* 响应延迟
* 基于当前redis基线性能
* 自身操作命令的影响


* 慢查询命令
    - 范围查询 可以使用scan分批次查询
    - 排序，交集，并集 放在客户端完成
    - 不要用keys命令
      
* 大量过期key
    - 过期key删除，大量key同时过期（加随机数）
    
* 文件系统和操作系统
    - 文件系统 AOF 和 RDB
    
# 内存碎片
    - 内因：
    - 外因：
    

# 缓冲区溢出
  - 数据丢失

客户端输入输出缓冲区

* 客户端输入溢出
  - 写入bigkey
  - 写入过慢


* 客户端输出溢出
  - 返回bigkey
  - 缓存区大小不合理
  - monitor命令
  


统计模式？
五大数据类型和布隆过滤器？
Stream 模式，同一个消费组内只能消费一次


    



