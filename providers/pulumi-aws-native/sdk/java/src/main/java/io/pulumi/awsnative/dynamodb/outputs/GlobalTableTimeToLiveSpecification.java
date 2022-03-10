// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalTableTimeToLiveSpecification {
    private final @Nullable String attributeName;
    private final Boolean enabled;

    @OutputCustomType.Constructor
    private GlobalTableTimeToLiveSpecification(
        @OutputCustomType.Parameter("attributeName") @Nullable String attributeName,
        @OutputCustomType.Parameter("enabled") Boolean enabled) {
        this.attributeName = attributeName;
        this.enabled = enabled;
    }

    public Optional<String> getAttributeName() {
        return Optional.ofNullable(this.attributeName);
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableTimeToLiveSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String attributeName;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableTimeToLiveSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.enabled = defaults.enabled;
        }

        public Builder setAttributeName(@Nullable String attributeName) {
            this.attributeName = attributeName;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GlobalTableTimeToLiveSpecification build() {
            return new GlobalTableTimeToLiveSpecification(attributeName, enabled);
        }
    }
}
