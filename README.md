# LED Controller
This program controls RGB LED lights connected to an Arduino from a PC application.

<b>Setup</b>

Connect an Arduino to your PC with a USB cable and RGB LED lights to the Arduino's pins. By default, the Arduino is connected on COM3 and lights are connected to the following pins: red on pin 3, green on pin 9, and blue on pin 6. These can be changed in the Java applicaton and the Arduino sketch respectively, however will require recompiling the programs.

<b>Usage</b>

<img src = "http://i.imgur.com/tzjIVkn.gif">

The program features color selectors for primary and secondary colors alongside a color mixer allowing for almost any color. Color brightness can also be controlled. The lights will remain on its last setting even after you close the program. The settings will reset if the Arduino looses power, if you relaunch the program, or if serial communication is in any other way interrupted.

<b>Commands</b>

These are the commands send by the Java application. They can also be sent manually using the serial monitor in the Arduino IDE.

Command | Description
--------|------------
red | Turns on only red lights
green | Turns on only green lights
blue | Turns on only blue lights
yellow | Turns on only red and green lights
pink | Turns on only red and blue lights
cyan | Turns on only green and blue lights
white | Turns on all lights
off | Turns off all lights
.### (0-255) | Sets PWM (brightness) of lights enabled by keyword (for color selector)
r### (0-255) | Sets PWM (brightness) of red lights (for color mixer)
g### (0-255) | Sets PWM (brightness) of green lights (for color mixer)
b### (0-255) | Sets PWM (brightness) of blue lights (for color mixer)

<b>Credits</b>

SerialClass is modified from <a href = "http://theelectronicist.blogspot.com/2015/02/java-to-arduino-communications-on-linux.html">Jeremy Dunne<a>
