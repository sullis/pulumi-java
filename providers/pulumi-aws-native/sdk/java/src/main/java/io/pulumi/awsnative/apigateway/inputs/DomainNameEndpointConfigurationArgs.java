// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameEndpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameEndpointConfigurationArgs Empty = new DomainNameEndpointConfigurationArgs();

    @InputImport(name="types")
    private final @Nullable Input<List<String>> types;

    public Input<List<String>> getTypes() {
        return this.types == null ? Input.empty() : this.types;
    }

    public DomainNameEndpointConfigurationArgs(@Nullable Input<List<String>> types) {
        this.types = types;
    }

    private DomainNameEndpointConfigurationArgs() {
        this.types = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> types;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameEndpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
        }

        public Builder setTypes(@Nullable Input<List<String>> types) {
            this.types = types;
            return this;
        }

        public Builder setTypes(@Nullable List<String> types) {
            this.types = Input.ofNullable(types);
            return this;
        }

        public DomainNameEndpointConfigurationArgs build() {
            return new DomainNameEndpointConfigurationArgs(types);
        }
    }
}
