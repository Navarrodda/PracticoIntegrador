package prueba.integradora.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Car")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Car {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;

   @Column(name = "brand")
   private String brand;

   @Column(name = "model")
   private String model;

   @Temporal(TemporalType.TIMESTAMP)/**datetime**/
   @JoinColumn(name="year",nullable = false)
   @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
   private Date year;

   @Column(name = "color")
   private String color;

   @Column(name = "patente")
   private String patente;

   @Column(name = "km")
   private String km;
}
