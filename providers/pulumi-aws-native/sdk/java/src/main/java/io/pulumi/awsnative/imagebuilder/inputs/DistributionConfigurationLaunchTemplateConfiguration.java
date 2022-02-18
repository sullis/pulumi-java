// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * launchTemplateConfiguration settings that apply to image distribution.
 * 
 */
public final class DistributionConfigurationLaunchTemplateConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DistributionConfigurationLaunchTemplateConfiguration Empty = new DistributionConfigurationLaunchTemplateConfiguration();

    /**
     * The account ID that this configuration applies to.
     * 
     */
    @InputImport(name="accountId")
    private final @Nullable String accountId;

    public Optional<String> getAccountId() {
        return this.accountId == null ? Optional.empty() : Optional.ofNullable(this.accountId);
    }

    /**
     * Identifies the EC2 launch template to use.
     * 
     */
    @InputImport(name="launchTemplateId")
    private final @Nullable String launchTemplateId;

    public Optional<String> getLaunchTemplateId() {
        return this.launchTemplateId == null ? Optional.empty() : Optional.ofNullable(this.launchTemplateId);
    }

    /**
     * Set the specified EC2 launch template as the default launch template for the specified account.
     * 
     */
    @InputImport(name="setDefaultVersion")
    private final @Nullable Boolean setDefaultVersion;

    public Optional<Boolean> getSetDefaultVersion() {
        return this.setDefaultVersion == null ? Optional.empty() : Optional.ofNullable(this.setDefaultVersion);
    }

    public DistributionConfigurationLaunchTemplateConfiguration(
        @Nullable String accountId,
        @Nullable String launchTemplateId,
        @Nullable Boolean setDefaultVersion) {
        this.accountId = accountId;
        this.launchTemplateId = launchTemplateId;
        this.setDefaultVersion = setDefaultVersion;
    }

    private DistributionConfigurationLaunchTemplateConfiguration() {
        this.accountId = null;
        this.launchTemplateId = null;
        this.setDefaultVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationLaunchTemplateConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String launchTemplateId;
        private @Nullable Boolean setDefaultVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationLaunchTemplateConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.setDefaultVersion = defaults.setDefaultVersion;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setLaunchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder setSetDefaultVersion(@Nullable Boolean setDefaultVersion) {
            this.setDefaultVersion = setDefaultVersion;
            return this;
        }

        public DistributionConfigurationLaunchTemplateConfiguration build() {
            return new DistributionConfigurationLaunchTemplateConfiguration(accountId, launchTemplateId, setDefaultVersion);
        }
    }
}
