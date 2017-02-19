package net.unit8.sigcolle.form;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

import lombok.Data;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


/**
 * @author kawasima
 */
@Data
public class CampaignForm extends FormBase {
    @DecimalMin("1")
    @DecimalMax("9999")
    private String campaignId;

    @NotNull
    @Length(min = 1, max = 20)
    private String title;

    @NotNull
    @Length(min = 1, max = 50)
    private String statement;

    @DecimalMin("1")
    @DecimalMax("9999")
    private Long goal;

    @DecimalMin("1")
    @DecimalMax("9999")
    private Long createUserId;

    public Long getCampaignIdLong() {
        return Long.parseLong(campaignId);
    }
    @Override
    public boolean hasErrors() {
        return super.hasErrors();
    }

    @Override
    public boolean hasErrors(String name) {
        return super.hasErrors(name);
    }

    @Override
    public List<String> getErrors(String name) {
        return super.getErrors(name);
    }

   // public Long getCampaignIdLong() {return Long.parseLong(campaignId);}
}
