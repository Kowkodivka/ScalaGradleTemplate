# Scala Gradle Template

Шаблон для проектов на Scala с системой сборки Gradle <br>

## Компиляция

Gradle может потребоваться до нескольких минут для загрузки файлов. <br>
После сборки выходной jar-файл должен находиться в каталоге `/build/libs/*.jar`.

Сначала убедитесь, что у вас установлен JDK 19. Откройте терминал в каталоге проекта и выполните следующие команды:

### Windows

_Jar:_ `gradlew jar` <br>
_Shadow Jar:_ `gradlew shadowJar`

### Linux/Mac OS

_Jar:_ `./gradlew jar` <br>
_Shadow Jar:_ `./gradlew shadowJar`

### Устранение неполадок

#### Permission Denied

Если терминал выдает `Permission denied` или `Command not found` на Mac/Linux, выполните `chmod +x ./gradlew` перед
запуском `./gradlew`. *Это одноразовая процедура.*

Если терминал не находит команду gradlew на Windows, добавьте перед командой префикс `.\`.