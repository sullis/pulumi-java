// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDomainNameEndpointConfiguration {
    /**
     * List of endpoint types.
     * 
     */
    private final List<String> types;

    @CustomType.Constructor
    private GetDomainNameEndpointConfiguration(@CustomType.Parameter("types") List<String> types) {
        this.types = types;
    }

    /**
     * List of endpoint types.
     * 
    */
    public List<String> types() {
        return this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
        }

        public Builder types(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }        public GetDomainNameEndpointConfiguration build() {
            return new GetDomainNameEndpointConfiguration(types);
        }
    }
}
