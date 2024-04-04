public class overloadedMethodChallenge
{
    public static double convertToCentimeters(int inches)
    {
//         my code:
//        double cm = inches * 2.54;
//         return cm;
        return inches * 2.54;

    }
    public static double  convertToCentimeters(int feet, int inches) // double was changed from int //
    {
//        my code: //
//        convertToCentimeters(inches);
//        feet *= 12;
//        int totalInches = feet + inches;
//        return totalInches;

        // method 1:
        return convertToCentimeters((feet*12) + inches);

    }
   public static void main(String[] args)
   {
//       double z = convertToCentimeters(106);
//       int a = convertToCentimeters(5,8);
        System.out.println("5ft 8in = "+convertToCentimeters(5,8)+ "cm");
        System.out.println("68in = "+convertToCentimeters(68)+ "cm");

   }
}
