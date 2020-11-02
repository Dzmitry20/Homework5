package academy.belhard;


import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {

       User user = new User("Dmitry", "Zl","xxxxxx@mail.ru","100500");

        System.out.println("Полное имя: ");
        System.out.println(user.getFullName());

        System.out.println();

        System.out.println("Полная информация: ");
        System.out.println(user.getFullInfo());

        System.out.println();

        System.out.println("Верный ли пороль: ");
        System.out.println(user.isPasswordCorrect("100500"));

    }
}

