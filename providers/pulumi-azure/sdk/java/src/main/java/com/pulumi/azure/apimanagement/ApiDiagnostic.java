// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.ApiDiagnosticArgs;
import com.pulumi.azure.apimanagement.inputs.ApiDiagnosticState;
import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticBackendRequest;
import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticBackendResponse;
import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendRequest;
import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendResponse;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a API Management Service API Diagnostics Logs.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleInsights = new Insights(&#34;exampleInsights&#34;, InsightsArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .applicationType(&#34;web&#34;)
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .publisherName(&#34;My Company&#34;)
 *             .publisherEmail(&#34;company@mycompany.io&#34;)
 *             .skuName(&#34;Developer_1&#34;)
 *             .build());
 * 
 *         var exampleApi = new Api(&#34;exampleApi&#34;, ApiArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .apiManagementName(exampleService.getName())
 *             .revision(&#34;1&#34;)
 *             .displayName(&#34;Example API&#34;)
 *             .path(&#34;example&#34;)
 *             .protocols(&#34;https&#34;)
 *             .import_(ApiImport.builder()
 *                 .contentFormat(&#34;swagger-link-json&#34;)
 *                 .contentValue(&#34;http://conferenceapi.azurewebsites.net/?format=json&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleLogger = new Logger(&#34;exampleLogger&#34;, LoggerArgs.builder()        
 *             .apiManagementName(exampleService.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .applicationInsights(LoggerApplicationInsights.builder()
 *                 .instrumentationKey(exampleInsights.getInstrumentationKey())
 *                 .build())
 *             .build());
 * 
 *         var exampleApiDiagnostic = new ApiDiagnostic(&#34;exampleApiDiagnostic&#34;, ApiDiagnosticArgs.builder()        
 *             .identifier(&#34;applicationinsights&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .apiManagementName(exampleService.getName())
 *             .apiName(exampleApi.getName())
 *             .apiManagementLoggerId(exampleLogger.getId())
 *             .samplingPercentage(5)
 *             .alwaysLogErrors(true)
 *             .logClientIp(true)
 *             .verbosity(&#34;verbose&#34;)
 *             .httpCorrelationProtocol(&#34;W3C&#34;)
 *             .frontendRequest(ApiDiagnosticFrontendRequest.builder()
 *                 .bodyBytes(32)
 *                 .headersToLogs(                
 *                     &#34;content-type&#34;,
 *                     &#34;accept&#34;,
 *                     &#34;origin&#34;)
 *                 .build())
 *             .frontendResponse(ApiDiagnosticFrontendResponse.builder()
 *                 .bodyBytes(32)
 *                 .headersToLogs(                
 *                     &#34;content-type&#34;,
 *                     &#34;content-length&#34;,
 *                     &#34;origin&#34;)
 *                 .build())
 *             .backendRequest(ApiDiagnosticBackendRequest.builder()
 *                 .bodyBytes(32)
 *                 .headersToLogs(                
 *                     &#34;content-type&#34;,
 *                     &#34;accept&#34;,
 *                     &#34;origin&#34;)
 *                 .build())
 *             .backendResponse(ApiDiagnosticBackendResponse.builder()
 *                 .bodyBytes(32)
 *                 .headersToLogs(                
 *                     &#34;content-type&#34;,
 *                     &#34;content-length&#34;,
 *                     &#34;origin&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management Service API Diagnostics Logs can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/apiDiagnostic:ApiDiagnostic example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/instance1/apis/api1/diagnostics/diagnostic1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/apiDiagnostic:ApiDiagnostic")
public class ApiDiagnostic extends com.pulumi.resources.CustomResource {
    /**
     * Always log errors. Send telemetry if there is an erroneous condition, regardless of sampling settings.
     * 
     */
    @Export(name="alwaysLogErrors", type=Boolean.class, parameters={})
    private Output<Boolean> alwaysLogErrors;

    /**
     * @return Always log errors. Send telemetry if there is an erroneous condition, regardless of sampling settings.
     * 
     */
    public Output<Boolean> alwaysLogErrors() {
        return this.alwaysLogErrors;
    }
    /**
     * The ID (name) of the Diagnostics Logger.
     * 
     */
    @Export(name="apiManagementLoggerId", type=String.class, parameters={})
    private Output<String> apiManagementLoggerId;

    /**
     * @return The ID (name) of the Diagnostics Logger.
     * 
     */
    public Output<String> apiManagementLoggerId() {
        return this.apiManagementLoggerId;
    }
    /**
     * The name of the API Management Service instance. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    @Export(name="apiManagementName", type=String.class, parameters={})
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service instance. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * The name of the API on which to configure the Diagnostics Logs. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    @Export(name="apiName", type=String.class, parameters={})
    private Output<String> apiName;

    /**
     * @return The name of the API on which to configure the Diagnostics Logs. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    public Output<String> apiName() {
        return this.apiName;
    }
    /**
     * A `backend_request` block as defined below.
     * 
     */
    @Export(name="backendRequest", type=ApiDiagnosticBackendRequest.class, parameters={})
    private Output<ApiDiagnosticBackendRequest> backendRequest;

    /**
     * @return A `backend_request` block as defined below.
     * 
     */
    public Output<ApiDiagnosticBackendRequest> backendRequest() {
        return this.backendRequest;
    }
    /**
     * A `backend_response` block as defined below.
     * 
     */
    @Export(name="backendResponse", type=ApiDiagnosticBackendResponse.class, parameters={})
    private Output<ApiDiagnosticBackendResponse> backendResponse;

    /**
     * @return A `backend_response` block as defined below.
     * 
     */
    public Output<ApiDiagnosticBackendResponse> backendResponse() {
        return this.backendResponse;
    }
    /**
     * A `frontend_request` block as defined below.
     * 
     */
    @Export(name="frontendRequest", type=ApiDiagnosticFrontendRequest.class, parameters={})
    private Output<ApiDiagnosticFrontendRequest> frontendRequest;

    /**
     * @return A `frontend_request` block as defined below.
     * 
     */
    public Output<ApiDiagnosticFrontendRequest> frontendRequest() {
        return this.frontendRequest;
    }
    /**
     * A `frontend_response` block as defined below.
     * 
     */
    @Export(name="frontendResponse", type=ApiDiagnosticFrontendResponse.class, parameters={})
    private Output<ApiDiagnosticFrontendResponse> frontendResponse;

    /**
     * @return A `frontend_response` block as defined below.
     * 
     */
    public Output<ApiDiagnosticFrontendResponse> frontendResponse() {
        return this.frontendResponse;
    }
    /**
     * The HTTP Correlation Protocol to use. Possible values are `None`, `Legacy` or `W3C`.
     * 
     */
    @Export(name="httpCorrelationProtocol", type=String.class, parameters={})
    private Output<String> httpCorrelationProtocol;

    /**
     * @return The HTTP Correlation Protocol to use. Possible values are `None`, `Legacy` or `W3C`.
     * 
     */
    public Output<String> httpCorrelationProtocol() {
        return this.httpCorrelationProtocol;
    }
    /**
     * Identifier of the Diagnostics Logs. Possible values are `applicationinsights` and `azuremonitor`. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return Identifier of the Diagnostics Logs. Possible values are `applicationinsights` and `azuremonitor`. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Log client IP address.
     * 
     */
    @Export(name="logClientIp", type=Boolean.class, parameters={})
    private Output<Boolean> logClientIp;

    /**
     * @return Log client IP address.
     * 
     */
    public Output<Boolean> logClientIp() {
        return this.logClientIp;
    }
    /**
     * The format of the Operation Name for Application Insights telemetries. Possible values are `Name`, and `Url`. Defaults to `Name`.
     * 
     */
    @Export(name="operationNameFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationNameFormat;

    /**
     * @return The format of the Operation Name for Application Insights telemetries. Possible values are `Name`, and `Url`. Defaults to `Name`.
     * 
     */
    public Output<Optional<String>> operationNameFormat() {
        return Codegen.optional(this.operationNameFormat);
    }
    /**
     * The name of the Resource Group where the API Management Service API Diagnostics Logs should exist. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the API Management Service API Diagnostics Logs should exist. Changing this forces a new API Management Service API Diagnostics Logs to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Sampling (%). For high traffic APIs, please read this [documentation](https://docs.microsoft.com/azure/api-management/api-management-howto-app-insights#performance-implications-and-log-sampling) to understand performance implications and log sampling. Valid values are between `0.0` and `100.0`.
     * 
     */
    @Export(name="samplingPercentage", type=Double.class, parameters={})
    private Output<Double> samplingPercentage;

    /**
     * @return Sampling (%). For high traffic APIs, please read this [documentation](https://docs.microsoft.com/azure/api-management/api-management-howto-app-insights#performance-implications-and-log-sampling) to understand performance implications and log sampling. Valid values are between `0.0` and `100.0`.
     * 
     */
    public Output<Double> samplingPercentage() {
        return this.samplingPercentage;
    }
    /**
     * Logging verbosity. Possible values are `verbose`, `information` or `error`.
     * 
     */
    @Export(name="verbosity", type=String.class, parameters={})
    private Output<String> verbosity;

    /**
     * @return Logging verbosity. Possible values are `verbose`, `information` or `error`.
     * 
     */
    public Output<String> verbosity() {
        return this.verbosity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiDiagnostic(String name) {
        this(name, ApiDiagnosticArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiDiagnostic(String name, ApiDiagnosticArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiDiagnostic(String name, ApiDiagnosticArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/apiDiagnostic:ApiDiagnostic", name, args == null ? ApiDiagnosticArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiDiagnostic(String name, Output<String> id, @Nullable ApiDiagnosticState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/apiDiagnostic:ApiDiagnostic", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiDiagnostic get(String name, Output<String> id, @Nullable ApiDiagnosticState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiDiagnostic(name, id, state, options);
    }
}
