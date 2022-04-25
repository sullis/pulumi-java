// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IosTestLoopResponse {
    /**
     * @return Bundle ID of the app.
     * 
     */
    private final String bundleId;

    @CustomType.Constructor
    private IosTestLoopResponse(@CustomType.Parameter("bundleId") String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * @return Bundle ID of the app.
     * 
     */
    public String bundleId() {
        return this.bundleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestLoopResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bundleId;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestLoopResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
        }

        public Builder bundleId(String bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }        public IosTestLoopResponse build() {
            return new IosTestLoopResponse(bundleId);
        }
    }
}
