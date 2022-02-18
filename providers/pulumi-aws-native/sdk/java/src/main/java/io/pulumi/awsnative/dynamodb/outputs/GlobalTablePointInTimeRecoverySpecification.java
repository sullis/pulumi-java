// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalTablePointInTimeRecoverySpecification {
    private final @Nullable Boolean pointInTimeRecoveryEnabled;

    @OutputCustomType.Constructor({"pointInTimeRecoveryEnabled"})
    private GlobalTablePointInTimeRecoverySpecification(@Nullable Boolean pointInTimeRecoveryEnabled) {
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
    }

    public Optional<Boolean> getPointInTimeRecoveryEnabled() {
        return Optional.ofNullable(this.pointInTimeRecoveryEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTablePointInTimeRecoverySpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean pointInTimeRecoveryEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTablePointInTimeRecoverySpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
        }

        public Builder setPointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }

        public GlobalTablePointInTimeRecoverySpecification build() {
            return new GlobalTablePointInTimeRecoverySpecification(pointInTimeRecoveryEnabled);
        }
    }
}
