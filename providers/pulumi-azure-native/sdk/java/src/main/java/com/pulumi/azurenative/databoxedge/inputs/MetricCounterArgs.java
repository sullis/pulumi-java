// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.MetricDimensionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The metric counter
 * 
 */
public final class MetricCounterArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricCounterArgs Empty = new MetricCounterArgs();

    /**
     * The additional dimensions to be added to metric.
     * 
     */
    @Import(name="additionalDimensions")
    private @Nullable Output<List<MetricDimensionArgs>> additionalDimensions;

    /**
     * @return The additional dimensions to be added to metric.
     * 
     */
    public Optional<Output<List<MetricDimensionArgs>>> additionalDimensions() {
        return Optional.ofNullable(this.additionalDimensions);
    }

    /**
     * The dimension filter.
     * 
     */
    @Import(name="dimensionFilter")
    private @Nullable Output<List<MetricDimensionArgs>> dimensionFilter;

    /**
     * @return The dimension filter.
     * 
     */
    public Optional<Output<List<MetricDimensionArgs>>> dimensionFilter() {
        return Optional.ofNullable(this.dimensionFilter);
    }

    /**
     * The instance from which counter should be collected.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The instance from which counter should be collected.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * The counter name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The counter name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private MetricCounterArgs() {}

    private MetricCounterArgs(MetricCounterArgs $) {
        this.additionalDimensions = $.additionalDimensions;
        this.dimensionFilter = $.dimensionFilter;
        this.instance = $.instance;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricCounterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricCounterArgs $;

        public Builder() {
            $ = new MetricCounterArgs();
        }

        public Builder(MetricCounterArgs defaults) {
            $ = new MetricCounterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalDimensions The additional dimensions to be added to metric.
         * 
         * @return builder
         * 
         */
        public Builder additionalDimensions(@Nullable Output<List<MetricDimensionArgs>> additionalDimensions) {
            $.additionalDimensions = additionalDimensions;
            return this;
        }

        /**
         * @param additionalDimensions The additional dimensions to be added to metric.
         * 
         * @return builder
         * 
         */
        public Builder additionalDimensions(List<MetricDimensionArgs> additionalDimensions) {
            return additionalDimensions(Output.of(additionalDimensions));
        }

        /**
         * @param additionalDimensions The additional dimensions to be added to metric.
         * 
         * @return builder
         * 
         */
        public Builder additionalDimensions(MetricDimensionArgs... additionalDimensions) {
            return additionalDimensions(List.of(additionalDimensions));
        }

        /**
         * @param dimensionFilter The dimension filter.
         * 
         * @return builder
         * 
         */
        public Builder dimensionFilter(@Nullable Output<List<MetricDimensionArgs>> dimensionFilter) {
            $.dimensionFilter = dimensionFilter;
            return this;
        }

        /**
         * @param dimensionFilter The dimension filter.
         * 
         * @return builder
         * 
         */
        public Builder dimensionFilter(List<MetricDimensionArgs> dimensionFilter) {
            return dimensionFilter(Output.of(dimensionFilter));
        }

        /**
         * @param dimensionFilter The dimension filter.
         * 
         * @return builder
         * 
         */
        public Builder dimensionFilter(MetricDimensionArgs... dimensionFilter) {
            return dimensionFilter(List.of(dimensionFilter));
        }

        /**
         * @param instance The instance from which counter should be collected.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The instance from which counter should be collected.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param name The counter name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The counter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public MetricCounterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
