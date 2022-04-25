// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.DetectorModelAssetPropertyTimestamp;
import com.pulumi.awsnative.iotevents.inputs.DetectorModelAssetPropertyVariant;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A structure that contains value information. For more information, see [AssetPropertyValue](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetPropertyValue.html) in the *AWS IoT SiteWise API Reference*.
 * 
 */
public final class DetectorModelAssetPropertyValue extends com.pulumi.resources.InvokeArgs {

    public static final DetectorModelAssetPropertyValue Empty = new DetectorModelAssetPropertyValue();

    /**
     * The quality of the asset property value. The value must be `GOOD`, `BAD`, or `UNCERTAIN`. You can also specify an expression.
     * 
     */
    @Import(name="quality")
    private @Nullable String quality;

    /**
     * @return The quality of the asset property value. The value must be `GOOD`, `BAD`, or `UNCERTAIN`. You can also specify an expression.
     * 
     */
    public Optional<String> quality() {
        return Optional.ofNullable(this.quality);
    }

    @Import(name="timestamp")
    private @Nullable DetectorModelAssetPropertyTimestamp timestamp;

    public Optional<DetectorModelAssetPropertyTimestamp> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    @Import(name="value", required=true)
    private DetectorModelAssetPropertyVariant value;

    public DetectorModelAssetPropertyVariant value() {
        return this.value;
    }

    private DetectorModelAssetPropertyValue() {}

    private DetectorModelAssetPropertyValue(DetectorModelAssetPropertyValue $) {
        this.quality = $.quality;
        this.timestamp = $.timestamp;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelAssetPropertyValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelAssetPropertyValue $;

        public Builder() {
            $ = new DetectorModelAssetPropertyValue();
        }

        public Builder(DetectorModelAssetPropertyValue defaults) {
            $ = new DetectorModelAssetPropertyValue(Objects.requireNonNull(defaults));
        }

        /**
         * @param quality The quality of the asset property value. The value must be `GOOD`, `BAD`, or `UNCERTAIN`. You can also specify an expression.
         * 
         * @return builder
         * 
         */
        public Builder quality(@Nullable String quality) {
            $.quality = quality;
            return this;
        }

        public Builder timestamp(@Nullable DetectorModelAssetPropertyTimestamp timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        public Builder value(DetectorModelAssetPropertyVariant value) {
            $.value = value;
            return this;
        }

        public DetectorModelAssetPropertyValue build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
