// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketNoncurrentVersionTransitionStorageClass;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketNoncurrentVersionTransitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketNoncurrentVersionTransitionArgs Empty = new BucketNoncurrentVersionTransitionArgs();

    @InputImport(name="newerNoncurrentVersions")
    private final @Nullable Input<Integer> newerNoncurrentVersions;

    public Input<Integer> getNewerNoncurrentVersions() {
        return this.newerNoncurrentVersions == null ? Input.empty() : this.newerNoncurrentVersions;
    }

    @InputImport(name="storageClass", required=true)
    private final Input<BucketNoncurrentVersionTransitionStorageClass> storageClass;

    public Input<BucketNoncurrentVersionTransitionStorageClass> getStorageClass() {
        return this.storageClass;
    }

    @InputImport(name="transitionInDays", required=true)
    private final Input<Integer> transitionInDays;

    public Input<Integer> getTransitionInDays() {
        return this.transitionInDays;
    }

    public BucketNoncurrentVersionTransitionArgs(
        @Nullable Input<Integer> newerNoncurrentVersions,
        Input<BucketNoncurrentVersionTransitionStorageClass> storageClass,
        Input<Integer> transitionInDays) {
        this.newerNoncurrentVersions = newerNoncurrentVersions;
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
        this.transitionInDays = Objects.requireNonNull(transitionInDays, "expected parameter 'transitionInDays' to be non-null");
    }

    private BucketNoncurrentVersionTransitionArgs() {
        this.newerNoncurrentVersions = Input.empty();
        this.storageClass = Input.empty();
        this.transitionInDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNoncurrentVersionTransitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> newerNoncurrentVersions;
        private Input<BucketNoncurrentVersionTransitionStorageClass> storageClass;
        private Input<Integer> transitionInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNoncurrentVersionTransitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newerNoncurrentVersions = defaults.newerNoncurrentVersions;
    	      this.storageClass = defaults.storageClass;
    	      this.transitionInDays = defaults.transitionInDays;
        }

        public Builder setNewerNoncurrentVersions(@Nullable Input<Integer> newerNoncurrentVersions) {
            this.newerNoncurrentVersions = newerNoncurrentVersions;
            return this;
        }

        public Builder setNewerNoncurrentVersions(@Nullable Integer newerNoncurrentVersions) {
            this.newerNoncurrentVersions = Input.ofNullable(newerNoncurrentVersions);
            return this;
        }

        public Builder setStorageClass(Input<BucketNoncurrentVersionTransitionStorageClass> storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder setStorageClass(BucketNoncurrentVersionTransitionStorageClass storageClass) {
            this.storageClass = Input.of(Objects.requireNonNull(storageClass));
            return this;
        }

        public Builder setTransitionInDays(Input<Integer> transitionInDays) {
            this.transitionInDays = Objects.requireNonNull(transitionInDays);
            return this;
        }

        public Builder setTransitionInDays(Integer transitionInDays) {
            this.transitionInDays = Input.of(Objects.requireNonNull(transitionInDays));
            return this;
        }

        public BucketNoncurrentVersionTransitionArgs build() {
            return new BucketNoncurrentVersionTransitionArgs(newerNoncurrentVersions, storageClass, transitionInDays);
        }
    }
}
