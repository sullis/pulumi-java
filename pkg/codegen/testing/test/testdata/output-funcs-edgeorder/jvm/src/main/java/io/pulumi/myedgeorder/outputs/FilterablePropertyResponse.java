// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FilterablePropertyResponse {
    /**
     * Values to be filtered.
     * 
     */
    private final List<String> supportedValues;
    /**
     * Type of product filter.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"supportedValues","type"})
    private FilterablePropertyResponse(
        List<String> supportedValues,
        String type) {
        this.supportedValues = Objects.requireNonNull(supportedValues);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Values to be filtered.
     * 
    */
    public List<String> getSupportedValues() {
        return this.supportedValues;
    }
    /**
     * Type of product filter.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterablePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> supportedValues;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterablePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supportedValues = defaults.supportedValues;
    	      this.type = defaults.type;
        }

        public Builder setSupportedValues(List<String> supportedValues) {
            this.supportedValues = Objects.requireNonNull(supportedValues);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FilterablePropertyResponse build() {
            return new FilterablePropertyResponse(supportedValues, type);
        }
    }
}