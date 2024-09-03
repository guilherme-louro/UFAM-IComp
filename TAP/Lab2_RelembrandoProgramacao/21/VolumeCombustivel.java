import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tank_height = scan.nextDouble();
        double tank_level = scan.nextDouble();
        double radius = scan.nextDouble();

        double tank_volumn = 0;
		double cylinder_height = tank_height - 2 * radius;
		
		if (tank_level >= 0 && tank_level <= tank_height) {
			if (tank_level > (cylinder_height + radius)){
				double x = tank_height - tank_level;
				double sphere_volumn = ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
				double bulge_volumn = sphere_volumn - (Math.PI / 3.0) * Math.pow(x, 2) * (3 * radius - x);
				double cilinder_volumn = Math.PI * Math.pow(radius, 2) * cylinder_height;
				
				tank_volumn = bulge_volumn + cilinder_volumn;
			}
			else if (tank_level > radius && tank_level <= (cylinder_height + radius)) {
				double cilinder_volumn = Math.PI * Math.pow(radius, 2) * (tank_level - radius);
				double bulge_volumn = 0.5 * ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
				
				tank_volumn = bulge_volumn + cilinder_volumn;
			}
			else if (tank_level >= 0 && tank_level <= radius) {
				double lower_bulge_volumn = (Math.PI / 3.0) * Math.pow(tank_level, 2) * (3 * radius - tank_level);
				
				tank_volumn = lower_bulge_volumn;
			}
		}
		else {
			tank_volumn = -1;
		}
		System.out.printf("%.3f", tank_volumn);
    }
}
