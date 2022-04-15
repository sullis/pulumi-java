// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DistributionOriginGroupFailoverCriteria {
    /**
     * A list of HTTP status codes for the origin group
     * 
     */
    private final List<Integer> statusCodes;

    @CustomType.Constructor
    private DistributionOriginGroupFailoverCriteria(@CustomType.Parameter("statusCodes") List<Integer> statusCodes) {
        this.statusCodes = statusCodes;
    }

    /**
     * A list of HTTP status codes for the origin group
     * 
    */
    public List<Integer> statusCodes() {
        return this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupFailoverCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupFailoverCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder statusCodes(List<Integer> statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }
        public Builder statusCodes(Integer... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }        public DistributionOriginGroupFailoverCriteria build() {
            return new DistributionOriginGroupFailoverCriteria(statusCodes);
        }
    }
}
