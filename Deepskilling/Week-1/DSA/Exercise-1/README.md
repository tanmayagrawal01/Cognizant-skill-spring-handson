# Exercise 1: Inventory Management System

## 1. Understand the Problem
When building an inventory system for a warehouse, the biggest challenge is managing thousands of items efficiently. If our data structure is slow, search and update operations will take too much time, which is bad for scale. Choosing the right Data Structures and Algorithms (DSA) is really important here.

I considered a few options:
- **ArrayList:** Good for small data, but search and delete operations take `O(N)` time. Not ideal for a large inventory where we need to look up items constantly.
- **HashMap / HashTable:** This seemed like the best choice. It stores data in key-value pairs (like using Product ID as the key and the Product object as the value). This gives us super fast performance for almost every operation.

So, I went with a **HashMap** for this project because our main requirement is to quickly find, update, or delete items based on their unique IDs.

---

## 4. Analysis (Time Complexity)
Using a HashMap directly improves our time complexity:
- **Add (Insert):** `O(1)` average time. Adding an item to the map is instantly fast.
- **Update / Search:** `O(1)` average time. We can access the item directly using its Product ID without traversing a whole list.
- **Delete:** `O(1)` average time. 

**Optimization thoughts:**
If we already know the rough size of the inventory, we can set the initial capacity of the HashMap so it doesn't have to resize memory repeatedly. Also, in a real-world scenario where multiple warehouse workers use the system at the same time, using a `ConcurrentHashMap` would be a safer choice to avoid concurrency issues.