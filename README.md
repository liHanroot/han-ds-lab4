# Лабораторная работа #4

![GitHub Classroom Workflow](../../workflows/GitHub%20Classroom%20Workflow/badge.svg?branch=master)

## Deploy to Cloud

### Формулировка

На базе [Лабораторной работы #2](https://github.com/bmstu-rsoi/lab2-template) выполнить деплой приложения в managed
кластер k8s.

### Требования

1. Скопировать исходный код из ЛР #2 в проект.
2. Развернуть руками свой Managed Kubernetes Cluster, настроить Ingress Controller (для публикации сервисов наружу можно
   использовать _только_ Ingress).
4. Собрать и опубликовать образы docker в [Docker Registry](https://hub.docker.com/).
5. Описать манифесты для деплоя в виде [helm charts](https://helm.sh/docs/topics/charts/), они должен быть универсальным
   для всех сервисов и отличаться лишь набором параметров запуска.
6. В кластере k8s можно использовать один физический instance базы, но каждый сервис должен работать только со своей
   виртуальной базой данных. Задеплоить базу в кластер можно руками, либо использовать уже готовый helm chart.
7. Код хранить на Github, для сборки использовать Github Actions.
8. Для автоматических прогонов тестов в файле [autograding.json](.github/classroom/autograding.json)
   и [classroom.yml](.github/workflows/classroom.yml) заменить `<variant>` на ваш вариант.
9. В [classroom.yml](.github/workflows/classroom.yml) дописать шаги:
    1. сборка приложения;
    2. сборка и публикация образа docker (можно использовать `docker compose build`, `docker compose push`);
    3. деплой каждого сервиса в кластер k8s.

### Пояснения

Т.к. развертывание полноценного кластера на виртуальным машинах очень сложный процесс, можно использовать Managed
Kubernetes Cluster, т.е. готовый кластер k8s, предоставляемый сторонней платформой, например:

* [Digital Ocean](https://www.digitalocean.com/products/kubernetes/)
* [Yandex Cloud](https://cloud.yandex.ru/services/managed-kubernetes)
* [Google Kubernetes Engine](https://cloud.google.com/kubernetes-engine)
* [AWS](https://aws.amazon.com/ru/eks/)

Платформ, которые предоставляют Kubernetes as a Service большое количество, вы можете сами исследовать рынок и выбрать
другого провайдера услуг. Большинство провайдеров имеют бесплатный триальный период или денежный грант.

Для создания кластера достаточно 2-3 worker ноды 2Gb, 1CPU.

### Прием задания

1. При получении задания у вас создается fork этого репозитория для вашего пользователя.
2. После того как все тесты успешно завершатся, в Github Classroom на Dashboard будет отмечено успешное выполнение
   тестов.

### Варианты заданий

Распределение вариантов заданий аналогично [ЛР #2](https://github.com/bmstu-rsoi/lab2-template).





#实验室#4

![GitHub 课堂工作流程](../../workflows/GitHub%20Classroom%20Workflow/badge.svg?branch=master)

## 部署到云端

### 措辞

基于[实验 #2](https://github.com/bmstu-rsoi/lab2-template) 将应用程序部署到托管
k8s集群。

＃＃＃ 要求

1. 将源代码从 LR #2 复制到项目中。
2. 手动部署您的托管 Kubernetes 集群，配置 Ingress Controller（要对外发布服务，您可以
    仅使用 Ingress）。
3. 构建 docker 镜像并将其发布到 [Docker Registry](https://hub.docker.com/)。
4.以[helm图表](https://helm.sh/docs/topics/charts/)的形式描述部署清单，它们应该是通用的
    适用于所有服务，仅在启动参数集上有所不同。
5. 在k8s集群中，您可以使用一个数据库物理实例，但每个服务必须只能使用自己的
    虚拟数据库。 您可以手动将数据库部署到集群，或者使用现成的 Helm Chart。
6. 将代码存储在Github上，使用Github Actions进行构建。
7. 对于文件 [autograding.json](.github/classroom/autograding.json) 中的自动测试运行
    并 [classroom.yml](.github/workflows/classroom.yml) 将 `<variant>` 替换为您的变体。
8. 在 [classroom.yml](.github/workflows/classroom.yml) 中添加以下步骤：
    1. 构建应用程序；
    2.构建并发布docker镜像（可以使用`docker compose build`、`docker compose push`）；
    3. 将各个服务部署到k8s集群。

### 说明

因为 在虚拟机上部署成熟的集群是一个非常复杂的过程，您可以使用托管
Kubernetes 集群，即 第三方平台提供的现成的k8s集群，例如：

* [数字海洋](https://www.digitalocean.com/products/kubernetes/)
* [Yandex 云](https://cloud.yandex.ru/services/driven-kubernetes)
* [谷歌 Kubernetes 引擎](https://cloud.google.com/kubernetes-engine)
* [AWS](https://aws.amazon.com/ru/eks/)

有大量的平台提供 Kubernetes as a Service，您可以自行探索市场并选择
另一个服务提供商。 大多数提供商都有免费试用期或现金补助。

创建一个集群，2-3个2Gb、1CPU的工作节点就足够了。

### 接受任务

1. 当您收到任务时，您为您的用户创建此存储库的分支。
2. 所有测试成功完成后，Github Classroom Dashboard 中将标记成功
    测试。

### 任务选项

任务选项的分布类似于[LR #2](https://github.com/bmstu-rsoi/lab2-template)。