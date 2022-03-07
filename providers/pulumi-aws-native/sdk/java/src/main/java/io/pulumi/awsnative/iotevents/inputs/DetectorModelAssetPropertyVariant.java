// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A structure that contains an asset property value. For more information, see [Variant](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html) in the *AWS IoT SiteWise API Reference*.
 * 
 */
public final class DetectorModelAssetPropertyVariant extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelAssetPropertyVariant Empty = new DetectorModelAssetPropertyVariant();

    /**
     * The asset property value is a Boolean value that must be `TRUE` or `FALSE`. You can also specify an expression. If you use an expression, the evaluated result should be a Boolean value.
     * 
     */
    @InputImport(name="booleanValue")
      private final @Nullable String booleanValue;

    public Optional<String> getBooleanValue() {
        return this.booleanValue == null ? Optional.empty() : Optional.ofNullable(this.booleanValue);
    }

    /**
     * The asset property value is a double. You can also specify an expression. If you use an expression, the evaluated result should be a double.
     * 
     */
    @InputImport(name="doubleValue")
      private final @Nullable String doubleValue;

    public Optional<String> getDoubleValue() {
        return this.doubleValue == null ? Optional.empty() : Optional.ofNullable(this.doubleValue);
    }

    /**
     * The asset property value is an integer. You can also specify an expression. If you use an expression, the evaluated result should be an integer.
     * 
     */
    @InputImport(name="integerValue")
      private final @Nullable String integerValue;

    public Optional<String> getIntegerValue() {
        return this.integerValue == null ? Optional.empty() : Optional.ofNullable(this.integerValue);
    }

    /**
     * The asset property value is a string. You can also specify an expression. If you use an expression, the evaluated result should be a string.
     * 
     */
    @InputImport(name="stringValue")
      private final @Nullable String stringValue;

    public Optional<String> getStringValue() {
        return this.stringValue == null ? Optional.empty() : Optional.ofNullable(this.stringValue);
    }

    public DetectorModelAssetPropertyVariant(
        @Nullable String booleanValue,
        @Nullable String doubleValue,
        @Nullable String integerValue,
        @Nullable String stringValue) {
        this.booleanValue = booleanValue;
        this.doubleValue = doubleValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
    }

    private DetectorModelAssetPropertyVariant() {
        this.booleanValue = null;
        this.doubleValue = null;
        this.integerValue = null;
        this.stringValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelAssetPropertyVariant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String booleanValue;
        private @Nullable String doubleValue;
        private @Nullable String integerValue;
        private @Nullable String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelAssetPropertyVariant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setBooleanValue(@Nullable String booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setDoubleValue(@Nullable String doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setIntegerValue(@Nullable String integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public DetectorModelAssetPropertyVariant build() {
            return new DetectorModelAssetPropertyVariant(booleanValue, doubleValue, integerValue, stringValue);
        }
    }
}