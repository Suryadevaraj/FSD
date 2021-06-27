package com.dell.fsd.LockedMe;

import com.dell.fsd.LockedMe.screens.WelcomeScreen;

public class VirtualKeyApplication {

    public static void main(String[] args) {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}
