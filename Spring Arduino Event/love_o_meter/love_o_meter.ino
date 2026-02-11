const int sensor_pin = A0;
const float baseline_temp = 20.0;

void setup() {
  // Serial.begin(9600);
  for(int i = 3; i < 6; i++){
      pinMode(i, OUTPUT);
      digitalWrite(i, LOW);
    }
}

void loop() {
  int sensor_val = analogRead(sensor_pin); //reading sensor

 // Serial.print("Sensor Value: \n");
 // Serial.print(sensor_val);
 // Serial.print("\n");

  float voltage = (sensor_val/1024.0) * 5.0; // calculating voltage
 // Serial.print("Voltage: \n");
 // Serial.print(voltage);
 // Serial.print("\n");

  float temperature = (voltage - .5) * 100; // calculating temperature

 // Serial.println(temperature);
 // Serial.println(" celcius\n");

// conditionals for LEDS
  if(temperature < (baseline_temp + 2)){
   for(int i = 3; i < 6; i++){
      digitalWrite(i, LOW);
      }
    }
   else if((baseline_temp + 2) <= temperature && temperature < (baseline_temp + 5)){
    digitalWrite(3, HIGH);
    digitalWrite(4, LOW);
    digitalWrite(5, LOW);
    }
   else if((baseline_temp + 5) <= temperature && temperature < (baseline_temp + 8)){
    digitalWrite(3, HIGH);
    digitalWrite(4, HIGH);
    digitalWrite(5, LOW);
    }
   else{
    digitalWrite(3, HIGH);
    digitalWrite(4, HIGH);
    digitalWrite(5, HIGH);
    }
    
   delay(1); // one millisecond delay for analog input
}
