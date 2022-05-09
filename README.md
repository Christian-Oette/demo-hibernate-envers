# Demo project to test hibernate envers

This is a demo project to test auditing with hibernate envers.
You can create orders and update them interactively.

The project has a swagger-ui and h2 console enabled.

@Audited fields are added to the order

```java
@Entity
@Table(name = "orders")
public class Order {    
    //...
    @Audited
    @Column(name = "article")
    @Enumerated(value = EnumType.STRING)
    private Article article;

    @Audited
    @Column(name = "description")
    private String description;
    // ...
```

## How to run the application

- Start `AuditApplication`
- Go to http://localhost:8080 for testing
- Go to http://localhost:8080/h2-console to see the result

## Test result example

![Screenshot](/images/screenshot.jpg)