package tasksweeks1_to_3;

import java.util.Scanner;

public class AndroidVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String version = input.nextLine();
        String result="";
        /*### Android is one of the popular mobile operating systems. The versions in android systems follow names related to sweets. You will need to take the given `version` value to output the name of the current version. Use the follow chart to determine the versions:
#### Note: The `version` will be given as a `String`

**Versions**
> - 1.5 - Cupcake
> - 1.6 - Donut
> - 2.1 - Eclair
> - 2.2 - Froyo
> - 2.3 - Gingerbread
> - 3.1 - Honeycomb
> - 4.0 - Ice Cream Sandwich
> - 4.1 - Jelly Bean
> - 4.4 - KitKat
> - 5.0 - Lollipop
> - 8.0 - Oreo
> - 9.0 - Pie
> - Any other number is invalid and should display: Not a valid version
*/
        switch(version){
            case "1.5":
                result="Cupcake";
                break;
            case "1.6":
                result="Donut";
                break;
            case "2.1":
                result="Eclair";
                break;
            case "2.2":
                result="Froyo";
                break;
            case "4.0":
                result="Ice Cream Sandwich";
                break;
            case "4.1":
                result="Jelly Bean";
                break;
            case "4.4":
                result="KitKat";
                break;
            case "5.0":
                result="Lollipop";
                break;
            case "8.0":
                result="Oreo";
                break;
            case "9.0":
                result="Pie";
                break;
            case "2.3":
                result="Gingerbread";
                break;

                case "3.1":
                    result="Honeycomb";
                    break;
                default:
                    result="Not a valid version";

            }
            System.out.println(result);


        }












        /*
#### Note: Its possible to use if statements to complete this,
but use switch statement for practice. Or for even more practice,
complete the task twice, once using each different conditional statement.

Main topics: switch statements, primitive variables, Scanner

Examples:
```
Ex:
  Input:
    1.5

  Output:
    Cupcake
```
```
Ex:
  Input:
    9.0

  Output:
    Pie
```
```
Ex:
  Input:
    11.0

  Output:
    Not a valid version
```
char color='r';

		switch(color) {
		case 'R':case 'r':
			System.out.println("Red Light");
			break;
		case 'O':case 'o':
			System.out.println("Orange Light");
			break;
		case 'G':case 'g':
			System.out.println("Green Light");
			break;
		default:
			System.out.println("Invalid Light");

		}*/
    }

