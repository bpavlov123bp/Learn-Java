package Lesson_Variables;

//Дефинирайте с еnum вашата компания с имена IVAN, STOYAN, PETAR, MILEN, OGNYAN.
// Създайте променливи и ги отпечатайте със System.out.println()
public class EnumOurCompany {
  enum Company
  {
    IVAN,
    STOYAN,
    PETAR,
    MILEN,
    OGNYAN
  }
  public static void main(String[] args)
  {
    String name1 = String.valueOf(Company.IVAN);
    String name2 = String.valueOf(Company.STOYAN);
    String name3 = String.valueOf(Company.PETAR);
    String name4 = String.valueOf(Company.MILEN);
    String name5 = String.valueOf(Company.OGNYAN);
    System.out.println(name1);
    System.out.println(name2);
    System.out.println(name3);
    System.out.println(name4);
    System.out.println(name5);
  }
}
