// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginCustomHeader extends io.pulumi.resources.InvokeArgs {

    public static final DistributionOriginCustomHeader Empty = new DistributionOriginCustomHeader();

    @InputImport(name="headerName", required=true)
    private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    @InputImport(name="headerValue", required=true)
    private final String headerValue;

    public String getHeaderValue() {
        return this.headerValue;
    }

    public DistributionOriginCustomHeader(
        String headerName,
        String headerValue) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.headerValue = Objects.requireNonNull(headerValue, "expected parameter 'headerValue' to be non-null");
    }

    private DistributionOriginCustomHeader() {
        this.headerName = null;
        this.headerValue = null;
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
