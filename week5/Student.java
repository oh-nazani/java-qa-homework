package week5;

public class Student {
    String firstName;
    String email;
    int age;

    public void setFirstName(String firstName) {
        boolean check = true;
        if (firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'Z') {
            for(int i = 1; i < firstName.length(); i++) {
                if(!(firstName.charAt(i) >= 'a' && firstName.charAt(i) <= 'z')) {
                    check = false;
                    break;
                }
            }
            if (check){
                this.firstName = firstName;
            }
        }
        else {
            System.out.println("Wrong input.");
        }
    }
}
