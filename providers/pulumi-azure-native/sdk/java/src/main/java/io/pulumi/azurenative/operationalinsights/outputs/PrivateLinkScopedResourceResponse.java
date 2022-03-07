// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkScopedResourceResponse {
    /**
     * The full resource Id of the private link scope resource.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * The private link scope unique Identifier.
     * 
     */
    private final @Nullable String scopeId;

    @OutputCustomType.Constructor({"resourceId","scopeId"})
    private PrivateLinkScopedResourceResponse(
        @Nullable String resourceId,
        @Nullable String scopeId) {
        this.resourceId = resourceId;
        this.scopeId = scopeId;
    }

    /**
     * The full resource Id of the private link scope resource.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * The private link scope unique Identifier.
     * 
    */
    public Optional<String> getScopeId() {
        return Optional.ofNullable(this.scopeId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkScopedResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String scopeId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkScopedResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.scopeId = defaults.scopeId;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setScopeId(@Nullable String scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public PrivateLinkScopedResourceResponse build() {
            return new PrivateLinkScopedResourceResponse(resourceId, scopeId);
        }
    }
}