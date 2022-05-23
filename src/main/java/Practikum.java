public class Practikum {

    public static void main(String[] args) {
        Account account = new Account("Elena Nataeva");

        boolean isNameAllowed = account.checkNameToEmboss();

        System.out.println(isNameAllowed ? "The name is allowed." : "The name is NOT allowed");
    }
}
