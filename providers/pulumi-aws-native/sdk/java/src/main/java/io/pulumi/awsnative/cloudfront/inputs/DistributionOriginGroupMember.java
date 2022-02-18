// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginGroupMember extends io.pulumi.resources.InvokeArgs {

    public static final DistributionOriginGroupMember Empty = new DistributionOriginGroupMember();

    @InputImport(name="originId", required=true)
    private final String originId;

    public String getOriginId() {
        return this.originId;
    }

    public DistributionOriginGroupMember(String originId) {
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
    }

    private DistributionOriginGroupMember() {
        this.originId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String originId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originId = defaults.originId;
        }

        public Builder setOriginId(String originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public DistributionOriginGroupMember build() {
            return new DistributionOriginGroupMember(originId);
        }
    }
}
