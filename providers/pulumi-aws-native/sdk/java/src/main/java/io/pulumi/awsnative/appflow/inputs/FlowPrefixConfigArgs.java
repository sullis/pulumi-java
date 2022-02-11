// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowPrefixFormat;
import io.pulumi.awsnative.appflow.enums.FlowPrefixType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowPrefixConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowPrefixConfigArgs Empty = new FlowPrefixConfigArgs();

    @InputImport(name="prefixFormat")
    private final @Nullable Input<FlowPrefixFormat> prefixFormat;

    public Input<FlowPrefixFormat> getPrefixFormat() {
        return this.prefixFormat == null ? Input.empty() : this.prefixFormat;
    }

    @InputImport(name="prefixType")
    private final @Nullable Input<FlowPrefixType> prefixType;

    public Input<FlowPrefixType> getPrefixType() {
        return this.prefixType == null ? Input.empty() : this.prefixType;
    }

    public FlowPrefixConfigArgs(
        @Nullable Input<FlowPrefixFormat> prefixFormat,
        @Nullable Input<FlowPrefixType> prefixType) {
        this.prefixFormat = prefixFormat;
        this.prefixType = prefixType;
    }

    private FlowPrefixConfigArgs() {
        this.prefixFormat = Input.empty();
        this.prefixType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowPrefixConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowPrefixFormat> prefixFormat;
        private @Nullable Input<FlowPrefixType> prefixType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowPrefixConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefixFormat = defaults.prefixFormat;
    	      this.prefixType = defaults.prefixType;
        }

        public Builder setPrefixFormat(@Nullable Input<FlowPrefixFormat> prefixFormat) {
            this.prefixFormat = prefixFormat;
            return this;
        }

        public Builder setPrefixFormat(@Nullable FlowPrefixFormat prefixFormat) {
            this.prefixFormat = Input.ofNullable(prefixFormat);
            return this;
        }

        public Builder setPrefixType(@Nullable Input<FlowPrefixType> prefixType) {
            this.prefixType = prefixType;
            return this;
        }

        public Builder setPrefixType(@Nullable FlowPrefixType prefixType) {
            this.prefixType = Input.ofNullable(prefixType);
            return this;
        }

        public FlowPrefixConfigArgs build() {
            return new FlowPrefixConfigArgs(prefixFormat, prefixType);
        }
    }
}
