# job4j_elementary
## Проект содержит решения блока "Базовый синтаксис" курса Job4j
* Класс Calculator относится к уроку "3. Арифметические операции" Темы "Тип данных"
* Класс ArgMethod относится к уроку "4.1. Аргументы" Темы "Тип данных"
* Класс MathFunc относится к уроку "4.2. Результат работы метода" Темы "Тип данных"
* Класс Converter относится к уроку "5. Конвертер валюты" Темы "Тип данных"
* Класс Fit относится к уроку "6. Идеальный вес " Темы "Тип данных"
* Класс Point относится к уроку "7. Расстояние между точками в системе координат" Темы "Тип данных"
* Класс SqArea относится к уроку "8. Стороны прямоугольника " Темы "Тип данных"
* Класс TrgArea относится к уроку "9. Площадь треугольника" Темы "Тип данных"
* Класс Greeting относится к уроку "9.1. String" Темы "Тип данных"
* В класс Converter добавлено тестирование реализованных в нём методов. Урок "0. Что такое тестирование [#159431]".
Тема "1.1.3. Тестирование"
* Класс ConverterTest используется для тестирования реализованных в классе Converter методов
* Пакет ru.job4j.math содержит класс MathFunction 
* Класс MathCalculator, использует методы класса ru.job4j.math.MathFunction
* Класс ru.job4j.condition.X2 реализует метод для вычисления функции квадратного трёхчлена.
Класс X2Test используется для тестирования методов класса ru.job4j.condition.X2
* Класс FitTest используется для тестирования методов, реализованных в классе ru.job4j.calculator.Fit
* Класс PointTest используется для тестирования методов, реализованных в классе ru.job4j.condition.Point
* Класс SqAreaTest используется для тестирования методов, реализованных в классе ru.job4j.condition.SqArea
* Класс ru.job4j.condition.Liken выводит в консоль результаты логического сравнения двух переменных
* Класс ru.job4j.condition.AlertDivByZero выводит в консоль сообщение если параметр вызываемого метода равен 0 
или меньше 0
* Класс ru.job4j.condition.Cinema проверяет возраст посетителя кино и выводит соответствующее сообщение в консоль
* Класс ru.job4j.condition.Game проверяет название игры и выводит соответствующее сообщение в консоль
* Класс ru.job4j.condition.DummyBot проверяет передаваемую в метод answer строку и выводит в консоль соответствующий 
ответ.
* Класс ru.job4j.condition.Max выводит в консоль максимальное из 3 чисел, для сравнения используя тернарное выражение.
* Класс MaxTest используется для тестирования реализованных в лассе ru.job4j.condition.Max методов.
* Класс ru.job4j.condition.Games проверяет на истинность параметры реализованного в нем метода и выводит 
соотвтетствующее сообщение в консоль.
* Класс ru.job4j.condition.Club проверяет является ли истиной хотя бы один из параметров реализованного метода и 
выводит в консоль соответствующее сообщение.
* Класс ru.job4j.condition.LogicNot проверяет параметры, передаваемые в реализованные в классе методы, на соответствие
описанным в методах условиям, и выводит в консоль соответствующее сообщение (true или false).  
* Класс ru.job4j.condition.PointEq выводит в консоль сообщение true или false если соответствующие координаты точек, 
сравнивваемые в реализованном методе, равны.
* Класс ru.job4j.condition.Triangle проверяет значения сторон треугольника и на основании этого определяет
может ли существовать такой треугольник, и выводит в консоль сообщение true или false.
* Класс ru.job4j.condition.ChessBoard выводит в консоль количество ходов шахматной фигуры "Слон"
* Класс ru.job4j.condition.DivideBySix проверяет делится ли число на 6 и выводит соответствующее сообщение в консоль.
* Класс ru.job4j.condition.ThreeMax сравнивает между собой 3 числа и возвращает максимальное.
* Класс ru.job4j.condition.SwitchWeek возвращает название дня недели, соответствующее его порядковому номеру.
* Класс ru.job4j.condition.MultipleSwitchWeek возвращает порядковый номер соответствующего дня недели.
* Класс ru.job4j.loop.LoopFor выводит в консоль числа от 5 до 10 используя цикл for.
* Класс ru.job4j.loop.Counter подсчитывает сумму всех чисел из диаппазона чисел, начало и конец которого передаются
в качестве параметров в метод, реализованный в данном классе. Метод sumByEven возвращает сумму всех чётных чисел 
в диаппазоне.
* Класс ru.job4j.loop.Factorial вычисляет и возвращает значение факториала для передаваемого методу данного класса
в качестве параметра натурального положительного числа.