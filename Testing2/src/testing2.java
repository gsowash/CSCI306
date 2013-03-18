
public class testing2 {
	
	public static int[] shiftLeft(int[] nums) 
	{
		int[] shifted = new int [nums.length];
		shifted[0]=nums[nums.length-1];
		for (int i=1; i<nums.length; i++)
		{
			shifted[i]=nums[i-1];
		}
		return shifted;
	}
	
	public static void main(String[] args)
	{
		int[] blah = {12, 17, 23};
		int[] shift;
		shift = shiftLeft(blah);
		System.out.println(shift);
	}
}