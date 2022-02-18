// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs;
import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs;
import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationLaunchTemplateConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The distributions of the distribution configuration.
 * 
 */
public final class DistributionConfigurationDistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionArgs Empty = new DistributionConfigurationDistributionArgs();

    /**
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * 
     */
    @InputImport(name="amiDistributionConfiguration")
    private final @Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration;

    public Input<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> getAmiDistributionConfiguration() {
        return this.amiDistributionConfiguration == null ? Input.empty() : this.amiDistributionConfiguration;
    }

    /**
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * 
     */
    @InputImport(name="containerDistributionConfiguration")
    private final @Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration;

    public Input<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> getContainerDistributionConfiguration() {
        return this.containerDistributionConfiguration == null ? Input.empty() : this.containerDistributionConfiguration;
    }

    /**
     * A group of launchTemplateConfiguration settings that apply to image distribution.
     * 
     */
    @InputImport(name="launchTemplateConfigurations")
    private final @Nullable Input<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations;

    public Input<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> getLaunchTemplateConfigurations() {
        return this.launchTemplateConfigurations == null ? Input.empty() : this.launchTemplateConfigurations;
    }

    /**
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * 
     */
    @InputImport(name="licenseConfigurationArns")
    private final @Nullable Input<List<String>> licenseConfigurationArns;

    public Input<List<String>> getLicenseConfigurationArns() {
        return this.licenseConfigurationArns == null ? Input.empty() : this.licenseConfigurationArns;
    }

    /**
     * region
     * 
     */
    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    public DistributionConfigurationDistributionArgs(
        @Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration,
        @Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration,
        @Nullable Input<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations,
        @Nullable Input<List<String>> licenseConfigurationArns,
        Input<String> region) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
        this.containerDistributionConfiguration = containerDistributionConfiguration;
        this.launchTemplateConfigurations = launchTemplateConfigurations;
        this.licenseConfigurationArns = licenseConfigurationArns;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private DistributionConfigurationDistributionArgs() {
        this.amiDistributionConfiguration = Input.empty();
        this.containerDistributionConfiguration = Input.empty();
        this.launchTemplateConfigurations = Input.empty();
        this.licenseConfigurationArns = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration;
        private @Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration;
        private @Nullable Input<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations;
        private @Nullable Input<List<String>> licenseConfigurationArns;
        private Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiDistributionConfiguration = defaults.amiDistributionConfiguration;
    	      this.containerDistributionConfiguration = defaults.containerDistributionConfiguration;
    	      this.launchTemplateConfigurations = defaults.launchTemplateConfigurations;
    	      this.licenseConfigurationArns = defaults.licenseConfigurationArns;
    	      this.region = defaults.region;
        }

        public Builder setAmiDistributionConfiguration(@Nullable Input<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration) {
            this.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }

        public Builder setAmiDistributionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs amiDistributionConfiguration) {
            this.amiDistributionConfiguration = Input.ofNullable(amiDistributionConfiguration);
            return this;
        }

        public Builder setContainerDistributionConfiguration(@Nullable Input<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration) {
            this.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }

        public Builder setContainerDistributionConfiguration(@Nullable DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs containerDistributionConfiguration) {
            this.containerDistributionConfiguration = Input.ofNullable(containerDistributionConfiguration);
            return this;
        }

        public Builder setLaunchTemplateConfigurations(@Nullable Input<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations) {
            this.launchTemplateConfigurations = launchTemplateConfigurations;
            return this;
        }

        public Builder setLaunchTemplateConfigurations(@Nullable List<DistributionConfigurationLaunchTemplateConfigurationArgs> launchTemplateConfigurations) {
            this.launchTemplateConfigurations = Input.ofNullable(launchTemplateConfigurations);
            return this;
        }

        public Builder setLicenseConfigurationArns(@Nullable Input<List<String>> licenseConfigurationArns) {
            this.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }

        public Builder setLicenseConfigurationArns(@Nullable List<String> licenseConfigurationArns) {
            this.licenseConfigurationArns = Input.ofNullable(licenseConfigurationArns);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public DistributionConfigurationDistributionArgs build() {
            return new DistributionConfigurationDistributionArgs(amiDistributionConfiguration, containerDistributionConfiguration, launchTemplateConfigurations, licenseConfigurationArns, region);
        }
    }
}
