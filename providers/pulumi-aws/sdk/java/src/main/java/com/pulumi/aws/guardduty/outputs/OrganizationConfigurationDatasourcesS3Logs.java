// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class OrganizationConfigurationDatasourcesS3Logs {
    /**
     * @return When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
     * 
     */
    private final Boolean autoEnable;

    @CustomType.Constructor
    private OrganizationConfigurationDatasourcesS3Logs(@CustomType.Parameter("autoEnable") Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * @return When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
     * 
     */
    public Boolean autoEnable() {
        return this.autoEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationDatasourcesS3Logs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoEnable;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConfigurationDatasourcesS3Logs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoEnable = defaults.autoEnable;
        }

        public Builder autoEnable(Boolean autoEnable) {
            this.autoEnable = Objects.requireNonNull(autoEnable);
            return this;
        }        public OrganizationConfigurationDatasourcesS3Logs build() {
            return new OrganizationConfigurationDatasourcesS3Logs(autoEnable);
        }
    }
}
