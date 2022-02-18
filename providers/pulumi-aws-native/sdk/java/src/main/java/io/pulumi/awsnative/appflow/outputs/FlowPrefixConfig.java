// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowPrefixFormat;
import io.pulumi.awsnative.appflow.enums.FlowPrefixType;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowPrefixConfig {
    private final @Nullable FlowPrefixFormat prefixFormat;
    private final @Nullable FlowPrefixType prefixType;

    @OutputCustomType.Constructor({"prefixFormat","prefixType"})
    private FlowPrefixConfig(
        @Nullable FlowPrefixFormat prefixFormat,
        @Nullable FlowPrefixType prefixType) {
        this.prefixFormat = prefixFormat;
        this.prefixType = prefixType;
    }

    public Optional<FlowPrefixFormat> getPrefixFormat() {
        return Optional.ofNullable(this.prefixFormat);
    }
    public Optional<FlowPrefixType> getPrefixType() {
        return Optional.ofNullable(this.prefixType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowPrefixConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowPrefixFormat prefixFormat;
        private @Nullable FlowPrefixType prefixType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowPrefixConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefixFormat = defaults.prefixFormat;
    	      this.prefixType = defaults.prefixType;
        }

        public Builder setPrefixFormat(@Nullable FlowPrefixFormat prefixFormat) {
            this.prefixFormat = prefixFormat;
            return this;
        }

        public Builder setPrefixType(@Nullable FlowPrefixType prefixType) {
            this.prefixType = prefixType;
            return this;
        }

        public FlowPrefixConfig build() {
            return new FlowPrefixConfig(prefixFormat, prefixType);
        }
    }
}
