package com.sasha.SE_03.Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Александра on 23.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_03\\Task3\\text.html";
        //String fileName = "6 и Шесть пионных трубок (Рис. 4) расположены в «шубе» нейтрона седьмая пионная трубка расположена в центре коллапсара – керне нейтрона. Вокруг седьмого пиона – керна нейтрона, индуцированы 6 (шесть) полных коллапсарных нанотрубок – полных трубок магнетонов коллапсара-нейтрона (протона), на рисунке 4 показаны шестиконечными звёздами и буквами «П». &nbsp;На «поверхности» нейтрона, между трубками пионов в шубе нейтрона, расположены шесть неполных нанотрубок – неполных трубок магнетонов, на рисунке 4 показаны буквами «Н».";
        String contents = readUsingFiles(fileName);
        //System.out.println(contents);

        Pattern pattern = Pattern.compile("[А-Я]([^.!?]+(\\([Рр]ис\\. (\\d+)[^)]*\\)))+[^.!?]*[.!?]");
        Matcher matcher = pattern.matcher(contents);
        //Matcher matcher = pattern.matcher(fileName);
        int index = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        while(matcher.find()) {
            System.out.println("found: " + ++index + " " + matcher.group());
            numbers.add(new Integer(matcher.group(3)));
        }
        System.out.println("====================================");
        int first = numbers.get(0);
        for (Integer number : numbers) {
            if(number==first | number==(first+1))
                first=number;
            else {
                System.out.println("All bad! The author refers inconsistently");
                break;
            }
        }

    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
