// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketTagFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationRuleAndOperator extends io.pulumi.resources.InvokeArgs {

    public static final BucketReplicationRuleAndOperator Empty = new BucketReplicationRuleAndOperator();

    @Import(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> prefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    @Import(name="tagFilters")
      private final @Nullable List<BucketTagFilter> tagFilters;

    public List<BucketTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    public BucketReplicationRuleAndOperator(
        @Nullable String prefix,
        @Nullable List<BucketTagFilter> tagFilters) {
        this.prefix = prefix;
        this.tagFilters = tagFilters;
    }

    private BucketReplicationRuleAndOperator() {
        this.prefix = null;
        this.tagFilters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationRuleAndOperator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String prefix;
        private @Nullable List<BucketTagFilter> tagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationRuleAndOperator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tagFilters = defaults.tagFilters;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder tagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(BucketTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }        public BucketReplicationRuleAndOperator build() {
            return new BucketReplicationRuleAndOperator(prefix, tagFilters);
        }
    }
}
