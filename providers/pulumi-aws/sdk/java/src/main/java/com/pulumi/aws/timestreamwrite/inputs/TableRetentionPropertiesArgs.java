// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.timestreamwrite.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class TableRetentionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableRetentionPropertiesArgs Empty = new TableRetentionPropertiesArgs();

    /**
     * The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
     * 
     */
    @Import(name="magneticStoreRetentionPeriodInDays", required=true)
    private Output<Integer> magneticStoreRetentionPeriodInDays;

    /**
     * @return The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
     * 
     */
    public Output<Integer> magneticStoreRetentionPeriodInDays() {
        return this.magneticStoreRetentionPeriodInDays;
    }

    /**
     * The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
     * 
     */
    @Import(name="memoryStoreRetentionPeriodInHours", required=true)
    private Output<Integer> memoryStoreRetentionPeriodInHours;

    /**
     * @return The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
     * 
     */
    public Output<Integer> memoryStoreRetentionPeriodInHours() {
        return this.memoryStoreRetentionPeriodInHours;
    }

    private TableRetentionPropertiesArgs() {}

    private TableRetentionPropertiesArgs(TableRetentionPropertiesArgs $) {
        this.magneticStoreRetentionPeriodInDays = $.magneticStoreRetentionPeriodInDays;
        this.memoryStoreRetentionPeriodInHours = $.memoryStoreRetentionPeriodInHours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableRetentionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableRetentionPropertiesArgs $;

        public Builder() {
            $ = new TableRetentionPropertiesArgs();
        }

        public Builder(TableRetentionPropertiesArgs defaults) {
            $ = new TableRetentionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param magneticStoreRetentionPeriodInDays The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
         * 
         * @return builder
         * 
         */
        public Builder magneticStoreRetentionPeriodInDays(Output<Integer> magneticStoreRetentionPeriodInDays) {
            $.magneticStoreRetentionPeriodInDays = magneticStoreRetentionPeriodInDays;
            return this;
        }

        /**
         * @param magneticStoreRetentionPeriodInDays The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
         * 
         * @return builder
         * 
         */
        public Builder magneticStoreRetentionPeriodInDays(Integer magneticStoreRetentionPeriodInDays) {
            return magneticStoreRetentionPeriodInDays(Output.of(magneticStoreRetentionPeriodInDays));
        }

        /**
         * @param memoryStoreRetentionPeriodInHours The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
         * 
         * @return builder
         * 
         */
        public Builder memoryStoreRetentionPeriodInHours(Output<Integer> memoryStoreRetentionPeriodInHours) {
            $.memoryStoreRetentionPeriodInHours = memoryStoreRetentionPeriodInHours;
            return this;
        }

        /**
         * @param memoryStoreRetentionPeriodInHours The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
         * 
         * @return builder
         * 
         */
        public Builder memoryStoreRetentionPeriodInHours(Integer memoryStoreRetentionPeriodInHours) {
            return memoryStoreRetentionPeriodInHours(Output.of(memoryStoreRetentionPeriodInHours));
        }

        public TableRetentionPropertiesArgs build() {
            $.magneticStoreRetentionPeriodInDays = Objects.requireNonNull($.magneticStoreRetentionPeriodInDays, "expected parameter 'magneticStoreRetentionPeriodInDays' to be non-null");
            $.memoryStoreRetentionPeriodInHours = Objects.requireNonNull($.memoryStoreRetentionPeriodInHours, "expected parameter 'memoryStoreRetentionPeriodInHours' to be non-null");
            return $;
        }
    }

}
