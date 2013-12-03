package edu.neumont.csc130;

public class MotorController {
  
  private NXTMotor coinSlotMotor;
  private NXTMotor doorMotor;
  private final int insertPower = 40;
  private final int returnPower = 100;
  private final int doorPower = 20;


public MotorController(){
    coinSlotMotor = new NXTMotor(MotorPort.A);
    doorMotor = new NXTMotor(MotorPort.B);
}

public void insertCoin(){
   coinSlotMotor.setPower(insertPower);
   coinSlotMotor.forward();
   try{
     Thread.sleep(1000);
   }
   coinSlotMotor.stop();
}

public void returnCoin(){
  coinSlotMotor.setPower(returnPower);
  coinSlotMotor.backward();
  try{
    Thread.sleep(1000);
  }
  coinSlotMotor.stop;
}

public void releaseCoins(){
  doorMotor.setPower(doorPower);
  doorMotor.forward();
  try{
    Thread.sleep(2000);
  }
  doorMotor.setPower(doorPower);
  doorMotor.backward();
  try{
    Thread.sleep(2000);
  }
  doorMotor.stop();
}

}
