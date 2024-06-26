// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DimensionsResponse {
    /**
     * @return Depth of the device.
     * 
     */
    private Double depth;
    /**
     * @return Height of the device.
     * 
     */
    private Double height;
    /**
     * @return Length of the device.
     * 
     */
    private Double length;
    /**
     * @return Unit for the dimensions of length, height and width.
     * 
     */
    private String lengthHeightUnit;
    /**
     * @return Weight of the device.
     * 
     */
    private Double weight;
    /**
     * @return Unit for the dimensions of weight.
     * 
     */
    private String weightUnit;
    /**
     * @return Width of the device.
     * 
     */
    private Double width;

    private DimensionsResponse() {}
    /**
     * @return Depth of the device.
     * 
     */
    public Double depth() {
        return this.depth;
    }
    /**
     * @return Height of the device.
     * 
     */
    public Double height() {
        return this.height;
    }
    /**
     * @return Length of the device.
     * 
     */
    public Double length() {
        return this.length;
    }
    /**
     * @return Unit for the dimensions of length, height and width.
     * 
     */
    public String lengthHeightUnit() {
        return this.lengthHeightUnit;
    }
    /**
     * @return Weight of the device.
     * 
     */
    public Double weight() {
        return this.weight;
    }
    /**
     * @return Unit for the dimensions of weight.
     * 
     */
    public String weightUnit() {
        return this.weightUnit;
    }
    /**
     * @return Width of the device.
     * 
     */
    public Double width() {
        return this.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DimensionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double depth;
        private Double height;
        private Double length;
        private String lengthHeightUnit;
        private Double weight;
        private String weightUnit;
        private Double width;
        public Builder() {}
        public Builder(DimensionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.depth = defaults.depth;
    	      this.height = defaults.height;
    	      this.length = defaults.length;
    	      this.lengthHeightUnit = defaults.lengthHeightUnit;
    	      this.weight = defaults.weight;
    	      this.weightUnit = defaults.weightUnit;
    	      this.width = defaults.width;
        }

        @CustomType.Setter
        public Builder depth(Double depth) {
            if (depth == null) {
              throw new MissingRequiredPropertyException("DimensionsResponse", "depth");
            }
            this.depth = depth;
            return this;
        }
        @CustomType.Setter
        public Builder height(Double height) {
            if (height == null) {
              throw new MissingRequiredPropertyException("DimensionsResponse", "height");
            }
            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder length(Double length) {
            if (length == null) {
              throw new MissingRequiredPropertyException("DimensionsResponse", "length");
            }
            this.length = length;
            return this;
        }
        @CustomType.Setter
        public Builder lengthHeightUnit(String lengthHeightUnit) {
            if (lengthHeightUnit == null) {
              throw new MissingRequiredPropertyException("DimensionsResponse", "lengthHeightUnit");
            }
            this.lengthHeightUnit = lengthHeightUnit;
            return this;
        }
        @CustomType.Setter
        public Builder weight(Double weight) {
            if (weight == null) {
              throw new MissingRequiredPropertyException("DimensionsResponse", "weight");
            }
            this.weight = weight;
            return this;
        }
        @CustomType.Setter
        public Builder weightUnit(String weightUnit) {
            if (weightUnit == null) {
              throw new MissingRequiredPropertyException("DimensionsResponse", "weightUnit");
            }
            this.weightUnit = weightUnit;
            return this;
        }
        @CustomType.Setter
        public Builder width(Double width) {
            if (width == null) {
              throw new MissingRequiredPropertyException("DimensionsResponse", "width");
            }
            this.width = width;
            return this;
        }
        public DimensionsResponse build() {
            final var _resultValue = new DimensionsResponse();
            _resultValue.depth = depth;
            _resultValue.height = height;
            _resultValue.length = length;
            _resultValue.lengthHeightUnit = lengthHeightUnit;
            _resultValue.weight = weight;
            _resultValue.weightUnit = weightUnit;
            _resultValue.width = width;
            return _resultValue;
        }
    }
}
