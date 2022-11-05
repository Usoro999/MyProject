package Tests;

public class Work {
    public static void main(String[] args) {
        String headerText = "Ваш заказ #16365 сформирован!";
        String numberOfOrder = headerText.substring(11, 17);
        System.out.println(numberOfOrder);
    }
}
