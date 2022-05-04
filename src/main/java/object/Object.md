## Object 
### HashCode
> **Note:** Bu obyektni maydonlarini unikal qiymatlariga utkazish yo'li bilan birga unikalligini saqlab qolishda ishlatiladi ammo default holarda heap hotiradagi o'rnini generatsiya qiladi.Odatda yaxshi tajriba sifatida  quyidagi kod orqali tub son (prime ) 31 tanlanadi Joshua Bloch ning 'Effective Java ' kitobidan bu son yuqori ko'rsatkish bilan tanlangan
.
```java
      @Override
      public int hashCode() {
        int result = this.getBirthDate().hashCode();
        result = 31 * result + this.getFirstName().hashCode();
        result = 31 * result + this.getLastName().hashCode();
        return result;
        }
```
## Equals 
>Bu obyektlarni tengligini tekshirish uchun ishlatiladi.Default holatda
 ```java
    @Override
    public boolean equals(Object obj) {
      return this == obj;
    }
 ```

Ko'p hollarda quyidagi kod ko'rinishida aks etadi kontraktlarni hisobga olsak:
*** 
an object must equal itself n
x.equals(y) must return the same result as y.equals(x)
x.equals(y) and y.equals(z) then also x.equals(z)
the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)

```java
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.getBirthDate().equals(user.getBirthDate()) && this.getFirstName().equals(user.getFirstName()) && this.getLastName().equals(user.getLastName());
    }
> ```

