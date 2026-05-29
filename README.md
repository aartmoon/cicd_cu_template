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

## Полезные ссылки

- [GitHub Actions документация](https://docs.github.com/en/actions)
- [Marketplace actions](https://github.com/marketplace?type=actions)
- [Контекст и выражения](https://docs.github.com/en/actions/writing-workflows/choosing-what-your-workflow-does/accessing-contextual-information-about-workflow-runs)
