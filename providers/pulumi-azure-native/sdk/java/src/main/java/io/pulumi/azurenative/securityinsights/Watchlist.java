// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.WatchlistArgs;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.azurenative.securityinsights.outputs.WatchlistUserInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a Watchlist in Azure Security Insights.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:Watchlist highValueAsset /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalIinsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/watchlists/highValueAsset 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:Watchlist")
public class Watchlist extends io.pulumi.resources.CustomResource {
    /**
     * The content type of the raw content. Example : text/csv or text/tsv
     * 
     */
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    /**
     * @return The content type of the raw content. Example : text/csv or text/tsv
     * 
     */
    public Output</* @Nullable */ String> getContentType() {
        return this.contentType;
    }
    /**
     * The time the watchlist was created
     * 
     */
    @OutputExport(name="created", type=String.class, parameters={})
    private Output</* @Nullable */ String> created;

    /**
     * @return The time the watchlist was created
     * 
     */
    public Output</* @Nullable */ String> getCreated() {
        return this.created;
    }
    /**
     * Describes a user that created the watchlist
     * 
     */
    @OutputExport(name="createdBy", type=WatchlistUserInfoResponse.class, parameters={})
    private Output</* @Nullable */ WatchlistUserInfoResponse> createdBy;

    /**
     * @return Describes a user that created the watchlist
     * 
     */
    public Output</* @Nullable */ WatchlistUserInfoResponse> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The default duration of a watchlist (in ISO 8601 duration format)
     * 
     */
    @OutputExport(name="defaultDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultDuration;

    /**
     * @return The default duration of a watchlist (in ISO 8601 duration format)
     * 
     */
    public Output</* @Nullable */ String> getDefaultDuration() {
        return this.defaultDuration;
    }
    /**
     * A description of the watchlist
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the watchlist
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The display name of the watchlist
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the watchlist
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
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
     * A flag that indicates if the watchlist is deleted or not
     * 
     */
    @OutputExport(name="isDeleted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDeleted;

    /**
     * @return A flag that indicates if the watchlist is deleted or not
     * 
     */
    public Output</* @Nullable */ Boolean> getIsDeleted() {
        return this.isDeleted;
    }
    /**
     * The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
     * 
     */
    @OutputExport(name="itemsSearchKey", type=String.class, parameters={})
    private Output<String> itemsSearchKey;

    /**
     * @return The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
     * 
     */
    public Output<String> getItemsSearchKey() {
        return this.itemsSearchKey;
    }
    /**
     * List of labels relevant to this watchlist
     * 
     */
    @OutputExport(name="labels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> labels;

    /**
     * @return List of labels relevant to this watchlist
     * 
     */
    public Output</* @Nullable */ List<String>> getLabels() {
        return this.labels;
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
     * The number of lines in a csv/tsv content to skip before the header
     * 
     */
    @OutputExport(name="numberOfLinesToSkip", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfLinesToSkip;

    /**
     * @return The number of lines in a csv/tsv content to skip before the header
     * 
     */
    public Output</* @Nullable */ Integer> getNumberOfLinesToSkip() {
        return this.numberOfLinesToSkip;
    }
    /**
     * The provider of the watchlist
     * 
     */
    @OutputExport(name="provider", type=String.class, parameters={})
    private Output<String> provider;

    /**
     * @return The provider of the watchlist
     * 
     */
    public Output<String> getProvider() {
        return this.provider;
    }
    /**
     * The raw content that represents to watchlist items to create. In case of csv/tsv content type, it's the content of the file that will parsed by the endpoint
     * 
     */
    @OutputExport(name="rawContent", type=String.class, parameters={})
    private Output</* @Nullable */ String> rawContent;

    /**
     * @return The raw content that represents to watchlist items to create. In case of csv/tsv content type, it's the content of the file that will parsed by the endpoint
     * 
     */
    public Output</* @Nullable */ String> getRawContent() {
        return this.rawContent;
    }
    /**
     * The source of the watchlist
     * 
     */
    @OutputExport(name="source", type=String.class, parameters={})
    private Output<String> source;

    /**
     * @return The source of the watchlist
     * 
     */
    public Output<String> getSource() {
        return this.source;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The tenantId where the watchlist belongs to
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The tenantId where the watchlist belongs to
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
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
     * The last time the watchlist was updated
     * 
     */
    @OutputExport(name="updated", type=String.class, parameters={})
    private Output</* @Nullable */ String> updated;

    /**
     * @return The last time the watchlist was updated
     * 
     */
    public Output</* @Nullable */ String> getUpdated() {
        return this.updated;
    }
    /**
     * Describes a user that updated the watchlist
     * 
     */
    @OutputExport(name="updatedBy", type=WatchlistUserInfoResponse.class, parameters={})
    private Output</* @Nullable */ WatchlistUserInfoResponse> updatedBy;

    /**
     * @return Describes a user that updated the watchlist
     * 
     */
    public Output</* @Nullable */ WatchlistUserInfoResponse> getUpdatedBy() {
        return this.updatedBy;
    }
    /**
     * The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
     * 
     */
    @OutputExport(name="uploadStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> uploadStatus;

    /**
     * @return The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
     * 
     */
    public Output</* @Nullable */ String> getUploadStatus() {
        return this.uploadStatus;
    }
    /**
     * The alias of the watchlist
     * 
     */
    @OutputExport(name="watchlistAlias", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistAlias;

    /**
     * @return The alias of the watchlist
     * 
     */
    public Output</* @Nullable */ String> getWatchlistAlias() {
        return this.watchlistAlias;
    }
    /**
     * The id (a Guid) of the watchlist
     * 
     */
    @OutputExport(name="watchlistId", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistId;

    /**
     * @return The id (a Guid) of the watchlist
     * 
     */
    public Output</* @Nullable */ String> getWatchlistId() {
        return this.watchlistId;
    }
    /**
     * The number of Watchlist Items in the Watchlist
     * 
     */
    @OutputExport(name="watchlistItemsCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> watchlistItemsCount;

    /**
     * @return The number of Watchlist Items in the Watchlist
     * 
     */
    public Output</* @Nullable */ Integer> getWatchlistItemsCount() {
        return this.watchlistItemsCount;
    }
    /**
     * The type of the watchlist
     * 
     */
    @OutputExport(name="watchlistType", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistType;

    /**
     * @return The type of the watchlist
     * 
     */
    public Output</* @Nullable */ String> getWatchlistType() {
        return this.watchlistType;
    }

    public interface BuilderApplicator {
        public void apply(WatchlistArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.WatchlistArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.WatchlistArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Watchlist(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Watchlist(String name) {
        this(name, WatchlistArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Watchlist(String name, WatchlistArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Watchlist(String name, WatchlistArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Watchlist", name, args == null ? WatchlistArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Watchlist(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Watchlist", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:Watchlist").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:Watchlist").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210401:Watchlist").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:Watchlist").build())
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
    public static Watchlist get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Watchlist(name, id, options);
    }
}