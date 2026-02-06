/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoabao_6936;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gamet
 */
public abstract class Book implements IBook {

    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;

    public Book() {
    }

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void addBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter book id: ");
            setBookId(scanner.nextLine());
            System.out.print("Enter publisher: ");
            setPublisher(scanner.nextLine());
            System.out.print("Enter price: ");
            setUnitPrice(scanner.nextDouble());
            System.out.print("Enter quantity: ");
            setQuantity(scanner.nextDouble());
            scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter entryDate: ");
            String entryDateString = scanner.nextLine();
            setEntryDate(sdf.parse(entryDateString));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public void updateBook(String id) {
        if (this.bookId.equals(id)) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter publisher: ");
                setPublisher(scanner.nextLine());
                System.out.print("Enter price: ");
                setUnitPrice(scanner.nextDouble());
                System.out.print("Enter quantity: ");
                setQuantity(scanner.nextDouble());
                scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Enter entryDate: ");
                String entryDateString = scanner.nextLine();
                setEntryDate(sdf.parse(entryDateString));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }

    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getBookId() + ", publisher: " + getPublisher() + ",entryDate: " + sdf.format(entryDate) + ", unitPrice: " + getUnitPrice() + ", quantity: " + getQuantity());
    }
}
