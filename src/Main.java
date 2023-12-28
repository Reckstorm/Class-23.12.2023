//import java.io.IOException;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task 1
//        System.out.printf("\"Your time is limited, \n\tso don’t waste it \n\t\tliving someone else’s life\" \n\t\t\tSteve Jobs");

//        Task 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter num:");
//        int a = scanner.nextInt();
//        System.out.println("Enter percent:");
//        int b = scanner.nextInt();
//        System.out.println("Percent of the num is: " + String.valueOf(a * b / 100));

//        Task 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first num:");
//        int a = scanner.nextInt();
//        System.out.println("Enter second num:");
//        int b = scanner.nextInt();
//        System.out.println("Enter third num:");
//        int c = scanner.nextInt();
//        System.out.println(String.valueOf(a) + String.valueOf(b) + String.valueOf(c));

//        Task 4
//        Scanner scanner = new Scanner(System.in);
//        String a = null;
//        char [] arr = new char[]{};
//        do {
//            if (a != null) System.out.println("Invalid num");
//            System.out.println("Enter num:");
//            a = scanner.nextLine();
//        }while(!a.matches("[0-9]{6}"));
//        arr = a.toCharArray();
//        char t = arr[0];
//        arr[0] = arr[5];
//        arr[5] = t;
//        t = arr[1];
//        arr[1] = arr[4];
//        arr[4] = t;
//        System.out.println(String.valueOf(arr));

//        Task 5
//        Scanner scanner = new Scanner(System.in);
//        int a = 0;
//        System.out.println("Enter month num:");
//        a = scanner.nextInt();
//        if (a == 1 || a == 2 || a == 12) System.out.println("Winter");
//        else if (a == 3 || a == 4 || a == 5) System.out.println("Spring");
//        else if (a == 6 || a == 7 || a == 8) System.out.println("Summer");
//        else if (a == 9 || a == 10 || a == 11) System.out.println("Autumn");
//        else System.out.println("Invalid num");

//        Task 6
//        Scanner scanner = new Scanner(System.in);
//        String a = null;
//        int control = 0;
//        do {
//            if (a != null) System.out.println("Invalid num");
//            System.out.println("Enter meters num:");
//            a = scanner.nextLine();
//        } while(!a.matches("[0-9]+"));
//        do {
//            System.out.println("Pick what to convert into");
//            System.out.println("1 - Miles");
//            System.out.println("2 - Inches");
//            System.out.println("3 - Yards");
//            System.out.println("4 - Exit");
//            control = scanner.nextInt();
//            if (control == 1){
//                System.out.println(String.valueOf(a) + " meters is " + String.valueOf(Integer.parseInt(a) * 0.0006213689) + " miles");
//            } else if (control == 2) {
//                System.out.println(String.valueOf(a) + " meters is " + String.valueOf(Integer.parseInt(a) * 39.37007874) + " inches");
//            } else if (control == 3) {
//                System.out.println(String.valueOf(a) + " meters is " + String.valueOf(Integer.parseInt(a) * 1.0936132983) + " yards");
//            } else if (control == 4) {
//                break;
//            } else {
//                System.out.println("Invalid command");
//            }
//        } while(control != 4);

//        Task 7
//        Scanner scanner = new Scanner(System.in);
//        String a = null;
//        String b = null;
//        int control = 0;
//        do {
//            System.out.println("Hello! Pick an action:");
//            System.out.println("1 - Start counting");
//            System.out.println("2 - Exit");
//            control = Integer.parseInt(scanner.nextLine());
//            if (control == 1){
//                do {
//                    if (a != null) System.out.println("Invalid 'a' num");
//                    System.out.println("Enter first num");
//                    a = scanner.nextLine();
//                } while(!a.matches("[0-9]+"));
//                do {
//                    if (b != null) System.out.println("Invalid 'b' num");
//                    System.out.println("Enter second num");
//                    b = scanner.nextLine();
//                } while(!b.matches("[0-9]+"));
//                int intA = Integer.parseInt(a);
//                int intB = Integer.parseInt(b);
//                if (intA > intB){
//                    int t = intB;
//                    intB = intA;
//                    intA = t;
//                }
//                if (intA % 2 == 0) intA++;
//                System.out.println("All of the odd values are: ");
//                for (int i = intA; i <= intB; i+=2)
//                {
//                    System.out.println(String.valueOf(i));
//                }
//            }
//        }while(control != 2);

