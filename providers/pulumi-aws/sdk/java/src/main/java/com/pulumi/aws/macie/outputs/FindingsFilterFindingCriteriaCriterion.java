// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FindingsFilterFindingCriteriaCriterion {
    /**
     * @return The value for the property exclusively matches (equals an exact match for) all the specified values. If you specify multiple values, Amazon Macie uses AND logic to join the values.
     * 
     */
    private final @Nullable List<String> eqExactMatches;
    /**
     * @return The value for the property matches (equals) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
     * 
     */
    private final @Nullable List<String> eqs;
    /**
     * @return The name of the field to be evaluated.
     * 
     */
    private final String field;
    /**
     * @return The value for the property is greater than the specified value.
     * 
     */
    private final @Nullable String gt;
    /**
     * @return The value for the property is greater than or equal to the specified value.
     * 
     */
    private final @Nullable String gte;
    /**
     * @return The value for the property is less than the specified value.
     * 
     */
    private final @Nullable String lt;
    /**
     * @return The value for the property is less than or equal to the specified value.
     * 
     */
    private final @Nullable String lte;
    /**
     * @return The value for the property doesn&#39;t match (doesn&#39;t equal) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
     * 
     */
    private final @Nullable List<String> neqs;

    @CustomType.Constructor
    private FindingsFilterFindingCriteriaCriterion(
        @CustomType.Parameter("eqExactMatches") @Nullable List<String> eqExactMatches,
        @CustomType.Parameter("eqs") @Nullable List<String> eqs,
        @CustomType.Parameter("field") String field,
        @CustomType.Parameter("gt") @Nullable String gt,
        @CustomType.Parameter("gte") @Nullable String gte,
        @CustomType.Parameter("lt") @Nullable String lt,
        @CustomType.Parameter("lte") @Nullable String lte,
        @CustomType.Parameter("neqs") @Nullable List<String> neqs) {
        this.eqExactMatches = eqExactMatches;
        this.eqs = eqs;
        this.field = field;
        this.gt = gt;
        this.gte = gte;
        this.lt = lt;
        this.lte = lte;
        this.neqs = neqs;
    }

    /**
     * @return The value for the property exclusively matches (equals an exact match for) all the specified values. If you specify multiple values, Amazon Macie uses AND logic to join the values.
     * 
     */
    public List<String> eqExactMatches() {
        return this.eqExactMatches == null ? List.of() : this.eqExactMatches;
    }
    /**
     * @return The value for the property matches (equals) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
     * 
     */
    public List<String> eqs() {
        return this.eqs == null ? List.of() : this.eqs;
    }
    /**
     * @return The name of the field to be evaluated.
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return The value for the property is greater than the specified value.
     * 
     */
    public Optional<String> gt() {
        return Optional.ofNullable(this.gt);
    }
    /**
     * @return The value for the property is greater than or equal to the specified value.
     * 
     */
    public Optional<String> gte() {
        return Optional.ofNullable(this.gte);
    }
    /**
     * @return The value for the property is less than the specified value.
     * 
     */
    public Optional<String> lt() {
        return Optional.ofNullable(this.lt);
    }
    /**
     * @return The value for the property is less than or equal to the specified value.
     * 
     */
    public Optional<String> lte() {
        return Optional.ofNullable(this.lte);
    }
    /**
     * @return The value for the property doesn&#39;t match (doesn&#39;t equal) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
     * 
     */
    public List<String> neqs() {
        return this.neqs == null ? List.of() : this.neqs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteriaCriterion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> eqExactMatches;
        private @Nullable List<String> eqs;
        private String field;
        private @Nullable String gt;
        private @Nullable String gte;
        private @Nullable String lt;
        private @Nullable String lte;
        private @Nullable List<String> neqs;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteriaCriterion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eqExactMatches = defaults.eqExactMatches;
    	      this.eqs = defaults.eqs;
    	      this.field = defaults.field;
    	      this.gt = defaults.gt;
    	      this.gte = defaults.gte;
    	      this.lt = defaults.lt;
    	      this.lte = defaults.lte;
    	      this.neqs = defaults.neqs;
        }

        public Builder eqExactMatches(@Nullable List<String> eqExactMatches) {
            this.eqExactMatches = eqExactMatches;
            return this;
        }
        public Builder eqExactMatches(String... eqExactMatches) {
            return eqExactMatches(List.of(eqExactMatches));
        }
        public Builder eqs(@Nullable List<String> eqs) {
            this.eqs = eqs;
            return this;
        }
        public Builder eqs(String... eqs) {
            return eqs(List.of(eqs));
        }
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder gt(@Nullable String gt) {
            this.gt = gt;
            return this;
        }
        public Builder gte(@Nullable String gte) {
            this.gte = gte;
            return this;
        }
        public Builder lt(@Nullable String lt) {
            this.lt = lt;
            return this;
        }
        public Builder lte(@Nullable String lte) {
            this.lte = lte;
            return this;
        }
        public Builder neqs(@Nullable List<String> neqs) {
            this.neqs = neqs;
            return this;
        }
        public Builder neqs(String... neqs) {
            return neqs(List.of(neqs));
        }        public FindingsFilterFindingCriteriaCriterion build() {
            return new FindingsFilterFindingCriteriaCriterion(eqExactMatches, eqs, field, gt, gte, lt, lte, neqs);
        }
    }
}
