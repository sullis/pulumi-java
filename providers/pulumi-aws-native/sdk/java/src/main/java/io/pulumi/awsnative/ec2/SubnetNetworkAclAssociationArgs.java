// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SubnetNetworkAclAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetNetworkAclAssociationArgs Empty = new SubnetNetworkAclAssociationArgs();

    /**
     * The ID of the network ACL
     * 
     */
    @Import(name="networkAclId", required=true)
      private final Output<String> networkAclId;

    public Output<String> getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * The ID of the subnet
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    public SubnetNetworkAclAssociationArgs(
        Output<String> networkAclId,
        Output<String> subnetId) {
        this.networkAclId = Objects.requireNonNull(networkAclId, "expected parameter 'networkAclId' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private SubnetNetworkAclAssociationArgs() {
        this.networkAclId = Output.empty();
        this.subnetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetNetworkAclAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> networkAclId;
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetNetworkAclAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkAclId = defaults.networkAclId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder networkAclId(Output<String> networkAclId) {
            this.networkAclId = Objects.requireNonNull(networkAclId);
            return this;
        }
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = Output.of(Objects.requireNonNull(networkAclId));
            return this;
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }        public SubnetNetworkAclAssociationArgs build() {
            return new SubnetNetworkAclAssociationArgs(networkAclId, subnetId);
        }
    }
}
