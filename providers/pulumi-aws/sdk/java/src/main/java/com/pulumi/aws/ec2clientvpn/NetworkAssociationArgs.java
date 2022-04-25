// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAssociationArgs Empty = new NetworkAssociationArgs();

    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Import(name="clientVpnEndpointId", required=true)
    private Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Output<String> clientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private NetworkAssociationArgs() {}

    private NetworkAssociationArgs(NetworkAssociationArgs $) {
        this.clientVpnEndpointId = $.clientVpnEndpointId;
        this.securityGroups = $.securityGroups;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAssociationArgs $;

        public Builder() {
            $ = new NetworkAssociationArgs();
        }

        public Builder(NetworkAssociationArgs defaults) {
            $ = new NetworkAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(Output<String> clientVpnEndpointId) {
            $.clientVpnEndpointId = clientVpnEndpointId;
            return this;
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(String clientVpnEndpointId) {
            return clientVpnEndpointId(Output.of(clientVpnEndpointId));
        }

        /**
         * @param securityGroups A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param subnetId The ID of the subnet to associate with the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the subnet to associate with the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public NetworkAssociationArgs build() {
            $.clientVpnEndpointId = Objects.requireNonNull($.clientVpnEndpointId, "expected parameter 'clientVpnEndpointId' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
