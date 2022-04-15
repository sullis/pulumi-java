// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionConfigurationLaunchTemplateConfiguration {
    /**
     * The account ID that this configuration applies to.
     * 
     */
    private final @Nullable String accountId;
    /**
     * Identifies the EC2 launch template to use.
     * 
     */
    private final @Nullable String launchTemplateId;
    /**
     * Set the specified EC2 launch template as the default launch template for the specified account.
     * 
     */
    private final @Nullable Boolean setDefaultVersion;

    @CustomType.Constructor
    private DistributionConfigurationLaunchTemplateConfiguration(
        @CustomType.Parameter("accountId") @Nullable String accountId,
        @CustomType.Parameter("launchTemplateId") @Nullable String launchTemplateId,
        @CustomType.Parameter("setDefaultVersion") @Nullable Boolean setDefaultVersion) {
        this.accountId = accountId;
        this.launchTemplateId = launchTemplateId;
        this.setDefaultVersion = setDefaultVersion;
    }

    /**
     * The account ID that this configuration applies to.
     * 
    */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * Identifies the EC2 launch template to use.
     * 
    */
    public Optional<String> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    /**
     * Set the specified EC2 launch template as the default launch template for the specified account.
     * 
    */
    public Optional<Boolean> setDefaultVersion() {
        return Optional.ofNullable(this.setDefaultVersion);
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

        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public Builder setDefaultVersion(@Nullable Boolean setDefaultVersion) {
            this.setDefaultVersion = setDefaultVersion;
            return this;
        }        public DistributionConfigurationLaunchTemplateConfiguration build() {
            return new DistributionConfigurationLaunchTemplateConfiguration(accountId, launchTemplateId, setDefaultVersion);
        }
    }
}