//        Task 8
//        Scanner scanner = new Scanner(System.in);
//        String a = null;
//        String b = null;
//        int control = 0;
//        do {
//            System.out.println("Hello! Pick an action:");
//            System.out.println("1 - Start multiplying");
//            System.out.println("2 - Exit");
//            control = Integer.parseInt(scanner.nextLine());
//            if (control == 1){
//                do {
//                    if (a != null) System.out.println("Invalid 'a' num");
//                    System.out.println("Enter first num");
//                    a = scanner.nextLine();
//                } while(!a.matches("[0-9]+"));
//                do {
//                    if (b != null) System.out.println("Invalid 'b' num");
//                    System.out.println("Enter second num");
//                    b = scanner.nextLine();
//                } while(!b.matches("[0-9]+"));
//                int intA = Integer.parseInt(a);
//                int intB = Integer.parseInt(b);
//                if (intA > intB){
//                    int t = intB;
//                    intB = intA;
//                    intA = t;
//                }
//                for (int i = intA; i <= intB; i++)
//                {
//                    System.out.print("Multiplying " + String.valueOf(i) + ": ");
//                    for (int j = 1; j <= 10; j++)
//                    {
//                        System.out.print(String.valueOf(i) + " * " + String.valueOf(j) + " = " + String.valueOf(i * j) + "\t");
//                    }
//                    System.out.print("\n");
//                }
//            }
//            System.out.print("\n");
//        }while(control != 2);

//        Task 9
//        Scanner scanner = new Scanner(System.in);
//        String a = null;
//        int control = 0;
//        Random rand = new Random();
//        int [] arr;
//        do {
//            System.out.println("Hello! Pick an action:");
//            System.out.println("1 - Start program");
//            System.out.println("2 - Exit");
//            control = Integer.parseInt(scanner.nextLine());
//            if (control == 1){
//                do {
//                    if (a != null) System.out.println("Invalid size");
//                    System.out.println("Enter array size");
//                    a = scanner.nextLine();
//                } while(!a.matches("[0-9]+"));
//                int intA = Integer.parseInt(a);
//                arr = new int[intA];
//                int min = 0;
//                int max = 0;
//                int negatives = 0;
//                int positives = 0;
//                int zeros = 0;
//                for (int i = 0; i < intA; i++)
//                {
//                    arr[i] = rand.nextInt(-100, 100);
//                    if (i == 0){
//                        min = arr[i];
//                        max = arr[i];
//                    }
//                    if (arr[i] < min) min = arr[i];
//                    if (arr[i] > max) max = arr[i];
//                    if (arr[i] < 0) negatives++;
//                    else if (arr[i] > 0) positives++;
//                    else zeros++;
//                }
//                System.out.println("Results: ");
//                System.out.println("Min element: " + String.valueOf(min));
//                System.out.println("Max element: " + String.valueOf(max));
//                System.out.println("Negatives: " + String.valueOf(negatives));
//                System.out.println("Positives: " + String.valueOf(positives));
//                System.out.println("Zeros: " + String.valueOf(zeros));
//            }
//            System.out.print("\n");
//        }while(control != 2);

