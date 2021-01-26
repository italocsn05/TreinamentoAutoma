package Common;

import com.github.javafaker.Faker;

public class DataFaker {
    private Faker faker;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String confirmPassword;
    private String adress;
    private String profile;
    private String job;

    public DataFaker() {
        this.faker = new Faker();
        this.setFirstName(faker.name().firstName());
        this.setLastName(faker.name().lastName());
        this.setEmail(faker.internet().emailAddress());
        this.setTelephone(faker.phoneNumber().cellPhone());
        this.setPassword(faker.internet().password());
        this.setConfirmPassword(this.getPassword());
        this.setAdress(faker.address().cityName());
        this.setProfile(faker.educator().campus());
        this.setJob(faker.job().position());
    }


    public String getJob() {
        return job;
    }

    public Faker getFaker() {
        return faker;
    }

    public void setFaker(Faker faker) {
        this.faker = faker;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getAdress() {
        return adress;
    }

    public String getProfile() {
        return profile;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
