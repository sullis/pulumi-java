// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GlobalTableContributorInsightsSpecification {
    private final Boolean enabled;

    @CustomType.Constructor
    private GlobalTableContributorInsightsSpecification(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableContributorInsightsSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableContributorInsightsSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GlobalTableContributorInsightsSpecification build() {
            return new GlobalTableContributorInsightsSpecification(enabled);
        }
    }
}
