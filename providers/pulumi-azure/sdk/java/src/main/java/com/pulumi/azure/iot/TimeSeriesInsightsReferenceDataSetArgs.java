// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.iot.inputs.TimeSeriesInsightsReferenceDataSetKeyPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TimeSeriesInsightsReferenceDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeSeriesInsightsReferenceDataSetArgs Empty = new TimeSeriesInsightsReferenceDataSetArgs();

    /**
     * The comparison behavior that will be used to compare keys. Valid values include `Ordinal` and `OrdinalIgnoreCase`. Defaults to `Ordinal`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="dataStringComparisonBehavior")
    private @Nullable Output<String> dataStringComparisonBehavior;

    /**
     * @return The comparison behavior that will be used to compare keys. Valid values include `Ordinal` and `OrdinalIgnoreCase`. Defaults to `Ordinal`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> dataStringComparisonBehavior() {
        return Optional.ofNullable(this.dataStringComparisonBehavior);
    }

    /**
     * A `key_property` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="keyProperties", required=true)
    private Output<List<TimeSeriesInsightsReferenceDataSetKeyPropertyArgs>> keyProperties;

    /**
     * @return A `key_property` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<List<TimeSeriesInsightsReferenceDataSetKeyPropertyArgs>> keyProperties() {
        return this.keyProperties;
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The resource ID of the Azure IoT Time Series Insights Environment in which to create the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="timeSeriesInsightsEnvironmentId", required=true)
    private Output<String> timeSeriesInsightsEnvironmentId;

    /**
     * @return The resource ID of the Azure IoT Time Series Insights Environment in which to create the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> timeSeriesInsightsEnvironmentId() {
        return this.timeSeriesInsightsEnvironmentId;
    }

    private TimeSeriesInsightsReferenceDataSetArgs() {}

    private TimeSeriesInsightsReferenceDataSetArgs(TimeSeriesInsightsReferenceDataSetArgs $) {
        this.dataStringComparisonBehavior = $.dataStringComparisonBehavior;
        this.keyProperties = $.keyProperties;
        this.location = $.location;
        this.name = $.name;
        this.tags = $.tags;
        this.timeSeriesInsightsEnvironmentId = $.timeSeriesInsightsEnvironmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesInsightsReferenceDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesInsightsReferenceDataSetArgs $;

        public Builder() {
            $ = new TimeSeriesInsightsReferenceDataSetArgs();
        }

        public Builder(TimeSeriesInsightsReferenceDataSetArgs defaults) {
            $ = new TimeSeriesInsightsReferenceDataSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataStringComparisonBehavior The comparison behavior that will be used to compare keys. Valid values include `Ordinal` and `OrdinalIgnoreCase`. Defaults to `Ordinal`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataStringComparisonBehavior(@Nullable Output<String> dataStringComparisonBehavior) {
            $.dataStringComparisonBehavior = dataStringComparisonBehavior;
            return this;
        }

        /**
         * @param dataStringComparisonBehavior The comparison behavior that will be used to compare keys. Valid values include `Ordinal` and `OrdinalIgnoreCase`. Defaults to `Ordinal`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataStringComparisonBehavior(String dataStringComparisonBehavior) {
            return dataStringComparisonBehavior(Output.of(dataStringComparisonBehavior));
        }

        /**
         * @param keyProperties A `key_property` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyProperties(Output<List<TimeSeriesInsightsReferenceDataSetKeyPropertyArgs>> keyProperties) {
            $.keyProperties = keyProperties;
            return this;
        }

        /**
         * @param keyProperties A `key_property` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyProperties(List<TimeSeriesInsightsReferenceDataSetKeyPropertyArgs> keyProperties) {
            return keyProperties(Output.of(keyProperties));
        }

        /**
         * @param keyProperties A `key_property` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyProperties(TimeSeriesInsightsReferenceDataSetKeyPropertyArgs... keyProperties) {
            return keyProperties(List.of(keyProperties));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param timeSeriesInsightsEnvironmentId The resource ID of the Azure IoT Time Series Insights Environment in which to create the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesInsightsEnvironmentId(Output<String> timeSeriesInsightsEnvironmentId) {
            $.timeSeriesInsightsEnvironmentId = timeSeriesInsightsEnvironmentId;
            return this;
        }

        /**
         * @param timeSeriesInsightsEnvironmentId The resource ID of the Azure IoT Time Series Insights Environment in which to create the Azure IoT Time Series Insights Reference Data Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesInsightsEnvironmentId(String timeSeriesInsightsEnvironmentId) {
            return timeSeriesInsightsEnvironmentId(Output.of(timeSeriesInsightsEnvironmentId));
        }

        public TimeSeriesInsightsReferenceDataSetArgs build() {
            $.keyProperties = Objects.requireNonNull($.keyProperties, "expected parameter 'keyProperties' to be non-null");
            $.timeSeriesInsightsEnvironmentId = Objects.requireNonNull($.timeSeriesInsightsEnvironmentId, "expected parameter 'timeSeriesInsightsEnvironmentId' to be non-null");
            return $;
        }
    }

}
