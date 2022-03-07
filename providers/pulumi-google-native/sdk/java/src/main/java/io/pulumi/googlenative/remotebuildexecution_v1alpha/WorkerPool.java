// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.WorkerPoolArgs;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new worker pool with a specified size and configuration. Returns a long running operation which contains a worker pool on completion. While the long running operation is in progress, any call to `GetWorkerPool` returns a worker pool in state `CREATING`.
 * 
 */
@ResourceType(type="google-native:remotebuildexecution/v1alpha:WorkerPool")
public class WorkerPool extends io.pulumi.resources.CustomResource {
    /**
     * The autoscale policy to apply on a pool.
     * 
     */
    @OutputExport(name="autoscale", type=GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse.class, parameters={})
    private Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse> autoscale;

    /**
     * @return The autoscale policy to apply on a pool.
     * 
     */
    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse> getAutoscale() {
        return this.autoscale;
    }
    /**
     * Channel specifies the release channel of the pool.
     * 
     */
    @OutputExport(name="channel", type=String.class, parameters={})
    private Output<String> channel;

    /**
     * @return Channel specifies the release channel of the pool.
     * 
     */
    public Output<String> getChannel() {
        return this.channel;
    }
    /**
     * WorkerPool resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be populated when creating a worker pool since it is provided in the `poolId` field.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return WorkerPool resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be populated when creating a worker pool since it is provided in the `poolId` field.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the worker pool.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the worker pool.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Specifies the properties, such as machine type and disk size, used for creating workers in a worker pool.
     * 
     */
    @OutputExport(name="workerConfig", type=GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse.class, parameters={})
    private Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse> workerConfig;

    /**
     * @return Specifies the properties, such as machine type and disk size, used for creating workers in a worker pool.
     * 
     */
    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse> getWorkerConfig() {
        return this.workerConfig;
    }
    /**
     * The desired number of workers in the worker pool. Must be a value between 0 and 15000.
     * 
     */
    @OutputExport(name="workerCount", type=String.class, parameters={})
    private Output<String> workerCount;

    /**
     * @return The desired number of workers in the worker pool. Must be a value between 0 and 15000.
     * 
     */
    public Output<String> getWorkerCount() {
        return this.workerCount;
    }

    public interface BuilderApplicator {
        public void apply(WorkerPoolArgs.Builder a);
    }
    private static io.pulumi.googlenative.remotebuildexecution_v1alpha.WorkerPoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.remotebuildexecution_v1alpha.WorkerPoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WorkerPool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerPool(String name) {
        this(name, WorkerPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerPool(String name, WorkerPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerPool(String name, WorkerPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:remotebuildexecution/v1alpha:WorkerPool", name, args == null ? WorkerPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkerPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:remotebuildexecution/v1alpha:WorkerPool", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WorkerPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkerPool(name, id, options);
    }
}