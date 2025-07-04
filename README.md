🚀 How It Works
This Java console-based e-commerce simulation models a simplified shopping and checkout process. The system demonstrates core object-oriented principles including encapsulation, abstraction, and polymorphism.

🛒 Features:
Product Management
Multiple product types including perishable (e.g., Cheese, Biscuits) and non-perishable (e.g., TV, ScratchCard).
Products may or may not be shippable or expirable.

Cart Operations
Customers can add items to the cart, and quantities are validated against stock availability.

Checkout Process

Verifies product expiration and stock quantity

Calculates the subtotal of all cart items

Computes shipping costs based on total package weight

Deducts the total amount from the customer's balance

Reduces the product quantities accordingly

Shipping Logic

Shippable items are listed with quantities and weights

Shipping cost is calculated as:
Shipping Cost = Total Weight × 30 LE

📦 Sample Console Output:
markdown
Copy
Edit
** Shipment notice **
2x Cheese        400g
1x Biscuits      600g
Total package weight 1.0kg

** Checkout receipt **
2x Cheese         200
1x Biscuits       150
----------------------
Subtotal          350
Shipping           30
Amount            380
🧪 Technologies Used:
Java SE

OOP Principles (Abstraction, Encapsulation, Inheritance, Polymorphism)

Interfaces (e.g., Shippable, Expirable)

Console-based simulation (no GUI)

▶️ How to Run:
Compile the project:

bash
Copy
Edit
javac Main.java
Run the application:

bash
Copy
Edit
java Main
