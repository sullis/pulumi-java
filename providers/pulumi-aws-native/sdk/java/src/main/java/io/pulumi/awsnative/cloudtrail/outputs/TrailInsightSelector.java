// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrailInsightSelector {
    /**
     * The type of insight to log on a trail.
     * 
     */
    private final @Nullable String insightType;

    @CustomType.Constructor
    private TrailInsightSelector(@CustomType.Parameter("insightType") @Nullable String insightType) {
        this.insightType = insightType;
    }

    /**
     * The type of insight to log on a trail.
     * 
    */
    public Optional<String> insightType() {
        return Optional.ofNullable(this.insightType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailInsightSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String insightType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailInsightSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insightType = defaults.insightType;
        }

        public Builder insightType(@Nullable String insightType) {
            this.insightType = insightType;
            return this;
        }        public TrailInsightSelector build() {
            return new TrailInsightSelector(insightType);
        }
    }
}
