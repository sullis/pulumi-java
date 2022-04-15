// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketLifecycleRuleExpiration;
import io.pulumi.aws.s3.outputs.BucketLifecycleRuleNoncurrentVersionExpiration;
import io.pulumi.aws.s3.outputs.BucketLifecycleRuleNoncurrentVersionTransition;
import io.pulumi.aws.s3.outputs.BucketLifecycleRuleTransition;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRule {
    /**
     * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
     */
    private final @Nullable Integer abortIncompleteMultipartUploadDays;
    /**
     * Specifies lifecycle rule status.
     * 
     */
    private final Boolean enabled;
    /**
     * Specifies a period in the object's expire (documented below).
     * 
     */
    private final @Nullable BucketLifecycleRuleExpiration expiration;
    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    private final @Nullable String id;
    /**
     * Specifies when noncurrent object versions expire (documented below).
     * 
     */
    private final @Nullable BucketLifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration;
    /**
     * Specifies when noncurrent object versions transitions (documented below).
     * 
     */
    private final @Nullable List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions;
    /**
     * Object key prefix identifying one or more objects to which the rule applies.
     * 
     */
    private final @Nullable String prefix;
    /**
     * Specifies object tags key and value.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies a period in the object's transitions (documented below).
     * 
     */
    private final @Nullable List<BucketLifecycleRuleTransition> transitions;

    @CustomType.Constructor
    private BucketLifecycleRule(
        @CustomType.Parameter("abortIncompleteMultipartUploadDays") @Nullable Integer abortIncompleteMultipartUploadDays,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("expiration") @Nullable BucketLifecycleRuleExpiration expiration,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("noncurrentVersionExpiration") @Nullable BucketLifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration,
        @CustomType.Parameter("noncurrentVersionTransitions") @Nullable List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("transitions") @Nullable List<BucketLifecycleRuleTransition> transitions) {
        this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
        this.enabled = enabled;
        this.expiration = expiration;
        this.id = id;
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
        this.prefix = prefix;
        this.tags = tags;
        this.transitions = transitions;
    }

    /**
     * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
    */
    public Optional<Integer> abortIncompleteMultipartUploadDays() {
        return Optional.ofNullable(this.abortIncompleteMultipartUploadDays);
    }
    /**
     * Specifies lifecycle rule status.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * Specifies a period in the object's expire (documented below).
     * 
    */
    public Optional<BucketLifecycleRuleExpiration> expiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Specifies when noncurrent object versions expire (documented below).
     * 
    */
    public Optional<BucketLifecycleRuleNoncurrentVersionExpiration> noncurrentVersionExpiration() {
        return Optional.ofNullable(this.noncurrentVersionExpiration);
    }
    /**
     * Specifies when noncurrent object versions transitions (documented below).
     * 
    */
    public List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions() {
        return this.noncurrentVersionTransitions == null ? List.of() : this.noncurrentVersionTransitions;
    }
    /**
     * Object key prefix identifying one or more objects to which the rule applies.
     * 
    */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * Specifies object tags key and value.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies a period in the object's transitions (documented below).
     * 
    */
    public List<BucketLifecycleRuleTransition> transitions() {
        return this.transitions == null ? List.of() : this.transitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer abortIncompleteMultipartUploadDays;
        private Boolean enabled;
        private @Nullable BucketLifecycleRuleExpiration expiration;
        private @Nullable String id;
        private @Nullable BucketLifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration;
        private @Nullable List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions;
        private @Nullable String prefix;
        private @Nullable Map<String,String> tags;
        private @Nullable List<BucketLifecycleRuleTransition> transitions;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUploadDays = defaults.abortIncompleteMultipartUploadDays;
    	      this.enabled = defaults.enabled;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
    	      this.noncurrentVersionExpiration = defaults.noncurrentVersionExpiration;
    	      this.noncurrentVersionTransitions = defaults.noncurrentVersionTransitions;
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
    	      this.transitions = defaults.transitions;
        }

        public Builder abortIncompleteMultipartUploadDays(@Nullable Integer abortIncompleteMultipartUploadDays) {
            this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder expiration(@Nullable BucketLifecycleRuleExpiration expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder noncurrentVersionExpiration(@Nullable BucketLifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }
        public Builder noncurrentVersionTransitions(@Nullable List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = noncurrentVersionTransitions;
            return this;
        }
        public Builder noncurrentVersionTransitions(BucketLifecycleRuleNoncurrentVersionTransition... noncurrentVersionTransitions) {
            return noncurrentVersionTransitions(List.of(noncurrentVersionTransitions));
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder transitions(@Nullable List<BucketLifecycleRuleTransition> transitions) {
            this.transitions = transitions;
            return this;
        }
        public Builder transitions(BucketLifecycleRuleTransition... transitions) {
            return transitions(List.of(transitions));
        }        public BucketLifecycleRule build() {
            return new BucketLifecycleRule(abortIncompleteMultipartUploadDays, enabled, expiration, id, noncurrentVersionExpiration, noncurrentVersionTransitions, prefix, tags, transitions);
        }
    }
}
