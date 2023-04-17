import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        // 创建用户输入的数组
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("请输入5个元素（以空格分隔）: ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);//字符串转为整数
        }
        int temp = 0;//辅助交换
        //bubblesort
        for(int i=0;i<arr.length-1;i++) { //外层循环循环length-次
        	for(int j=0;j<arr.length-1-i;j++) {//内层循环循环外层减i次
        		if(arr[j] > arr[j+1]) {
        			temp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = temp;  //交换值
        		}
        	}
        }
        for(int i =0;i<arr.length;i++) 
        {
        System.out.print(arr[i]+" ");//输出在同一行 以空格分离
        
        }
}
}
