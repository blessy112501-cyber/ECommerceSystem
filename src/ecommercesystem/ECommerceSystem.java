/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;
import java.util.*;

/**
 *
 * @author bless
 */
public class ECommerceSystem {
       static void buyProduct(int productId, int quantity,
                           int stock, double payment)
            throws InvalidProductException,
                   InvalidQuantityException,
                   InsufficientStockException,
                   PaymentException {

        if (productId <= 0)
            throw new InvalidProductException("Invalid product ID");

        if (quantity <= 0)
            throw new InvalidQuantityException("Invalid quantity");

        if (quantity > stock)
            throw new InsufficientStockException(
                    "Insufficient stock");

        if (payment <= 0)
            throw new PaymentException("Invalid payment amount");

        System.out.println("Order placed successfully");
        System.out.println("Payment successful");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product ID: ");
            int id = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter available stock: ");
            int stock = sc.nextInt();

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            buyProduct(id, quantity, stock, payment);

        } catch (InvalidProductException |
                 InvalidQuantityException |
                 InsufficientStockException |
                 PaymentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
        // TODO code application logic here
    
    

