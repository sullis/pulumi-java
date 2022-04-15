// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketTransitionStorageClass;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * You must specify at least one of "TransitionDate" and "TransitionInDays"
 * 
 */
public final class BucketTransition extends io.pulumi.resources.InvokeArgs {

    public static final BucketTransition Empty = new BucketTransition();

    @Import(name="storageClass", required=true)
      private final BucketTransitionStorageClass storageClass;

    public BucketTransitionStorageClass storageClass() {
        return this.storageClass;
    }

    @Import(name="transitionDate")
      private final @Nullable String transitionDate;

    public Optional<String> transitionDate() {
        return this.transitionDate == null ? Optional.empty() : Optional.ofNullable(this.transitionDate);
    }

    @Import(name="transitionInDays")
      private final @Nullable Integer transitionInDays;

    public Optional<Integer> transitionInDays() {
        return this.transitionInDays == null ? Optional.empty() : Optional.ofNullable(this.transitionInDays);
    }

    public BucketTransition(
        BucketTransitionStorageClass storageClass,
        @Nullable String transitionDate,
        @Nullable Integer transitionInDays) {
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
        this.transitionDate = transitionDate;
        this.transitionInDays = transitionInDays;
    }

    private BucketTransition() {
        this.storageClass = null;
        this.transitionDate = null;
        this.transitionInDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketTransition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketTransitionStorageClass storageClass;
        private @Nullable String transitionDate;
        private @Nullable Integer transitionInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageClass = defaults.storageClass;
    	      this.transitionDate = defaults.transitionDate;
    	      this.transitionInDays = defaults.transitionInDays;
        }

        public Builder storageClass(BucketTransitionStorageClass storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder transitionDate(@Nullable String transitionDate) {
            this.transitionDate = transitionDate;
            return this;
        }
        public Builder transitionInDays(@Nullable Integer transitionInDays) {
            this.transitionInDays = transitionInDays;
            return this;
        }        public BucketTransition build() {
            return new BucketTransition(storageClass, transitionDate, transitionInDays);
        }
    }
}
