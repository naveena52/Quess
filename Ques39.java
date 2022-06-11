package Day5_3_06;

import java.util.Scanner;

public class Ques39 {


    class InvalidPasswordException extends Exception {
        int passwordinvalid = 0;

        public InvalidPasswordException(int invalid) {
            super("Invalid Password");
            passwordinvalid = invalid;

        }

        public String printMessage() {
            switch (passwordinvalid) {

                case 1:
                    return ("username length " + " between 6 to 15 characters");
                case 2:
                    return ("Username have  " + " first letter in  one uppercase letter(A-Z)");
                case 3:
                    return ("Password range should be " + " from 8 to 256 ");
                case 4:
                    return ("Username should not" + " contain any space or parentheses");
                case 5:
                    return ("Password should not" + " contain any space or parentheses");
                case 6:
                    return ("username and password should be different!!!!!!! ");
            }
            return ("");
        }
    }
}