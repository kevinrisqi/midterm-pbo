package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class MidtermTest {

	public static void main(String[] args) {
		Item item = new Item("Gula", 10000, 2); //Mengisi nilai pada atribut name, price, amount ke class Item
		DiscountItem discountItem = new DiscountItem("Susu", 10000, 2, 0.05f); // Mengisi nilai pada atribut name, price, amount, discountItem ke class DiscountItem
		PromoItem promoItem = new PromoItem("Kopi", 10000, 2, 2000); // Mengisi nilai pada atribut name, price, amount, promo ke class PromoItem

		Transaction transaction = new Transaction(item, discountItem, promoItem); // Mengisi nilai dari class Item, DiscountItem, PromoItem ke class Transaction
		transaction.print(); // Memanggil method print pada class transaction untuk menampilkan outputnya
	}
}
