// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationConfigurationDetails;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationSubComponentTypeConfiguration;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationComponentConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationComponentConfiguration Empty = new ApplicationComponentConfiguration();

    @InputImport(name="configurationDetails")
    private final @Nullable ApplicationConfigurationDetails configurationDetails;

    public Optional<ApplicationConfigurationDetails> getConfigurationDetails() {
        return this.configurationDetails == null ? Optional.empty() : Optional.ofNullable(this.configurationDetails);
    }

    @InputImport(name="subComponentTypeConfigurations")
    private final @Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations;

    public List<ApplicationSubComponentTypeConfiguration> getSubComponentTypeConfigurations() {
        return this.subComponentTypeConfigurations == null ? List.of() : this.subComponentTypeConfigurations;
    }

    public ApplicationComponentConfiguration(
        @Nullable ApplicationConfigurationDetails configurationDetails,
        @Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations) {
        this.configurationDetails = configurationDetails;
        this.subComponentTypeConfigurations = subComponentTypeConfigurations;
    }

    private ApplicationComponentConfiguration() {
        this.configurationDetails = null;
        this.subComponentTypeConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationComponentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationConfigurationDetails configurationDetails;
        private @Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationComponentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationDetails = defaults.configurationDetails;
    	      this.subComponentTypeConfigurations = defaults.subComponentTypeConfigurations;
        }

        public Builder setConfigurationDetails(@Nullable ApplicationConfigurationDetails configurationDetails) {
            this.configurationDetails = configurationDetails;
            return this;
        }

        public Builder setSubComponentTypeConfigurations(@Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations) {
            this.subComponentTypeConfigurations = subComponentTypeConfigurations;
            return this;
        }

        public ApplicationComponentConfiguration build() {
            return new ApplicationComponentConfiguration(configurationDetails, subComponentTypeConfigurations);
        }
    }
}
