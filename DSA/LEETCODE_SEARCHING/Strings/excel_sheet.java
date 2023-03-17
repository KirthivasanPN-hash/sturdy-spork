package Strings;

public class excel_sheet {

    public static void convertToTitle(int columnNumber) {

        StringBuilder output = new StringBuilder();

        while(columnNumber > 0){

            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');

            columnNumber /= 26;

            output.append(c);
        }

        output.reverse();

        System.out.println(output.toString());
    }
    public static void main(String[] args) {
        int column_number   = 701;
        convertToTitle(column_number);
        }
    }


