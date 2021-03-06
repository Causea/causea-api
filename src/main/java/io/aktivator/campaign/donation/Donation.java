package io.aktivator.campaign.donation;

import io.aktivator.campaign.Campaign;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Donation extends Campaign {
    @NotNull
    private Long target;
}
