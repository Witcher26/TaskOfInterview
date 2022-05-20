package Home_Task_Netology.TwelveИсключения.ПроверкаДоступаКресурсу;

public class User {
    private static int allId=0;
    private int id;
    private String login;
    private String password;
    private int age;
    private String email;

    public User(String login, String password, int age, String email) {
        this.id = allId++;
        this.login = login;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
