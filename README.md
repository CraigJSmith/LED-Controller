# RGBcontroller_Client
This is a Java application created using NetBeans for controlling an RGB LED strip using an Arduino connected over a serial connection. It requires the
<a href = "https://github.com/CraigJSmith/RGBcontroller_Arduino">Arduino Sketch</a> to function. The program is currently in a
working, but not complete state.

<b>Setup</b>

To use this on your own PC, you will need to connect your Arduino using a USB cable. Depending on your configuration, you
might also need to change the port name in SerialClass on line 16.

<b>Usage</b>

<img src = "http://i.imgur.com/IEnkQ3S.png">

Select your desired color by clicking on the button coresponding to the color. You can use the slider to adjust the PWM setting (brightness).
By default it is at 128. The LEDs will remain on its last setting even after you close the program. The settings will reset if the Arduino looses
power or if you relaunch the program.

<b>Credits</b>

SerialClass is modified from <a href = "http://theelectronicist.blogspot.com/2015/02/java-to-arduino-communications-on-linux.html">Jeremy Dunne's Code<a>

<a href = "http://rxtx.qbang.org/wiki/index.php/Main_Page">RXTX</a> is used for interfacing with the serial connection
