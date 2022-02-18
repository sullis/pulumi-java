// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.enums.ResolverConfigAutodefinedReverse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResolverConfigResult {
    /**
     * ResolverAutodefinedReverseStatus, possible values are ENABLING, ENABLED, DISABLING AND DISABLED.
     * 
     */
    private final @Nullable ResolverConfigAutodefinedReverse autodefinedReverse;
    /**
     * Id
     * 
     */
    private final @Nullable String id;
    /**
     * AccountId
     * 
     */
    private final @Nullable String ownerId;

    @OutputCustomType.Constructor({"autodefinedReverse","id","ownerId"})
    private GetResolverConfigResult(
        @Nullable ResolverConfigAutodefinedReverse autodefinedReverse,
        @Nullable String id,
        @Nullable String ownerId) {
        this.autodefinedReverse = autodefinedReverse;
        this.id = id;
        this.ownerId = ownerId;
    }

    /**
     * ResolverAutodefinedReverseStatus, possible values are ENABLING, ENABLED, DISABLING AND DISABLED.
     * 
     */
    public Optional<ResolverConfigAutodefinedReverse> getAutodefinedReverse() {
        return Optional.ofNullable(this.autodefinedReverse);
    }
    /**
     * Id
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * AccountId
     * 
     */
    public Optional<String> getOwnerId() {
        return Optional.ofNullable(this.ownerId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResolverConfigAutodefinedReverse autodefinedReverse;
        private @Nullable String id;
        private @Nullable String ownerId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autodefinedReverse = defaults.autodefinedReverse;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
        }

        public Builder setAutodefinedReverse(@Nullable ResolverConfigAutodefinedReverse autodefinedReverse) {
            this.autodefinedReverse = autodefinedReverse;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public GetResolverConfigResult build() {
            return new GetResolverConfigResult(autodefinedReverse, id, ownerId);
        }
    }
}
