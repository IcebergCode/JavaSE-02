package cn.itcast.day02.demo03;
//2、静态初始化（指定内容）：在创建数组的时候，不直接指定数据个数多少，而是将具体的数据内容进行指定
//静态初始化标准格式：数据类型[] 数据名称 = new 数据类型[] {元素1, 元素2, ...};
//静态初始化省略格式：数据类型[] 数据名称 = {元素1, 元素2, ...};
//注意事项：
//1、静态初始化没有直接指定长度，但是仍然会自动推算得到长度
//2、静态初始化标准格式可以初始化维两个步骤
//3、动态初始化也可以拆分成为两个步骤
//4、静态初始化一旦使用省略格式，就不能拆分称为两个步骤了
//使用建议：如果不确定数组当中的内容，使用动态初始化；否则，已经确定了数组当中的内容，用静态初始化
public class Demo03Array {
    public static void main(String[] args) {
        //省略格式的静态初始化
        int[] arrayA = {1, 2, 3, 4, 5, 6};

        //将标准静态初始化拆分为两个步骤
        int[] arrayB;
        arrayB = new int[] {1, 2, 3, 4, 5};

        //动态初始化也可以拆分为两个步骤
        int[] arrayC;
        arrayC = new int[5];

        //静态初始化的省略格式不能拆分成两个步骤
//        int[] arrayD;
//        arrayD = {1, 2, 3, 4, 5};

    }

}
