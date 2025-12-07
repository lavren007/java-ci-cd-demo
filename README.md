# Java CI/CD Demo Project

Это демонстрационный проект для настройки CI/CD пайплайна с использованием GitHub Actions.

## Описание проекта

Простой Java-проект, который включает:
- Класс `App` с несколькими методами
- Юнит-тесты с использованием JUnit 5
- Сборку с помощью Maven

## Функциональность

1. **Сложение чисел** - метод `add()`
2. **Проверка четности** - метод `isEven()`
3. **Фильтрация четных чисел** - метод `filterEvenNumbers()`

## CI/CD Pipeline

В проекте настроен GitHub Actions workflow, который:
1. Запускается при каждом push в репозиторий
2. Выполняет сборку на 4 разных ОС:
   - Ubuntu Linux
   - Windows
   - macOS (Intel)
   - macOS (Apple Silicon)
3. Запускает все юнит-тесты
4. Создает JAR-файл
5. Выполняет деплой (демо-версия)

## Локальный запуск

```bash
# Клонировать репозиторий
git clone https://github.com/lavren007/java-ci-cd-demo.git

# Перейти в папку проекта
cd java-ci-cd-demo

# Собрать проект
mvn clean compile

# Запустить тесты
mvn test

# Запустить приложение
mvn exec:java -Dexec.mainClass="com.example.App"

# Создать исполняемый JAR
mvn clean package
java -jar target/java-ci-cd-demo-1.0.0-jar-with-dependencies.jar