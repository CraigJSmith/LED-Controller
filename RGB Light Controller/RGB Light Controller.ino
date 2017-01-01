int red = 3;
int green = 9;
int blue = 6;

int pwm = 128;

int redPWM;
int greenPWM;
int bluePWM;

boolean redon;
boolean greenon;
boolean blueon;

void setup()
{
    pinMode(red,OUTPUT);
    pinMode(green,OUTPUT);
    pinMode(blue,OUTPUT);
    
    analogWrite(red, redPWM);
    analogWrite(green, greenPWM);
    analogWrite(blue, bluePWM);

    analogWrite(13, LOW); //Turns off unnecessary Arduino light

    Serial.begin(9600);
    Serial.flush();

    redon = false;
    greenon = false;
    blueon = false;

}

void loop()
{
  String input = "";

  while (Serial.available() > 0) {
    input += (char) Serial.read();
    delay(5);
  }

  if (input == "red") {
    redon = true;
    greenon = false;
    blueon = false;
  }
  else if (input == "green") {
    redon = false;
    greenon = true;
    blueon = false;
  }
  else if (input == "blue") {
    redon = false;
    greenon = false;
    blueon = true;
  }
  else if (input == "yellow") {
    redon = true;
    greenon = true;
    blueon = false;
  }
  else if (input == "pink") {
    redon = true;
    greenon = false;
    blueon = true;
  }
  else if (input == "cyan") {
    redon = false;
    greenon = true;
    blueon = true;
  }
  else if (input == "white") {
    redon = true;
    greenon = true;
    blueon = true;
  }
  else if (input == "off") {
    redon = false;
    greenon = false;
    blueon = false;
  }
  else {
  }

  if (input == "off") {
    redon = false;
    greenon = false;
    blueon = false;

    analogWrite(red, 0);
    analogWrite(green, 0);
    analogWrite(blue, 0);
  }
  
  if (input.startsWith("."))
  {
    input.replace('.', ' ');
    input.trim();
    pwm = input.toInt();

    if (redon) {
      analogWrite(red, pwm);
    }
    else {
    }
    
    if (greenon) {
      analogWrite(green, pwm);
    }
    else {
    }

    if (blueon) {
      analogWrite(blue, pwm);
    }
    else {
    }

  }

  if (input.startsWith("r"))
  {
    input.replace('r', ' ');
    input.trim();
    redPWM = input.toInt();
    analogWrite(red, redPWM);
  }
  else {
  }

  if (input.startsWith("g"))
  {
    input.replace('g', ' ');
    input.trim();
    greenPWM = input.toInt();
    analogWrite(green, greenPWM);
  }
  else {
  }

 if (input.startsWith("b"))
  {
    input.replace('b', ' ');
    input.trim();
    bluePWM = input.toInt();
    analogWrite(blue, bluePWM);
    blueon = true;
  }
  else {
  }
  
}
