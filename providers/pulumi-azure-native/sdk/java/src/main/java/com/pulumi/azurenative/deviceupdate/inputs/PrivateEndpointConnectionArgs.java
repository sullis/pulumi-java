// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.inputs;

import com.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Private Endpoint Connection resource.
 * 
 */
public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Array of group IDs.
     * 
     */
    @Import(name="groupIds")
    private @Nullable Output<List<String>> groupIds;

    /**
     * @return Array of group IDs.
     * 
     */
    public Optional<Output<List<String>>> groupIds() {
        return Optional.ofNullable(this.groupIds);
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
    private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.groupIds = $.groupIds;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
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
         * @param groupIds Array of group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            $.groupIds = groupIds;
            return this;
        }

        /**
         * @param groupIds Array of group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(List<String> groupIds) {
            return groupIds(Output.of(groupIds));
        }

        /**
         * @param groupIds Array of group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        public PrivateEndpointConnectionArgs build() {
            $.privateLinkServiceConnectionState = Objects.requireNonNull($.privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
            return $;
        }
    }

}
