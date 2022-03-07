// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FilterFindingCriteriaCriterion {
    /**
     * List of string values to be evaluated.
     * 
     */
    private final @Nullable List<String> equals;
    /**
     * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
     * 
     */
    private final String field;
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final @Nullable String greaterThan;
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final @Nullable String greaterThanOrEqual;
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final @Nullable String lessThan;
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final @Nullable String lessThanOrEqual;
    /**
     * List of string values to be evaluated.
     * 
     */
    private final @Nullable List<String> notEquals;

    @OutputCustomType.Constructor({"equals","field","greaterThan","greaterThanOrEqual","lessThan","lessThanOrEqual","notEquals"})
    private FilterFindingCriteriaCriterion(
        @Nullable List<String> equals,
        String field,
        @Nullable String greaterThan,
        @Nullable String greaterThanOrEqual,
        @Nullable String lessThan,
        @Nullable String lessThanOrEqual,
        @Nullable List<String> notEquals) {
        this.equals = equals;
        this.field = Objects.requireNonNull(field);
        this.greaterThan = greaterThan;
        this.greaterThanOrEqual = greaterThanOrEqual;
        this.lessThan = lessThan;
        this.lessThanOrEqual = lessThanOrEqual;
        this.notEquals = notEquals;
    }

    /**
     * List of string values to be evaluated.
     * 
    */
    public List<String> getEquals() {
        return this.equals == null ? List.of() : this.equals;
    }
    /**
     * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
     * 
    */
    public String getField() {
        return this.field;
    }
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public Optional<String> getGreaterThan() {
        return Optional.ofNullable(this.greaterThan);
    }
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public Optional<String> getGreaterThanOrEqual() {
        return Optional.ofNullable(this.greaterThanOrEqual);
    }
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public Optional<String> getLessThan() {
        return Optional.ofNullable(this.lessThan);
    }
    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public Optional<String> getLessThanOrEqual() {
        return Optional.ofNullable(this.lessThanOrEqual);
    }
    /**
     * List of string values to be evaluated.
     * 
    */
    public List<String> getNotEquals() {
        return this.notEquals == null ? List.of() : this.notEquals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFindingCriteriaCriterion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> equals;
        private String field;
        private @Nullable String greaterThan;
        private @Nullable String greaterThanOrEqual;
        private @Nullable String lessThan;
        private @Nullable String lessThanOrEqual;
        private @Nullable List<String> notEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFindingCriteriaCriterion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
    	      this.greaterThan = defaults.greaterThan;
    	      this.greaterThanOrEqual = defaults.greaterThanOrEqual;
    	      this.lessThan = defaults.lessThan;
    	      this.lessThanOrEqual = defaults.lessThanOrEqual;
    	      this.notEquals = defaults.notEquals;
        }

        public Builder setEquals(@Nullable List<String> equals) {
            this.equals = equals;
            return this;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setGreaterThan(@Nullable String greaterThan) {
            this.greaterThan = greaterThan;
            return this;
        }

        public Builder setGreaterThanOrEqual(@Nullable String greaterThanOrEqual) {
            this.greaterThanOrEqual = greaterThanOrEqual;
            return this;
        }

        public Builder setLessThan(@Nullable String lessThan) {
            this.lessThan = lessThan;
            return this;
        }

        public Builder setLessThanOrEqual(@Nullable String lessThanOrEqual) {
            this.lessThanOrEqual = lessThanOrEqual;
            return this;
        }

        public Builder setNotEquals(@Nullable List<String> notEquals) {
            this.notEquals = notEquals;
            return this;
        }
        public FilterFindingCriteriaCriterion build() {
            return new FilterFindingCriteriaCriterion(equals, field, greaterThan, greaterThanOrEqual, lessThan, lessThanOrEqual, notEquals);
        }
    }
}