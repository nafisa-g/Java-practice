import javax.xml.transform.Source;

public class Makka {
    public static void main(String[] args) {
    List<Integer> nums =new ArrayList<Integer>();
        nums.add(3);
        nums.add(31);
        nums.add(32);
        nums.add(33);
        nums.add(34);

        for(Object n  : nums)
        {
            int num =(Integer)n;
            System.out.println(num*1);
        }

    }

}
