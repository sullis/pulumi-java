// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Criteria to limit import of WSDL to a subset of the document.
 * 
 */
public final class ApiCreateOrUpdatePropertiesWsdlSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiCreateOrUpdatePropertiesWsdlSelectorArgs Empty = new ApiCreateOrUpdatePropertiesWsdlSelectorArgs();

    /**
     * Name of endpoint(port) to import from WSDL
     * 
     */
    @Import(name="wsdlEndpointName")
    private @Nullable Output<String> wsdlEndpointName;

    /**
     * @return Name of endpoint(port) to import from WSDL
     * 
     */
    public Optional<Output<String>> wsdlEndpointName() {
        return Optional.ofNullable(this.wsdlEndpointName);
    }

    /**
     * Name of service to import from WSDL
     * 
     */
    @Import(name="wsdlServiceName")
    private @Nullable Output<String> wsdlServiceName;

    /**
     * @return Name of service to import from WSDL
     * 
     */
    public Optional<Output<String>> wsdlServiceName() {
        return Optional.ofNullable(this.wsdlServiceName);
    }

    private ApiCreateOrUpdatePropertiesWsdlSelectorArgs() {}

    private ApiCreateOrUpdatePropertiesWsdlSelectorArgs(ApiCreateOrUpdatePropertiesWsdlSelectorArgs $) {
        this.wsdlEndpointName = $.wsdlEndpointName;
        this.wsdlServiceName = $.wsdlServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiCreateOrUpdatePropertiesWsdlSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiCreateOrUpdatePropertiesWsdlSelectorArgs $;

        public Builder() {
            $ = new ApiCreateOrUpdatePropertiesWsdlSelectorArgs();
        }

        public Builder(ApiCreateOrUpdatePropertiesWsdlSelectorArgs defaults) {
            $ = new ApiCreateOrUpdatePropertiesWsdlSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param wsdlEndpointName Name of endpoint(port) to import from WSDL
         * 
         * @return builder
         * 
         */
        public Builder wsdlEndpointName(@Nullable Output<String> wsdlEndpointName) {
            $.wsdlEndpointName = wsdlEndpointName;
            return this;
        }

        /**
         * @param wsdlEndpointName Name of endpoint(port) to import from WSDL
         * 
         * @return builder
         * 
         */
        public Builder wsdlEndpointName(String wsdlEndpointName) {
            return wsdlEndpointName(Output.of(wsdlEndpointName));
        }

        /**
         * @param wsdlServiceName Name of service to import from WSDL
         * 
         * @return builder
         * 
         */
        public Builder wsdlServiceName(@Nullable Output<String> wsdlServiceName) {
            $.wsdlServiceName = wsdlServiceName;
            return this;
        }

        /**
         * @param wsdlServiceName Name of service to import from WSDL
         * 
         * @return builder
         * 
         */
        public Builder wsdlServiceName(String wsdlServiceName) {
            return wsdlServiceName(Output.of(wsdlServiceName));
        }

        public ApiCreateOrUpdatePropertiesWsdlSelectorArgs build() {
            return $;
        }
    }

}
