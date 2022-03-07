// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionUrlMapArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapState;
import io.pulumi.gcp.compute.outputs.RegionUrlMapDefaultUrlRedirect;
import io.pulumi.gcp.compute.outputs.RegionUrlMapHostRule;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcher;
import io.pulumi.gcp.compute.outputs.RegionUrlMapTest;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * UrlMaps are used to route requests to a backend service based on rules
 * that you define for the host and path of an incoming URL.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionUrlMap can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionUrlMap:RegionUrlMap default projects/{{project}}/regions/{{region}}/urlMaps/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionUrlMap:RegionUrlMap default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionUrlMap:RegionUrlMap default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionUrlMap:RegionUrlMap default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionUrlMap:RegionUrlMap")
public class RegionUrlMap extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * A reference to a RegionBackendService resource. This will be used if
     * none of the pathRules defined by this PathMatcher is matched by
     * the URL's path portion.
     * 
     */
    @OutputExport(name="defaultService", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultService;

    /**
     * @return A reference to a RegionBackendService resource. This will be used if
     * none of the pathRules defined by this PathMatcher is matched by
     * the URL's path portion.
     * 
     */
    public Output</* @Nullable */ String> getDefaultService() {
        return this.defaultService;
    }
    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="defaultUrlRedirect", type=RegionUrlMapDefaultUrlRedirect.class, parameters={})
    private Output</* @Nullable */ RegionUrlMapDefaultUrlRedirect> defaultUrlRedirect;

    /**
     * @return When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionUrlMapDefaultUrlRedirect> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }
    /**
     * Description of this test case.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of this test case.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The list of HostRules to use against the URL.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="hostRules", type=List.class, parameters={RegionUrlMapHostRule.class})
    private Output</* @Nullable */ List<RegionUrlMapHostRule>> hostRules;

    /**
     * @return The list of HostRules to use against the URL.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<RegionUrlMapHostRule>> getHostRules() {
        return this.hostRules;
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @OutputExport(name="mapId", type=Integer.class, parameters={})
    private Output<Integer> mapId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> getMapId() {
        return this.mapId;
    }
    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL's host portion.
     * 
     */
    @OutputExport(name="pathMatchers", type=List.class, parameters={RegionUrlMapPathMatcher.class})
    private Output</* @Nullable */ List<RegionUrlMapPathMatcher>> pathMatchers;

    /**
     * @return The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL's host portion.
     * 
     */
    public Output</* @Nullable */ List<RegionUrlMapPathMatcher>> getPathMatchers() {
        return this.pathMatchers;
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
     * The Region in which the url map should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The Region in which the url map should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The list of expected URL mappings. Requests to update this UrlMap will
     * succeed only if all of the test cases pass.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="tests", type=List.class, parameters={RegionUrlMapTest.class})
    private Output</* @Nullable */ List<RegionUrlMapTest>> tests;

    /**
     * @return The list of expected URL mappings. Requests to update this UrlMap will
     * succeed only if all of the test cases pass.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<RegionUrlMapTest>> getTests() {
        return this.tests;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable RegionUrlMapArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.RegionUrlMapArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.RegionUrlMapArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegionUrlMap(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionUrlMap(String name) {
        this(name, RegionUrlMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionUrlMap(String name, @Nullable RegionUrlMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionUrlMap(String name, @Nullable RegionUrlMapArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionUrlMap:RegionUrlMap", name, args == null ? RegionUrlMapArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionUrlMap(String name, Input<String> id, @Nullable RegionUrlMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionUrlMap:RegionUrlMap", name, state, makeResourceOptions(options, id));
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
    public static RegionUrlMap get(String name, Input<String> id, @Nullable RegionUrlMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionUrlMap(name, id, state, options);
    }
}