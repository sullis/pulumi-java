// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubnetNetworkAclAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubnetNetworkAclAssociationArgs Empty = new GetSubnetNetworkAclAssociationArgs();

    @Import(name="associationId", required=true)
      private final String associationId;

    public String associationId() {
        return this.associationId;
    }

    public GetSubnetNetworkAclAssociationArgs(String associationId) {
        this.associationId = Objects.requireNonNull(associationId, "expected parameter 'associationId' to be non-null");
    }

    private GetSubnetNetworkAclAssociationArgs() {
        this.associationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetNetworkAclAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetNetworkAclAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
        }

        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }        public GetSubnetNetworkAclAssociationArgs build() {
            return new GetSubnetNetworkAclAssociationArgs(associationId);
        }
    }
}
