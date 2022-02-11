// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainNameEndpointConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DomainNameEndpointConfiguration Empty = new DomainNameEndpointConfiguration();

    @InputImport(name="types")
    private final @Nullable List<String> types;

    public List<String> getTypes() {
        return this.types == null ? List.of() : this.types;
    }

    public DomainNameEndpointConfiguration(@Nullable List<String> types) {
        this.types = types;
    }

    private DomainNameEndpointConfiguration() {
        this.types = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
        }

        public Builder setTypes(@Nullable List<String> types) {
            this.types = types;
            return this;
        }

        public DomainNameEndpointConfiguration build() {
            return new DomainNameEndpointConfiguration(types);
        }
    }
}
