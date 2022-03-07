// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.appengine.FlexibleAppVersionArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionState;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionApiConfig;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionAutomaticScaling;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeployment;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionEndpointsApiService;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionEntrypoint;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionHandler;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionLivenessCheck;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionManualScaling;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionNetwork;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionReadinessCheck;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionResources;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionVpcAccessConnector;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Flexible App Version resource to create a new version of flexible GAE Application. Based on Google Compute Engine,
 * the App Engine flexible environment automatically scales your app up and down while also balancing the load.
 * Learn about the differences between the standard environment and the flexible environment
 * at https://cloud.google.com/appengine/docs/the-appengine-environments.
 * 
 * > **Note:** The App Engine flexible environment service account uses the member ID `service-[YOUR_PROJECT_NUMBER]@gae-api-prod.google.com.iam.gserviceaccount.com`
 * It should have the App Engine Flexible Environment Service Agent role, which will be applied when the `appengineflex.googleapis.com` service is enabled.
 * 
 * To get more information about FlexibleAppVersion, see:
 * 
 * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/appengine/docs/flexible)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * FlexibleAppVersion can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/flexibleAppVersion:FlexibleAppVersion default apps/{{project}}/services/{{service}}/versions/{{version_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/flexibleAppVersion:FlexibleAppVersion default {{project}}/{{service}}/{{version_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/flexibleAppVersion:FlexibleAppVersion default {{service}}/{{version_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:appengine/flexibleAppVersion:FlexibleAppVersion")
public class FlexibleAppVersion extends io.pulumi.resources.CustomResource {
    /**
     * Serving configuration for Google Cloud Endpoints.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="apiConfig", type=FlexibleAppVersionApiConfig.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionApiConfig> apiConfig;

    /**
     * @return Serving configuration for Google Cloud Endpoints.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionApiConfig> getApiConfig() {
        return this.apiConfig;
    }
    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="automaticScaling", type=FlexibleAppVersionAutomaticScaling.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionAutomaticScaling> automaticScaling;

    /**
     * @return Automatic scaling is based on request rate, response latencies, and other application metrics.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionAutomaticScaling> getAutomaticScaling() {
        return this.automaticScaling;
    }
    /**
     * Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    @OutputExport(name="betaSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> betaSettings;

    /**
     * @return Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getBetaSettings() {
        return this.betaSettings;
    }
    /**
     * Duration that static files should be cached by web proxies and browsers.
     * Only applicable if the corresponding StaticFilesHandler does not specify its own expiration time.
     * 
     */
    @OutputExport(name="defaultExpiration", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultExpiration;

    /**
     * @return Duration that static files should be cached by web proxies and browsers.
     * Only applicable if the corresponding StaticFilesHandler does not specify its own expiration time.
     * 
     */
    public Output</* @Nullable */ String> getDefaultExpiration() {
        return this.defaultExpiration;
    }
    /**
     * If set to `true`, the service will be deleted if it is the last version.
     * 
     */
    @OutputExport(name="deleteServiceOnDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteServiceOnDestroy;

    /**
     * @return If set to `true`, the service will be deleted if it is the last version.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeleteServiceOnDestroy() {
        return this.deleteServiceOnDestroy;
    }
    /**
     * Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="deployment", type=FlexibleAppVersionDeployment.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionDeployment> deployment;

    /**
     * @return Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionDeployment> getDeployment() {
        return this.deployment;
    }
    /**
     * Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="endpointsApiService", type=FlexibleAppVersionEndpointsApiService.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionEndpointsApiService> endpointsApiService;

    /**
     * @return Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionEndpointsApiService> getEndpointsApiService() {
        return this.endpointsApiService;
    }
    /**
     * The entrypoint for the application.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="entrypoint", type=FlexibleAppVersionEntrypoint.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionEntrypoint> entrypoint;

    /**
     * @return The entrypoint for the application.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionEntrypoint> getEntrypoint() {
        return this.entrypoint;
    }
    /**
     * Environment variables available to the application.  As these are not returned in the API request, the provider will not detect any changes made outside of the config.
     * 
     */
    @OutputExport(name="envVariables", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> envVariables;

    /**
     * @return Environment variables available to the application.  As these are not returned in the API request, the provider will not detect any changes made outside of the config.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getEnvVariables() {
        return this.envVariables;
    }
    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests.
     * The first matching URL handles the request and other request handlers are not attempted.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="handlers", type=List.class, parameters={FlexibleAppVersionHandler.class})
    private Output<List<FlexibleAppVersionHandler>> handlers;

    /**
     * @return An ordered list of URL-matching patterns that should be applied to incoming requests.
     * The first matching URL handles the request and other request handlers are not attempted.
     * Structure is documented below.
     * 
     */
    public Output<List<FlexibleAppVersionHandler>> getHandlers() {
        return this.handlers;
    }
    /**
     * A list of the types of messages that this application is able to receive.
     * Each value may be one of `INBOUND_SERVICE_MAIL`, `INBOUND_SERVICE_MAIL_BOUNCE`, `INBOUND_SERVICE_XMPP_ERROR`, `INBOUND_SERVICE_XMPP_MESSAGE`, `INBOUND_SERVICE_XMPP_SUBSCRIBE`, `INBOUND_SERVICE_XMPP_PRESENCE`, `INBOUND_SERVICE_CHANNEL_PRESENCE`, and `INBOUND_SERVICE_WARMUP`.
     * 
     */
    @OutputExport(name="inboundServices", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> inboundServices;

    /**
     * @return A list of the types of messages that this application is able to receive.
     * Each value may be one of `INBOUND_SERVICE_MAIL`, `INBOUND_SERVICE_MAIL_BOUNCE`, `INBOUND_SERVICE_XMPP_ERROR`, `INBOUND_SERVICE_XMPP_MESSAGE`, `INBOUND_SERVICE_XMPP_SUBSCRIBE`, `INBOUND_SERVICE_XMPP_PRESENCE`, `INBOUND_SERVICE_CHANNEL_PRESENCE`, and `INBOUND_SERVICE_WARMUP`.
     * 
     */
    public Output</* @Nullable */ List<String>> getInboundServices() {
        return this.inboundServices;
    }
    /**
     * Instance class that is used to run this version. Valid values are
     * AutomaticScaling: F1, F2, F4, F4_1G
     * ManualScaling: B1, B2, B4, B8, B4_1G
     * Defaults to F1 for AutomaticScaling and B1 for ManualScaling.
     * 
     */
    @OutputExport(name="instanceClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceClass;

    /**
     * @return Instance class that is used to run this version. Valid values are
     * AutomaticScaling: F1, F2, F4, F4_1G
     * ManualScaling: B1, B2, B4, B8, B4_1G
     * Defaults to F1 for AutomaticScaling and B1 for ManualScaling.
     * 
     */
    public Output</* @Nullable */ String> getInstanceClass() {
        return this.instanceClass;
    }
    /**
     * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="livenessCheck", type=FlexibleAppVersionLivenessCheck.class, parameters={})
    private Output<FlexibleAppVersionLivenessCheck> livenessCheck;

    /**
     * @return Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
     * Structure is documented below.
     * 
     */
    public Output<FlexibleAppVersionLivenessCheck> getLivenessCheck() {
        return this.livenessCheck;
    }
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="manualScaling", type=FlexibleAppVersionManualScaling.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionManualScaling> manualScaling;

    /**
     * @return A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionManualScaling> getManualScaling() {
        return this.manualScaling;
    }
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Extra network settings
     * Structure is documented below.
     * 
     */
    @OutputExport(name="network", type=FlexibleAppVersionNetwork.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionNetwork> network;

    /**
     * @return Extra network settings
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionNetwork> getNetwork() {
        return this.network;
    }
    /**
     * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.
     * 
     */
    @OutputExport(name="nobuildFilesRegex", type=String.class, parameters={})
    private Output</* @Nullable */ String> nobuildFilesRegex;

    /**
     * @return Files that match this pattern will not be built into this version. Only applicable for Go runtimes.
     * 
     */
    public Output</* @Nullable */ String> getNobuildFilesRegex() {
        return this.nobuildFilesRegex;
    }
    /**
     * If set to `true`, the application version will not be deleted.
     * 
     */
    @OutputExport(name="noopOnDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noopOnDestroy;

    /**
     * @return If set to `true`, the application version will not be deleted.
     * 
     */
    public Output</* @Nullable */ Boolean> getNoopOnDestroy() {
        return this.noopOnDestroy;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="readinessCheck", type=FlexibleAppVersionReadinessCheck.class, parameters={})
    private Output<FlexibleAppVersionReadinessCheck> readinessCheck;

    /**
     * @return Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.
     * Structure is documented below.
     * 
     */
    public Output<FlexibleAppVersionReadinessCheck> getReadinessCheck() {
        return this.readinessCheck;
    }
    /**
     * Machine resources for a version.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="resources", type=FlexibleAppVersionResources.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionResources> resources;

    /**
     * @return Machine resources for a version.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionResources> getResources() {
        return this.resources;
    }
    /**
     * Desired runtime. Example python27.
     * 
     */
    @OutputExport(name="runtime", type=String.class, parameters={})
    private Output<String> runtime;

    /**
     * @return Desired runtime. Example python27.
     * 
     */
    public Output<String> getRuntime() {
        return this.runtime;
    }
    /**
     * The version of the API in the given runtime environment.
     * Please see the app.yaml reference for valid values at `https://cloud.google.com/appengine/docs/standard/<language>/config/appref`\
     * Substitute `<language>` with `python`, `java`, `php`, `ruby`, `go` or `nodejs`.
     * 
     */
    @OutputExport(name="runtimeApiVersion", type=String.class, parameters={})
    private Output<String> runtimeApiVersion;

    /**
     * @return The version of the API in the given runtime environment.
     * Please see the app.yaml reference for valid values at `https://cloud.google.com/appengine/docs/standard/<language>/config/appref`\
     * Substitute `<language>` with `python`, `java`, `php`, `ruby`, `go` or `nodejs`.
     * 
     */
    public Output<String> getRuntimeApiVersion() {
        return this.runtimeApiVersion;
    }
    /**
     * The channel of the runtime to use. Only available for some runtimes.
     * 
     */
    @OutputExport(name="runtimeChannel", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeChannel;

    /**
     * @return The channel of the runtime to use. Only available for some runtimes.
     * 
     */
    public Output</* @Nullable */ String> getRuntimeChannel() {
        return this.runtimeChannel;
    }
    /**
     * The path or name of the app's main executable.
     * 
     */
    @OutputExport(name="runtimeMainExecutablePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeMainExecutablePath;

    /**
     * @return The path or name of the app's main executable.
     * 
     */
    public Output</* @Nullable */ String> getRuntimeMainExecutablePath() {
        return this.runtimeMainExecutablePath;
    }
    /**
     * AppEngine service resource. Can contain numbers, letters, and hyphens.
     * 
     */
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return AppEngine service resource. Can contain numbers, letters, and hyphens.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }
    /**
     * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.
     * Default value is `SERVING`.
     * Possible values are `SERVING` and `STOPPED`.
     * 
     */
    @OutputExport(name="servingStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> servingStatus;

    /**
     * @return Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.
     * Default value is `SERVING`.
     * Possible values are `SERVING` and `STOPPED`.
     * 
     */
    public Output</* @Nullable */ String> getServingStatus() {
        return this.servingStatus;
    }
    /**
     * Relative name of the version within the service. For example, `v1`. Version names can contain only lowercase letters, numbers, or hyphens.
     * Reserved names,"default", "latest", and any name with the prefix "ah-".
     * 
     */
    @OutputExport(name="versionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionId;

    /**
     * @return Relative name of the version within the service. For example, `v1`. Version names can contain only lowercase letters, numbers, or hyphens.
     * Reserved names,"default", "latest", and any name with the prefix "ah-".
     * 
     */
    public Output</* @Nullable */ String> getVersionId() {
        return this.versionId;
    }
    /**
     * Enables VPC connectivity for standard apps.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="vpcAccessConnector", type=FlexibleAppVersionVpcAccessConnector.class, parameters={})
    private Output</* @Nullable */ FlexibleAppVersionVpcAccessConnector> vpcAccessConnector;

    /**
     * @return Enables VPC connectivity for standard apps.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FlexibleAppVersionVpcAccessConnector> getVpcAccessConnector() {
        return this.vpcAccessConnector;
    }

    public interface BuilderApplicator {
        public void apply(FlexibleAppVersionArgs.Builder a);
    }
    private static io.pulumi.gcp.appengine.FlexibleAppVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.appengine.FlexibleAppVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FlexibleAppVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlexibleAppVersion(String name) {
        this(name, FlexibleAppVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlexibleAppVersion(String name, FlexibleAppVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlexibleAppVersion(String name, FlexibleAppVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/flexibleAppVersion:FlexibleAppVersion", name, args == null ? FlexibleAppVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FlexibleAppVersion(String name, Input<String> id, @Nullable FlexibleAppVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/flexibleAppVersion:FlexibleAppVersion", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static FlexibleAppVersion get(String name, Input<String> id, @Nullable FlexibleAppVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FlexibleAppVersion(name, id, state, options);
    }
}