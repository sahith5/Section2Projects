public class LogicalFun {
    public static void main(String[] args) {

        boolean isRaining=true;
        boolean iswarm=true;
        boolean combined;
        combined= (isRaining && iswarm);
        System.out.println("israining and iswarm"+combined);
        combined= (isRaining || iswarm);
        System.out.println("israining and iswarm"+combined);
        boolean notraining= !isRaining;
        System.out.println("israining and iswarm"+notraining);
        isRaining=false;
        iswarm=false;
        combined= (isRaining && iswarm);
        System.out.println("israining and iswarm"+combined);
        combined= (isRaining || iswarm);
        System.out.println("israining and iswarm"+combined);
         notraining= !isRaining;
        System.out.println("israining and iswarm"+notraining);

        isRaining=true;
        iswarm=false;


        combined= (isRaining && iswarm);
        System.out.println("israining and iswarm"+combined);
        combined= (isRaining || iswarm);
        System.out.println("israining and iswarm"+combined);
         notraining= !isRaining;
        System.out.println("israining and iswarm"+notraining);

        isRaining=false;
        iswarm=true;

        combined= (isRaining && iswarm);
        System.out.println("israining and iswarm"+combined);
        combined= (isRaining || iswarm);
        System.out.println("israining and booleaniswarm"+combined);
         notraining= !isRaining;
        System.out.println("israining and iswarm"+notraining);



    }

}
