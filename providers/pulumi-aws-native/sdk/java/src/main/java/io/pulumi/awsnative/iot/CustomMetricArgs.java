// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.CustomMetricMetricType;
import io.pulumi.awsnative.iot.inputs.CustomMetricTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomMetricArgs Empty = new CustomMetricArgs();

    /**
     * Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn't begin with aws: . Cannot be updated once defined.
     * 
     */
    @InputImport(name="metricName")
    private final @Nullable Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName == null ? Input.empty() : this.metricName;
    }

    /**
     * The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
     * 
     */
    @InputImport(name="metricType", required=true)
    private final Input<CustomMetricMetricType> metricType;

    public Input<CustomMetricMetricType> getMetricType() {
        return this.metricType;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<CustomMetricTagArgs>> tags;

    public Input<List<CustomMetricTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CustomMetricArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> metricName,
        Input<CustomMetricMetricType> metricType,
        @Nullable Input<List<CustomMetricTagArgs>> tags) {
        this.displayName = displayName;
        this.metricName = metricName;
        this.metricType = Objects.requireNonNull(metricType, "expected parameter 'metricType' to be non-null");
        this.tags = tags;
    }

    private CustomMetricArgs() {
        this.displayName = Input.empty();
        this.metricName = Input.empty();
        this.metricType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> metricName;
        private Input<CustomMetricMetricType> metricType;
        private @Nullable Input<List<CustomMetricTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.metricName = defaults.metricName;
    	      this.metricType = defaults.metricType;
    	      this.tags = defaults.tags;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setMetricName(@Nullable Input<String> metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder setMetricName(@Nullable String metricName) {
            this.metricName = Input.ofNullable(metricName);
            return this;
        }

        public Builder setMetricType(Input<CustomMetricMetricType> metricType) {
            this.metricType = Objects.requireNonNull(metricType);
            return this;
        }

        public Builder setMetricType(CustomMetricMetricType metricType) {
            this.metricType = Input.of(Objects.requireNonNull(metricType));
            return this;
        }

        public Builder setTags(@Nullable Input<List<CustomMetricTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<CustomMetricTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public CustomMetricArgs build() {
            return new CustomMetricArgs(displayName, metricName, metricType, tags);
        }
    }
}
