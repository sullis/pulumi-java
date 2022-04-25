// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * launchTemplateConfiguration settings that apply to image distribution.
 * 
 */
public final class DistributionConfigurationLaunchTemplateConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationLaunchTemplateConfigurationArgs Empty = new DistributionConfigurationLaunchTemplateConfigurationArgs();

    /**
     * The account ID that this configuration applies to.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account ID that this configuration applies to.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Identifies the EC2 launch template to use.
     * 
     */
    @Import(name="launchTemplateId")
    private @Nullable Output<String> launchTemplateId;

    /**
     * @return Identifies the EC2 launch template to use.
     * 
     */
    public Optional<Output<String>> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }

    /**
     * Set the specified EC2 launch template as the default launch template for the specified account.
     * 
     */
    @Import(name="setDefaultVersion")
    private @Nullable Output<Boolean> setDefaultVersion;

    /**
     * @return Set the specified EC2 launch template as the default launch template for the specified account.
     * 
     */
    public Optional<Output<Boolean>> setDefaultVersion() {
        return Optional.ofNullable(this.setDefaultVersion);
    }

    private DistributionConfigurationLaunchTemplateConfigurationArgs() {}

    private DistributionConfigurationLaunchTemplateConfigurationArgs(DistributionConfigurationLaunchTemplateConfigurationArgs $) {
        this.accountId = $.accountId;
        this.launchTemplateId = $.launchTemplateId;
        this.setDefaultVersion = $.setDefaultVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionConfigurationLaunchTemplateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionConfigurationLaunchTemplateConfigurationArgs $;

        public Builder() {
            $ = new DistributionConfigurationLaunchTemplateConfigurationArgs();
        }

        public Builder(DistributionConfigurationLaunchTemplateConfigurationArgs defaults) {
            $ = new DistributionConfigurationLaunchTemplateConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID that this configuration applies to.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID that this configuration applies to.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param launchTemplateId Identifies the EC2 launch template to use.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            $.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * @param launchTemplateId Identifies the EC2 launch template to use.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(String launchTemplateId) {
            return launchTemplateId(Output.of(launchTemplateId));
        }

        /**
         * @param setDefaultVersion Set the specified EC2 launch template as the default launch template for the specified account.
         * 
         * @return builder
         * 
         */
        public Builder setDefaultVersion(@Nullable Output<Boolean> setDefaultVersion) {
            $.setDefaultVersion = setDefaultVersion;
            return this;
        }

        /**
         * @param setDefaultVersion Set the specified EC2 launch template as the default launch template for the specified account.
         * 
         * @return builder
         * 
         */
        public Builder setDefaultVersion(Boolean setDefaultVersion) {
            return setDefaultVersion(Output.of(setDefaultVersion));
        }

        public DistributionConfigurationLaunchTemplateConfigurationArgs build() {
            return $;
        }
    }

}
