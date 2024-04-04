public class DecimalComparator 
{
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2)
    {
        int n1D = (int) (n1 * 1000);
        int n2D = (int) (n2 * 1000);
        if (n1D == n2D)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
