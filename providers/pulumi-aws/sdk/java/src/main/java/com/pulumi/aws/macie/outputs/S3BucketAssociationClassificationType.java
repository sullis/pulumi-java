// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class S3BucketAssociationClassificationType {
    /**
     * @return A string value indicating that Macie perform a one-time classification of all of the existing objects in the bucket.
     * The only valid value is the default value, `FULL`.
     * 
     */
    private final @Nullable String continuous;
    /**
     * @return A string value indicating whether or not Macie performs a one-time classification of all of the existing objects in the bucket.
     * Valid values are `NONE` and `FULL`. Defaults to `NONE` indicating that Macie only classifies objects that are added after the association was created.
     * 
     */
    private final @Nullable String oneTime;

    @CustomType.Constructor
    private S3BucketAssociationClassificationType(
        @CustomType.Parameter("continuous") @Nullable String continuous,
        @CustomType.Parameter("oneTime") @Nullable String oneTime) {
        this.continuous = continuous;
        this.oneTime = oneTime;
    }

    /**
     * @return A string value indicating that Macie perform a one-time classification of all of the existing objects in the bucket.
     * The only valid value is the default value, `FULL`.
     * 
     */
    public Optional<String> continuous() {
        return Optional.ofNullable(this.continuous);
    }
    /**
     * @return A string value indicating whether or not Macie performs a one-time classification of all of the existing objects in the bucket.
     * Valid values are `NONE` and `FULL`. Defaults to `NONE` indicating that Macie only classifies objects that are added after the association was created.
     * 
     */
    public Optional<String> oneTime() {
        return Optional.ofNullable(this.oneTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(S3BucketAssociationClassificationType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String continuous;
        private @Nullable String oneTime;

        public Builder() {
    	      // Empty
        }

        public Builder(S3BucketAssociationClassificationType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continuous = defaults.continuous;
    	      this.oneTime = defaults.oneTime;
        }

        public Builder continuous(@Nullable String continuous) {
            this.continuous = continuous;
            return this;
        }
        public Builder oneTime(@Nullable String oneTime) {
            this.oneTime = oneTime;
            return this;
        }        public S3BucketAssociationClassificationType build() {
            return new S3BucketAssociationClassificationType(continuous, oneTime);
        }
    }
}
