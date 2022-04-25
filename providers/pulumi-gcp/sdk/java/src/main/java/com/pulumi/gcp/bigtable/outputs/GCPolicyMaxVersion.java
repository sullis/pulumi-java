// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GCPolicyMaxVersion {
    /**
     * @return Number of version before applying the GC policy.
     * 
     */
    private final Integer number;

    @CustomType.Constructor
    private GCPolicyMaxVersion(@CustomType.Parameter("number") Integer number) {
        this.number = number;
    }

    /**
     * @return Number of version before applying the GC policy.
     * 
     */
    public Integer number() {
        return this.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GCPolicyMaxVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer number;

        public Builder() {
    	      // Empty
        }

        public Builder(GCPolicyMaxVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.number = defaults.number;
        }

        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }        public GCPolicyMaxVersion build() {
            return new GCPolicyMaxVersion(number);
        }
    }
}
