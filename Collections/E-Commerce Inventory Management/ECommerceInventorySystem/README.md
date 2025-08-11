# E-Commerce Inventory System (Java)

## 📌 Overview
A Java console-based e-commerce inventory system using **Java Collections Framework**:
- `HashMap` → Store products by name.
- `Set` → Prevent duplicate product entries.
- `List` → Track new arrivals.
- `Comparator` → Sort by name or price.
- Transaction tracking with Who, What, Where, Why, and When.

---

## ✨ Features
- Add new products or update existing quantities.
- Prevent duplicate product names using `HashSet`.
- Track **new arrivals**.
- Maintain transaction logs with:
  - Why (purchase/sale)
  - Who (supplier/buyer)
  - What (product)
  - Where (location)
  - When (date)
- Sort inventory by:
  - Name
  - Price

---

## 🛠 Technologies Used
- **Java 8+**
- `HashMap`, `HashSet`, `ArrayList`
- `Comparator` for sorting(by Price/Name)
- `LocalDate` for transaction timestamps

---

## 🚀 How to Run
```bash
javac ECommerceInventorySystem.java
java ECommerceInventorySystem
