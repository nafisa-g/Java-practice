import java.util.ArrayList;

public class Sam {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(20);

        System.out.println("Element at index 0"  +nums.get(0));

        System.out.println("Elements");
        for(int i:nums)
        {
            System.out.println(i);
        }

        nums.remove(1);
        for(int i:nums)
        {
            System.out.println(i);
        }
    }
}
