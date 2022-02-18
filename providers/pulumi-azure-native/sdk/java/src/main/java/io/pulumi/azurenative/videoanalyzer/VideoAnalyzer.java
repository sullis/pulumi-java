// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.VideoAnalyzerArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.AccountEncryptionResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.EndpointResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.StorageAccountResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoAnalyzerIdentityResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Video Analyzer account.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:videoanalyzer:VideoAnalyzer contosomovies /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contoso/providers/Microsoft.Media/videoAnalyzers/contosomovies 
 * ```
 * 
 */
@ResourceType(type="azure-native:videoanalyzer:VideoAnalyzer")
public class VideoAnalyzer extends io.pulumi.resources.CustomResource {
    /**
     * The account encryption properties.
     * 
     */
    @OutputExport(name="encryption", type=AccountEncryptionResponse.class, parameters={})
    private Output<AccountEncryptionResponse> encryption;

    /**
     * @return The account encryption properties.
     * 
     */
    public Output<AccountEncryptionResponse> getEncryption() {
        return this.encryption;
    }
    /**
     * The list of endpoints associated with this resource.
     * 
     */
    @OutputExport(name="endpoints", type=List.class, parameters={EndpointResponse.class})
    private Output<List<EndpointResponse>> endpoints;

    /**
     * @return The list of endpoints associated with this resource.
     * 
     */
    public Output<List<EndpointResponse>> getEndpoints() {
        return this.endpoints;
    }
    /**
     * The set of managed identities associated with the Video Analyzer resource.
     * 
     */
    @OutputExport(name="identity", type=VideoAnalyzerIdentityResponse.class, parameters={})
    private Output</* @Nullable */ VideoAnalyzerIdentityResponse> identity;

    /**
     * @return The set of managed identities associated with the Video Analyzer resource.
     * 
     */
    public Output</* @Nullable */ VideoAnalyzerIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The storage accounts for this resource.
     * 
     */
    @OutputExport(name="storageAccounts", type=List.class, parameters={StorageAccountResponse.class})
    private Output<List<StorageAccountResponse>> storageAccounts;

    /**
     * @return The storage accounts for this resource.
     * 
     */
    public Output<List<StorageAccountResponse>> getStorageAccounts() {
        return this.storageAccounts;
    }
    /**
     * The system data of the Video Analyzer account.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data of the Video Analyzer account.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
    public VideoAnalyzer(String name, VideoAnalyzerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:VideoAnalyzer", name, args == null ? VideoAnalyzerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VideoAnalyzer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:VideoAnalyzer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:videoanalyzer/v20210501preview:VideoAnalyzer").build()),
                Input.of(Alias.builder().setType("azure-native:videoanalyzer/v20211101preview:VideoAnalyzer").build())
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
    public static VideoAnalyzer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VideoAnalyzer(name, id, options);
    }
}
