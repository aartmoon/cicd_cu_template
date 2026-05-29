# GitHub Actions — Шаблон для практики

Kotlin-проект с заготовками GitHub Actions workflows. Ваша задача — заполнить все `TODO`.

## Задания

### Kotlin тесты (`kotlin-project/src/test/`)
10 тестов с TODO — реализуйте каждый, используя JUnit 5 и kotlin.test assertions.

### Workflows (`.github/workflows/`)

| Файл | Тема | Заданий |
|------|------|---------|
| `01-ci.yml` | Базовый CI: триггеры, JDK, Gradle cache, артефакты | 8 |
| `02-matrix.yml` | Matrix strategy: несколько JDK и ОС параллельно | 6 |
| `03-artifacts.yml` | Artifacts: передача между jobs, GitHub Release | 7 |
| `04-docker.yml` | Docker: сборка и push в GHCR | 5 |
| `05-advanced.yml` | Concurrency, environments, conditions, Slack | 6 |
| `06-repo-automation.yml` | Auto-label, stale bot, workflow_dispatch, GitHub Script | 8 |
| `07-reusable-workflow.yml` | Reusable workflow: inputs, secrets, outputs | 8 |
| `08-caller.yml` | Вызов reusable workflow и использование outputs | 2 |

## Запуск тестов локально

```bash
cd kotlin-project
./gradlew test
```




### 1.1 Если Gradle установлен локально — одна команда из папки проекта:

`cd kotlin-project`
`gradle wrapper --gradle-version 8.11.1`

Это сгенерирует все четыре файла: gradlew, gradlew.bat, gradle/wrapper/gradle-wrapper.jar, gradle/wrapper/gradle-wrapper.properties.


### 1.2 Если Gradle не установлен, то через Docker:

`docker run --rm -v "$(pwd)/kotlin-project:/project" -w /project \
gradle:8.11.1-jdk21 gradle wrapper`


### 2 После этого сделать gradlew исполняемым (Mac/Linux):

`chmod +x kotlin-project/gradlew`

И закоммитить всё включая бинарный JAR:

`git add kotlin-project/gradlew kotlin-project/gradlew.bat kotlin-project/gradle/`
`git commit -m "Add Gradle wrapper"`
`git push`
## Полезные ссылки

- [GitHub Actions документация](https://docs.github.com/en/actions)
- [Marketplace actions](https://github.com/marketplace?type=actions)
- [Контекст и выражения](https://docs.github.com/en/actions/writing-workflows/choosing-what-your-workflow-does/accessing-contextual-information-about-workflow-runs)
