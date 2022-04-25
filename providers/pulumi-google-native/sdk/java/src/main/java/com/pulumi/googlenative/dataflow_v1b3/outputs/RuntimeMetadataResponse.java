// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataflow_v1b3.outputs.ParameterMetadataResponse;
import com.pulumi.googlenative.dataflow_v1b3.outputs.SDKInfoResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuntimeMetadataResponse {
    /**
     * @return The parameters for the template.
     * 
     */
    private final List<ParameterMetadataResponse> parameters;
    /**
     * @return SDK Info for the template.
     * 
     */
    private final SDKInfoResponse sdkInfo;

    @CustomType.Constructor
    private RuntimeMetadataResponse(
        @CustomType.Parameter("parameters") List<ParameterMetadataResponse> parameters,
        @CustomType.Parameter("sdkInfo") SDKInfoResponse sdkInfo) {
        this.parameters = parameters;
        this.sdkInfo = sdkInfo;
    }

    /**
     * @return The parameters for the template.
     * 
     */
    public List<ParameterMetadataResponse> parameters() {
        return this.parameters;
    }
    /**
     * @return SDK Info for the template.
     * 
     */
    public SDKInfoResponse sdkInfo() {
        return this.sdkInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ParameterMetadataResponse> parameters;
        private SDKInfoResponse sdkInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.sdkInfo = defaults.sdkInfo;
        }

        public Builder parameters(List<ParameterMetadataResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(ParameterMetadataResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder sdkInfo(SDKInfoResponse sdkInfo) {
            this.sdkInfo = Objects.requireNonNull(sdkInfo);
            return this;
        }        public RuntimeMetadataResponse build() {
            return new RuntimeMetadataResponse(parameters, sdkInfo);
        }
    }
}
