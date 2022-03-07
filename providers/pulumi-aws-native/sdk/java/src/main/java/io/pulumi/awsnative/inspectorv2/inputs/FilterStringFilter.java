// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.awsnative.inspectorv2.enums.FilterStringComparison;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FilterStringFilter extends io.pulumi.resources.InvokeArgs {

    public static final FilterStringFilter Empty = new FilterStringFilter();

    @InputImport(name="comparison", required=true)
      private final FilterStringComparison comparison;

    public FilterStringComparison getComparison() {
        return this.comparison;
    }

    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public FilterStringFilter(
        FilterStringComparison comparison,
        String value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FilterStringFilter() {
        this.comparison = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterStringFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterStringComparison comparison;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterStringFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder setComparison(FilterStringComparison comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FilterStringFilter build() {
            return new FilterStringFilter(comparison, value);
        }
    }
}