# 🔌 REST Assured API Testing — Java

> A structured API test automation project using REST Assured and Java — practising core API testing concepts including GET/POST/PUT/DELETE operations, response validation, and test reporting.

---

## 📌 About This Project

This repository was one of my core **API automation learning projects** during my Bridgelabz apprenticeship (early 2022). It focuses on building a solid foundation in REST API testing — starting from simple GET requests and progressively covering more complex scenarios like request chaining, header validation, and error handling.

Think of this as a practice gym for API testing — each file targets a specific concept, building understanding step by step.

---

## 🎯 What This Project Covers

**GET Requests**
- Fetching single resources by ID
- Fetching lists with query parameters
- Validating response body fields and data types
- Asserting correct HTTP 200 status

**POST Requests**
- Creating new resources with a JSON body
- Validating the created resource is returned in the response
- Asserting HTTP 201 (Created) status
- Verifying the response body matches the request payload

**PUT / PATCH Requests**
- Updating existing resources
- Validating updated fields reflect changes correctly
- Asserting appropriate response codes

**DELETE Requests**
- Deleting a resource and confirming HTTP 204 or 200 response
- Verifying the deleted resource is no longer accessible (follow-up GET returns 404)

**Error & Edge Case Testing**
- Sending invalid IDs — expect 404 Not Found
- Missing required fields in request body — expect 400 Bad Request
- Unauthorised requests — expect 401 Unauthorised
- Validating error messages in response body

---

## 🛠️ Tools & Tech Stack

| Tool | Purpose |
|---|---|
| `Java` | Core programming language |
| `REST Assured` | API automation and assertion library |
| `TestNG` | Test framework and execution |
| `Maven` | Dependency management |
| `JSONPlaceholder / ReqRes` | Public mock APIs used for practice |
| `Postman` | Manual API exploration and request building |

---

## 📁 Repo Structure

```
RestAssuredAPI-Testing/
│
├── src/
│   ├── test/java/
│   │   ├── GetRequestTest.java      ← GET endpoint tests
│   │   ├── PostRequestTest.java     ← POST / create tests
│   │   ├── PutRequestTest.java      ← PUT / update tests
│   │   ├── DeleteRequestTest.java   ← DELETE tests
│   │   └── NegativeTests.java       ← Error and edge case tests
│   └── main/java/
│       └── BaseSetup.java           ← Base URI and common config
├── pom.xml                          ← Maven dependencies
├── testng.xml                       ← Test suite runner
└── README.md
```

---

## 💡 Skills Demonstrated

`REST Assured` · `Java` · `API Test Automation` · `HTTP Methods (GET · POST · PUT · DELETE)` · `JSON Validation` · `Status Code Assertions` · `Negative Testing` · `TestNG` · `Maven` · `Postman`

---

## 📝 What I Learned

This project taught me the full lifecycle of an API interaction — not just the happy path, but what happens when things go wrong. Understanding how APIs fail gracefully (or don't) became directly useful when I started writing API-related requirements and integration test cases as a Business Analyst.

---
