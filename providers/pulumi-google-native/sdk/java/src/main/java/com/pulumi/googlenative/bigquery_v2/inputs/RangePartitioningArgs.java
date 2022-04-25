// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.RangePartitioningRangeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RangePartitioningArgs extends com.pulumi.resources.ResourceArgs {

    public static final RangePartitioningArgs Empty = new RangePartitioningArgs();

    /**
     * [TrustedTester] [Required] The table is partitioned by this field. The field must be a top-level NULLABLE/REQUIRED field. The only supported type is INTEGER/INT64.
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return [TrustedTester] [Required] The table is partitioned by this field. The field must be a top-level NULLABLE/REQUIRED field. The only supported type is INTEGER/INT64.
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * [TrustedTester] [Required] Defines the ranges for range partitioning.
     * 
     */
    @Import(name="range")
    private @Nullable Output<RangePartitioningRangeArgs> range;

    /**
     * @return [TrustedTester] [Required] Defines the ranges for range partitioning.
     * 
     */
    public Optional<Output<RangePartitioningRangeArgs>> range() {
        return Optional.ofNullable(this.range);
    }

    private RangePartitioningArgs() {}

    private RangePartitioningArgs(RangePartitioningArgs $) {
        this.field = $.field;
        this.range = $.range;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RangePartitioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RangePartitioningArgs $;

        public Builder() {
            $ = new RangePartitioningArgs();
        }

        public Builder(RangePartitioningArgs defaults) {
            $ = new RangePartitioningArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param field [TrustedTester] [Required] The table is partitioned by this field. The field must be a top-level NULLABLE/REQUIRED field. The only supported type is INTEGER/INT64.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field [TrustedTester] [Required] The table is partitioned by this field. The field must be a top-level NULLABLE/REQUIRED field. The only supported type is INTEGER/INT64.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param range [TrustedTester] [Required] Defines the ranges for range partitioning.
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<RangePartitioningRangeArgs> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range [TrustedTester] [Required] Defines the ranges for range partitioning.
         * 
         * @return builder
         * 
         */
        public Builder range(RangePartitioningRangeArgs range) {
            return range(Output.of(range));
        }

        public RangePartitioningArgs build() {
            return $;
        }
    }

}
