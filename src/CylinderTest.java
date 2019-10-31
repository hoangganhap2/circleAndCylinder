public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder+ "Volume = "+cylinder.getVolume());

        cylinder = new Cylinder(2.2,3.5,"red",true);
        System.out.println(cylinder+" Volume = "+cylinder.getVolume());
    }
}
