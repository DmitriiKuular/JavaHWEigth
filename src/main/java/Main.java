public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 11;
        post.birthday.month = 11;
        post.birthday.year = 1999;

        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
