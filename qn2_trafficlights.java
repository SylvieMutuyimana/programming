import java.util.ArrayList;
import java.util.Scanner;

public class qn2_trafficlights {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		Scanner user_input = new Scanner(System.in);
		System.out.println("cars in traffic" + cars);
		String[] traffic_lights = {"Red", "Yellow", "Green"};
		System.out.print("Traffic lights: ");
		for (int i = 0; i < traffic_lights.length; i++) {
			if(i==1 || i == 2){System.out.print(", ");}
			System.out.print(traffic_lights[i]);}
		float time_milli = 20000;
		float time_seconds = time_milli / 1000;
		System.out.printf("%nEach light has " + time_seconds + " seconds");
		int alg = 0;
		int car_id = 0;
		while (alg == 0){
			for (int i = 0; i < traffic_lights.length; i++) {
				if(i==0){System.out.printf("%n RED %n %n");}
				if(i==1){System.out.printf("%n YELLOW %n %n");}
				if(i==2){System.out.printf("%n GREEN %n %n");}
				long start_time_constant; long end_time_constant;
				float time_passed; float count_down; float new_countdown;
				count_down = time_milli;
				start_time_constant = System.currentTimeMillis();
				end_time_constant = System.currentTimeMillis();
				time_passed = end_time_constant - start_time_constant;
				new_countdown = count_down - time_passed;
				System.out.println("Start countdown: " + (new_countdown/1000)+ " seconds");
				while(new_countdown > 0){
					if (i==1 || i==2){
		            	if (cars.size()>0){
		            		for (int leave = 0; leave < 2; leave++) {
		            			System.out.println(cars.get(0) + " has left the quee");
		            			cars.remove(0);}
		            	}
		            }
					if (i==1 || i==2){
						if (cars.size()==0){
							System.out.println("There are no more cars in traffic");
							alg = alg + 1;
							System.exit(1);
						}
					}
					end_time_constant = System.currentTimeMillis();
					time_passed = end_time_constant - start_time_constant;
					new_countdown = count_down - time_passed;
					System.out.println("Countdown: " + (int)(new_countdown/1000));

					System.out.printf("How many cars are approaching?"); String choic = user_input.next();
		     		try{
		     			int choice = Integer.parseInt(choic);
						if (i==1 || i==2){if (cars.size()>0){for (int leave = 0; leave < 2; leave++) {
							System.out.println(cars.get(0) + " has left the quee");cars.remove(0);}}
						}
		     			for (int car = 1; car <= choice; car++) {
		     				if(cars.size()<100){car_id = car_id + 1; String car_n = "Car No " + car_id; cars.add(car_n);
		     				System.out.println(car_n + " has joined the quee");
				        	}
		     				else{System.out.println("The maximum number of cars have reached. Car should stay where it is.");					
		     			    	if (i==1 || i==2){if (cars.size()>0){for (int leave = 0; leave < 2; leave++) {
		     				    	System.out.println(cars.get(0) + " has left the quee");cars.remove(0);}}}
		     			    }
		     			}
						System.out.println("Number of cars in traffic: " + cars.size());  	
			        }catch (Exception e) {System.out.println("Choose correctly, only integers");}
					if (i==1 || i==2){
		            	if (cars.size()>0){
		            		for (int leave = 0; leave < 2; leave++) {
		            			System.out.println(cars.get(0) + " has left the quee");
		            			cars.remove(0);}}
		            }
			        System.out.println("There are " + cars.size() + " cars in traffic");
					end_time_constant = System.currentTimeMillis();
					time_passed = end_time_constant - start_time_constant;
					new_countdown = count_down - time_passed;	
					if (new_countdown<=0){
						System.out.printf("%n  Countdown: " + 0);
						System.out.printf(", Next Light %n");
					}
					if (i==1 || i==2){
		            	if (cars.size()>0){
		            		for (int leave = 0; leave < 2; leave++) {
		            			System.out.println(cars.get(0) + " has left the quee");
		            			cars.remove(0);}
		            	}
		            }
				}
			}
		}
	}
}
