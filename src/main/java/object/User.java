package object;/* 
 @author: Javohir
  Date: 5/5/2022
  Time: 12:55 AM*/

import java.time.LocalDate;

public class User implements Cloneable {
    private LocalDate birthDate;
    private String firstName;
    private Integer id;
    private String lastName;

    /**
     * Example creation object like Prototype pattern
     * @return {@code User}
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new User(this.getBirthDate(),this.getId(), this.getFirstName(), this.getLastName());
    }

    public User(LocalDate birthDate,Integer id, String firstName, String lastName) {
        this.birthDate = birthDate;
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
   public String toString() {
        return "User{" +
                "birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        int result = this.getBirthDate().hashCode();
        result = 31 * result + this.getFirstName().hashCode();
        result = 31 * result + this.getLastName().hashCode();
        result = 31 * result + this.getId().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.getBirthDate().equals(user.getBirthDate())
                && this.getFirstName().equals(user.getFirstName())
                && this.getLastName().equals(user.getLastName())
                && this.getId().equals(user.getId());
    }
}
