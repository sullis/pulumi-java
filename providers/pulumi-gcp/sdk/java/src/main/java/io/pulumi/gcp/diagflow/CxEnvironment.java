// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.CxEnvironmentArgs;
import io.pulumi.gcp.diagflow.inputs.CxEnvironmentState;
import io.pulumi.gcp.diagflow.outputs.CxEnvironmentVersionConfig;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents an environment for an agent. You can create multiple versions of your agent and publish them to separate environments.
 * When you edit an agent, you are editing the draft agent. At any point, you can save the draft agent as an agent version, which is an immutable snapshot of your agent.
 * When you save the draft agent, it is published to the default environment. When you create agent versions, you can publish them to custom environments. You can create a variety of custom environments for testing, development, production, etc.
 * 
 * To get more information about Environment, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.environments)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Environment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxEnvironment:CxEnvironment default {{parent}}/environments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxEnvironment:CxEnvironment default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxEnvironment:CxEnvironment")
public class CxEnvironment extends io.pulumi.resources.CustomResource {
    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The name of the environment.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Agent to create an Environment for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The Agent to create an Environment for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    public Output</* @Nullable */ String> getParent() {
        return this.parent;
    }
    /**
     * Update time of this environment. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Update time of this environment. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="versionConfigs", type=List.class, parameters={CxEnvironmentVersionConfig.class})
    private Output<List<CxEnvironmentVersionConfig>> versionConfigs;

    /**
     * @return A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    public Output<List<CxEnvironmentVersionConfig>> getVersionConfigs() {
        return this.versionConfigs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxEnvironment(String name, CxEnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxEnvironment:CxEnvironment", name, args == null ? CxEnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CxEnvironment(String name, Input<String> id, @Nullable CxEnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxEnvironment:CxEnvironment", name, state, makeResourceOptions(options, id));
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
    public static CxEnvironment get(String name, Input<String> id, @Nullable CxEnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CxEnvironment(name, id, state, options);
    }
}
