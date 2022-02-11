// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIPAMAllocationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIPAMAllocationArgs Empty = new GetIPAMAllocationArgs();

    @InputImport(name="cidr", required=true)
    private final String cidr;

    public String getCidr() {
        return this.cidr;
    }

    @InputImport(name="ipamPoolAllocationId", required=true)
    private final String ipamPoolAllocationId;

    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    @InputImport(name="ipamPoolId", required=true)
    private final String ipamPoolId;

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public GetIPAMAllocationArgs(
        String cidr,
        String ipamPoolAllocationId,
        String ipamPoolId) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
        this.ipamPoolAllocationId = Objects.requireNonNull(ipamPoolAllocationId, "expected parameter 'ipamPoolAllocationId' to be non-null");
        this.ipamPoolId = Objects.requireNonNull(ipamPoolId, "expected parameter 'ipamPoolId' to be non-null");
    }

    private GetIPAMAllocationArgs() {
        this.cidr = null;
        this.ipamPoolAllocationId = null;
        this.ipamPoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPAMAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;
        private String ipamPoolAllocationId;
        private String ipamPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPAMAllocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.ipamPoolAllocationId = defaults.ipamPoolAllocationId;
    	      this.ipamPoolId = defaults.ipamPoolId;
        }

        public Builder setCidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }

        public Builder setIpamPoolAllocationId(String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = Objects.requireNonNull(ipamPoolAllocationId);
            return this;
        }

        public Builder setIpamPoolId(String ipamPoolId) {
            this.ipamPoolId = Objects.requireNonNull(ipamPoolId);
            return this;
        }

        public GetIPAMAllocationArgs build() {
            return new GetIPAMAllocationArgs(cidr, ipamPoolAllocationId, ipamPoolId);
        }
    }
}
