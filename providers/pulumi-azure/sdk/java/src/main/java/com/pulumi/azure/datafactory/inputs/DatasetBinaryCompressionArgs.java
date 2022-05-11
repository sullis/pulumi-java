// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetBinaryCompressionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetBinaryCompressionArgs Empty = new DatasetBinaryCompressionArgs();

    /**
     * The level of compression. Possible values are `Fastest` and `Optimal`.
     * 
     */
    @Import(name="level")
    private @Nullable Output<String> level;

    /**
     * @return The level of compression. Possible values are `Fastest` and `Optimal`.
     * 
     */
    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * The type of compression used during transport.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of compression used during transport.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DatasetBinaryCompressionArgs() {}

    private DatasetBinaryCompressionArgs(DatasetBinaryCompressionArgs $) {
        this.level = $.level;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetBinaryCompressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetBinaryCompressionArgs $;

        public Builder() {
            $ = new DatasetBinaryCompressionArgs();
        }

        public Builder(DatasetBinaryCompressionArgs defaults) {
            $ = new DatasetBinaryCompressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param level The level of compression. Possible values are `Fastest` and `Optimal`.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level The level of compression. Possible values are `Fastest` and `Optimal`.
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param type The type of compression used during transport.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of compression used during transport.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DatasetBinaryCompressionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
