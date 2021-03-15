package swehacker.playground.salon.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Configuration
public class SalonDetails {

  @Value("${salon.name}")
  private String name;

  @Value("${salon.address}")
  private String address;

  @Value("${salon.city}")
  private String city;

  @Value("${salon.state}")
  private String state;

  @Value("${salon.zipcode}")
  private String zipcode;

  @Value("${salon.phone}")
  private String phone;

  public SalonDetails clone() throws CloneNotSupportedException {
    super.clone();
    SalonDetails salonDetails = new SalonDetails();
    salonDetails.address = address;
    salonDetails.city = city;
    salonDetails.state = state;
    salonDetails.zipcode = zipcode;
    salonDetails.phone = phone;
    salonDetails.name = name;
    return salonDetails;
  }
}
