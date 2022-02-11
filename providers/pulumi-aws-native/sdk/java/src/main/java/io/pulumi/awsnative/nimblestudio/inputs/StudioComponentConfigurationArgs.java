// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentActiveDirectoryConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentComputeFarmConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentLicenseServiceConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentSharedFileSystemConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioComponentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentConfigurationArgs Empty = new StudioComponentConfigurationArgs();

    @InputImport(name="activeDirectoryConfiguration")
    private final @Nullable Input<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration;

    public Input<StudioComponentActiveDirectoryConfigurationArgs> getActiveDirectoryConfiguration() {
        return this.activeDirectoryConfiguration == null ? Input.empty() : this.activeDirectoryConfiguration;
    }

    @InputImport(name="computeFarmConfiguration")
    private final @Nullable Input<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration;

    public Input<StudioComponentComputeFarmConfigurationArgs> getComputeFarmConfiguration() {
        return this.computeFarmConfiguration == null ? Input.empty() : this.computeFarmConfiguration;
    }

    @InputImport(name="licenseServiceConfiguration")
    private final @Nullable Input<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration;

    public Input<StudioComponentLicenseServiceConfigurationArgs> getLicenseServiceConfiguration() {
        return this.licenseServiceConfiguration == null ? Input.empty() : this.licenseServiceConfiguration;
    }

    @InputImport(name="sharedFileSystemConfiguration")
    private final @Nullable Input<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration;

    public Input<StudioComponentSharedFileSystemConfigurationArgs> getSharedFileSystemConfiguration() {
        return this.sharedFileSystemConfiguration == null ? Input.empty() : this.sharedFileSystemConfiguration;
    }

    public StudioComponentConfigurationArgs(
        @Nullable Input<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration,
        @Nullable Input<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration,
        @Nullable Input<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration,
        @Nullable Input<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration) {
        this.activeDirectoryConfiguration = activeDirectoryConfiguration;
        this.computeFarmConfiguration = computeFarmConfiguration;
        this.licenseServiceConfiguration = licenseServiceConfiguration;
        this.sharedFileSystemConfiguration = sharedFileSystemConfiguration;
    }

    private StudioComponentConfigurationArgs() {
        this.activeDirectoryConfiguration = Input.empty();
        this.computeFarmConfiguration = Input.empty();
        this.licenseServiceConfiguration = Input.empty();
        this.sharedFileSystemConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration;
        private @Nullable Input<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration;
        private @Nullable Input<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration;
        private @Nullable Input<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryConfiguration = defaults.activeDirectoryConfiguration;
    	      this.computeFarmConfiguration = defaults.computeFarmConfiguration;
    	      this.licenseServiceConfiguration = defaults.licenseServiceConfiguration;
    	      this.sharedFileSystemConfiguration = defaults.sharedFileSystemConfiguration;
        }

        public Builder setActiveDirectoryConfiguration(@Nullable Input<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration) {
            this.activeDirectoryConfiguration = activeDirectoryConfiguration;
            return this;
        }

        public Builder setActiveDirectoryConfiguration(@Nullable StudioComponentActiveDirectoryConfigurationArgs activeDirectoryConfiguration) {
            this.activeDirectoryConfiguration = Input.ofNullable(activeDirectoryConfiguration);
            return this;
        }

        public Builder setComputeFarmConfiguration(@Nullable Input<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration) {
            this.computeFarmConfiguration = computeFarmConfiguration;
            return this;
        }

        public Builder setComputeFarmConfiguration(@Nullable StudioComponentComputeFarmConfigurationArgs computeFarmConfiguration) {
            this.computeFarmConfiguration = Input.ofNullable(computeFarmConfiguration);
            return this;
        }

        public Builder setLicenseServiceConfiguration(@Nullable Input<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration) {
            this.licenseServiceConfiguration = licenseServiceConfiguration;
            return this;
        }

        public Builder setLicenseServiceConfiguration(@Nullable StudioComponentLicenseServiceConfigurationArgs licenseServiceConfiguration) {
            this.licenseServiceConfiguration = Input.ofNullable(licenseServiceConfiguration);
            return this;
        }

        public Builder setSharedFileSystemConfiguration(@Nullable Input<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration) {
            this.sharedFileSystemConfiguration = sharedFileSystemConfiguration;
            return this;
        }

        public Builder setSharedFileSystemConfiguration(@Nullable StudioComponentSharedFileSystemConfigurationArgs sharedFileSystemConfiguration) {
            this.sharedFileSystemConfiguration = Input.ofNullable(sharedFileSystemConfiguration);
            return this;
        }

        public StudioComponentConfigurationArgs build() {
            return new StudioComponentConfigurationArgs(activeDirectoryConfiguration, computeFarmConfiguration, licenseServiceConfiguration, sharedFileSystemConfiguration);
        }
    }
}
