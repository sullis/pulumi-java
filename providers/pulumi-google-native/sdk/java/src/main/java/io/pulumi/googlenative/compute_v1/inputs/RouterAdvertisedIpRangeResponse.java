// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Description-tagged IP ranges for the router to advertise.
 * 
 */
public final class RouterAdvertisedIpRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterAdvertisedIpRangeResponse Empty = new RouterAdvertisedIpRangeResponse();

    /**
     * User-specified description for the IP range.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    @InputImport(name="range", required=true)
      private final String range;

    public String getRange() {
        return this.range;
    }

    public RouterAdvertisedIpRangeResponse(
        String description,
        String range) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
    }

    private RouterAdvertisedIpRangeResponse() {
        this.description = null;
        this.range = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterAdvertisedIpRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterAdvertisedIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setRange(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public RouterAdvertisedIpRangeResponse build() {
            return new RouterAdvertisedIpRangeResponse(description, range);
        }
    }
}