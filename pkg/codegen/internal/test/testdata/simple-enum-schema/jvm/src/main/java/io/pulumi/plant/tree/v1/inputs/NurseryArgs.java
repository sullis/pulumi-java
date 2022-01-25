// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.plant.Utilities;


public final class NurseryArgs extends io.pulumi.resources.ResourceArgs {

    public static final NurseryArgs Empty = new NurseryArgs();

    @InputImport(name="sizes")
    private final @Nullable Input<Map<String,io.pulumi.plant.tree.v1.enums.TreeSize>> sizes;

    public Input<Map<String,io.pulumi.plant.tree.v1.enums.TreeSize>> getSizes() {
        return this.sizes == null ? Input.empty() : this.sizes;
    }

    @InputImport(name="varieties", required=true)
    private final Input<List<io.pulumi.plant.tree.v1.enums.RubberTreeVariety>> varieties;

    public Input<List<io.pulumi.plant.tree.v1.enums.RubberTreeVariety>> getVarieties() {
        return this.varieties;
    }

    public NurseryArgs(
        @Nullable Input<Map<String,io.pulumi.plant.tree.v1.enums.TreeSize>> sizes,
        Input<List<io.pulumi.plant.tree.v1.enums.RubberTreeVariety>> varieties) {
        this.sizes = sizes;
        this.varieties = Objects.requireNonNull(varieties, "expected parameter 'varieties' to be non-null");
    }

    private NurseryArgs() {
        this.sizes = Input.empty();
        this.varieties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NurseryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,io.pulumi.plant.tree.v1.enums.TreeSize>> sizes;
        private Input<List<io.pulumi.plant.tree.v1.enums.RubberTreeVariety>> varieties;

        public Builder() {
    	      // Empty
        }

        public Builder(NurseryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizes = defaults.sizes;
    	      this.varieties = defaults.varieties;
        }

        public Builder setSizes(@Nullable Input<Map<String,io.pulumi.plant.tree.v1.enums.TreeSize>> sizes) {
            this.sizes = sizes;
            return this;
        }

        public Builder setSizes(@Nullable Map<String,io.pulumi.plant.tree.v1.enums.TreeSize> sizes) {
            this.sizes = Input.ofNullable(sizes);
            return this;
        }

        public Builder setVarieties(Input<List<io.pulumi.plant.tree.v1.enums.RubberTreeVariety>> varieties) {
            this.varieties = Objects.requireNonNull(varieties);
            return this;
        }

        public Builder setVarieties(List<io.pulumi.plant.tree.v1.enums.RubberTreeVariety> varieties) {
            this.varieties = Input.of(Objects.requireNonNull(varieties));
            return this;
        }

        public NurseryArgs build() {
            return new NurseryArgs(sizes, varieties);
        }
    }
}
