// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcCidrBlockAssociation {
    /**
     * The association ID for the the IPv4 CIDR block.
     * 
     */
    private final String associationId;
    /**
     * The cidr block of the desired VPC.
     * 
     */
    private final String cidrBlock;
    /**
     * The current state of the desired VPC.
     * Can be either `"pending"` or `"available"`.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetVpcCidrBlockAssociation(
        @CustomType.Parameter("associationId") String associationId,
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("state") String state) {
        this.associationId = associationId;
        this.cidrBlock = cidrBlock;
        this.state = state;
    }

    /**
     * The association ID for the the IPv4 CIDR block.
     * 
    */
    public String associationId() {
        return this.associationId;
    }
    /**
     * The cidr block of the desired VPC.
     * 
    */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The current state of the desired VPC.
     * Can be either `"pending"` or `"available"`.
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcCidrBlockAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationId;
        private String cidrBlock;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcCidrBlockAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.state = defaults.state;
        }

        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetVpcCidrBlockAssociation build() {
            return new GetVpcCidrBlockAssociation(associationId, cidrBlock, state);
        }
    }
}
