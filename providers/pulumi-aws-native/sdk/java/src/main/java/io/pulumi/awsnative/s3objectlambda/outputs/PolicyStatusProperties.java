// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3objectlambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyStatusProperties {
    /**
     * Specifies whether the Object lambda Access Point Policy is Public or not. Object lambda Access Points are private by default.
     * 
     */
    private final @Nullable Boolean isPublic;

    @OutputCustomType.Constructor({"isPublic"})
    private PolicyStatusProperties(@Nullable Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * Specifies whether the Object lambda Access Point Policy is Public or not. Object lambda Access Points are private by default.
     * 
     */
    public Optional<Boolean> getIsPublic() {
        return Optional.ofNullable(this.isPublic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyStatusProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isPublic;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyStatusProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPublic = defaults.isPublic;
        }

        public Builder setIsPublic(@Nullable Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public PolicyStatusProperties build() {
            return new PolicyStatusProperties(isPublic);
        }
    }
}
