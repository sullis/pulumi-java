// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketOwnershipControlsRuleObjectOwnership;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketOwnershipControlsRule {
    /**
     * Specifies an object ownership rule.
     * 
     */
    private final @Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership;

    @OutputCustomType.Constructor({"objectOwnership"})
    private BucketOwnershipControlsRule(@Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
        this.objectOwnership = objectOwnership;
    }

    /**
     * Specifies an object ownership rule.
     * 
    */
    public Optional<BucketOwnershipControlsRuleObjectOwnership> getObjectOwnership() {
        return Optional.ofNullable(this.objectOwnership);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectOwnership = defaults.objectOwnership;
        }

        public Builder setObjectOwnership(@Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }
        public BucketOwnershipControlsRule build() {
            return new BucketOwnershipControlsRule(objectOwnership);
        }
    }
}