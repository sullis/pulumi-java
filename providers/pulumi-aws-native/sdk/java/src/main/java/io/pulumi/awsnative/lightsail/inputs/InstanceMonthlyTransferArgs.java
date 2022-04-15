// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Monthly Transfer of the Instance.
 * 
 */
public final class InstanceMonthlyTransferArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMonthlyTransferArgs Empty = new InstanceMonthlyTransferArgs();

    /**
     * GbPerMonthAllocated of the Instance.
     * 
     */
    @Import(name="gbPerMonthAllocated")
      private final @Nullable Output<String> gbPerMonthAllocated;

    public Output<String> gbPerMonthAllocated() {
        return this.gbPerMonthAllocated == null ? Codegen.empty() : this.gbPerMonthAllocated;
    }

    public InstanceMonthlyTransferArgs(@Nullable Output<String> gbPerMonthAllocated) {
        this.gbPerMonthAllocated = gbPerMonthAllocated;
    }

    private InstanceMonthlyTransferArgs() {
        this.gbPerMonthAllocated = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMonthlyTransferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gbPerMonthAllocated;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMonthlyTransferArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gbPerMonthAllocated = defaults.gbPerMonthAllocated;
        }

        public Builder gbPerMonthAllocated(@Nullable Output<String> gbPerMonthAllocated) {
            this.gbPerMonthAllocated = gbPerMonthAllocated;
            return this;
        }
        public Builder gbPerMonthAllocated(@Nullable String gbPerMonthAllocated) {
            this.gbPerMonthAllocated = Codegen.ofNullable(gbPerMonthAllocated);
            return this;
        }        public InstanceMonthlyTransferArgs build() {
            return new InstanceMonthlyTransferArgs(gbPerMonthAllocated);
        }
    }
}