//        Task 10
//        Scanner scanner = new Scanner(System.in);
//        String a = null;
//        int control = 0;
//        Random rand = new Random();
//        do {
//            System.out.println("Hello! Pick an action:");
//            System.out.println("1 - Start program");
//            System.out.println("2 - Exit");
//            control = Integer.parseInt(scanner.nextLine());
//            if (control == 1){
//                do {
//                    if (a != null) System.out.println("Invalid size");
//                    System.out.println("Enter array size");
//                    a = scanner.nextLine();
//                } while(!a.matches("[0-9]+"));
//                int intA = Integer.parseInt(a);
//                ArrayList<Integer> arr = new ArrayList<Integer>(intA);
//                ArrayList<Integer> evens = new ArrayList<Integer>();
//                ArrayList<Integer> odds = new ArrayList<Integer>();
//                ArrayList<Integer> negatives = new ArrayList<Integer>();
//                ArrayList<Integer> positives = new ArrayList<Integer>();
//                for (int i = 0; i < intA; i++)
//                {
//                    arr.add(rand.nextInt(-100, 100));
//                    if (arr.get(i) % 2 == 0) evens.add(arr.get(i));
//                    else odds.add(arr.get(i));
//                    if (arr.get(i) < 0) negatives.add(arr.get(i));
//                    else positives.add(arr.get(i));
//                }
//                System.out.println("Results: ");
//                PrintArrayList(evens, "Even");
//                PrintArrayList(odds, "Odd");
//                PrintArrayList(negatives, "Negative");
//                PrintArrayList(positives, "Positive");
//            }
//            System.out.print("\n");
//        }while(control != 2);

//        Task 11
//        Scanner scanner = new Scanner(System.in);
//        int control = 0;
//        do {
//            String len = null;
//            String ch = null;
//            String dir = null;
//            System.out.println("Hello! Pick an action:\n1 - Start program\n2 - Exit");
//            control = Integer.parseInt(scanner.nextLine());
//            if (control == 1){
//                do {
//                    if (len != null) System.out.println("Invalid length");
//                    System.out.println("Enter line length");
//                    len = scanner.nextLine();
//                } while(!len.matches("[0-9]+"));
//                int intLen = Integer.parseInt(len);
//
//                do {
//                    if (ch != null) System.out.println("Invalid char");
//                    System.out.println("Enter char to use");
//                    ch = scanner.nextLine();
//                } while(!ch.matches("[a-zA-Z0-9!@#$%^&*()-]"));
//
//                do {
//                    if (dir != null) System.out.println("Invalid direction");
//                    System.out.println("Enter direction for the line:\n1 - Horizontal\n2 - Vertical");
//                    dir = scanner.nextLine();
//                } while(!dir.matches("[12]"));
//                int intDir = Integer.parseInt(dir);
//                PrintCustomLine(intLen, ch.charAt(0), intDir);
//            }
//            System.out.print("\n");
//        }while(control != 2);

//        Task 12
        Scanner scanner = new Scanner(System.in);
        int control = 0;
        do {
            String len = null;
            String dir = null;
            Random rand = new Random();
            System.out.println("Hello! Pick an action:\n1 - Start program\n2 - Exit");
            control = Integer.parseInt(scanner.nextLine());
            if (control == 1) {
                do {
                    if (len != null) System.out.println("Invalid size");
                    System.out.println("Enter array size");
                    len = scanner.nextLine();
                } while (!len.matches("[0-9]+"));
                int intLen = Integer.parseInt(len);
                int[] arr = new int[intLen];

                do {
                    if (dir != null) System.out.println("Invalid direction");
                    System.out.println("Choose sorting direction:\n1 - Ascending\n2 - Descending");
                    dir = scanner.nextLine();
                } while (!dir.matches("[12]"));
                int intDir = Integer.parseInt(dir);

                for (int i = 0; i < intLen; i++) {
                    arr[i] = rand.nextInt(-100, 100);
                }

                arr = SortArr(arr, intDir);
                System.out.print("Sorted array: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(String.valueOf(arr[i] + " "));
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        } while (control != 2);
    }

    public static int[] SortArr(int[] arr, int dir) {
        if (dir == 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
        }
        return arr;
    }

    public static void PrintCustomLine(int length, char ch, int dir) {
        if (dir == 1) {
            for (int i = 0; i < length; i++) {
                System.out.print(ch);
            }
            System.out.print("\n");
        } else {
            for (int i = 0; i < length; i++) {
                System.out.println(ch);
            }
        }
    }

    public static void PrintArrayList(ArrayList<Integer> list, String s) {
        System.out.print(s + " array values: ");
        for (Integer num : list) {
            System.out.print(String.valueOf(num) + " ");
        }
        System.out.print("\n");
    }
}


