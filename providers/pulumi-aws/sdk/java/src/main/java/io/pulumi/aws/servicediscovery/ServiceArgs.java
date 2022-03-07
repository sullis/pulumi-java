// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery;

import io.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs;
import io.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckConfigArgs;
import io.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckCustomConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * The description of the service.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     * 
     */
    @InputImport(name="dnsConfig")
      private final @Nullable Input<ServiceDnsConfigArgs> dnsConfig;

    public Input<ServiceDnsConfigArgs> getDnsConfig() {
        return this.dnsConfig == null ? Input.empty() : this.dnsConfig;
    }

    /**
     * A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
     * 
     */
    @InputImport(name="forceDestroy")
      private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     * 
     */
    @InputImport(name="healthCheckConfig")
      private final @Nullable Input<ServiceHealthCheckConfigArgs> healthCheckConfig;

    public Input<ServiceHealthCheckConfigArgs> getHealthCheckConfig() {
        return this.healthCheckConfig == null ? Input.empty() : this.healthCheckConfig;
    }

    /**
     * A complex type that contains settings for ECS managed health checks.
     * 
     */
    @InputImport(name="healthCheckCustomConfig")
      private final @Nullable Input<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig;

    public Input<ServiceHealthCheckCustomConfigArgs> getHealthCheckCustomConfig() {
        return this.healthCheckCustomConfig == null ? Input.empty() : this.healthCheckCustomConfig;
    }

    /**
     * The name of the service.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the namespace to use for DNS configuration.
     * 
     */
    @InputImport(name="namespaceId")
      private final @Nullable Input<String> namespaceId;

    public Input<String> getNamespaceId() {
        return this.namespaceId == null ? Input.empty() : this.namespaceId;
    }

    /**
     * A map of tags to assign to the service. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServiceArgs(
        @Nullable Input<String> description,
        @Nullable Input<ServiceDnsConfigArgs> dnsConfig,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<ServiceHealthCheckConfigArgs> healthCheckConfig,
        @Nullable Input<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> namespaceId,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.dnsConfig = dnsConfig;
        this.forceDestroy = forceDestroy;
        this.healthCheckConfig = healthCheckConfig;
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        this.name = name;
        this.namespaceId = namespaceId;
        this.tags = tags;
    }

    private ServiceArgs() {
        this.description = Input.empty();
        this.dnsConfig = Input.empty();
        this.forceDestroy = Input.empty();
        this.healthCheckConfig = Input.empty();
        this.healthCheckCustomConfig = Input.empty();
        this.name = Input.empty();
        this.namespaceId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<ServiceDnsConfigArgs> dnsConfig;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<ServiceHealthCheckConfigArgs> healthCheckConfig;
        private @Nullable Input<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespaceId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
    	      this.healthCheckCustomConfig = defaults.healthCheckCustomConfig;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDnsConfig(@Nullable Input<ServiceDnsConfigArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setDnsConfig(@Nullable ServiceDnsConfigArgs dnsConfig) {
            this.dnsConfig = Input.ofNullable(dnsConfig);
            return this;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
            return this;
        }

        public Builder setHealthCheckConfig(@Nullable Input<ServiceHealthCheckConfigArgs> healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        public Builder setHealthCheckConfig(@Nullable ServiceHealthCheckConfigArgs healthCheckConfig) {
            this.healthCheckConfig = Input.ofNullable(healthCheckConfig);
            return this;
        }

        public Builder setHealthCheckCustomConfig(@Nullable Input<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig) {
            this.healthCheckCustomConfig = healthCheckCustomConfig;
            return this;
        }

        public Builder setHealthCheckCustomConfig(@Nullable ServiceHealthCheckCustomConfigArgs healthCheckCustomConfig) {
            this.healthCheckCustomConfig = Input.ofNullable(healthCheckCustomConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamespaceId(@Nullable Input<String> namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        public Builder setNamespaceId(@Nullable String namespaceId) {
            this.namespaceId = Input.ofNullable(namespaceId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(description, dnsConfig, forceDestroy, healthCheckConfig, healthCheckCustomConfig, name, namespaceId, tags);
        }
    }
}