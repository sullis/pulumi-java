// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DistributionOriginCustomHeader {
    private final String headerName;
    private final String headerValue;

    @OutputCustomType.Constructor
    private DistributionOriginCustomHeader(
        @OutputCustomType.Parameter("headerName") String headerName,
        @OutputCustomType.Parameter("headerValue") String headerValue) {
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    public String getHeaderName() {
        return this.headerName;
    }
    public String getHeaderValue() {
        return this.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginCustomHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String headerValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginCustomHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        public DistributionOriginCustomHeader build() {
            return new DistributionOriginCustomHeader(headerName, headerValue);
        }
    }
}
