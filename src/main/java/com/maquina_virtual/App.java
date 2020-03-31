package com.maquina_virtual;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class App 
{
    public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("C:\\out\\programa.csv")); // TO-DO deixar dinâmico o path
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

        List<String[]> programa = csvReader.readAll();
        Comandos comando = new Comandos();
        for (String[] str : programa){
            comando.setListComando(new Comandos(str[0],str[1],str[2]));
        }

        for (Comandos comando2 : comando.getListComando()) {
            System.out.println(comando2);
        }
    }
}
