// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2clientvpn;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkAssociationArgs Empty = new NetworkAssociationArgs();

    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Import(name="clientVpnEndpointId", required=true)
      private final Output<String> clientVpnEndpointId;

    public Output<String> clientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> securityGroups() {
        return this.securityGroups == null ? Codegen.empty() : this.securityGroups;
    }

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId;
    }

    public NetworkAssociationArgs(
        Output<String> clientVpnEndpointId,
        @Nullable Output<List<String>> securityGroups,
        Output<String> subnetId) {
        this.clientVpnEndpointId = Objects.requireNonNull(clientVpnEndpointId, "expected parameter 'clientVpnEndpointId' to be non-null");
        this.securityGroups = securityGroups;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private NetworkAssociationArgs() {
        this.clientVpnEndpointId = Codegen.empty();
        this.securityGroups = Codegen.empty();
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clientVpnEndpointId;
        private @Nullable Output<List<String>> securityGroups;
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientVpnEndpointId = defaults.clientVpnEndpointId;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder clientVpnEndpointId(Output<String> clientVpnEndpointId) {
            this.clientVpnEndpointId = Objects.requireNonNull(clientVpnEndpointId);
            return this;
        }
        public Builder clientVpnEndpointId(String clientVpnEndpointId) {
            this.clientVpnEndpointId = Output.of(Objects.requireNonNull(clientVpnEndpointId));
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Codegen.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }        public NetworkAssociationArgs build() {
            return new NetworkAssociationArgs(clientVpnEndpointId, securityGroups, subnetId);
        }
    }
}
