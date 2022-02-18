// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ResponseHeadersPolicyContentTypeOptions {
    private final Boolean override;

    @OutputCustomType.Constructor({"override"})
    private ResponseHeadersPolicyContentTypeOptions(Boolean override) {
        this.override = Objects.requireNonNull(override);
    }

    public Boolean getOverride() {
        return this.override;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyContentTypeOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyContentTypeOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
        }

        public Builder setOverride(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public ResponseHeadersPolicyContentTypeOptions build() {
            return new ResponseHeadersPolicyContentTypeOptions(override);
        }
    }
}
