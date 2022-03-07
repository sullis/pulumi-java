// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.AFDOriginArgs;
import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SharedPrivateLinkResourcePropertiesResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:AFDOrigin origin1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/origingroups/origingroup1/origins/origin1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:AFDOrigin")
public class AFDOrigin extends io.pulumi.resources.CustomResource {
    /**
     * Resource reference to the Azure origin resource.
     * 
     */
    @OutputExport(name="azureOrigin", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> azureOrigin;

    /**
     * @return Resource reference to the Azure origin resource.
     * 
     */
    public Output</* @Nullable */ ResourceReferenceResponse> getAzureOrigin() {
        return this.azureOrigin;
    }
    @OutputExport(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    @OutputExport(name="enabledState", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabledState;

    /**
     * @return Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    public Output</* @Nullable */ String> getEnabledState() {
        return this.enabledState;
    }
    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    @OutputExport(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    public Output<String> getHostName() {
        return this.hostName;
    }
    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    @OutputExport(name="httpPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> httpPort;

    /**
     * @return The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    public Output</* @Nullable */ Integer> getHttpPort() {
        return this.httpPort;
    }
    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    @OutputExport(name="httpsPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> httpsPort;

    /**
     * @return The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    public Output</* @Nullable */ Integer> getHttpsPort() {
        return this.httpsPort;
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
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    @OutputExport(name="originHostHeader", type=String.class, parameters={})
    private Output</* @Nullable */ String> originHostHeader;

    /**
     * @return The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    public Output</* @Nullable */ String> getOriginHostHeader() {
        return this.originHostHeader;
    }
    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    public Output</* @Nullable */ Integer> getPriority() {
        return this.priority;
    }
    /**
     * Provisioning status
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The properties of the private link resource for private origin.
     * 
     */
    @OutputExport(name="sharedPrivateLinkResource", type=SharedPrivateLinkResourcePropertiesResponse.class, parameters={})
    private Output</* @Nullable */ SharedPrivateLinkResourcePropertiesResponse> sharedPrivateLinkResource;

    /**
     * @return The properties of the private link resource for private origin.
     * 
     */
    public Output</* @Nullable */ SharedPrivateLinkResourcePropertiesResponse> getSharedPrivateLinkResource() {
        return this.sharedPrivateLinkResource;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    @OutputExport(name="weight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> weight;

    /**
     * @return Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    public Output</* @Nullable */ Integer> getWeight() {
        return this.weight;
    }

    public interface BuilderApplicator {
        public void apply(AFDOriginArgs.Builder a);
    }
    private static io.pulumi.azurenative.cdn.AFDOriginArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cdn.AFDOriginArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AFDOrigin(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AFDOrigin(String name) {
        this(name, AFDOriginArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AFDOrigin(String name, AFDOriginArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AFDOrigin(String name, AFDOriginArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDOrigin", name, args == null ? AFDOriginArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AFDOrigin(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDOrigin", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:AFDOrigin").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:AFDOrigin").build())
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
    public static AFDOrigin get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AFDOrigin(name, id, options);
    }
}