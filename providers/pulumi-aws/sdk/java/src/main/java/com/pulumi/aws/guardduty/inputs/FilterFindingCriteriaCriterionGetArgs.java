// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterFindingCriteriaCriterionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterFindingCriteriaCriterionGetArgs Empty = new FilterFindingCriteriaCriterionGetArgs();

    /**
     * List of string values to be evaluated.
     * 
     */
    @Import(name="equals")
    private @Nullable Output<List<String>> equals;

    /**
     * @return List of string values to be evaluated.
     * 
     */
    public Optional<Output<List<String>>> equals_() {
        return Optional.ofNullable(this.equals);
    }

    /**
     * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
     * 
     */
    @Import(name="field", required=true)
    private Output<String> field;

    /**
     * @return The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
     * 
     */
    public Output<String> field() {
        return this.field;
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="greaterThan")
    private @Nullable Output<String> greaterThan;

    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<Output<String>> greaterThan() {
        return Optional.ofNullable(this.greaterThan);
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="greaterThanOrEqual")
    private @Nullable Output<String> greaterThanOrEqual;

    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<Output<String>> greaterThanOrEqual() {
        return Optional.ofNullable(this.greaterThanOrEqual);
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="lessThan")
    private @Nullable Output<String> lessThan;

    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<Output<String>> lessThan() {
        return Optional.ofNullable(this.lessThan);
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="lessThanOrEqual")
    private @Nullable Output<String> lessThanOrEqual;

    /**
     * @return A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<Output<String>> lessThanOrEqual() {
        return Optional.ofNullable(this.lessThanOrEqual);
    }

    /**
     * List of string values to be evaluated.
     * 
     */
    @Import(name="notEquals")
    private @Nullable Output<List<String>> notEquals;

    /**
     * @return List of string values to be evaluated.
     * 
     */
    public Optional<Output<List<String>>> notEquals() {
        return Optional.ofNullable(this.notEquals);
    }

    private FilterFindingCriteriaCriterionGetArgs() {}

    private FilterFindingCriteriaCriterionGetArgs(FilterFindingCriteriaCriterionGetArgs $) {
        this.equals = $.equals;
        this.field = $.field;
        this.greaterThan = $.greaterThan;
        this.greaterThanOrEqual = $.greaterThanOrEqual;
        this.lessThan = $.lessThan;
        this.lessThanOrEqual = $.lessThanOrEqual;
        this.notEquals = $.notEquals;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterFindingCriteriaCriterionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterFindingCriteriaCriterionGetArgs $;

        public Builder() {
            $ = new FilterFindingCriteriaCriterionGetArgs();
        }

        public Builder(FilterFindingCriteriaCriterionGetArgs defaults) {
            $ = new FilterFindingCriteriaCriterionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param equals List of string values to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder equals_(@Nullable Output<List<String>> equals) {
            $.equals = equals;
            return this;
        }

        /**
         * @param equals List of string values to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder equals_(List<String> equals) {
            return equals_(Output.of(equals));
        }

        /**
         * @param equals List of string values to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder equals_(String... equals) {
            return equals_(List.of(equals));
        }

        /**
         * @param field The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
         * 
         * @return builder
         * 
         */
        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param greaterThan A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder greaterThan(@Nullable Output<String> greaterThan) {
            $.greaterThan = greaterThan;
            return this;
        }

        /**
         * @param greaterThan A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder greaterThan(String greaterThan) {
            return greaterThan(Output.of(greaterThan));
        }

        /**
         * @param greaterThanOrEqual A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder greaterThanOrEqual(@Nullable Output<String> greaterThanOrEqual) {
            $.greaterThanOrEqual = greaterThanOrEqual;
            return this;
        }

        /**
         * @param greaterThanOrEqual A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder greaterThanOrEqual(String greaterThanOrEqual) {
            return greaterThanOrEqual(Output.of(greaterThanOrEqual));
        }

        /**
         * @param lessThan A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder lessThan(@Nullable Output<String> lessThan) {
            $.lessThan = lessThan;
            return this;
        }

        /**
         * @param lessThan A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder lessThan(String lessThan) {
            return lessThan(Output.of(lessThan));
        }

        /**
         * @param lessThanOrEqual A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder lessThanOrEqual(@Nullable Output<String> lessThanOrEqual) {
            $.lessThanOrEqual = lessThanOrEqual;
            return this;
        }

        /**
         * @param lessThanOrEqual A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder lessThanOrEqual(String lessThanOrEqual) {
            return lessThanOrEqual(Output.of(lessThanOrEqual));
        }

        /**
         * @param notEquals List of string values to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder notEquals(@Nullable Output<List<String>> notEquals) {
            $.notEquals = notEquals;
            return this;
        }

        /**
         * @param notEquals List of string values to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder notEquals(List<String> notEquals) {
            return notEquals(Output.of(notEquals));
        }

        /**
         * @param notEquals List of string values to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder notEquals(String... notEquals) {
            return notEquals(List.of(notEquals));
        }

        public FilterFindingCriteriaCriterionGetArgs build() {
            $.field = Objects.requireNonNull($.field, "expected parameter 'field' to be non-null");
            return $;
        }
    }

}
