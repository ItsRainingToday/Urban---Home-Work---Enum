public class Human {
    String name;
    int age;
    Gender gender;
    public Human (String name, int age,Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender.getGender() +
                '}';
    }

    enum Gender{
        MAN("Мужчина"),
        WOMAN("Женщина");
        private String gender;
        Gender(String gender){
            this.gender = gender;
        }
        public String getGender(){
            return gender;
        }

    }
}
