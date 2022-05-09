package com.christianoette.database;

import com.christianoette.services.Article;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected Order() {

    }

    public Order(Article article) {
        this.article = article;
        this.description = article.getDefaultDescription();
    }

    @Audited
    @Column(name = "article")
    @Enumerated(value = EnumType.STRING)
    private Article article;

    @Audited
    @Column(name = "description")
    private String description;

    public void updateArticle(Article article) {
        this.article = article;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public Article getArticle() {
        return article;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }
}
