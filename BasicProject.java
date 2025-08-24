import java.lang.String;
import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;

public class BasicProject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t\t\t*****Welcome to the Vamsi's Project*****\t\t\t\t\t\n");
        System.out.println("1.Basic Programs");
        System.out.println("2.Advanced Data Structures Programs");
        System.out.print("Enter your option(1-2):");
        int program = s.nextInt();
        if (program == 1) {
            System.out.println("\t\t\t\t\t*****PROGRAMS*****\t\t\t\t\t\n");
            System.out.println("1.ARRAY RELATED PROGRAMS");
            System.out.println("2.VALUE RELATED PROGRAMS");
            System.out.println("3.RECURSION RELATED PROGRAMS");
            System.out.println("4.SORTING ALGORITHMS PROGRAMS");
            System.out.println("5.SEARCHING ALGORITHMS PROGRAMS");
            int option1 = s.nextInt();
            while (option1 >= 1 && option1 <= 5) {// outer while
                switch (option1) {// outer switch
                    case 2: {
                        System.out.println("\n0:VALUE RELATED PROGRAMS INFORMATION");
                        System.out.println("1:PRINTING TWO VALUES");
                        System.out.println("2:SUM OF TWO VALUES");
                        System.out.println("3:SWAPPING OF TWO VALUES");
                        System.out.println("4:PRINT MAX OF TWO NUMBERS");
                        System.out.println("5:SUM OF N NATURAL NUMBER");
                        System.out.println("6:PRINT FROM 1 TO N");
                        System.out.println("7:PRINT ALPHABETS FROM Z TO FIRST CHAR OF YOUR NAME");
                        System.out.println("8:FACTORIAL OF A NUMBER");
                        System.out.println("-1:exit");
                        System.out.print("Enter your option:(1-8)");
                        int option2 = s.nextInt();
                        while (option2 >= 1 && option2 <= 8)// inner while
                        {
                            switch (option2) {// inner switch
                                case 0: {
                                    System.out.println("\n0:VALUE RELATED PROGRAMS INFORMATION");
                                    System.out.println("1:PRINTING TWO VALUES");
                                    System.out.println("2:SUM OF TWO VALUES");
                                    System.out.println("3:SWAPPING OF TWO VALUES");
                                    System.out.println("4:PRINT MAX OF TWO NUMBERS");
                                    System.out.println("5:SUM OF N NATURAL NUMBER");
                                    System.out.println("6:PRINT FROM 1 TO 10");
                                    System.out.println("7:PRINT ALPHABETS FROM Z TO FIRST CHAR OF YOUR NAME");
                                    System.out.println("8:FACTORIAL OF A NUMBER");
                                    break;
                                }
                                case 1: {
                                    System.out.println("\n1.PRINTING TWO VALUES\n");
                                    System.out.println("enter first value:");
                                    int a = s.nextInt();
                                    System.out.println("enter second value: ");
                                    int b = s.nextInt();
                                    UserSwitch.printValues(a, b);
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n2.SUM OF TWO VALUES");
                                    System.out.println("enter first value:");
                                    int a = s.nextInt();
                                    System.out.println("enter second value: ");
                                    int b = s.nextInt();
                                    UserSwitch.sumOfTwo(a, b);
                                    break;
                                }
                                case 3: {
                                    System.out.println("\n3.SWAPPING TWO VALUES");
                                    System.out.println("3.1:LOGIC-USING TEMPORARY VARIABLE");
                                    System.out.println("3.2:LOGIC-USING ARITHMETIC OPERATORS ADD AND SUB");
                                    System.out.println("3.3:LOGIC-USING ARITHMETIC OPERATORS MUL AND DIV");
                                    System.out.println("3.4:LOGIC-USING BITWISE OPERATORS");
                                    System.out.println("3.5:LOGIC-USING EXPRESSION");
                                    System.out.println("Enter your optin 1-5:");
                                    int option3 = s.nextInt();
                                    switch (option3) {
                                        case 1: {
                                            System.out.println("\n1.ALGORITHM-USING TEMPORARY VARIABLE");
                                            System.out.println("enter first value:");
                                            int a = s.nextInt();
                                            System.out.println("enter second value: ");
                                            int b = s.nextInt();
                                            UserSwitch.swapL1(a, b);
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("\n2.ALGORITHM-USING ARITHMETIC OPERATORS ADD AND SUB");
                                            System.out.println("enter first value:");
                                            int a = s.nextInt();
                                            System.out.println("enter second value: ");
                                            int b = s.nextInt();
                                            UserSwitch.swapL2(a, b);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("\n3.ALGORITHM-USING ARITHMETIC OPERATORS MUL AND DIV");
                                            System.out.println("enter first value:");
                                            int a = s.nextInt();
                                            System.out.println("enter second value: ");
                                            int b = s.nextInt();
                                            UserSwitch.swapL3(a, b);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("\n4.ALGORITHM-USING BITWISE OPERATORS");
                                            System.out.println("enter first value:");
                                            int a = s.nextInt();
                                            System.out.println("enter second value: ");
                                            int b = s.nextInt();
                                            UserSwitch.swapL4(a, b);
                                            break;
                                        }
                                        case 5: {
                                            System.out.println("\n5.ALGORITHM-USING EXPRESSION");
                                            System.out.println("enter first value:");
                                            int a = s.nextInt();
                                            System.out.println("enter second value: ");
                                            int b = s.nextInt();
                                            UserSwitch.swapL5(a, b);
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("\n4:PRINT MAX OF TWO NUMBERS");
                                    System.out.println("4.1:LOGIC-USING TERNARY OPERATOR");
                                    System.out.println("4.2:LOGIC-USING MAX PREDEFINED METHOD");
                                    System.out.println("Enter your optin 1/2:");
                                    int option4 = s.nextInt();
                                    switch (option4) {
                                        case 1: {
                                            System.out.println("\nLLOGIC:USING TERNARY OPERATOR");
                                            System.out.println("enter first value:");
                                            int a = s.nextInt();
                                            System.out.println("enter second value: ");
                                            int b = s.nextInt();
                                            System.out.println("Maximum value is: " + UserSwitch.maxofTwoL1(a, b));
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("\nLOGIC:USING MAX PREDEFINED METHOD");
                                            System.out.println("enter first value:");
                                            int a = s.nextInt();
                                            System.out.println("enter second value: ");
                                            int b = s.nextInt();
                                            System.out.println("Maximum value is: " + UserSwitch.maxofTwoL2(a, b));
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                case 5: {
                                    System.out.println("\n5:SUM OF N NATURAL NUMBERS");
                                    System.out.println("5.1:LOGIC-USING ITERATION");
                                    System.out.println("5.2:LOGIC-USING FORMULA");
                                    System.out.println("Enter your optin 1/2:");
                                    int option5 = s.nextInt();
                                    switch (option5) {
                                        case 1: {
                                            System.out.println("\n5.1:LOGIC-USING ITERATION");
                                            System.out.println("Enter n value:");
                                            int n = s.nextInt();
                                            System.out
                                                    .println("sum of" + n + "natural numbers:"
                                                            + UserSwitch.sumofNaturalL1(n));
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("\n5.2:LOGIC-USING FORMULA");
                                            System.out.println("Enter n value:");
                                            int n = s.nextInt();
                                            System.out
                                                    .println("sum of" + n + "natural numbers:"
                                                            + UserSwitch.sumofNaturalL2(n));
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                case 6: {
                                    System.out.println("\n6:PRINT FROM 1 TO N");
                                    System.out.println("Enter n value:");
                                    int n1 = s.nextInt();
                                    System.out.println("\n6:print from 1 to " + n1);
                                    UserSwitch.print1toN(n1);
                                    break;
                                }
                                case 7: {
                                    System.out.println("\n7:PRINT ALPHABETS FROM Z TO FIRST CHAR OF YOUR NAME");
                                    System.out.println("Enter first char of ur name:");
                                    char c = s.next().charAt(0);
                                    UserSwitch.printztochar(c);
                                    break;
                                }
                                case 8: {
                                    System.out.println("\n8:FACTORIAL OF A NUMBER");
                                    System.out.println("Enter  value:");
                                    int n = s.nextInt();
                                    System.out.println("Factorial of " + n + ":" + UserSwitch.fact(n));
                                    break;
                                }
                                default:
                                    break;
                            }
                            System.out.println("\n0:VALUE RELATED PROGRAMS INFORMATION");
                            System.out.println("1:PRINTING TWO VALUES");
                            System.out.println("2:SUM OF TWO VALUES");
                            System.out.println("3:SWAPPING OF TWO VALUES");
                            System.out.println("4:PRINT MAX OF TWO NUMBERS");
                            System.out.println("5:SUM OF N NATURAL NUMBER");
                            System.out.println("6:PRINT FROM 1 TO N");
                            System.out.println("7:PRINT ALPHABETS FROM Z TO FIRST CHAR OF YOUR NAME");
                            System.out.println("8:FACTORIAL OF A NUMBER");
                            System.out.println("-1:exit");
                            System.out.println("Enter your option:(1-8)");
                            option2 = s.nextInt();
                        }
                        break;
                    }
                    case 1: {
                        System.out.println("\n0:SWITCH CASE INFORMATION");
                        System.out.println("1:PRINT ARRAY ELEMENTS");
                        System.out.println("2:PASS AND RETURN AN ARRAY");
                        System.out.println("3:MULTIPLY ARRAY ELEMENTS WITH 2 AND PRINT");
                        System.out.println("4:PRINT SUM OF ARRAY ELEMENTS");
                        System.out.println("5:MAXIMUM ELEMENT IN AN ARRAY");
                        System.out.println("6:MINIMUM ELEMENT IN ARRAY");
                        System.out.println("7:PRINT ARRAY ELEMENTS WHICH ARE DIVISIBLE BY 2 & 3");
                        System.out.println("8:SUM OF ELEMENTS WHICH ARE GREATER THAN 80 OR EQUAL TO 40");
                        System.out.println("-1:EXIT");
                        System.out.print("Enter your option:(1-8)");
                        int option3 = s.nextInt();
                        while (option3 >= 1 && option3 <= 8) {// inner while
                            switch (option3) {// inner
                                case 0: {
                                    System.out.println("\n0:SWITCH CASE INFORMATION");
                                    System.out.println("1:PRINT ARRAY ELEMENTS");
                                    System.out.println("2:PASS AND RETURN AN ARRAY");
                                    System.out.println("3:MULTIPLY ARRAY ELEMENTS WITH 2 AND PRINT");
                                    System.out.println("4:PRINT SUM OF ARRAY ELEMENTS");
                                    System.out.println("5:MAXIMUM ELEMENT IN AN ARRAY");
                                    System.out.println("6:MINIMUM ELEMENT IN ARRAY");
                                    System.out.println("7:PRINT ARRAY ELEMENTS WHICH ARE DIVISIBLE BY 2 & 3");
                                    System.out.println("8:SUM OF ELEMENTS WHICH ARE GREATER THAN 80 OR EQUAL TO 40");
                                    System.out.println("-1:EXIT");
                                    break;
                                }
                                case 1: {
                                    System.out.println("\n1:PRINT ARRAY ELEMENTS");
                                    int arr[] = arrayRead();
                                    UserSwitch.display(arr);
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n2:PASS AND RETURN AN ARRAY");
                                    int arr[] = arrayRead();
                                    int[] arr1 = UserSwitch.returnArr(arr);
                                    System.out.println("returning an array and printing");
                                    UserSwitch.display(arr1);
                                    break;
                                }
                                case 3: {
                                    System.out.println("\n3:MULTIPLY ARRAY ELEMENTS WITH 2 AND PRINT");
                                    int arr[] = arrayRead();
                                    int[] arr1 = UserSwitch.multiplyTwo(arr);
                                    UserSwitch.display(arr1);
                                    break;
                                }
                                case 4: {
                                    System.out.println("\n4:PRINT SUM OF ARRAY ELEMENTS");
                                    int arr[] = arrayRead();
                                    System.out.println("sum:" + UserSwitch.sum(arr));
                                    break;
                                }
                                case 5: {
                                    System.out.println("\n5:MAXIMUM ELEMENT IN AN ARRAY");
                                    int arr[] = arrayRead();
                                    System.out.println("max element:" + UserSwitch.maxArray(arr));
                                    break;
                                }
                                case 6: {
                                    System.out.println("\n6:MINIMUM ELEMENT IN ARRAY");
                                    int arr[] = arrayRead();
                                    System.out.println("min element:" + UserSwitch.minArray(arr));
                                    break;
                                }
                                case 7: {
                                    System.out.println("\n7:PRINT ARRAY ELEMENTS WHICH ARE DIVISIBLE BY 2 & 3");
                                    int arr[] = arrayRead();
                                    UserSwitch.divByTwoThree(arr);
                                    break;
                                }
                                case 8: {
                                    System.out.println("\n8:SUM OF ELEMENTS WHICH ARE GREATER THAN 80 OR EQUAL TO 40");
                                    int arr[] = arrayRead();
                                    UserSwitch.greaterequal(arr);
                                    break;
                                }
                                default:
                                    break;
                            }
                            System.out.println("\n0:SWITCH CASE INFORMATION");
                            System.out.println("1:PRINT ARRAY ELEMENTS");
                            System.out.println("2:PASS AND RETURN AN ARRAY");
                            System.out.println("3:MULTIPLY ARRAY ELEMENTS WITH 2 AND PRINT");
                            System.out.println("4:PRINT SUM OF ARRAY ELEMENTS");
                            System.out.println("5:MAXIMUM ELEMENT IN AN ARRAY");
                            System.out.println("6:MINIMUM ELEMENT IN ARRAY");
                            System.out.println("7:PRINT ARRAY ELEMENTS WHICH ARE DIVISIBLE BY 2 & 3");
                            System.out.println("8:SUM OF ELEMENTS WHICH ARE GREATER THAN 80 OR EQUAL TO 40");
                            System.out.println("-1:EXIT");
                            System.out.print("Enter your option:(1-8)");
                            option3 = s.nextInt();
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("\n0:PROGRAMS INFORMATION");
                        System.out.println("1:FACTORIAL OF A NUMBER");
                        System.out.println("2:SUM OF N NATURAL NUMBERS");
                        System.out.println("3:PRINT 1-N NUMBERS");
                        System.out.println("4:PRINT Z OR z TO OUR NAME FIRST CHAR");
                        System.out.print("Enter your option:(1-4)");
                        int option4 = s.nextInt();
                        while (option4 >= 0 && option4 <= 4) {// inner while
                            switch (option4) {// inner switch
                                case 0: {
                                    System.out.println("\n0:PROGRAMS INFORMATION");
                                    System.out.println("1:FACTORIAL OF A NUMBER");
                                    System.out.println("2:SUM OF N NATURAL NUMBERS");
                                    System.out.println("3:PRINT 1-N NUMBERS");
                                    System.out.println("4:PRINT Z OR z TO OUR NAME FIRST CHAR");
                                    break;
                                }
                                case 1: {
                                    System.out.println("\n1:FACTORIAL OF A NUMBER");
                                    System.out.println("Enter a number:");
                                    int n = s.nextInt();
                                    System.out.println("Factorial of " + n + ":" + UserSwitch.recfact(n));
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n2:SUM OF N NATURAL NUMBERS");
                                    System.out.println("Enter a number:");
                                    int n = s.nextInt();
                                    System.out
                                            .println("Sum of first " + n + " natural numbers:"
                                                    + UserSwitch.recsumofNatural(n));
                                    break;
                                }
                                case 3: {
                                    System.out.println("\n3:PRINT 1-N NUMBERS");
                                    System.out.println("Enter a number:");
                                    int n = s.nextInt();
                                    UserSwitch.recprintOneToN(n);
                                    break;
                                }
                                case 4: {
                                    System.out.println("\n4:PRINT Z OR z TO OUR NAME FIRST CHAR");
                                    System.out.println("Enter first char of your name:");
                                    char c = s.next().charAt(0);
                                    System.out.println("Printing characters from z to" + c);
                                    if (c >= 'A' && c <= 'Z')
                                        UserSwitch.recprintZtoA('Z', c);
                                    else if (c >= 'a' && c <= 'z')
                                        UserSwitch.recprintztoa('z', c);
                                    else {
                                        System.out.println("Invalid character");
                                    }
                                    break;
                                }
                                default:
                                    break;
                            }
                            System.out.println("\n0:PROGRAMS INFORMATION");
                            System.out.println("1:FACTORIAL OF A NUMBER");
                            System.out.println("2:SUM OF N NATURAL NUMBERS");
                            System.out.println("3:PRINT 1-N NUMBERS");
                            System.out.println("4:PRINT Z OR z TO OUR NAME FIRST CHAR");

                            System.out.print("Enter your option:(1-4)");
                            option4 = s.nextInt();
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("\n4:SORTING ALGORITHMS PROGRAMS");
                        System.out.println("\n0:PROGRAMS INFORMATION");
                        System.out.println("1:BUBBLE SORT");
                        System.out.println("2:INSERTION SORT");
                        System.out.println("3:SELECTION SORT");
                        System.out.println("4:MERGE SORT");
                        System.out.println("5:QUICK SORT");
                        System.out.println("\n Enter your option (1-5):");
                        int bs = s.nextInt();
                        while (bs >= 0 && bs <= 5) {// inner while
                            switch (bs) {// inner switch
                                case 0: {
                                    System.out.println("\n4:SORTING ALGORITHMS PROGRAMS");
                                    System.out.println("\n0:PROGRAMS INFORMATION");
                                    System.out.println("1:BUBBLE SORT");
                                    System.out.println("2:INSERTION SORT");
                                    System.out.println("3:SELECTION SORT");
                                    System.out.println("4:MERGE SORT");
                                    System.out.println("5:QUICK SORT");
                                    break;
                                }
                                case 1: {
                                    System.out.println("\nSORTING USING BUBBLE SORT ALGORITHM");
                                    int[] arr = arrayRead();
                                    System.out.println("1.Ascending order");
                                    System.out.println("2.Descending order");
                                    int order = s.nextInt();
                                    switch (order) {
                                        case 1: {
                                            BubbleSort.ascending(arr);
                                            System.out.println("\nprinting in ascending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        case 2: {
                                            BubbleSort.descending(arr);
                                            System.out.println("\nprinting in descending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n2.SORTING USING INSERTION SORT ALGORITHM");
                                    int[] arr = arrayRead();
                                    System.out.println("1.Ascending order");
                                    System.out.println("2.Descending order");
                                    int order = s.nextInt();
                                    switch (order) {
                                        case 1: {
                                            InsertionSort.insertionAscending(arr);
                                            System.out.println("\nprinting in ascending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        case 2: {
                                            InsertionSort.insertionDescending(arr);
                                            System.out.println("\nprinting in descending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("\n3.SORTING USING SELECTION SORT ALGORITHM");
                                    int[] arr = arrayRead();
                                    System.out.println("1.Ascending order");
                                    System.out.println("2.Descending order");
                                    int order = s.nextInt();
                                    switch (order) {
                                        case 1: {
                                            SelectionSort.selectionAscending(arr);
                                            System.out.println("\nprinting in ascending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        case 2: {
                                            SelectionSort.selectionDescending(arr);
                                            System.out.println("\nprinting in descending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("\n4.SORTING USING MERGE SORT ALGORITHM");
                                    int[] arr = arrayRead();
                                    System.out.println("1.Ascending order");
                                    System.out.println("2.Descending order");
                                    int order = s.nextInt();
                                    switch (order) {
                                        case 1: {
                                            MergeSort.mergesortAscending(arr, arr.length);
                                            System.out.println("\nprinting in ascending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        case 2: {
                                            MergeSort.mergesortDescending(arr, arr.length);
                                            System.out.println("\nprinting in descending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                case 5: {
                                    System.out.println("\nSORTING USING QUICK SORT ALGORITHM");
                                    int[] arr = arrayRead();
                                    System.out.println("1.Ascending order");
                                    System.out.println("2.Descending order");
                                    int order = s.nextInt();
                                    switch (order) {
                                        case 1: {
                                            QuickSort.quickAscending(arr, 0, arr.length - 1);
                                            System.out.println("\nprinting in ascending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        case 2: {
                                            QuickSort.quickDescending(arr, 0, arr.length - 1);
                                            System.out.println("\nprinting in descending order");
                                            System.out.println(Arrays.toString(arr));
                                            break;
                                        }
                                        default:
                                            break;
                                    }
                                    break;
                                }
                                default:
                                    break;
                            }
                            System.out.println("\n4:SORTING ALGORITHMS PROGRAMS");
                            System.out.println("\n0:PROGRAMS INFORMATION");
                            System.out.println("1:BUBBLE SORT");
                            System.out.println("2:INSERTION SORT");
                            System.out.println("3:SELECTION SORT");
                            System.out.println("4:MERGE SORT");
                            System.out.println("5:QUICK SORT");
                            System.out.println("\n Enter your option (1-5):");
                            bs = s.nextInt();
                        }
                    }
                    case 5: {
                        System.out.println("\n 5:SEARCHING ALGORITHMS AND PROGRAMS");
                        System.out.println("\n0:PROGRAMS INFORMATION");
                        System.out.println("1:LINEAR SEARCH");
                        System.out.println("2:BINARY SEARCH");
                        System.out.println("\n Enter your option (0-2):");
                        int bs = s.nextInt();
                        while (bs == 1 || bs == 2) {// inner while
                            switch (bs) {// inner switch
                                case 0: {
                                    System.out.println("\n 5:SEARCHING ALGORITHMS AND PROGRAMS");
                                    System.out.println("\n0:PROGRAMS INFORMATION");
                                    System.out.println("1:LINEAR SEARCH");
                                    System.out.println("2:BINARY SEARCH");
                                    break;
                                }
                                case 1: {
                                    System.out.println("\n1.LINEAR SEARCH");
                                    int[] arr = arrayRead();
                                    System.out.println("Enter search element:");
                                    int searchele = s.nextInt();
                                    Search.linearSearch(arr, searchele);
                                    break;
                                }
                                case 2: {
                                    System.out.println("2.BINARY SEARCH");
                                    int[] arr = arrayRead();
                                    System.out.println("Enter search element:");
                                    int searchele = s.nextInt();
                                    Search.binarySearch(arr, searchele);
                                    break;
                                }
                                default:
                                    break;
                            }
                            System.out.println("\n 5:SEARCHING ALGORITHMS AND PROGRAMS");
                            System.out.println("\n0:PROGRAMS INFORMATION");
                            System.out.println("1:LINEAR SEARCH");
                            System.out.println("2:BINARY SEARCH");
                            System.out.println("\n Enter your option (0-2):");
                            bs = s.nextInt();
                        }
                    }
                    default: {
                        break;
                    }
                }
                System.out.println("\t\t\t\t\t*****PROGRAMS*****\t\t\t\t\t\n");
                System.out.println("1.ARRAY RELATED PROGRAMS");
                System.out.println("2.VALUE RELATED PROGRAMS");
                System.out.println("3.RECURSION RELATED PROGRAMS");
                System.out.println("4.SORTING ALGORITHMS PROGRAMS");
                System.out.println("5.SEARCHING ALGORITHMS PROGRAMS");
                option1 = s.nextInt();
            }
            System.out.println("\nProject Developed By VamsiAndavarapu ");
            System.out.println("system exit");
        } else {
            DataStructures.programs();
        }
        s.close();
    }

    static int[] arrayRead() {
        System.out.println("enter array size:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter" + i + "th element:");
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
}

class UserSwitch {
    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }

    static int minArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i)
                min = i;
        }
        return min;
    }

    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int[] multiplyTwo(int[] arr) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] * 2;
        }
        return temp;
    }

    static int[] returnArr(int[] arr) {
        return arr;
    }

    static int sumOfTwo(int a, int b) {
        return a + b;
    }

    static void printValues(int a, int b) {
        System.out.println("\nfirst value:" + a + " " + "\nsecond value:" + b);
    }

    static void swapL1(int a, int b) {
        System.out.println("\nSwapping using temporary variable");
        System.out.println("Before swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);

    }

    static void swapL2(int a, int b) {
        System.out.println("\nSwapping Using Arithmetic Operators Add and sub");
        System.out.println("Before swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);

    }

    static void swapL3(int a, int b) {
        System.out.println("\nUsing Arithmetic Operators Mul and Div");
        System.out.println("Before swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);

    }

    static void swapL4(int a, int b) {
        System.out.println("\nUsing Bitwise operator-XOR");
        System.out.println("Before swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);
    }

    static void swapL5(int a, int b) {
        System.out.println("\nUsing expression");
        System.out.println("Before swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);
        a = (a + b) - (b = a);
        System.out.println("After swap");
        System.out.println("First value:" + a + "\n" + "Second Value" + b);
    }

    static int maxofTwoL1(int a, int b) {
        return (a > b) ? a : b;
    }

    static int maxofTwoL2(int a, int b) {
        return Math.max(a, b);
    }

    static int sumofNaturalL1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    static int sumofNaturalL2(int n) {
        return (n * (n + 1) / 2);
    }

    static int recsumofNatural(int n) {
        if (n == 0)
            return 0;
        else
            return n + recsumofNatural(n - 1);
    }

    static void print1toN(int n1) {
        for (int i = 1; i <= n1; i++) {
            System.out.println(i + " ");
        }
    }

    static void recprintOneToN(int n) {
        if (n == 0)
            return;
        recprintOneToN(n - 1);
        System.out.print(n + " ");
    }

    static void recprintZtoA(char c, char ch) {
        if (ch == c) {
            System.out.print(c + " ");
            return;
        }
        if (c >= 'A' && c <= 'Z') {
            System.out.print(c + " ");
            recprintZtoA((char) (c - 1), ch);
        }
    }

    static void recprintztoa(char c, char ch) {
        if (ch == c) {
            System.out.print(c + " ");
            return;
        }
        if (c >= 'a' && c <= 'z') {
            System.out.print(c + " ");
            recprintztoa((char) (c - 1), ch);
        }
    }

    static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static int recfact(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * recfact(n - 1);
    }

    static void greaterequal(int[] arr) {
        System.out.println("\n8:sum of elements which are greater than 80 or equal to 40");
        for (int i : arr) {
            if (i >= 80 || i == 40) {
                System.out.print(i + " ");
            }
        }
    }

    static void divByTwoThree(int[] arr) {
        System.out.println("\n7.print array elements which are divisible by 2 & 3");
        for (int i : arr) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void printztochar(char c) {
        if ((int) c >= 65 && (int) c <= 90) {
            for (char ch = 'Z'; ch >= c; ch--) {
                System.out.print(ch + " ");
            }
        } else if ((int) c >= 97 && (int) c <= 122) {
            for (char ch = 'z'; ch >= c; ch--) {
                System.out.print(ch + " ");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}

class BubbleSort {
    static void ascending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    arr[j] = (arr[j] + arr[j + 1]) - (arr[j + 1] = arr[j]);
            }
        }
    }

    static void descending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1])
                    arr[j] = (arr[j] + arr[j + 1]) - (arr[j + 1] = arr[j]);
    }
}

class QuickSort {
    static void quickAscending(int[] arr, int lindex, int rindex) {
        if (lindex >= rindex)
            return;
        System.out.println("success");
        int pivot = arr[rindex], lp, rp;
        lp = lindex;
        rp = rindex;
        while (lp < rp) {
            System.out.println("while success");
            while (arr[lp] <= pivot && lp < rp)
                lp++;
            while (arr[rp] >= pivot && lp < rp)
                rp--;
            arr[lp] = ((arr[lp] + arr[rp]) - (arr[rp] = arr[lp]));
        }
        arr[lp] = (arr[lp] + arr[rindex]) - (arr[rindex] = arr[lp]);
        System.out.println(Arrays.toString(arr));
        quickAscending(arr, lindex, lp - 1);
        quickAscending(arr, lp + 1, rindex);
    }

    static void quickDescending(int[] arr, int lindex, int rindex) {
        if (lindex >= rindex)
            return;
        System.out.println("success");
        int pivot = arr[rindex], lp, rp;
        lp = lindex;
        rp = rindex;
        while (lp < rp) {
            System.out.println("while success");
            while (arr[lp] >= pivot && lp < rp)
                lp++;
            while (arr[rp] <= pivot && lp < rp)
                rp--;
            arr[lp] = ((arr[lp] + arr[rp]) - (arr[rp] = arr[lp]));
        }
        arr[lp] = (arr[lp] + arr[rindex]) - (arr[rindex] = arr[lp]);
        System.out.println(Arrays.toString(arr));
        quickDescending(arr, lindex, lp - 1);
        quickDescending(arr, lp + 1, rindex);
    }
}

class SelectionSort {
    static void selectionAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            arr[i] = (arr[i] + arr[min]) - (arr[min] = arr[i]);
        }
    }

    static void selectionDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j])
                    max = j;
            }
            arr[i] = (arr[i] + arr[max]) - (arr[max] = arr[i]);
        }
    }
}

class InsertionSort {
    static void insertionAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void insertionDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}

class MergeSort {
    static void mergesortAscending(int[] arr, int n) {
        if (n < 2)
            return;
        int i, mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (i = 0; i < mid; i++)
            l[i] = arr[i];
        for (i = mid; i < n; i++)
            r[i - mid] = arr[i];
        mergesortAscending(l, mid);
        mergesortAscending(r, n - mid);
        merge(arr, l, r, mid, n - mid);
    }

    static void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[i])
                arr[k++] = l[i++];
            else
                arr[k++] = r[j++];
        }
        while (i < left)
            arr[k++] = l[i++];
        while (j < right)
            arr[k++] = r[j++];
    }

    static void mergesortDescending(int[] arr, int n) {
        if (n < 2)
            return;
        int i, mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (i = 0; i < mid; i++)
            l[i] = arr[i];
        for (i = mid; i < n; i++)
            r[i - mid] = arr[i];
        mergesortDescending(l, mid);
        mergesortDescending(r, n - mid);
        mergeDesc(arr, l, r, mid, n - mid);
    }

    static void mergeDesc(int[] arr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] >= r[i])
                arr[k++] = l[i++];
            else
                arr[k++] = r[j++];
        }
        while (i < left)
            arr[k++] = l[i++];
        while (j < right)
            arr[k++] = r[j++];
    }
}

class Search {
    static void linearSearch(int[] arr, int searchele) {
        System.out.println("Searching using linear search algorithm...");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchele) {
                System.out.println("Element found at index:" + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    static void binarySearch(int[] arr, int searchele) {
        System.out.println("Searching using binary search algorithm...");
        Arrays.sort(arr);
        int low = 0, high = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchele) {
                System.out.println("Element found at index:" + mid);
                return;
            }
            if (arr[mid] < searchele)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Element not found");
    }
}