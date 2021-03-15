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

  @Value("${organization.name}")
  private String name;

  @Value("${organization.address}")
  private String address;

  @Value("${organization.city}")
  private String city;

  @Value("${organization.state}")
  private String state;

  @Value("${organization.zipcode}")
  private String zipcode;

  @Value("${organization.phone}")
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
