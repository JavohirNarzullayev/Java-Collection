package object;/* 
 @author: Javohir
  Date: 5/5/2022
  Time: 12:55 AM*/

import java.time.LocalDate;

public class User implements Cloneable {
    private LocalDate birthDate;
    private String firstName;
    private String lastName;

    /**
     * Example creation object like Prototype pattern
     * @return {@code User}
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new User(this.getBirthDate(), this.getFirstName(), this.getLastName());
    }

    public User(LocalDate birthDate, String firstName, String lastName) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    @Override
    public String toString() {
        return "User{" +
                "birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = this.getBirthDate().hashCode();
        result = 31 * result + this.getFirstName().hashCode();
        result = 31 * result + this.getLastName().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.getBirthDate().equals(user.getBirthDate()) && this.getFirstName().equals(user.getFirstName()) && this.getLastName().equals(user.getLastName());
    }
}
