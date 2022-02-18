// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.ThreatIntelligenceIndicatorArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Threat intelligence information object.
 * API Version: 2019-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:ThreatIntelligenceIndicator 180105c7-a28d-b1a2-4a78-234f6ec80fd6 /subscriptions/bd794837-4d29-4647-9105-6339bfdb4e6a/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/ThreatIntelligence/180105c7-a28d-b1a2-4a78-234f6ec80fd6 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:ThreatIntelligenceIndicator")
public class ThreatIntelligenceIndicator extends io.pulumi.resources.CustomResource {
    /**
     * Etag of the azure resource
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The kind of the entity.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the entity.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Azure resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
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
    public ThreatIntelligenceIndicator(String name, ThreatIntelligenceIndicatorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ThreatIntelligenceIndicator", name, args == null ? ThreatIntelligenceIndicatorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ThreatIntelligenceIndicator(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ThreatIntelligenceIndicator", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:ThreatIntelligenceIndicator").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210401:ThreatIntelligenceIndicator").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:ThreatIntelligenceIndicator").build())
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
    public static ThreatIntelligenceIndicator get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ThreatIntelligenceIndicator(name, id, options);
    }
}
