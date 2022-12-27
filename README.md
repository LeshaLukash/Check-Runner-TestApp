# CheckRunner: a Java app that can create a store cash receipts, output them onto console and save them in a txt-file

+ OC: Windows 10
+ Текстовый редактор: Notepad++
+ Сборщик проекта: Gradle 7.5
+ Версия JDK: 17.0.5 

Приложение нужно собрать, для чего в консоли откройте папку с проектом и введите gradlew build

Инструкция по запуску (вариант А):
1. В консоли перейдите в "Check-Runner-TestApp\app\build\classes\java\main",
2. Введите java CheckRunner args

Инструкция по запуску (вариант B):
1. Открыв в консоли папку с проектом, введите gradlew run --args = "args" //в кавычках
2. Если текст некорректно выводится на экран, добавьте в систему системную переменную GRADLE_OPTS со значением -Dfile.encoding=utf-8
3. (Windows) Также убедитесь, что в консоли установлена кодировка UTF-8 (устанавливается введением в консоль chcp 65501)

args - набор параметров в форме "число-число" (товар) или "card-число" (скидочная карта)
Например: java CheckRunner 10-5 8-12 card-0451

Что реализовано:
* Принятие списка аргументов, как товаров так и карт скидочных — приложение *работает* с последней предъяявленной картой
* Вывод чека списка покупок на экране
* Обработка исключений
* Сохранение чека списка покупок в txt-Файл (по умолчанию на диск D:/check.txt)

Что предстоит реализовать:
* Форматированный вывод чека в текстовый файл
* Обработку скидочной карты (наложение скидки на все товары)
* Скидочные товары (при их определённом количестве итоговая стоимость уменьшается)
* БД товаров и скидочных карт принимать из txt-Файлов, подаваемых при старте программы
* Реализовать БД на одной из вариации SQL
* Написать тест-юниты
