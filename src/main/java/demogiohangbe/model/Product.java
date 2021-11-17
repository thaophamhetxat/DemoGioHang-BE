package demogiohangbe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor //tạo Constructor có tất cả tham số
@NoArgsConstructor //tạo Constructor không tham số
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int price;
    private String image;
    private String description;
    @ManyToOne
    private Category category;// category_id
}
