// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance;

import com.pulumi.azurenative.securityandcompliance.enums.Kind;
import com.pulumi.azurenative.securityandcompliance.inputs.ServicesPropertiesArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.ServicesResourceIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkServicesForSCCPowershellArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServicesForSCCPowershellArgs Empty = new PrivateLinkServicesForSCCPowershellArgs();

    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ServicesResourceIdentityArgs> identity;

    /**
     * @return Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Optional<Output<ServicesResourceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The kind of the service.
     * 
     */
    @Import(name="kind", required=true)
    private Output<Kind> kind;

    /**
     * @return The kind of the service.
     * 
     */
    public Output<Kind> kind() {
        return this.kind;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The common properties of a service.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ServicesPropertiesArgs> properties;

    /**
     * @return The common properties of a service.
     * 
     */
    public Optional<Output<ServicesPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the service instance.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The name of the service instance.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PrivateLinkServicesForSCCPowershellArgs() {}

    private PrivateLinkServicesForSCCPowershellArgs(PrivateLinkServicesForSCCPowershellArgs $) {
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServicesForSCCPowershellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServicesForSCCPowershellArgs $;

        public Builder() {
            $ = new PrivateLinkServicesForSCCPowershellArgs();
        }

        public Builder(PrivateLinkServicesForSCCPowershellArgs defaults) {
            $ = new PrivateLinkServicesForSCCPowershellArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity Setting indicating whether the service has a managed identity associated with it.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ServicesResourceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Setting indicating whether the service has a managed identity associated with it.
         * 
         * @return builder
         * 
         */
        public Builder identity(ServicesResourceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param kind The kind of the service.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<Kind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the service.
         * 
         * @return builder
         * 
         */
        public Builder kind(Kind kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties The common properties of a service.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ServicesPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The common properties of a service.
         * 
         * @return builder
         * 
         */
        public Builder properties(ServicesPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PrivateLinkServicesForSCCPowershellArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
