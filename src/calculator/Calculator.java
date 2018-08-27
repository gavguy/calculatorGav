package calculator;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {

        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);
        System.out.println(expression[3]);
        System.out.println(expression[4]);
        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);
        double c = Double.parseDouble(expression[4]);

        double result;


        if (expression.length < 4) {/// если меньше 4 символов вели, то 2 числа считаем, если нет ...
            switch (expression[1]) {
                case "+":
                    result = a + b;
                    break;
                case "-":                    /// с одним знаком число выведено
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }
        }
        if (expression[3] = "*" || "/") {  ///если 4-ый символ * или /, то переключаю и считаю.....
///// как перевести что-то с клавиатуры в символ и чтобы можно былобы сравненить это?
            switch (expression[3]) {
                case "*+":
                    result = b * c + a;
                    break;
                case "/+":
                    result = b / c + a;
                    break;
                case "*-": 
                    result = b * c - a;
                    break;
                case "/-":
                    result = b / c - a;
                    break;
            }
        } else {
            ///... или считаю по порядку , первое переключение

            switch (expression[1]) {
                case "*+":
                    result = a * b + c;
                    break;
                case "/+":
                    result = a / b + c;
                    break;
                case "*-":
                    result = a * b - c;
                    break;
                case "/-":
                    result = a / b + c;
                    break; }


            }

            return String.valueOf(result);
        }

    }
}
