// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelAssetPropertyTimestampArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelAssetPropertyVariantArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorModelAssetPropertyValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelAssetPropertyValueArgs Empty = new DetectorModelAssetPropertyValueArgs();

    @InputImport(name="quality")
    private final @Nullable Input<String> quality;

    public Input<String> getQuality() {
        return this.quality == null ? Input.empty() : this.quality;
    }

    @InputImport(name="timestamp")
    private final @Nullable Input<DetectorModelAssetPropertyTimestampArgs> timestamp;

    public Input<DetectorModelAssetPropertyTimestampArgs> getTimestamp() {
        return this.timestamp == null ? Input.empty() : this.timestamp;
    }

    @InputImport(name="value", required=true)
    private final Input<DetectorModelAssetPropertyVariantArgs> value;

    public Input<DetectorModelAssetPropertyVariantArgs> getValue() {
        return this.value;
    }

    public DetectorModelAssetPropertyValueArgs(
        @Nullable Input<String> quality,
        @Nullable Input<DetectorModelAssetPropertyTimestampArgs> timestamp,
        Input<DetectorModelAssetPropertyVariantArgs> value) {
        this.quality = quality;
        this.timestamp = timestamp;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private DetectorModelAssetPropertyValueArgs() {
        this.quality = Input.empty();
        this.timestamp = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelAssetPropertyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> quality;
        private @Nullable Input<DetectorModelAssetPropertyTimestampArgs> timestamp;
        private Input<DetectorModelAssetPropertyVariantArgs> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelAssetPropertyValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quality = defaults.quality;
    	      this.timestamp = defaults.timestamp;
    	      this.value = defaults.value;
        }

        public Builder setQuality(@Nullable Input<String> quality) {
            this.quality = quality;
            return this;
        }

        public Builder setQuality(@Nullable String quality) {
            this.quality = Input.ofNullable(quality);
            return this;
        }

        public Builder setTimestamp(@Nullable Input<DetectorModelAssetPropertyTimestampArgs> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setTimestamp(@Nullable DetectorModelAssetPropertyTimestampArgs timestamp) {
            this.timestamp = Input.ofNullable(timestamp);
            return this;
        }

        public Builder setValue(Input<DetectorModelAssetPropertyVariantArgs> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(DetectorModelAssetPropertyVariantArgs value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public DetectorModelAssetPropertyValueArgs build() {
            return new DetectorModelAssetPropertyValueArgs(quality, timestamp, value);
        }
    }
}
