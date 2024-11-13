# prv.bisik.ShopServiceApp

## Description
This is a simple shop service application that allows users to create, read, update and delete products and categories. The application is built using Spring Boot, Spring Data JPA, Spring Security, and MySQL.

### Documentation
- PostrgreSQL:

```other
Name of the database: 
() <- table name
[] <- column name
{} <- object name

Relationships:
One to One

(category_type)
[id] = [general_product_type]
14 = none
15 = wahsing_powder
16 = razor
17 = soap

(category)
[id] = [general_product_type_id]
7 = 14 
8 = 15 
9 = 16 
10 = 17

------[Relation Map]----------
7 - 14 = none               |
8 - 15 = wahsing_powder     |
9 - 16 = razor              |
10 - 17 = soap              |
------------------------------



```
--- 

- [API Documentation]
???

## Features
???