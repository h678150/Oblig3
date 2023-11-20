package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;


import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
            File f = new File(filnavn);
            if (f.createNewFile()) {
                System.out.println("Fil opretta" + f.getName());
                return true;
            }

            else {
                System.out.println("Fila eksisterer allerede");
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }


    }
		
}