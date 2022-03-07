// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketReplicationRuleAndOperator;
import io.pulumi.awsnative.s3.inputs.BucketTagFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationRuleFilter extends io.pulumi.resources.InvokeArgs {

    public static final BucketReplicationRuleFilter Empty = new BucketReplicationRuleFilter();

    @InputImport(name="and")
      private final @Nullable BucketReplicationRuleAndOperator and;

    public Optional<BucketReplicationRuleAndOperator> getAnd() {
        return this.and == null ? Optional.empty() : Optional.ofNullable(this.and);
    }

    @InputImport(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    @InputImport(name="tagFilter")
      private final @Nullable BucketTagFilter tagFilter;

    public Optional<BucketTagFilter> getTagFilter() {
        return this.tagFilter == null ? Optional.empty() : Optional.ofNullable(this.tagFilter);
    }

    public BucketReplicationRuleFilter(
        @Nullable BucketReplicationRuleAndOperator and,
        @Nullable String prefix,
        @Nullable BucketTagFilter tagFilter) {
        this.and = and;
        this.prefix = prefix;
        this.tagFilter = tagFilter;
    }

    private BucketReplicationRuleFilter() {
        this.and = null;
        this.prefix = null;
        this.tagFilter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationRuleFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationRuleAndOperator and;
        private @Nullable String prefix;
        private @Nullable BucketTagFilter tagFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.prefix = defaults.prefix;
    	      this.tagFilter = defaults.tagFilter;
        }

        public Builder setAnd(@Nullable BucketReplicationRuleAndOperator and) {
            this.and = and;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setTagFilter(@Nullable BucketTagFilter tagFilter) {
            this.tagFilter = tagFilter;
            return this;
        }
        public BucketReplicationRuleFilter build() {
            return new BucketReplicationRuleFilter(and, prefix, tagFilter);
        }
    }
}