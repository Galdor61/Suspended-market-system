import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to the Suspended Market ");
		LinkedList list = new LinkedList();
		list.addIndex(0, 00000);
		list.addIndex(1, 34567);
		list.addIndex(2, 45678);
		list.addIndex(3, 56789);
		list.addIndex(4, 98765);
		list.addIndex(5, 87654);
		list.addIndex(6, 76543);
		list.addIndex(7, 65432);
		list.addIndex(8, 54321);
		list.addIndex(9, 67823);
		list.addIndex(10, 98323);
		list.addIndex(11, 10000);
		System.out.println("Product range and amount in our stock : ");
		System.out.println(list.getSize() - 1);
		System.out.println("! Please do not enter more than the amounts of products! ");
		System.out.println("Choose a category from the menu: ");
		System.out.println("1--> FOOD");
		System.out.println("2--> CLEANING");
		System.out.println("3--> DRINKS");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		BST bst = new BST();
		if (a == 1) {  
			System.out.println("Choose a food from the menu: ");
			bst.insert("1--> macaroni\n");
			bst.insert("2--> tomato paste\n");
			bst.insert("3--> oil\n");
			bst.insert("4--> rice\n");
			bst.inorder();
			System.out.println("Product range in food category: " + bst.size());
			int b = input.nextInt();
			if (b == 1) {
				System.out.println("How many macaroni do you want to donate");
				int ff = input.nextInt();
				while (ff > 1) {
					System.out.println(
							"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
					int usd = input.nextInt();
					if (usd == 0) {
						System.out.println("How many products do you want to release? ");
						int removeProduct = input.nextInt();
						if (ff > removeProduct) {
							for (int i = 1; i < removeProduct; i++) {
								list.removeIndex(i);
							}
							int lastVersion = (ff - removeProduct);
							System.out.println("The number of products in your cart is " + lastVersion + " it costs "
									+ (lastVersion * 4) + "$ " + " barcode number is: ");
							list.printIndex(1);
						} else {
							System.out.println("Invalid number.");
						}
					} else if (usd == 9) {
						System.out.println("The number of products in your cart is " + ff + " it costs: " + (ff * 4)
								+ "$ " + " barcode number is: ");
						list.printIndex(1);
					}
					break;
				}

				System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
				int yes = input.nextInt();
				if (yes == 1) {
					list.clean();
					System.out.println(list.isEmpyt());
				} else if (yes == 2) {
					System.out.println("Payment Page\nPlease enter your credit card information.");
					System.out.println("First name: ");
					String fn = input.next();
					System.out.println("Last name: ");
					String ln = input.next();
					System.out.println("Enter your credit card number: ");
					long csno = input.nextLong();
					System.out.println("Cvc: ");
					int cvc = input.nextInt();
					System.out.println("Your donation has been made. Thanks.");
				} else {
					System.out.println("Wrong choice");
				}
			} else if (b == 2) {
				System.out.println("How many tomato paste do you want to donate");
				int gg = input.nextInt();
				while (gg > 1) {
					System.out.println(
							"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
					int usd = input.nextInt();
					if (usd == 0) {
						System.out.println("How many products do you want to release? ");
						int removeProduct = input.nextInt();
						if (gg > removeProduct) {
							for (int i = 1; i < removeProduct; i++) {
								list.removeIndex(i);
							}
							int lastVersion = (gg - removeProduct);
							System.out.println("The number of products in your cart is " + lastVersion + " it costs "
									+ (lastVersion * 9) + "$ " + " barcode number is: ");
							list.printIndex(2);
						} else {
							System.out.println("Invalid number.");
						}
					} else if (usd == 9) {
						System.out.println("The number of products in your cart is " + gg + " it costs: " + (gg * 9)
								+ "$ " + " barcode number is: ");
						list.printIndex(2);
					} else {
						System.out.println("Invalid number.");
					}

					break;
				}
				System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
				int yes = input.nextInt();
				if (yes == 1) {
					list.clean();
					System.out.println(list.isEmpyt());
				} else if (yes == 2) {
					System.out.println("Payment Page\nPlease enter your credit card information.");
					System.out.println("First name: ");
					String fn = input.next();
					System.out.println("Last name: ");
					String ln = input.next();
					System.out.println("Enter your credit card number: ");
					long csno = input.nextLong();
					System.out.println("Cvc: ");
					int cvc = input.nextInt();
					System.out.println("Your donation has been made. Thanks.");
				} else {
					System.out.println("Wrong choice");
				}
			} else if (b == 3) {
				System.out.println("How many oil do you want to donate?");
				int hh = input.nextInt();
				while (hh > 1) {
					System.out.println(
							"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
					int usd = input.nextInt();
					if (usd == 0) {
						System.out.println("How many products do you want to release? ");
						int removeProduct = input.nextInt();
						if (hh > removeProduct) {
							for (int i = 1; i < removeProduct; i++) {
								list.removeIndex(i);
							}
							int lastVersion = (hh - removeProduct);
							System.out.println("The number of products in your cart is " + lastVersion + " it costs "
									+ (lastVersion * 30) + "$ " + " barcode number is: ");
							list.printIndex(3);
							System.out.println("The number of products in your cart " + lastVersion);
						} else {
							System.out.println("Invalid number.");
						}
					} else if (usd == 9) {
						System.out.println("The number of products in your cart is " + hh + " it costs: " + (hh * 30)
								+ "$ " + " barcode number is: ");
						list.printIndex(3);
					} else {
						System.out.println("Invalid number.");
					}

					break;
				}

				System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
				int yes = input.nextInt();
				if (yes == 1) {
					list.clean();
					System.out.println(list.isEmpyt());
				} else if (yes == 2) {
					System.out.println("Payment Page\nPlease enter your credit card information.");
					System.out.println("First name: ");
					String fn = input.next();
					System.out.println("Last name: ");
					String ln = input.next();
					System.out.println("Enter your credit card number: ");
					long csno = input.nextLong();
					System.out.println("Cvc: ");
					int cvc = input.nextInt();
					System.out.println("Your donation has been made. Thanks.");
				} else {
					System.out.println("Wrong choice");
				}
			} else if (b == 4) {
				System.out.println("How many rice do you want to donate?");
				int kk = input.nextInt();
				while (kk > 1) {
					System.out.println(
							"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
					int usd = input.nextInt();
					if (usd == 0) {
						System.out.println("How many products do you want to release? ");
						int removeProduct = input.nextInt();
						if (kk > removeProduct) {
							for (int i = 1; i < removeProduct; i++) {
								list.removeIndex(i);
							}
							int lastVersion = (kk - removeProduct);
							System.out.println("The number of products in your cart is " + lastVersion + " it costs "
									+ (lastVersion * 19) + "$ " + " barcode number is: ");
							list.printIndex(4);
						} else {
							System.out.println("Invalid number.");
						}
					} else if (usd == 9) {
						System.out.println("The number of products in your cart is " + kk + " it costs: " + (kk * 19)
								+ "$ " + " barcode number is: ");
						list.printIndex(4);
					} else {
						System.out.println("Invalid number.");
					}

					break;
				}

				System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
				int yes = input.nextInt();
				if (yes == 1) {
					list.clean();
					System.out.println(list.isEmpyt());
				} else if (yes == 2) {
					System.out.println("Payment Page\nPlease enter your credit card information.");
					System.out.println("First name: ");
					String fn = input.next();
					System.out.println("Last name: ");
					String ln = input.next();
					System.out.println("Enter your credit card number: ");
					long csno = input.nextLong();
					System.out.println("Cvc: ");
					int cvc = input.nextInt();
					System.out.println("Your donation has been made. Thanks.");
				} else {
					System.out.println("Wrong choice");
				}
			} else {
				System.out.println("Invalid number.");
			}

		} else if (a == 2) {
			System.out.println("Choose cleaning product from the menu: ");
			bst.insert("1--> Bleacher\n");
			bst.insert("2--> Shampoo\n");
			bst.insert("3--> Dish soap\n");
			bst.inorder();
			System.out.println("Product range in cleaning category: " + bst.size());
			int c = input.nextInt();
			if (c == 1) {
				System.out.println("How many bleacher do you want to donate?");
				int cc = input.nextInt();
				while (cc > 1) {
					System.out.println(
							"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
					int usd = input.nextInt();
					if (usd == 0) {
						System.out.println("How many products do you want to release? ");
						int removeProduct = input.nextInt();
						if (cc > removeProduct) {
							for (int i = 1; i < removeProduct; i++) {
								list.removeIndex(i);
							}
							int lastVersion = (cc - removeProduct);
							System.out.println("The number of products in your cart is " + lastVersion + " it costs "
									+ (lastVersion * 13) + "$ " + " barcode number is: ");
							list.printIndex(5);
						} else {
							System.out.println("Invalid number.");
						}
					} else if (usd == 9) {
						System.out.println("The number of products in your cart is " + cc + " it costs: " + (cc * 13)
								+ "$ " + " barcode number is: ");
						list.printIndex(5);
					} else {
						System.out.println("Invalid number.");
					}

					break;
				}
				System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
				int yes = input.nextInt();
				if (yes == 1) {
					list.clean();
					System.out.println(list.isEmpyt());
				} else if (yes == 2) {
					System.out.println("Payment Page\nPlease enter your credit card information.");
					System.out.println("First name: ");
					String fn = input.next();
					System.out.println("Last name: ");
					String ln = input.next();
					System.out.println("Enter your credit card number: ");
					long csno = input.nextLong();
					System.out.println("Cvc: ");
					int cvc = input.nextInt();
					System.out.println("Your donation has been made. Thanks.");
				} else {
					System.out.println("Wrong choice");
				}
			} else if (c == 2) {
				System.out.println("How many shampoo do you want to donate?");
				int dd = input.nextInt();
				while (dd > 1) {
					System.out.println(
							"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
					int usd = input.nextInt();
					if (usd == 0) {
						System.out.println("How many products do you want to release? ");
						int removeProduct = input.nextInt();
						if (dd > removeProduct) {
							for (int i = 1; i < removeProduct; i++) {
								list.removeIndex(i);
							}
							int lastVersion = (dd - removeProduct);
							System.out.println("The number of products in your cart is " + lastVersion + " it costs "
									+ (lastVersion * 18) + "$ " + " barcode number is: ");
							list.printIndex(6);
						} else {
							System.out.println("Invalid number.");
						}
					} else if (usd == 9) {
						System.out.println("The number of products in your cart is " + dd + " it costs: " + (dd * 18)
								+ "$ " + " barcode number is: ");
						list.printIndex(6);
					} else {
						System.out.println("Invalid number.");
					}

					break;
				}
				System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
				int yes = input.nextInt();
				if (yes == 1) {
					list.clean();
					System.out.println(list.isEmpyt());
				} else if (yes == 2) {
					System.out.println("Payment Page\nPlease enter your credit card information.");
					System.out.println("First name: ");
					String fn = input.next();
					System.out.println("Last name: ");
					String ln = input.next();
					System.out.println("Enter your credit card number: ");
					long csno = input.nextLong();
					System.out.println("Cvc: ");
					int cvc = input.nextInt();
					System.out.println("Your donation has been made. Thanks.");
				} else {
					System.out.println("Wrong choice");
				}
			} else if (c == 3) {
				System.out.println("How many dish soap do you want to donate?");
				int ee = input.nextInt();
				while (ee > 1) {
					System.out.println(
							"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
					int usd = input.nextInt();
					if (usd == 0) {
						System.out.println("How many products do you want to release? ");
						int removeProduct = input.nextInt();
						if (ee > removeProduct) {
							for (int i = 1; i < removeProduct; i++) {
								list.removeIndex(i);
							}
							int lastVersion = (ee - removeProduct);
							System.out.println("The number of products in your cart is " + lastVersion + " it costs "
									+ (lastVersion * 14) + "$ " + " barcode number is: ");
							list.printIndex(7);
						} else {
							System.out.println("Invalid number.");
						}
					} else if (usd == 9) {
						System.out.println("The number of products in your cart is " + ee + " it costs: " + (ee * 14)
								+ "$ " + " barcode number is: ");
						list.printIndex(7);
					} else {
						System.out.println("Invalid number.");
					}

					break;
				}
				System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
				int yes = input.nextInt();
				if (yes == 1) {
					list.clean();
					System.out.println(list.isEmpyt());
				} else if (yes == 2) {
					System.out.println("Payment Page\nPlease enter your credit card information.");
					System.out.println("First name: ");
					String fn = input.next();
					System.out.println("Last name: ");
					String ln = input.next();
					System.out.println("Enter your credit card number: ");
					long csno = input.nextLong();
					System.out.println("Cvc: ");
					int cvc = input.nextInt();
					System.out.println("Your donation has been made. Thanks.");
				} else {
					System.out.println("Wrong choice");
				}
			}
		}
		if (a == 3) {
			System.out.println("What kind of drink do you want to donate?");
			System.out.println("1--> Fizzy drinks");
			System.out.println("2--> Acid Free drinks");
			int d = input.nextInt();
			if (d == 1) {
				System.out.println("Chose a drink: ");
				bst.insert("1--> Cola\n");
				bst.insert("2--> Sprite\n");
				bst.inorder();
				System.out.println("Product range in the category of fizzy drinks: " + bst.size());
				int dd = input.nextInt();
				if (dd == 1) {
					System.out.println("How many coke do you want to donate? ");
					int ddd = input.nextInt();
					while (ddd > 1) {
						System.out.println(
								"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
						int usd = input.nextInt();
						if (usd == 0) {
							System.out.println("How many products do you want to release? ");
							int removeProduct = input.nextInt();
							if (ddd > removeProduct) {
								for (int i = 1; i < removeProduct; i++) {
									list.removeIndex(i);
								}
								int lastVersion = (ddd - removeProduct);
								System.out.println("The number of products in your cart is " + lastVersion
										+ " it costs " + (lastVersion * 5) + "$ " + " barcode number is: ");
								list.printIndex(8);
							} else {
								System.out.println("Invalid number.");
							}
						} else if (usd == 9) {
							System.out.println("The number of products in your cart is " + ddd + " it costs: "
									+ (ddd * 5) + "$ " + " barcode number is: ");
							list.printIndex(8);
						} else {
							System.out.println("Invalid number.");
						}

						break;
					}
					System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
					int yes = input.nextInt();
					if (yes == 1) {
						list.clean();
						System.out.println(list.isEmpyt());
					} else if (yes == 2) {
						System.out.println("Payment Page\nPlease enter your credit card information.");
						System.out.println("First name: ");
						String fn = input.next();
						System.out.println("Last name: ");
						String ln = input.next();
						System.out.println("Enter your credit card number: ");
						long csno = input.nextLong();
						System.out.println("Cvc: ");
						int cvc = input.nextInt();
						System.out.println("Your donation has been made. Thanks.");
					} else {
						System.out.println("Wrong choice");
					}
				} else if (dd == 2) {
					System.out.println("How many sprite do you want to donate?");
					int dddd = input.nextInt();
					while (dddd > 1) {
						System.out.println(
								"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
						int usd = input.nextInt();
						if (usd == 0) {
							System.out.println("How many products do you want to release? ");
							int removeProduct = input.nextInt();
							if (dddd > removeProduct) {
								for (int i = 1; i < removeProduct; i++) {
									list.removeIndex(i);
								}
								int lastVersion = (dddd - removeProduct);
								System.out.println("The number of products in your cart is " + lastVersion
										+ " it costs " + (lastVersion * 3) + "$ " + " barcode number is: ");
								list.printIndex(9);
							} else {
								System.out.println("Invalid number.");
							}
						} else if (usd == 9) {
							System.out.println("The number of products in your cart is " + dddd + " it costs: "
									+ (dddd * 3) + "$ " + " barcode number is: ");
							list.printIndex(9);
						} else {
							System.out.println("Invalid number.");
						}

						break;
					}
					System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
					int yes = input.nextInt();
					if (yes == 1) {
						list.clean();
						System.out.println(list.isEmpyt());
					} else if (yes == 2) {
						System.out.println("Payment Page\nPlease enter your credit card information.");
						System.out.println("First name: ");
						String fn = input.next();
						System.out.println("Last name: ");
						String ln = input.next();
						System.out.println("Enter your credit card number: ");
						long csno = input.nextLong();
						System.out.println("Cvc: ");
						int cvc = input.nextInt();
						System.out.println("Your donation has been made. Thanks.");
					} else {
						System.out.println("Wrong choice");
					}
				} else {
					System.out.println("Invalid number.");

				}

			} else if (d == 2) {
				System.out.println("Chose a drink: ");
				bst.insert("1--> Ýce Tea\n");
				bst.insert("2--> Milk\n");
				bst.inorder();
				System.out.println("Product range in the category of acid free drinks: " + bst.size());
				int dd = input.nextInt();
				if (dd == 1) {
					System.out.println("How many ice tea do you want to donate?");
					int ppp = input.nextInt();
					while (ppp > 1) {
						System.out.println(
								"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
						int usd = input.nextInt();
						if (usd == 0) {
							System.out.println("How many products do you want to release? ");
							int removeProduct = input.nextInt();
							if (ppp > removeProduct) {
								for (int i = 1; i < removeProduct; i++) {
									list.removeIndex(i);
								}
								int lastVersion = (ppp - removeProduct);
								System.out.println("The number of products in your cart is " + lastVersion
										+ " it costs " + (lastVersion * 4) + "$ " + " barcode number is: ");
								list.printIndex(10);
							} else {
								System.out.println("Invalid number.");
							}
						} else if (usd == 9) {
							System.out.println("The number of products in your cart is " + ppp + " it costs: "
									+ (ppp * 4) + "$ " + " barcode number is: ");
							list.printIndex(10);
						} else {
							System.out.println("Invalid number.");
						}

						break;
					}
					System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
					int yes = input.nextInt();
					if (yes == 1) {
						list.clean();
						System.out.println(list.isEmpyt());
					} else if (yes == 2) {
						System.out.println("Payment Page\nPlease enter your credit card information.");
						System.out.println("First name: ");
						String fn = input.next();
						System.out.println("Last name: ");
						String ln = input.next();
						System.out.println("Enter your credit card number: ");
						long csno = input.nextLong();
						System.out.println("Cvc: ");
						int cvc = input.nextInt();
						System.out.println("Your donation has been made. Thanks.");
					} else {
						System.out.println("Wrong choice");
					}
				} else if (dd == 2) {
					System.out.println("How many milk do you want to donate?");
					int ddd = input.nextInt();
					while (ddd > 1) {
						System.out.println(
								"Do you want to reduce the number of products in your basket?\nTo say yes enter 0, to say no enter 9: ");
						int usd = input.nextInt();
						if (usd == 0) {
							System.out.println("How many products do you want to release? ");
							int removeProduct = input.nextInt();
							if (ddd > removeProduct) {
								for (int i = 1; i < removeProduct; i++) {
									list.removeIndex(i);
								}
								int lastVersion = (ddd - removeProduct);
								System.out.println("The number of products in your cart is " + lastVersion
										+ " it costs " + (lastVersion * 7) + "$ " + " barcode number is: ");
								list.printIndex(11);
							} else {
								System.out.println("Invalid number.");
							}
						} else if (usd == 9) {
							System.out.println("The number of products in your cart is " + ddd + " it costs: "
									+ (ddd * 7) + "$ " + " barcode number is: ");
							list.printIndex(11);
						} else {
							System.out.println("Invalid number.");
						}

						break;
					}
					System.out.println("Do you want to empty the basket?\nTo say yes enter 1,To say no enter 2.");
					int yes = input.nextInt();
					if (yes == 1) {
						list.clean();
						System.out.println(list.isEmpyt());
					} else if (yes == 2) {
						System.out.println("Payment Page\nPlease enter your credit card information.");
						System.out.println("First name: ");
						String fn = input.next();
						System.out.println("Last name: ");
						String ln = input.next();
						System.out.println("Enter your credit card number: ");
						long csno = input.nextLong();
						System.out.println("Cvc: ");
						int cvc = input.nextInt();
						System.out.println("Your donation has been made. Thanks.");
					} else {
						System.out.println("Wrong choice");
					}
				}
			} else {
				System.out.println("Invalid number or  Number of products in stock");
				bst.clear();
				System.out.println(bst.size());
			}
		}

	}

}
