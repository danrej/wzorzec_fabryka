package main;

import computer.Computer;
import computer.impl.ComputerA;
import computer.impl.ComputerB;
import graphics.GraphicsCard;
import graphics.impl.GraphicsCardImpl;
import processor.Processor;
import processor.impl.ProcessorImpl;
import ram.Ram;
import ram.impl.RamImpl;

public class main {

	public static void main(String[] args) {
		
		Computer mobile = new Computer("Mobile", new ComputerA());
		System.out.println(mobile.getInformation());

		System.out.println("");

		Computer desktop = new Computer("Desktop", new ComputerB());
		System.out.println(desktop.getInformation());
	}

}
