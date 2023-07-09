public class Author {

    public String name;

    public String gender;

    public String mail;

    public Author(String name, String gender, String mail){
        this.name = name;
        this.gender = gender;
        this.mail = mail;
    }

    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getMail() { return mail; }

    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setMail(String mail) { this.mail = mail; }

    public String toString() {
        return name + " " + gender + " " + mail;
    }

}
