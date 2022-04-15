// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionTrustedSignerItemGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionTrustedSignerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionTrustedSignerGetArgs Empty = new DistributionTrustedSignerGetArgs();

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * List of nested attributes for each trusted signer
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<DistributionTrustedSignerItemGetArgs>> items;

    public Output<List<DistributionTrustedSignerItemGetArgs>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    public DistributionTrustedSignerGetArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<DistributionTrustedSignerItemGetArgs>> items) {
        this.enabled = enabled;
        this.items = items;
    }

    private DistributionTrustedSignerGetArgs() {
        this.enabled = Codegen.empty();
        this.items = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedSignerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<DistributionTrustedSignerItemGetArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedSignerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.items = defaults.items;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder items(@Nullable Output<List<DistributionTrustedSignerItemGetArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<DistributionTrustedSignerItemGetArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(DistributionTrustedSignerItemGetArgs... items) {
            return items(List.of(items));
        }        public DistributionTrustedSignerGetArgs build() {
            return new DistributionTrustedSignerGetArgs(enabled, items);
        }
    }
}
