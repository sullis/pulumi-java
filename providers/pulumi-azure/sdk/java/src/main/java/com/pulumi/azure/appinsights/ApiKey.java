// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appinsights.ApiKeyArgs;
import com.pulumi.azure.appinsights.inputs.ApiKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Application Insights API key.
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
 *             .location(&#34;West Europe&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .applicationType(&#34;web&#34;)
 *             .build());
 * 
 *         var readTelemetry = new ApiKey(&#34;readTelemetry&#34;, ApiKeyArgs.builder()        
 *             .applicationInsightsId(exampleInsights.getId())
 *             .readPermissions(            
 *                 &#34;aggregate&#34;,
 *                 &#34;api&#34;,
 *                 &#34;draft&#34;,
 *                 &#34;extendqueries&#34;,
 *                 &#34;search&#34;)
 *             .build());
 * 
 *         var writeAnnotations = new ApiKey(&#34;writeAnnotations&#34;, ApiKeyArgs.builder()        
 *             .applicationInsightsId(exampleInsights.getId())
 *             .writePermissions(&#34;annotations&#34;)
 *             .build());
 * 
 *         var authenticateSdkControlChannelApiKey = new ApiKey(&#34;authenticateSdkControlChannelApiKey&#34;, ApiKeyArgs.builder()        
 *             .applicationInsightsId(exampleInsights.getId())
 *             .readPermissions(&#34;agentconfig&#34;)
 *             .build());
 * 
 *         var fullPermissions = new ApiKey(&#34;fullPermissions&#34;, ApiKeyArgs.builder()        
 *             .applicationInsightsId(exampleInsights.getId())
 *             .readPermissions(            
 *                 &#34;agentconfig&#34;,
 *                 &#34;aggregate&#34;,
 *                 &#34;api&#34;,
 *                 &#34;draft&#34;,
 *                 &#34;extendqueries&#34;,
 *                 &#34;search&#34;)
 *             .writePermissions(&#34;annotations&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;readTelemetryApiKey&#34;, readTelemetry.getApiKey());
 *         ctx.export(&#34;writeAnnotationsApiKey&#34;, writeAnnotations.getApiKey());
 *         ctx.export(&#34;authenticateSdkControlChannel&#34;, authenticateSdkControlChannelApiKey.getApiKey());
 *         ctx.export(&#34;fullPermissionsApiKey&#34;, fullPermissions.getApiKey());
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Application Insights API keys can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appinsights/apiKey:ApiKey my_key /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Insights/components/instance1/apiKeys/00000000-0000-0000-0000-000000000000
 * ```
 * 
 */
@ResourceType(type="azure:appinsights/apiKey:ApiKey")
public class ApiKey extends com.pulumi.resources.CustomResource {
    /**
     * The API Key secret (Sensitive).
     * 
     */
    @Export(name="apiKey", type=String.class, parameters={})
    private Output<String> apiKey;

    /**
     * @return The API Key secret (Sensitive).
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }
    /**
     * The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="applicationInsightsId", type=String.class, parameters={})
    private Output<String> applicationInsightsId;

    /**
     * @return The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> applicationInsightsId() {
        return this.applicationInsightsId;
    }
    /**
     * Specifies the name of the Application Insights API key. Changing this forces a
     * new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Application Insights API key. Changing this forces a
     * new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="readPermissions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> readPermissions;

    /**
     * @return Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<String>>> readPermissions() {
        return Codegen.optional(this.readPermissions);
    }
    /**
     * Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="writePermissions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> writePermissions;

    /**
     * @return Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<String>>> writePermissions() {
        return Codegen.optional(this.writePermissions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, ApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appinsights/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appinsights/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
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
    public static ApiKey get(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}
