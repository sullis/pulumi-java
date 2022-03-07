// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceEndpointSpecPort {
    private final @Nullable String name;
    private final @Nullable String protocol;
    private final @Nullable String publishMode;
    private final @Nullable Integer publishedPort;
    private final Integer targetPort;

    @OutputCustomType.Constructor({"name","protocol","publishMode","publishedPort","targetPort"})
    private ServiceEndpointSpecPort(
        @Nullable String name,
        @Nullable String protocol,
        @Nullable String publishMode,
        @Nullable Integer publishedPort,
        Integer targetPort) {
        this.name = name;
        this.protocol = protocol;
        this.publishMode = publishMode;
        this.publishedPort = publishedPort;
        this.targetPort = Objects.requireNonNull(targetPort);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> getPublishMode() {
        return Optional.ofNullable(this.publishMode);
    }
    public Optional<Integer> getPublishedPort() {
        return Optional.ofNullable(this.publishedPort);
    }
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointSpecPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String protocol;
        private @Nullable String publishMode;
        private @Nullable Integer publishedPort;
        private Integer targetPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointSpecPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.publishMode = defaults.publishMode;
    	      this.publishedPort = defaults.publishedPort;
    	      this.targetPort = defaults.targetPort;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setPublishMode(@Nullable String publishMode) {
            this.publishMode = publishMode;
            return this;
        }

        public Builder setPublishedPort(@Nullable Integer publishedPort) {
            this.publishedPort = publishedPort;
            return this;
        }

        public Builder setTargetPort(Integer targetPort) {
            this.targetPort = Objects.requireNonNull(targetPort);
            return this;
        }
        public ServiceEndpointSpecPort build() {
            return new ServiceEndpointSpecPort(name, protocol, publishMode, publishedPort, targetPort);
        }
    }
}