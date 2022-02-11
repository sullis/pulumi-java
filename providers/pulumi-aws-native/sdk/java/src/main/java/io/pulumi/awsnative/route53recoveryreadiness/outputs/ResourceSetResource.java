// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetDNSTargetResource;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSetResource {
    private final @Nullable String componentId;
    private final @Nullable ResourceSetDNSTargetResource dnsTargetResource;
    private final @Nullable List<String> readinessScopes;
    private final @Nullable String resourceArn;

    @OutputCustomType.Constructor({"componentId","dnsTargetResource","readinessScopes","resourceArn"})
    private ResourceSetResource(
        @Nullable String componentId,
        @Nullable ResourceSetDNSTargetResource dnsTargetResource,
        @Nullable List<String> readinessScopes,
        @Nullable String resourceArn) {
        this.componentId = componentId;
        this.dnsTargetResource = dnsTargetResource;
        this.readinessScopes = readinessScopes;
        this.resourceArn = resourceArn;
    }

    public Optional<String> getComponentId() {
        return Optional.ofNullable(this.componentId);
    }
    public Optional<ResourceSetDNSTargetResource> getDnsTargetResource() {
        return Optional.ofNullable(this.dnsTargetResource);
    }
    public List<String> getReadinessScopes() {
        return this.readinessScopes == null ? List.of() : this.readinessScopes;
    }
    public Optional<String> getResourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentId;
        private @Nullable ResourceSetDNSTargetResource dnsTargetResource;
        private @Nullable List<String> readinessScopes;
        private @Nullable String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.dnsTargetResource = defaults.dnsTargetResource;
    	      this.readinessScopes = defaults.readinessScopes;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setComponentId(@Nullable String componentId) {
            this.componentId = componentId;
            return this;
        }

        public Builder setDnsTargetResource(@Nullable ResourceSetDNSTargetResource dnsTargetResource) {
            this.dnsTargetResource = dnsTargetResource;
            return this;
        }

        public Builder setReadinessScopes(@Nullable List<String> readinessScopes) {
            this.readinessScopes = readinessScopes;
            return this;
        }

        public Builder setResourceArn(@Nullable String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public ResourceSetResource build() {
            return new ResourceSetResource(componentId, dnsTargetResource, readinessScopes, resourceArn);
        }
    }
}
