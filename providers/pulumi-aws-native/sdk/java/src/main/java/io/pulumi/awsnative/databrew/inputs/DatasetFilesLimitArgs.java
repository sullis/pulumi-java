// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.DatasetFilesLimitOrder;
import io.pulumi.awsnative.databrew.enums.DatasetFilesLimitOrderedBy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetFilesLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetFilesLimitArgs Empty = new DatasetFilesLimitArgs();

    /**
     * Maximum number of files
     * 
     */
    @Import(name="maxFiles", required=true)
      private final Output<Integer> maxFiles;

    public Output<Integer> maxFiles() {
        return this.maxFiles;
    }

    /**
     * Order
     * 
     */
    @Import(name="order")
      private final @Nullable Output<DatasetFilesLimitOrder> order;

    public Output<DatasetFilesLimitOrder> order() {
        return this.order == null ? Codegen.empty() : this.order;
    }

    /**
     * Ordered by
     * 
     */
    @Import(name="orderedBy")
      private final @Nullable Output<DatasetFilesLimitOrderedBy> orderedBy;

    public Output<DatasetFilesLimitOrderedBy> orderedBy() {
        return this.orderedBy == null ? Codegen.empty() : this.orderedBy;
    }

    public DatasetFilesLimitArgs(
        Output<Integer> maxFiles,
        @Nullable Output<DatasetFilesLimitOrder> order,
        @Nullable Output<DatasetFilesLimitOrderedBy> orderedBy) {
        this.maxFiles = Objects.requireNonNull(maxFiles, "expected parameter 'maxFiles' to be non-null");
        this.order = order;
        this.orderedBy = orderedBy;
    }

    private DatasetFilesLimitArgs() {
        this.maxFiles = Codegen.empty();
        this.order = Codegen.empty();
        this.orderedBy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilesLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxFiles;
        private @Nullable Output<DatasetFilesLimitOrder> order;
        private @Nullable Output<DatasetFilesLimitOrderedBy> orderedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilesLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFiles = defaults.maxFiles;
    	      this.order = defaults.order;
    	      this.orderedBy = defaults.orderedBy;
        }

        public Builder maxFiles(Output<Integer> maxFiles) {
            this.maxFiles = Objects.requireNonNull(maxFiles);
            return this;
        }
        public Builder maxFiles(Integer maxFiles) {
            this.maxFiles = Output.of(Objects.requireNonNull(maxFiles));
            return this;
        }
        public Builder order(@Nullable Output<DatasetFilesLimitOrder> order) {
            this.order = order;
            return this;
        }
        public Builder order(@Nullable DatasetFilesLimitOrder order) {
            this.order = Codegen.ofNullable(order);
            return this;
        }
        public Builder orderedBy(@Nullable Output<DatasetFilesLimitOrderedBy> orderedBy) {
            this.orderedBy = orderedBy;
            return this;
        }
        public Builder orderedBy(@Nullable DatasetFilesLimitOrderedBy orderedBy) {
            this.orderedBy = Codegen.ofNullable(orderedBy);
            return this;
        }        public DatasetFilesLimitArgs build() {
            return new DatasetFilesLimitArgs(maxFiles, order, orderedBy);
        }
    }
}
