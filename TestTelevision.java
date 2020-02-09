import java.util.*;
class Television
{
	double width;
	double height;
	double screenSize;
	int maxVolume;
	int volume;
	boolean power;
	
	double channelTuning(int channel){
		switch(channel)
		{
		case 1:
		return 34.56;
		case 2:
		return 54.89;
		case 3:
		return 73.89;
		case 4:
		return 94.98;
		}
		return 0;
	}
	void powerSwitch(){
	this.power=!power;
	}
	Television(double width,double height,double screenSize,int maxVolume){
	this.width=width;
	this.height=height;
	this.screenSize=screenSize;
	this.maxVolume=maxVolume;
	}
	int increaseVolume(){
	if(maxVolume>volume)
	volume++;
	return volume;
	}
	int decreaseVolume(){
	if(0<volume)
	volume--;
	return volume;
	}
	void showSpecification(){
		System.out.println("***Television***");
		System.out.println("Company is Samsumg");
		System.out.println("Width ="+width);
		System.out.println("Height ="+height);
		System.out.println("Maximum Volume ="+maxVolume);
		System.out.println("Color is black");
		}
}
class TestTelevision{
	public static void main(String args[]){
	Television television=new Television(10.5,7,9,100);
	
	television.powerSwitch();
	System.out.println("You are watching channel_2 and frequency= "+television.channelTuning(2));
	System.out.println("Increase volume= "+television.increaseVolume());
	System.out.println("Decrease volume= "+television.decreaseVolume());
	television.showSpecification();
	}
}