// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.DeleteExistingNSGs;
import com.pulumi.azurenative.network.enums.SecurityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityAdminConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityAdminConfigurationArgs Empty = new SecurityAdminConfigurationArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @Import(name="configurationName")
    private @Nullable Output<String> configurationName;

    /**
     * @return The name of the network manager security Configuration.
     * 
     */
    public Optional<Output<String>> configurationName() {
        return Optional.ofNullable(this.configurationName);
    }

    /**
     * Flag if need to delete existing network security groups.
     * 
     */
    @Import(name="deleteExistingNSGs")
    private @Nullable Output<Either<String,DeleteExistingNSGs>> deleteExistingNSGs;

    /**
     * @return Flag if need to delete existing network security groups.
     * 
     */
    public Optional<Output<Either<String,DeleteExistingNSGs>>> deleteExistingNSGs() {
        return Optional.ofNullable(this.deleteExistingNSGs);
    }

    /**
     * A description of the security configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the security configuration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A display name of the security configuration.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A display name of the security configuration.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private Output<String> networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public Output<String> networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Security Type.
     * 
     */
    @Import(name="securityType")
    private @Nullable Output<Either<String,SecurityType>> securityType;

    /**
     * @return Security Type.
     * 
     */
    public Optional<Output<Either<String,SecurityType>>> securityType() {
        return Optional.ofNullable(this.securityType);
    }

    private SecurityAdminConfigurationArgs() {}

    private SecurityAdminConfigurationArgs(SecurityAdminConfigurationArgs $) {
        this.configurationName = $.configurationName;
        this.deleteExistingNSGs = $.deleteExistingNSGs;
        this.description = $.description;
        this.displayName = $.displayName;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
        this.securityType = $.securityType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityAdminConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityAdminConfigurationArgs $;

        public Builder() {
            $ = new SecurityAdminConfigurationArgs();
        }

        public Builder(SecurityAdminConfigurationArgs defaults) {
            $ = new SecurityAdminConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName The name of the network manager security Configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(@Nullable Output<String> configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        /**
         * @param configurationName The name of the network manager security Configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            return configurationName(Output.of(configurationName));
        }

        /**
         * @param deleteExistingNSGs Flag if need to delete existing network security groups.
         * 
         * @return builder
         * 
         */
        public Builder deleteExistingNSGs(@Nullable Output<Either<String,DeleteExistingNSGs>> deleteExistingNSGs) {
            $.deleteExistingNSGs = deleteExistingNSGs;
            return this;
        }

        /**
         * @param deleteExistingNSGs Flag if need to delete existing network security groups.
         * 
         * @return builder
         * 
         */
        public Builder deleteExistingNSGs(Either<String,DeleteExistingNSGs> deleteExistingNSGs) {
            return deleteExistingNSGs(Output.of(deleteExistingNSGs));
        }

        /**
         * @param deleteExistingNSGs Flag if need to delete existing network security groups.
         * 
         * @return builder
         * 
         */
        public Builder deleteExistingNSGs(String deleteExistingNSGs) {
            return deleteExistingNSGs(Either.ofLeft(deleteExistingNSGs));
        }

        /**
         * @param deleteExistingNSGs Flag if need to delete existing network security groups.
         * 
         * @return builder
         * 
         */
        public Builder deleteExistingNSGs(DeleteExistingNSGs deleteExistingNSGs) {
            return deleteExistingNSGs(Either.ofRight(deleteExistingNSGs));
        }

        /**
         * @param description A description of the security configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the security configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A display name of the security configuration.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A display name of the security configuration.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(Output<String> networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            return networkManagerName(Output.of(networkManagerName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityType Security Type.
         * 
         * @return builder
         * 
         */
        public Builder securityType(@Nullable Output<Either<String,SecurityType>> securityType) {
            $.securityType = securityType;
            return this;
        }

        /**
         * @param securityType Security Type.
         * 
         * @return builder
         * 
         */
        public Builder securityType(Either<String,SecurityType> securityType) {
            return securityType(Output.of(securityType));
        }

        /**
         * @param securityType Security Type.
         * 
         * @return builder
         * 
         */
        public Builder securityType(String securityType) {
            return securityType(Either.ofLeft(securityType));
        }

        /**
         * @param securityType Security Type.
         * 
         * @return builder
         * 
         */
        public Builder securityType(SecurityType securityType) {
            return securityType(Either.ofRight(securityType));
        }

        public SecurityAdminConfigurationArgs build() {
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
