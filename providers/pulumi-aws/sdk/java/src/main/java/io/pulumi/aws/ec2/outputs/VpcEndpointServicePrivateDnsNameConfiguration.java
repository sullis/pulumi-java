// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpcEndpointServicePrivateDnsNameConfiguration {
    /**
     * Name of the record subdomain the service provider needs to create.
     * 
     */
    private final @Nullable String name;
    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    private final @Nullable String state;
    /**
     * Endpoint service verification type, for example `TXT`.
     * 
     */
    private final @Nullable String type;
    /**
     * Value the service provider adds to the private DNS name domain record before verification.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private VpcEndpointServicePrivateDnsNameConfiguration(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.state = state;
        this.type = type;
        this.value = value;
    }

    /**
     * Name of the record subdomain the service provider needs to create.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Endpoint service verification type, for example `TXT`.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Value the service provider adds to the private DNS name domain record before verification.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointServicePrivateDnsNameConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String state;
        private @Nullable String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointServicePrivateDnsNameConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public VpcEndpointServicePrivateDnsNameConfiguration build() {
            return new VpcEndpointServicePrivateDnsNameConfiguration(name, state, type, value);
        }
    }
}
