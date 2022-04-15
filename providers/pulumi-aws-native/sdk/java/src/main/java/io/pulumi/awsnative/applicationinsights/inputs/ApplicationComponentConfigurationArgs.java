// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationConfigurationDetailsArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationSubComponentTypeConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the component.
 * 
 */
public final class ApplicationComponentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationComponentConfigurationArgs Empty = new ApplicationComponentConfigurationArgs();

    /**
     * The configuration settings
     * 
     */
    @Import(name="configurationDetails")
      private final @Nullable Output<ApplicationConfigurationDetailsArgs> configurationDetails;

    public Output<ApplicationConfigurationDetailsArgs> configurationDetails() {
        return this.configurationDetails == null ? Codegen.empty() : this.configurationDetails;
    }

    /**
     * Sub component configurations of the component.
     * 
     */
    @Import(name="subComponentTypeConfigurations")
      private final @Nullable Output<List<ApplicationSubComponentTypeConfigurationArgs>> subComponentTypeConfigurations;

    public Output<List<ApplicationSubComponentTypeConfigurationArgs>> subComponentTypeConfigurations() {
        return this.subComponentTypeConfigurations == null ? Codegen.empty() : this.subComponentTypeConfigurations;
    }

    public ApplicationComponentConfigurationArgs(
        @Nullable Output<ApplicationConfigurationDetailsArgs> configurationDetails,
        @Nullable Output<List<ApplicationSubComponentTypeConfigurationArgs>> subComponentTypeConfigurations) {
        this.configurationDetails = configurationDetails;
        this.subComponentTypeConfigurations = subComponentTypeConfigurations;
    }

    private ApplicationComponentConfigurationArgs() {
        this.configurationDetails = Codegen.empty();
        this.subComponentTypeConfigurations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationConfigurationDetailsArgs> configurationDetails;
        private @Nullable Output<List<ApplicationSubComponentTypeConfigurationArgs>> subComponentTypeConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationComponentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationDetails = defaults.configurationDetails;
    	      this.subComponentTypeConfigurations = defaults.subComponentTypeConfigurations;
        }

        public Builder configurationDetails(@Nullable Output<ApplicationConfigurationDetailsArgs> configurationDetails) {
            this.configurationDetails = configurationDetails;
            return this;
        }
        public Builder configurationDetails(@Nullable ApplicationConfigurationDetailsArgs configurationDetails) {
            this.configurationDetails = Codegen.ofNullable(configurationDetails);
            return this;
        }
        public Builder subComponentTypeConfigurations(@Nullable Output<List<ApplicationSubComponentTypeConfigurationArgs>> subComponentTypeConfigurations) {
            this.subComponentTypeConfigurations = subComponentTypeConfigurations;
            return this;
        }
        public Builder subComponentTypeConfigurations(@Nullable List<ApplicationSubComponentTypeConfigurationArgs> subComponentTypeConfigurations) {
            this.subComponentTypeConfigurations = Codegen.ofNullable(subComponentTypeConfigurations);
            return this;
        }
        public Builder subComponentTypeConfigurations(ApplicationSubComponentTypeConfigurationArgs... subComponentTypeConfigurations) {
            return subComponentTypeConfigurations(List.of(subComponentTypeConfigurations));
        }        public ApplicationComponentConfigurationArgs build() {
            return new ApplicationComponentConfigurationArgs(configurationDetails, subComponentTypeConfigurations);
        }
    }
}
