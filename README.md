### Spring-Boot

#### Docker
1.创建镜像：docker build --build-arg JAR_FILE=target/guideJAR_FILE=target/guide-0.0.1-SNAPSHOT.jar -t ${image_name}

2.在容器中运行：docker run -p 8080:${local_port} ${image_name}

#### Upload File

#### LDAP
1.需要在application.properties里面配置LDAP参数，否则会报 `Embedded ldap connention refused`