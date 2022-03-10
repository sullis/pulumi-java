// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionFunctionAssociation {
    private final @Nullable String eventType;
    private final @Nullable String functionARN;

    @OutputCustomType.Constructor
    private DistributionFunctionAssociation(
        @OutputCustomType.Parameter("eventType") @Nullable String eventType,
        @OutputCustomType.Parameter("functionARN") @Nullable String functionARN) {
        this.eventType = eventType;
        this.functionARN = functionARN;
    }

    public Optional<String> getEventType() {
        return Optional.ofNullable(this.eventType);
    }
    public Optional<String> getFunctionARN() {
        return Optional.ofNullable(this.functionARN);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionFunctionAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventType;
        private @Nullable String functionARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionFunctionAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.functionARN = defaults.functionARN;
        }

        public Builder setEventType(@Nullable String eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setFunctionARN(@Nullable String functionARN) {
            this.functionARN = functionARN;
            return this;
        }
        public DistributionFunctionAssociation build() {
            return new DistributionFunctionAssociation(eventType, functionARN);
        }
    }
}
