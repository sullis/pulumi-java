// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that sets the public accessibility of objects in the specified bucket.
 * 
 */
public final class BucketAccessRules extends io.pulumi.resources.InvokeArgs {

    public static final BucketAccessRules Empty = new BucketAccessRules();

    /**
     * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual objects override the getObject option that is currently specified.
     * 
     */
    @Import(name="allowPublicOverrides")
      private final @Nullable Boolean allowPublicOverrides;

    public Optional<Boolean> getAllowPublicOverrides() {
        return this.allowPublicOverrides == null ? Optional.empty() : Optional.ofNullable(this.allowPublicOverrides);
    }

    /**
     * Specifies the anonymous access to all objects in a bucket.
     * 
     */
    @Import(name="getObject")
      private final @Nullable String getObject;

    public Optional<String> getGetObject() {
        return this.getObject == null ? Optional.empty() : Optional.ofNullable(this.getObject);
    }

    public BucketAccessRules(
        @Nullable Boolean allowPublicOverrides,
        @Nullable String getObject) {
        this.allowPublicOverrides = allowPublicOverrides;
        this.getObject = getObject;
    }

    private BucketAccessRules() {
        this.allowPublicOverrides = null;
        this.getObject = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessRules defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowPublicOverrides;
        private @Nullable String getObject;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPublicOverrides = defaults.allowPublicOverrides;
    	      this.getObject = defaults.getObject;
        }

        public Builder allowPublicOverrides(@Nullable Boolean allowPublicOverrides) {
            this.allowPublicOverrides = allowPublicOverrides;
            return this;
        }
        public Builder getObject(@Nullable String getObject) {
            this.getObject = getObject;
            return this;
        }        public BucketAccessRules build() {
            return new BucketAccessRules(allowPublicOverrides, getObject);
        }
    }
}
