// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerPort {
    private final @Nullable Integer external;
    private final Integer internal;
    private final @Nullable String ip;
    private final @Nullable String protocol;

    @CustomType.Constructor
    private ContainerPort(
        @CustomType.Parameter("external") @Nullable Integer external,
        @CustomType.Parameter("internal") Integer internal,
        @CustomType.Parameter("ip") @Nullable String ip,
        @CustomType.Parameter("protocol") @Nullable String protocol) {
        this.external = external;
        this.internal = internal;
        this.ip = ip;
        this.protocol = protocol;
    }

    public Optional<Integer> getExternal() {
        return Optional.ofNullable(this.external);
    }
    public Integer getInternal() {
        return this.internal;
    }
    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer external;
        private Integer internal;
        private @Nullable String ip;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.external = defaults.external;
    	      this.internal = defaults.internal;
    	      this.ip = defaults.ip;
    	      this.protocol = defaults.protocol;
        }

        public Builder external(@Nullable Integer external) {
            this.external = external;
            return this;
        }
        public Builder internal(Integer internal) {
            this.internal = Objects.requireNonNull(internal);
            return this;
        }
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public ContainerPort build() {
            return new ContainerPort(external, internal, ip, protocol);
        }
    }
}
