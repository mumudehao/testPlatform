## 拉取容器

```bash
# 登录
$ docker login
# 给image打tag
$ docker tag mysql mumude/mysql:mysql_v0.1
# 把image推送到镜像库 dockerhub
$ docker push mumude/mysql:mysql_v0.1
# 从镜像库拉取image
$ docker pull mumude/mysql:mysql_v0.1
```

> 运行容器
```bash
	$ docker run -itd --name mysql-test -p 3366:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql
```

## 前端地址 docs2
https://cn.vuejs.org/v2/guide/installation.html#CDN
## docs
https://v3.cn.vuejs.org/guide/introduction.html

