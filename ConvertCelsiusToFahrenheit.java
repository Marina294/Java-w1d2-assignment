// (Convert Celsius to Fahrenheit) Write a program that 
// reads a Celsius degree in a double value from the console, 
// then converts it to Fahrenheit and displays the result. 
// The formula for the conversion is as follows:
//          fahrenheit = (9 / 5) * celsius + 32
// Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

public class ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {
        float fahrenheit, celsius;
        celsius = 20;
        fahrenheit = ((celsius * 9 / 5) + 32);
        System.out.println("Fahrenheit is " + fahrenheit);

    }
}







// function cToF(celsius) 
// {
//   let cTemp = celsius;
//   let cToFahr = cTemp * 9 / 5 + 32;
//   let message = cTemp+'\xB0C is ' + cToFahr + ' \xB0F.';
//     console.log(message);
// }

// function fToC(fahrenheit) 
// {
//   let fTemp = fahrenheit;
//   let fToCel = (fTemp - 32) * 5 / 9;
//   let message = fTemp+'\xB0F is ' + fToCel + '\xB0C.';
//     console.log(message);
// } 
// cToF(41);
// fToC(32);