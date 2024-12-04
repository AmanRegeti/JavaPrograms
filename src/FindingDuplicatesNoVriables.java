public class FindingDuplicatesNoVriables {
    public static void main(String[] args)
    {
        boolean dupFound = false;
        int[] a = {1, 2, 2, 3, 4, 5, 3, 4, 1};
        for (int i = 0; i < a.length ; i++)
        {
            for (int j = i+1; j < a.length ; j++)
            {
                if (a[i] == a[j])
                {
                    dupFound = true;

                        break;
                    }

                }
            if(dupFound)
            {
                System.out.println("Yes, there are duplicates");
                break;
            }


            }

        }
    }

