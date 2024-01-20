package application;

import entities.Product;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\teste\\test.csv";
        Scanner sc = null;
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String arquivo = scanner.nextLine();
                String[] product = arquivo.split(",");

                String name = product[0];
                double value = Double.parseDouble(product[1]);
                double quantity = Double.parseDouble(product[2]);

                Product produto = new Product(name, value, quantity);
                products.add(produto);
            }
            } catch(FileNotFoundException e){
                e.printStackTrace();
            }

        new File("C:\\teste\\out").mkdirs();
        String outputPath = "C:\\teste\\out\\summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            for (Product product : products) {
                bw.write(product.getName() + "," + String.format("%.2f",product.totalValue()));
                bw.newLine();
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
