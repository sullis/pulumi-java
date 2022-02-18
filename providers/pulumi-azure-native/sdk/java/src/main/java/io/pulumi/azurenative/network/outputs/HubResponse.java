// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HubResponse {
    /**
     * Resource Id.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * Resource Type.
     * 
     */
    private final @Nullable String resourceType;

    @OutputCustomType.Constructor({"resourceId","resourceType"})
    private HubResponse(
        @Nullable String resourceId,
        @Nullable String resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    /**
     * Resource Id.
     * 
     */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Resource Type.
     * 
     */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(HubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public HubResponse build() {
            return new HubResponse(resourceId, resourceType);
        }
    }
}
