// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Criteria to limit import of WSDL to a subset of the document.
 * 
 */
public final class ApiCreateOrUpdatePropertiesWsdlSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiCreateOrUpdatePropertiesWsdlSelectorArgs Empty = new ApiCreateOrUpdatePropertiesWsdlSelectorArgs();

    /**
     * Name of endpoint(port) to import from WSDL
     * 
     */
    @InputImport(name="wsdlEndpointName")
      private final @Nullable Input<String> wsdlEndpointName;

    public Input<String> getWsdlEndpointName() {
        return this.wsdlEndpointName == null ? Input.empty() : this.wsdlEndpointName;
    }

    /**
     * Name of service to import from WSDL
     * 
     */
    @InputImport(name="wsdlServiceName")
      private final @Nullable Input<String> wsdlServiceName;

    public Input<String> getWsdlServiceName() {
        return this.wsdlServiceName == null ? Input.empty() : this.wsdlServiceName;
    }

    public ApiCreateOrUpdatePropertiesWsdlSelectorArgs(
        @Nullable Input<String> wsdlEndpointName,
        @Nullable Input<String> wsdlServiceName) {
        this.wsdlEndpointName = wsdlEndpointName;
        this.wsdlServiceName = wsdlServiceName;
    }

    private ApiCreateOrUpdatePropertiesWsdlSelectorArgs() {
        this.wsdlEndpointName = Input.empty();
        this.wsdlServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiCreateOrUpdatePropertiesWsdlSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> wsdlEndpointName;
        private @Nullable Input<String> wsdlServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiCreateOrUpdatePropertiesWsdlSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wsdlEndpointName = defaults.wsdlEndpointName;
    	      this.wsdlServiceName = defaults.wsdlServiceName;
        }

        public Builder setWsdlEndpointName(@Nullable Input<String> wsdlEndpointName) {
            this.wsdlEndpointName = wsdlEndpointName;
            return this;
        }

        public Builder setWsdlEndpointName(@Nullable String wsdlEndpointName) {
            this.wsdlEndpointName = Input.ofNullable(wsdlEndpointName);
            return this;
        }

        public Builder setWsdlServiceName(@Nullable Input<String> wsdlServiceName) {
            this.wsdlServiceName = wsdlServiceName;
            return this;
        }

        public Builder setWsdlServiceName(@Nullable String wsdlServiceName) {
            this.wsdlServiceName = Input.ofNullable(wsdlServiceName);
            return this;
        }
        public ApiCreateOrUpdatePropertiesWsdlSelectorArgs build() {
            return new ApiCreateOrUpdatePropertiesWsdlSelectorArgs(wsdlEndpointName, wsdlServiceName);
        }
    }
}