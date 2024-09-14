public class App {
    public static void main(String[] args) throws Exception {
        double[] per = {0.25,0.5,0.75,1};
        GeneratorBD z = new GeneratorBD();
        z.generateDTB(per, 1000,10);  
    }
}
