// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppSiteExtensionArgs;
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
 * Site Extension Information.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSiteExtension myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/siteextensions/{siteExtensionId} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSiteExtension")
public class WebAppSiteExtension extends io.pulumi.resources.CustomResource {
    /**
     * List of authors.
     * 
     */
    @OutputExport(name="authors", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authors;

    /**
     * @return List of authors.
     * 
     */
    public Output</* @Nullable */ List<String>> getAuthors() {
        return this.authors;
    }
    /**
     * Site Extension comment.
     * 
     */
    @OutputExport(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Site Extension comment.
     * 
     */
    public Output</* @Nullable */ String> getComment() {
        return this.comment;
    }
    /**
     * Detailed description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Detailed description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Count of downloads.
     * 
     */
    @OutputExport(name="downloadCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downloadCount;

    /**
     * @return Count of downloads.
     * 
     */
    public Output</* @Nullable */ Integer> getDownloadCount() {
        return this.downloadCount;
    }
    /**
     * Site extension ID.
     * 
     */
    @OutputExport(name="extensionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionId;

    /**
     * @return Site extension ID.
     * 
     */
    public Output</* @Nullable */ String> getExtensionId() {
        return this.extensionId;
    }
    /**
     * Site extension type.
     * 
     */
    @OutputExport(name="extensionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionType;

    /**
     * @return Site extension type.
     * 
     */
    public Output</* @Nullable */ String> getExtensionType() {
        return this.extensionType;
    }
    /**
     * Extension URL.
     * 
     */
    @OutputExport(name="extensionUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionUrl;

    /**
     * @return Extension URL.
     * 
     */
    public Output</* @Nullable */ String> getExtensionUrl() {
        return this.extensionUrl;
    }
    /**
     * Feed URL.
     * 
     */
    @OutputExport(name="feedUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> feedUrl;

    /**
     * @return Feed URL.
     * 
     */
    public Output</* @Nullable */ String> getFeedUrl() {
        return this.feedUrl;
    }
    /**
     * Icon URL.
     * 
     */
    @OutputExport(name="iconUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> iconUrl;

    /**
     * @return Icon URL.
     * 
     */
    public Output</* @Nullable */ String> getIconUrl() {
        return this.iconUrl;
    }
    /**
     * Installed timestamp.
     * 
     */
    @OutputExport(name="installedDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> installedDateTime;

    /**
     * @return Installed timestamp.
     * 
     */
    public Output</* @Nullable */ String> getInstalledDateTime() {
        return this.installedDateTime;
    }
    /**
     * Installer command line parameters.
     * 
     */
    @OutputExport(name="installerCommandLineParams", type=String.class, parameters={})
    private Output</* @Nullable */ String> installerCommandLineParams;

    /**
     * @return Installer command line parameters.
     * 
     */
    public Output</* @Nullable */ String> getInstallerCommandLineParams() {
        return this.installerCommandLineParams;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * License URL.
     * 
     */
    @OutputExport(name="licenseUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseUrl;

    /**
     * @return License URL.
     * 
     */
    public Output</* @Nullable */ String> getLicenseUrl() {
        return this.licenseUrl;
    }
    /**
     * <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
     */
    @OutputExport(name="localIsLatestVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> localIsLatestVersion;

    /**
     * @return <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
     */
    public Output</* @Nullable */ Boolean> getLocalIsLatestVersion() {
        return this.localIsLatestVersion;
    }
    /**
     * Local path.
     * 
     */
    @OutputExport(name="localPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> localPath;

    /**
     * @return Local path.
     * 
     */
    public Output</* @Nullable */ String> getLocalPath() {
        return this.localPath;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Project URL.
     * 
     */
    @OutputExport(name="projectUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectUrl;

    /**
     * @return Project URL.
     * 
     */
    public Output</* @Nullable */ String> getProjectUrl() {
        return this.projectUrl;
    }
    /**
     * Provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Published timestamp.
     * 
     */
    @OutputExport(name="publishedDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> publishedDateTime;

    /**
     * @return Published timestamp.
     * 
     */
    public Output</* @Nullable */ String> getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Summary description.
     * 
     */
    @OutputExport(name="summary", type=String.class, parameters={})
    private Output</* @Nullable */ String> summary;

    /**
     * @return Summary description.
     * 
     */
    public Output</* @Nullable */ String> getSummary() {
        return this.summary;
    }
    @OutputExport(name="title", type=String.class, parameters={})
    private Output</* @Nullable */ String> title;

    public Output</* @Nullable */ String> getTitle() {
        return this.title;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Version information.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Version information.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(WebAppSiteExtensionArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppSiteExtensionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppSiteExtensionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppSiteExtension(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppSiteExtension(String name) {
        this(name, WebAppSiteExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSiteExtension(String name, WebAppSiteExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSiteExtension(String name, WebAppSiteExtensionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSiteExtension", name, args == null ? WebAppSiteExtensionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppSiteExtension(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSiteExtension", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppSiteExtension").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppSiteExtension").build())
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
    public static WebAppSiteExtension get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSiteExtension(name, id, options);
    }
}