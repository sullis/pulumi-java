// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InsightFiltersResourceAwsEc2InstanceIpv6Address {
    /**
     * @return A finding&#39;s CIDR value.
     * 
     */
    private final String cidr;

    @CustomType.Constructor
    private InsightFiltersResourceAwsEc2InstanceIpv6Address(@CustomType.Parameter("cidr") String cidr) {
        this.cidr = cidr;
    }

    /**
     * @return A finding&#39;s CIDR value.
     * 
     */
    public String cidr() {
        return this.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceAwsEc2InstanceIpv6Address defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersResourceAwsEc2InstanceIpv6Address defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
        }

        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }        public InsightFiltersResourceAwsEc2InstanceIpv6Address build() {
            return new InsightFiltersResourceAwsEc2InstanceIpv6Address(cidr);
        }
    }
}
