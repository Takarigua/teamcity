# Домашнее задание к занятию 11 «Teamcity»

## Подготовка к выполнению

1. В Yandex Cloud создайте новый инстанс (4CPU4RAM) на основе образа `jetbrains/teamcity-server`.
2. Дождитесь запуска teamcity, выполните первоначальную настройку.
3. Создайте ещё один инстанс (2CPU4RAM) на основе образа `jetbrains/teamcity-agent`. Пропишите к нему переменную окружения `SERVER_URL: "http://<teamcity_url>:8111"`.
4. Авторизуйте агент.
5. Сделайте fork [репозитория](https://github.com/aragastmatb/example-teamcity).
6. Создайте VM (2CPU4RAM) и запустите [playbook](./infrastructure).

## Основная часть

1. Создайте новый проект в teamcity на основе fork.
2. Сделайте autodetect конфигурации.
3. Сохраните необходимые шаги, запустите первую сборку master.
4. Поменяйте условия сборки: если сборка по ветке `master`, то должен происходит `mvn clean deploy`, иначе `mvn clean test`.
5. Для deploy будет необходимо загрузить [settings.xml](./teamcity/settings.xml) в набор конфигураций maven у teamcity, предварительно записав туда креды для подключения к nexus.
6. В pom.xml необходимо поменять ссылки на репозиторий и nexus.
7. Запустите сборку по master, убедитесь, что всё прошло успешно и артефакт появился в nexus.
8. Мигрируйте `build configuration` в репозиторий.
9. Создайте отдельную ветку `feature/add_reply` в репозитории.
10. Напишите новый метод для класса Welcomer: метод должен возвращать произвольную реплику, содержащую слово `hunter`.
11. Дополните тест для нового метода на поиск слова `hunter` в новой реплике.
12. Сделайте push всех изменений в новую ветку репозитория.
13. Убедитесь, что сборка самостоятельно запустилась, тесты прошли успешно.
14. Внесите изменения из произвольной ветки `feature/add_reply` в `master` через `Merge`.
15. Убедитесь, что нет собранного артефакта в сборке по ветке `master`.
16. Настройте конфигурацию так, чтобы она собирала `.jar` в артефакты сборки.
17. Проведите повторную сборку мастера, убедитесь, что сбора прошла успешно и артефакты собраны.
18. Проверьте, что конфигурация в репозитории содержит все настройки конфигурации из teamcity.
19. В ответе пришлите ссылку на репозиторий.

---

### Как оформить решение задания

Выполненное домашнее задание пришлите в виде ссылки на .md-файл в вашем репозитории.

---

### Ответ

Создал ВМ и настроил nexus (пришёл немного править site.yml так как не хотел заводиться). Гонял тесты сначала без каких-либо настроек чтобы просто посмотреть, затем уже правил Pom файл. Загрузил setting заменит на свои данные учетки (на самом деле была другая учетка, но она не сработала, почему-то не принимал логин/пароль, а сработало из под неё создать отдельную с админскими правами и указать её). 
По итогу:
1. Сделал RUN и он выдал результат.
2. Сделал шаги чтобы выполняли условие пункта 4
3.Сделал файл setting как упомянул из пункта 5
4. RUN создавал в nexus соответствующую папку 0.0.2
5. Затем всё это дело залил в репозиторий
6. После этого создал ветку и внёс изменения в файлы Welcome.
7. Сделал тест, сначала были затыки, но потом разобрался.
8. Отправилось затем замерджил
9. Ещё раз проверил pom на условия задания
10. Затем пишу это и прикладываю скриншоты
---
![0](https://github.com/Takarigua/teamcity/blob/5bb4ff9a0f1e272db169f7674eb5f03b71278f70/screen/0.png)
![1](https://github.com/Takarigua/teamcity/blob/5bb4ff9a0f1e272db169f7674eb5f03b71278f70/screen/1.png)
![2](https://github.com/Takarigua/teamcity/blob/5bb4ff9a0f1e272db169f7674eb5f03b71278f70/screen/2.png)
![3](https://github.com/Takarigua/teamcity/blob/5bb4ff9a0f1e272db169f7674eb5f03b71278f70/screen/3.png)
![4](https://github.com/Takarigua/teamcity/blob/5bb4ff9a0f1e272db169f7674eb5f03b71278f70/screen/4.png)
![5](https://github.com/Takarigua/teamcity/blob/5bb4ff9a0f1e272db169f7674eb5f03b71278f70/screen/5.png)
