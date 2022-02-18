// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetNLBResource;
import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetR53ResourceRecord;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSetTargetResource {
    private final @Nullable ResourceSetNLBResource nLBResource;
    private final @Nullable ResourceSetR53ResourceRecord r53Resource;

    @OutputCustomType.Constructor({"nLBResource","r53Resource"})
    private ResourceSetTargetResource(
        @Nullable ResourceSetNLBResource nLBResource,
        @Nullable ResourceSetR53ResourceRecord r53Resource) {
        this.nLBResource = nLBResource;
        this.r53Resource = r53Resource;
    }

    public Optional<ResourceSetNLBResource> getNLBResource() {
        return Optional.ofNullable(this.nLBResource);
    }
    public Optional<ResourceSetR53ResourceRecord> getR53Resource() {
        return Optional.ofNullable(this.r53Resource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetTargetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceSetNLBResource nLBResource;
        private @Nullable ResourceSetR53ResourceRecord r53Resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetTargetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nLBResource = defaults.nLBResource;
    	      this.r53Resource = defaults.r53Resource;
        }

        public Builder setNLBResource(@Nullable ResourceSetNLBResource nLBResource) {
            this.nLBResource = nLBResource;
            return this;
        }

        public Builder setR53Resource(@Nullable ResourceSetR53ResourceRecord r53Resource) {
            this.r53Resource = r53Resource;
            return this;
        }

        public ResourceSetTargetResource build() {
            return new ResourceSetTargetResource(nLBResource, r53Resource);
        }
    }
}
