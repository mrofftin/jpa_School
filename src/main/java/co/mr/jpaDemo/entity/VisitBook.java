package co.mr.jpaDemo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_visit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
public class VisitBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vno;

    @Column(length = 200, nullable = false)
    private String visitMemo;
}
