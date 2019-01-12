package concepts;

 class MountainBike extends Inheritance {
	 //the MountainBike subclass adds one more field
	 public int seatHeight;
	 //the MountainBike subclass has one constructor
	 public MountainBike(int gear, int speed, int startHeight) {
	//invoking base-class(Inheritance) constructor
		 super(gear, speed);
		 seatHeight = startHeight;
	 }
	 //the MountainBike subclass adds one more method
	 public void setHeight(int newValue) {
		 seatHeight = newValue;
		 }
	 //overriding toString() method of Inheritance to print more info
	 @Override
	 public String toString() {
		 return(super.toString()+ "\n seat height is "+ seatHeight);
	 }
	 
}
