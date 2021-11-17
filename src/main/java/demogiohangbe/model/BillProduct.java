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
public class BillProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long unitPrice;
    private int quantity;
    @ManyToOne
    private Bill bill;
    @ManyToOne
    private Product product;
}
