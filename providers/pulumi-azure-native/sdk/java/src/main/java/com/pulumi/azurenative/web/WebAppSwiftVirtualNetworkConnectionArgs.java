// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppSwiftVirtualNetworkConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppSwiftVirtualNetworkConnectionArgs Empty = new WebAppSwiftVirtualNetworkConnectionArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Virtual Network subnet&#39;s resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    @Import(name="subnetResourceId")
    private @Nullable Output<String> subnetResourceId;

    /**
     * @return The Virtual Network subnet&#39;s resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    public Optional<Output<String>> subnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }

    /**
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    @Import(name="swiftSupported")
    private @Nullable Output<Boolean> swiftSupported;

    /**
     * @return A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    public Optional<Output<Boolean>> swiftSupported() {
        return Optional.ofNullable(this.swiftSupported);
    }

    private WebAppSwiftVirtualNetworkConnectionArgs() {}

    private WebAppSwiftVirtualNetworkConnectionArgs(WebAppSwiftVirtualNetworkConnectionArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.subnetResourceId = $.subnetResourceId;
        this.swiftSupported = $.swiftSupported;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppSwiftVirtualNetworkConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppSwiftVirtualNetworkConnectionArgs $;

        public Builder() {
            $ = new WebAppSwiftVirtualNetworkConnectionArgs();
        }

        public Builder(WebAppSwiftVirtualNetworkConnectionArgs defaults) {
            $ = new WebAppSwiftVirtualNetworkConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subnetResourceId The Virtual Network subnet&#39;s resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
         * 
         * @return builder
         * 
         */
        public Builder subnetResourceId(@Nullable Output<String> subnetResourceId) {
            $.subnetResourceId = subnetResourceId;
            return this;
        }

        /**
         * @param subnetResourceId The Virtual Network subnet&#39;s resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
         * 
         * @return builder
         * 
         */
        public Builder subnetResourceId(String subnetResourceId) {
            return subnetResourceId(Output.of(subnetResourceId));
        }

        /**
         * @param swiftSupported A flag that specifies if the scale unit this Web App is on supports Swift integration.
         * 
         * @return builder
         * 
         */
        public Builder swiftSupported(@Nullable Output<Boolean> swiftSupported) {
            $.swiftSupported = swiftSupported;
            return this;
        }

        /**
         * @param swiftSupported A flag that specifies if the scale unit this Web App is on supports Swift integration.
         * 
         * @return builder
         * 
         */
        public Builder swiftSupported(Boolean swiftSupported) {
            return swiftSupported(Output.of(swiftSupported));
        }

        public WebAppSwiftVirtualNetworkConnectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
