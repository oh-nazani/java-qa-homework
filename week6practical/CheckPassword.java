package week6practical;
// երկարություն- 10-ից ոչ պակաս, պետք է պարունակի @ || ! || *, մինիմում թվերի քանակ- 2

public class CheckPassword {
    public static boolean isValidPassword(String password){
        if(password.length() >= 10) {
            int countOfDigits = 0;
            int countOfSymbols = 0;

            for (int i = 0; i < password.length(); i++) {
                if(Character.isDigit(password.charAt(i))){
                    countOfDigits++;
                }
                else if(password.charAt(i) == '@' || password.charAt(i) == '1' || password.charAt(i)== '*'){
                    countOfSymbols++;
                }
            }
            if(countOfDigits>=2 && countOfSymbols>=2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("abc1efdjhh"));
    }
}
