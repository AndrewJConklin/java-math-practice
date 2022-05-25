public class MathApp {
  public static void main(String[] args) {
    int job1Salary = 40000;
    int job2Salary = 45000;
    int maxSalary = Math.max(job1Salary, job2Salary);
    System.out.println(maxSalary);

    int carPrice = 15000;
    int truckPrice = 25000;
    int minPrice = Math.min(carPrice, truckPrice);
    System.out.println(minPrice);

    double radius = 7.25;
    double circleArea = Math.PI * radius * radius;
    System.out.println(circleArea);

    double num1 = 5.0;
    double squareRoot = Math.sqrt(num1);
    System.out.println(squareRoot);

    double point1x = 5;
    double point1y = 10;
    double point2x = 85;
    double point2y = 50;
    double distance = Math.hypot((point2y - point1y), (point2x - point1x));
    System.out.println(distance);

    double num2 = -3.8;
    double absolute = Math.abs(num2);
    System.out.println(absolute);

    double random = Math.random();
    System.out.println(random);
  }

}
