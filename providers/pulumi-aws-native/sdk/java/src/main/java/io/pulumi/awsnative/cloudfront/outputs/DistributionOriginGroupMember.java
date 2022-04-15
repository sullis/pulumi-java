// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DistributionOriginGroupMember {
    private final String originId;

    @CustomType.Constructor
    private DistributionOriginGroupMember(@CustomType.Parameter("originId") String originId) {
        this.originId = originId;
    }

    public String originId() {
        return this.originId;
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

        public Builder originId(String originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }        public DistributionOriginGroupMember build() {
            return new DistributionOriginGroupMember(originId);
        }
    }
}
