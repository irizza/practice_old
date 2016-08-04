package practice1;


import sa.sf;

public class SimpleDataLoopsUtilsTest {
    public static void main(String[] args) {

        SimpleDataLoopsUtils.printVariables();

        System.out.println("dwa");
        int a = 10;
        int b = 30;
        int c = 5;
        System.out.println("Triangle with sides " + a +" "+ b + " " + c +" " + "is");
        SimpleDataLoopsUtils.checkTriangle(a,b,c);

        SimpleDataLoopsUtils.initFloatVariables();
        SimpleDataLoopsUtils.shortTypeCheck();
        SimpleDataLoopsUtils.Srednee(a,b,c);
        SimpleDataLoopsUtils.sumArg(a,b,c);


    }
}
