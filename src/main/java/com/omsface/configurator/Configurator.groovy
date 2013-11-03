package com.omsface.configurator

import java.nio.charset.Charset

import com.googlecode.lanterna.TerminalFacade
import com.googlecode.lanterna.gui.GUIScreen
import com.googlecode.lanterna.screen.Screen
import com.googlecode.lanterna.terminal.Terminal

class Configurator {

    static main(args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        Screen screen = new Screen(terminal);
        GUIScreen textGUI = new GUIScreen(screen);
        if(textGUI == null) {
            System.err.println("Couldn't allocate a terminal!");
            return;
        }
        textGUI.getScreen().startScreen();
        textGUI.setTitle("GUI Test");
    
        //Do GUI logic here
    
        //textGUI.getScreen().stopScreen();
    }

}