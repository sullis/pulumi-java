// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigGetArgs;
import io.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckConfigGetArgs;
import io.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckCustomConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * The ARN of the service.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The description of the service.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     * 
     */
    @Import(name="dnsConfig")
      private final @Nullable Output<ServiceDnsConfigGetArgs> dnsConfig;

    public Output<ServiceDnsConfigGetArgs> dnsConfig() {
        return this.dnsConfig == null ? Codegen.empty() : this.dnsConfig;
    }

    /**
     * A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> forceDestroy() {
        return this.forceDestroy == null ? Codegen.empty() : this.forceDestroy;
    }

    /**
     * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     * 
     */
    @Import(name="healthCheckConfig")
      private final @Nullable Output<ServiceHealthCheckConfigGetArgs> healthCheckConfig;

    public Output<ServiceHealthCheckConfigGetArgs> healthCheckConfig() {
        return this.healthCheckConfig == null ? Codegen.empty() : this.healthCheckConfig;
    }

    /**
     * A complex type that contains settings for ECS managed health checks.
     * 
     */
    @Import(name="healthCheckCustomConfig")
      private final @Nullable Output<ServiceHealthCheckCustomConfigGetArgs> healthCheckCustomConfig;

    public Output<ServiceHealthCheckCustomConfigGetArgs> healthCheckCustomConfig() {
        return this.healthCheckCustomConfig == null ? Codegen.empty() : this.healthCheckCustomConfig;
    }

    /**
     * The name of the service.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the namespace to use for DNS configuration.
     * 
     */
    @Import(name="namespaceId")
      private final @Nullable Output<String> namespaceId;

    public Output<String> namespaceId() {
        return this.namespaceId == null ? Codegen.empty() : this.namespaceId;
    }

    /**
     * A map of tags to assign to the service. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ServiceState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<ServiceDnsConfigGetArgs> dnsConfig,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<ServiceHealthCheckConfigGetArgs> healthCheckConfig,
        @Nullable Output<ServiceHealthCheckCustomConfigGetArgs> healthCheckCustomConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> namespaceId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.dnsConfig = dnsConfig;
        this.forceDestroy = forceDestroy;
        this.healthCheckConfig = healthCheckConfig;
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        this.name = name;
        this.namespaceId = namespaceId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ServiceState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.dnsConfig = Codegen.empty();
        this.forceDestroy = Codegen.empty();
        this.healthCheckConfig = Codegen.empty();
        this.healthCheckCustomConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.namespaceId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<ServiceDnsConfigGetArgs> dnsConfig;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<ServiceHealthCheckConfigGetArgs> healthCheckConfig;
        private @Nullable Output<ServiceHealthCheckCustomConfigGetArgs> healthCheckCustomConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespaceId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
    	      this.healthCheckCustomConfig = defaults.healthCheckCustomConfig;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder dnsConfig(@Nullable Output<ServiceDnsConfigGetArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }
        public Builder dnsConfig(@Nullable ServiceDnsConfigGetArgs dnsConfig) {
            this.dnsConfig = Codegen.ofNullable(dnsConfig);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Codegen.ofNullable(forceDestroy);
            return this;
        }
        public Builder healthCheckConfig(@Nullable Output<ServiceHealthCheckConfigGetArgs> healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public Builder healthCheckConfig(@Nullable ServiceHealthCheckConfigGetArgs healthCheckConfig) {
            this.healthCheckConfig = Codegen.ofNullable(healthCheckConfig);
            return this;
        }
        public Builder healthCheckCustomConfig(@Nullable Output<ServiceHealthCheckCustomConfigGetArgs> healthCheckCustomConfig) {
            this.healthCheckCustomConfig = healthCheckCustomConfig;
            return this;
        }
        public Builder healthCheckCustomConfig(@Nullable ServiceHealthCheckCustomConfigGetArgs healthCheckCustomConfig) {
            this.healthCheckCustomConfig = Codegen.ofNullable(healthCheckCustomConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = Codegen.ofNullable(namespaceId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ServiceState build() {
            return new ServiceState(arn, description, dnsConfig, forceDestroy, healthCheckConfig, healthCheckCustomConfig, name, namespaceId, tags, tagsAll);
        }
    }
}
