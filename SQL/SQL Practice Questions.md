SQL Practice Questions
Orders Table
..........................................................................
+----------+---------------+---------+---------------+-------------+----------+----------+-------------+------------------+------------+
| order_id | customer_name | city    | product_name  | category    | price    | quantity | order_date  | payment_mode     | status     |
+----------+---------------+---------+---------------+-------------+----------+----------+-------------+------------------+------------+
| 1        | Ajay          | Pune    | Laptop        | Electronics | 55000.00 | 1        | 2026-03-01  | Credit Card      | Delivered  |
| 2        | Rohit         | Mumbai  | Smartphone    | Electronics | 30000.00 | 2        | 2026-03-02  | UPI              | Shipped    |
| 3        | Sneha         | Nagpur  | Headphones    | Accessories | 2000.00  | 1        | 2026-03-02  | Cash on Delivery | Delivered  |
| 4        | Priya         | Nashik  | Keyboard      | Accessories | 1500.00  | 1        | 2026-03-03  | Debit Card       | Cancelled  |
| 5        | Amit          | Solapur | Mouse         | Accessories | 800.00   | 2        | 2026-03-04  | UPI              | Delivered  |
| 6        | Neha          | Pune    | Monitor       | Electronics | 12000.00 | 1        | 2026-03-05  | Credit Card      | Processing |
| 7        | Karan         | Mumbai  | Tablet        | Electronics | 18000.00 | 1        | 2026-03-06  | Debit Card       | Shipped    |
| 8        | Pooja         | Nagpur  | Charger       | Accessories | 500.00   | 3        | 2026-03-06  | UPI              | Delivered  |
| 9        | Rahul         | Nashik  | Power Bank    | Accessories | 1200.00  | 1        | 2026-03-07  | Cash on Delivery | Returned   |
| 10       | Anjali        | Solapur | Smart Watch   | Electronics | 5000.00  | 1        | 2026-03-08  | Credit Card      | Delivered  |
| 11       | Vikram        | Pune    | Camera        | Electronics | 45000.00 | 1        | 2026-03-09  | Debit Card       | Processing |
| 12       | Meena         | Mumbai  | Printer       | Electronics | 9000.00  | 1        | 2026-03-10  | UPI              | Delivered  |
| 13       | Suresh        | Nagpur  | Router        | Networking  | 2500.00  | 2        | 2026-03-11  | Credit Card      | Shipped    |
| 14       | Kavita        | Nashik  | USB Cable     | Accessories | 200.00   | 4        | 2026-03-12  | UPI              | Delivered  |
| 15       | Mahesh        | Solapur | External HDD  | Storage     | 6000.00  | 1        | 2026-03-13  | Cash on Delivery | Delivered  |
| 16       | Rina          | Pune    | Speakers      | Audio       | 3000.00  | 1        | 2026-03-14  | Debit Card       | Cancelled  |
| 17       | Deepak        | Mumbai  | Microphone    | Audio       | 2500.00  | 1        | 2026-03-15  | Credit Card      | Delivered  |
| 18       | Shweta        | Nagpur  | Gaming Chair  | Furniture   | 15000.00 | 1        | 2026-03-16  | UPI              | Processing |
| 19       | Nikhil        | Nashik  | Desk Lamp     | Furniture   | 700.00   | 2        | 2026-03-17  | Cash on Delivery | Delivered  |
| 20       | Aarti         | Solapur | Graphics Card | Electronics | 75000.00 | 1        | 2026-03-18  | Credit Card      | Shipped    |
+----------+---------------+---------+---------------+-------------+----------+----------+-------------+------------------+------------+
SQL Questions with Queries
1) Display all orders placed by customers from Pune
SELECT * FROM orders WHERE city = 'Pune';
2) Show all orders where price is greater than 5000
SELECT * FROM orders WHERE price > 5000;
3) Find all orders where payment mode is exactly 'UPI'
SELECT * FROM orders WHERE payment_mode = 'UPI';
4) Display all orders where status is exactly 'Delivered'
SELECT * FROM orders WHERE status = 'Delivered';
5) Show all orders where quantity is between 2 and 5
SELECT * FROM orders WHERE quantity BETWEEN 2 AND 5;
6) Display orders where category is exactly 'Electronics' or 'Clothing'
SELECT * FROM orders 
WHERE category = 'Electronics' OR category = 'Clothing';
7) Find orders where customer name is exactly Ajay, Amit, or Anjali
SELECT * FROM orders 
WHERE customer_name IN ('Ajay', 'Amit', 'Anjali');
8) Show orders where product name is exactly 'Phone'
SELECT * FROM orders WHERE product_name = 'Phone';
9) Display all orders sorted by price in descending order
SELECT * FROM orders ORDER BY price DESC;
10) Show all orders sorted by order date (latest first)
SELECT * FROM orders ORDER BY order_date DESC;
11) Find the total revenue (price × quantity)
SELECT SUM(price * quantity) AS total_revenue FROM orders;
12) Find average price of products for each category
SELECT category, AVG(price) AS avg_price 
FROM orders 
GROUP BY category;
13) Count total number of orders
SELECT COUNT(*) AS total_orders FROM orders;