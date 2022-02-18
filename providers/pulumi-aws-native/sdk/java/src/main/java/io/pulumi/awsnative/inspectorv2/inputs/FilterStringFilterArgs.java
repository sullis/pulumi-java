// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.awsnative.inspectorv2.enums.FilterStringComparison;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FilterStringFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterStringFilterArgs Empty = new FilterStringFilterArgs();

    @InputImport(name="comparison", required=true)
    private final Input<FilterStringComparison> comparison;

    public Input<FilterStringComparison> getComparison() {
        return this.comparison;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public FilterStringFilterArgs(
        Input<FilterStringComparison> comparison,
        Input<String> value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FilterStringFilterArgs() {
        this.comparison = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterStringFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FilterStringComparison> comparison;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterStringFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder setComparison(Input<FilterStringComparison> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setComparison(FilterStringComparison comparison) {
            this.comparison = Input.of(Objects.requireNonNull(comparison));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public FilterStringFilterArgs build() {
            return new FilterStringFilterArgs(comparison, value);
        }
    }
}
