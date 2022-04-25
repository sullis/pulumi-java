// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay;

import com.pulumi.azurenative.relay.inputs.PrivateEndpointArgs;
import com.pulumi.azurenative.relay.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Properties of the private endpoint object.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    /**
     * @return Properties of the private endpoint object.
     * 
     */
    public Optional<Output<PrivateEndpointArgs>> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * The PrivateEndpointConnection name.
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    /**
     * @return The PrivateEndpointConnection name.
     * 
     */
    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * Approval state of the private link connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return Approval state of the private link connection.
     * 
     */
    public Optional<Output<PrivateLinkServiceConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.location = $.location;
        this.namespaceName = $.namespaceName;
        this.privateEndpoint = $.privateEndpoint;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param privateEndpoint Properties of the private endpoint object.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable Output<PrivateEndpointArgs> privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateEndpoint Properties of the private endpoint object.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(PrivateEndpointArgs privateEndpoint) {
            return privateEndpoint(Output.of(privateEndpoint));
        }

        /**
         * @param privateEndpointConnectionName The PrivateEndpointConnection name.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName The PrivateEndpointConnection name.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param privateLinkServiceConnectionState Approval state of the private link connection.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState Approval state of the private link connection.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PrivateEndpointConnectionArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
