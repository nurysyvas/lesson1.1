package yrt;

public class Main {
    public static void main(String args[]) throws RadiusExseption {

        Circle[] ar = new Circle[10];
        float eps = 0.01f;
        for (int i=0 ; i<ar.length; i++){
            float x =((float) (( Math.random() * 4)));
            int y =(int) (Math.random() * 4);
            int R =(int) (Math.random() * 8);
            Circle circle = new Circle(x,y,R);
            ar[i] = circle;
            ar[i].getR();
            ar[i].S();

        }
        summScircl(ar);

        double k = ((ar[1].getY()-ar[0].getY())/(ar[1].getX()-ar[0].getX()));
        double b = ar[0].getY()-k * ar[0].getX();

            for (Circle i : ar){
                    if (Math.abs(i.getY() - k * i.getX()-b) < eps){

                    System.out.println("centers of circles coincide");
                }else {
                    System.out.println("centers of circles not coincide");
                }
            }
    }
    private static void summScircl(Circle[] ar){
        float summS = 0;
        for (Circle i : ar){
              summS += i.S();
        }
        System.out.println(summS);
    }
}

