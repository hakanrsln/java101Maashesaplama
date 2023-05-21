public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double raiseSalary;

    double taxBonustotal;

    double total;

    double tax;

    double bonus;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax() {
    /* tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
     Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
     Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.*/
        if (this.salary <= 1000) {
            tax= 0;
        } else {
            tax= salary * 0.03;
        }

    }

    void bonus() {
        /*Eğer çalışan haftada 40 saatten fazla çalışmış ise
        fazladan çalıştığı her saat başına 30 TL olacak şekilde
        bonus ücretleri hesaplayacaktır.*/

        if (this.workHours > 40) {
            int extraHours = workHours - 40;
            bonus= extraHours * 30;
        } else {
            bonus= 0;
        }

    }

    void raiseSalary() {
        /*Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.*/
        int yearsOfWork = 2021 - this.hireYear;

        if (yearsOfWork < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (yearsOfWork < 20) {
            this.raiseSalary = this.salary * 0.10;
        } else {
            this.raiseSalary = this.salary * 0.15;
        }


    }

    void printInfo() {
        //Çalışana ait bilgileri ekrana bastıracaktır.
        /*Adı : kemal  +
        Maaşı : 2000.0  +
        Çalışma Saati : 45  +
        Başlangıç Yılı : 1985  +
        Vergi : 60.0  +
        Bonus : 150.0  +
        Maaş Artışı : 300.0  +
        Vergi ve Bonuslar ile birlikte maaş : 2090.0
        taxBonustotal
        Toplam Maaş : 2300.0*/
        tax();
        bonus();
        raiseSalary();

        this.taxBonustotal = (this.salary - this.tax) + this.bonus;
        this.total = this.taxBonustotal + this.raiseSalary;

        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma Saati: " + this.workHours);
        System.out.println("Baslangic Yili: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maas Artisi: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maas: " + this.taxBonustotal);
        System.out.println("Toplam Maas: " + this.total);
        System.out.println("=======================================");
    }

}
