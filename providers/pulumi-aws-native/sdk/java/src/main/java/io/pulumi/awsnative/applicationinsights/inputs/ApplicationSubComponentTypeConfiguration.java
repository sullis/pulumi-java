// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationSubComponentTypeConfigurationSubComponentType;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationSubComponentConfigurationDetails;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * One type sub component configurations for the component.
 * 
 */
public final class ApplicationSubComponentTypeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationSubComponentTypeConfiguration Empty = new ApplicationSubComponentTypeConfiguration();

    /**
     * The configuration settings of sub components.
     * 
     */
    @Import(name="subComponentConfigurationDetails", required=true)
      private final ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails;

    public ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails() {
        return this.subComponentConfigurationDetails;
    }

    /**
     * The sub component type.
     * 
     */
    @Import(name="subComponentType", required=true)
      private final ApplicationSubComponentTypeConfigurationSubComponentType subComponentType;

    public ApplicationSubComponentTypeConfigurationSubComponentType subComponentType() {
        return this.subComponentType;
    }

    public ApplicationSubComponentTypeConfiguration(
        ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails,
        ApplicationSubComponentTypeConfigurationSubComponentType subComponentType) {
        this.subComponentConfigurationDetails = Objects.requireNonNull(subComponentConfigurationDetails, "expected parameter 'subComponentConfigurationDetails' to be non-null");
        this.subComponentType = Objects.requireNonNull(subComponentType, "expected parameter 'subComponentType' to be non-null");
    }

    private ApplicationSubComponentTypeConfiguration() {
        this.subComponentConfigurationDetails = null;
        this.subComponentType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSubComponentTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails;
        private ApplicationSubComponentTypeConfigurationSubComponentType subComponentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSubComponentTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subComponentConfigurationDetails = defaults.subComponentConfigurationDetails;
    	      this.subComponentType = defaults.subComponentType;
        }

        public Builder subComponentConfigurationDetails(ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails) {
            this.subComponentConfigurationDetails = Objects.requireNonNull(subComponentConfigurationDetails);
            return this;
        }
        public Builder subComponentType(ApplicationSubComponentTypeConfigurationSubComponentType subComponentType) {
            this.subComponentType = Objects.requireNonNull(subComponentType);
            return this;
        }        public ApplicationSubComponentTypeConfiguration build() {
            return new ApplicationSubComponentTypeConfiguration(subComponentConfigurationDetails, subComponentType);
        }
    }
}
