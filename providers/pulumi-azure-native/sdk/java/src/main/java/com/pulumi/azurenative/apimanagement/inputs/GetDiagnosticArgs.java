// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticArgs Empty = new GetDiagnosticArgs();

    /**
     * Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="diagnosticId", required=true)
    private Output<String> diagnosticId;

    /**
     * @return Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> diagnosticId() {
        return this.diagnosticId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetDiagnosticArgs() {}

    private GetDiagnosticArgs(GetDiagnosticArgs $) {
        this.diagnosticId = $.diagnosticId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiagnosticArgs $;

        public Builder() {
            $ = new GetDiagnosticArgs();
        }

        public Builder(GetDiagnosticArgs defaults) {
            $ = new GetDiagnosticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticId(Output<String> diagnosticId) {
            $.diagnosticId = diagnosticId;
            return this;
        }

        /**
         * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticId(String diagnosticId) {
            return diagnosticId(Output.of(diagnosticId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetDiagnosticArgs build() {
            $.diagnosticId = Objects.requireNonNull($.diagnosticId, "expected parameter 'diagnosticId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
