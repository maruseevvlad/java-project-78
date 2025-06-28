### Hexlet & SonarQube tests and linter status:
[![Actions Status](https://github.com/maruseevvlad/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/maruseevvlad/java-project-78/actions)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=maruseevvlad_java-project-78&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=maruseevvlad_java-project-78)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=maruseevvlad_java-project-78&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=maruseevvlad_java-project-78)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=maruseevvlad_java-project-78&metric=coverage)](https://sonarcloud.io/summary/new_code?id=maruseevvlad_java-project-78)

# Проект "Валидатор данных"

Проект представляет собой модуль валидации данных на языке Java. Схемы позволяют гибко описывать правила валидации для строк, чисел и словарей (`Map`) с возможностью комбинирования условий.

## 📦 Возможности

- Валидация строк (`StringSchema`):
  - Проверка на обязательность (`required`)
  - Минимальная длина (`minLength`)
  - Содержит подстроку (`contains`)

- Валидация чисел (`NumberSchema`):
  - Проверка на обязательность (`required`)
  - Только положительные значения (`positive`)
  - Диапазон значений (`range`)

- Валидация словарей (`MapSchema`):
  - Проверка на обязательность (`required`)
  - Количество ключей (`sizeof`)
  - Валидация значений по ключам (`shape`)

## Пример валидации строк

![image](https://github.com/user-attachments/assets/f47b9a44-6619-4346-9d97-a836a1f1683c)

## Пример валидации чисел

![image](https://github.com/user-attachments/assets/bef77bb4-c3f6-42ed-ab34-5cd0b39d8826)

## Пример валидации объектов типа Map

![image](https://github.com/user-attachments/assets/e9499b12-084c-4146-b117-31a6c089872e)

## Пример вложенный валидации

![image](https://github.com/user-attachments/assets/bd61f920-3e50-4d23-8869-056324cb2104)


### Проект выполнен в рамках прохождения курса по обучению языку Java на платформе [Hexlet](https://hexlet.io/).
