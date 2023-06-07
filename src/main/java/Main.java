public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Василий";
        post.patronymic = "Сметанкович";
        post.surname = "Мурлыкин";
        post.birthday.day = 12;
        post.birthday.month = 6;
        post.birthday.year = 1996;
        post.phone = "+7(907)524-36-98";
        post.passport = "4587 №662074";
        post.subscription = true;
    }
}
