// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.MethodSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identification for an API Operation.
 * 
 */
public final class ApiOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiOperationArgs Empty = new ApiOperationArgs();

    /**
     * API methods or permissions to allow. Method or permission must belong to the service specified by `service_name` field. A single MethodSelector entry with `*` specified for the `method` field will allow all methods AND permissions for the service specified in `service_name`.
     * 
     */
    @InputImport(name="methodSelectors")
      private final @Nullable Input<List<MethodSelectorArgs>> methodSelectors;

    public Input<List<MethodSelectorArgs>> getMethodSelectors() {
        return this.methodSelectors == null ? Input.empty() : this.methodSelectors;
    }

    /**
     * The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to allow. A single ApiOperation with `service_name` field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    @InputImport(name="serviceName")
      private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    public ApiOperationArgs(
        @Nullable Input<List<MethodSelectorArgs>> methodSelectors,
        @Nullable Input<String> serviceName) {
        this.methodSelectors = methodSelectors;
        this.serviceName = serviceName;
    }

    private ApiOperationArgs() {
        this.methodSelectors = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MethodSelectorArgs>> methodSelectors;
        private @Nullable Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setMethodSelectors(@Nullable Input<List<MethodSelectorArgs>> methodSelectors) {
            this.methodSelectors = methodSelectors;
            return this;
        }

        public Builder setMethodSelectors(@Nullable List<MethodSelectorArgs> methodSelectors) {
            this.methodSelectors = Input.ofNullable(methodSelectors);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }
        public ApiOperationArgs build() {
            return new ApiOperationArgs(methodSelectors, serviceName);
        }
    }
}