# LED Controller
This program controls RGB LED lights connected to an Arduino from a PC application.

<b>Setup</b>

Connect an Arduino to your PC with a USB cable and RGB LED lights to the Arduino's pins. By default, the Arduino is connected on COM3 and lights are connected to the following pins: red on pin 3, green on pin 9, and blue on pin 6. These can be changed in the Java applicaton and the Arduino sketch respectively, however will require recompiling the programs.

<b>Usage</b>

<img src = "http://i.imgur.com/tzjIVkn.gif">

The program features color selectors for primary and secondary colors alongside a color mixer allowing for almost any color. Color brightness can also be controlled. The lights will remain on its last setting even after you close the program. The settings will reset if the Arduino looses power, if you relaunch the program, or if serial communication is in any other way interrupted.

<b>Credits</b>

SerialClass is modified from <a href = "http://theelectronicist.blogspot.com/2015/02/java-to-arduino-communications-on-linux.html">Jeremy Dunne<a>
