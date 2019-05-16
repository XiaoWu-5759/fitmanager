# fitmanager

### 数据库里state
配件入数据库默认是0

设置1 就是备件

设置2 就是激活的

设置3 就是被替换的配件

 
### 局域网地址：192.168.1.115
### url:localhost:8080/active/{num}
方法POST

//返回0，激活失败

//返回1，是正常配件，激活成功

//返回2，是备件，需要另外一个被激活的配件码

//返回3，是激活过的配件，提示该配件已被激活

### url: localhost:8080/active/{num1}/{num2}
方法POST

//返回0，激活码不正确，激活失败

//返回1，激活成功

//返回4，请将激活码填入正确的输入框中

//第一个输入框填备件，第二个输入框填已激活件

###url:localhost:8080/manager/show
// 返回的是列表类型的 json数据

###url:localhost:8080/manager/update
//返回1，更新成功；返回0，更新失败
// 单表更新，更新配件数据
// 要求json数据传入，至少包含唯一id
```$js
var fitInfo = {
                    fitId: 1,
                    state: $("#state").val()
                };
```

###url:localhost:8080/manager/upload
// 通过上传excel文件，添加配件数据
excel 表头
编号；配件码；配件状态

