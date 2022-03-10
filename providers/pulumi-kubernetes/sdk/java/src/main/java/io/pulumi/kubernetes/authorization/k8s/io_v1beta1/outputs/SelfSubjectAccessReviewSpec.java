// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.NonResourceAttributes;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.ResourceAttributes;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SelfSubjectAccessReviewSpec {
    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
     */
    private final @Nullable NonResourceAttributes nonResourceAttributes;
    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    private final @Nullable ResourceAttributes resourceAttributes;

    @OutputCustomType.Constructor
    private SelfSubjectAccessReviewSpec(
        @OutputCustomType.Parameter("nonResourceAttributes") @Nullable NonResourceAttributes nonResourceAttributes,
        @OutputCustomType.Parameter("resourceAttributes") @Nullable ResourceAttributes resourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
    }

    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
    */
    public Optional<NonResourceAttributes> getNonResourceAttributes() {
        return Optional.ofNullable(this.nonResourceAttributes);
    }
    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
    */
    public Optional<ResourceAttributes> getResourceAttributes() {
        return Optional.ofNullable(this.resourceAttributes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectAccessReviewSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NonResourceAttributes nonResourceAttributes;
        private @Nullable ResourceAttributes resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfSubjectAccessReviewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceAttributes = defaults.nonResourceAttributes;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder setNonResourceAttributes(@Nullable NonResourceAttributes nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }

        public Builder setResourceAttributes(@Nullable ResourceAttributes resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public SelfSubjectAccessReviewSpec build() {
            return new SelfSubjectAccessReviewSpec(nonResourceAttributes, resourceAttributes);
        }
    }
}
