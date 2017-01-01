int red = 3;
int green = 9;
int blue = 6;

int pwm = 128;

int red_pwm = 0;
int green_pwm = 0;
int blue_pwm = 0;

boolean redon = false;
boolean greenon = false;
boolean blueon = false;

void setup() {
  pinMode(red,OUTPUT);
  pinMode(green,OUTPUT);
  pinMode(blue,OUTPUT);

  Serial.begin(9600);
  Serial.flush();
}

void off() {
    analogWrite(red, 0);
    analogWrite(green, 0);
    analogWrite(blue, 0);
    boolean redon = false;
    boolean greenon = false;
    boolean blueon = false;
}

void setswitcher() {
  if (redon) {
    analogWrite(red, pwm);
  }
  else {
    analogWrite(red, 0);
  }

  if (greenon) {
    analogWrite(green, pwm);
  }
  else {
    analogWrite(green, 0);
  }

  if (blueon) {
    analogWrite(blue, pwm);
  }
  else {
    analogWrite(blue, 0);
  }
  

}
void setmixer() {
  analogWrite(red, red_pwm);
  analogWrite(green, green_pwm);
  analogWrite(blue, blue_pwm);
}

void loop() {

  String input = "";

  while (Serial.available() > 0) {
  input += (char) Serial.read();
  delay(5);
}
  
    if (input.startsWith("."))
      {
        input.replace('.', ' ');
        input.trim();
        pwm = input.toInt();
        setswitcher();
      }
    else if (input == "off"){
      off();
    }
    else if (input == "red") {
      redon = true;
      greenon = false;
      blueon = false;
      setswitcher();
    }
    else if (input == "green") {
      redon = false;
      greenon = true;
      blueon = false;
      setswitcher();
    }
    else if (input == "blue") {
      redon = false;
      greenon = false;
      blueon = true;
      setswitcher();
    }
    else if (input == "yellow") {
      redon = true;
      greenon = true;
      blueon = false;
      setswitcher();
    }
    else if (input == "pink") {
      redon = true;
      greenon = false;
      blueon = true;
      setswitcher();
    }
    else if (input == "cyan") {
      redon = false;
      greenon = true;
      blueon = true;
      setswitcher();
    }
     else if (input == "white") {
      redon = true;
      greenon = true;
      blueon = true;
      setswitcher();
    }
    else if (input.startsWith("r"))
    {
      input.replace('r', ' ');
      input.trim();
      red_pwm = input.toInt();
      setmixer();
    } 
    else if (input.startsWith("g"))
    {
      input.replace('g', ' ');
      input.trim();
      green_pwm = input.toInt();
      setmixer();
    }
    else if (input.startsWith("b"))
    {
      input.replace('b', ' ');
      input.trim();
      blue_pwm = input.toInt();
      setmixer();
    }

}
