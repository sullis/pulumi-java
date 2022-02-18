// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.DiagnosticLoggerArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Logger details.
 * API Version: 2018-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:DiagnosticLogger applicationinsights /subscriptions/subid/resourcegroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/diagnostics/default/loggers/applicationinsights 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:DiagnosticLogger")
public class DiagnosticLogger extends io.pulumi.resources.CustomResource {
    /**
     * The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     * 
     */
    @OutputExport(name="credentials", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> credentials;

    /**
     * @return The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     * 
     */
    public Output<Map<String,String>> getCredentials() {
        return this.credentials;
    }
    /**
     * Logger description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Logger description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether records are buffered in the logger before publishing. Default is assumed to be true.
     * 
     */
    @OutputExport(name="isBuffered", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isBuffered;

    /**
     * @return Whether records are buffered in the logger before publishing. Default is assumed to be true.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsBuffered() {
        return this.isBuffered;
    }
    /**
     * Logger type.
     * 
     */
    @OutputExport(name="loggerType", type=String.class, parameters={})
    private Output<String> loggerType;

    /**
     * @return Logger type.
     * 
     */
    public Output<String> getLoggerType() {
        return this.loggerType;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiagnosticLogger(String name, DiagnosticLoggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:DiagnosticLogger", name, args == null ? DiagnosticLoggerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DiagnosticLogger(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:DiagnosticLogger", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:DiagnosticLogger").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:DiagnosticLogger").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DiagnosticLogger get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DiagnosticLogger(name, id, options);
    }
}
