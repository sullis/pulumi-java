// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.GetAmiIdsArgs;
import io.pulumi.aws.outputs.GetAmiIdsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
public class GetAmiIds {
    private GetAmiIds() {}
    public interface BuilderApplicator {
        public void apply(GetAmiIdsArgs.Builder a);
    }
    private static GetAmiIdsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAmiIdsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get a list of AMI IDs matching the specified criteria.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getAmiIds.
 * 
     *
     * A collection of values returned by getAmiIds.
 * 
     * @Deprecated
     * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
 * 
     */
    public static CompletableFuture<GetAmiIdsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get a list of AMI IDs matching the specified criteria.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getAmiIds.
     * 
     *
         * A collection of values returned by getAmiIds.
     * 
     * @Deprecated
         * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
     * 
     */
    @Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
    public static CompletableFuture<GetAmiIdsResult> invokeAsync(GetAmiIdsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAmiIds:getAmiIds", TypeShape.of(GetAmiIdsResult.class), args == null ? GetAmiIdsArgs.Empty : args, Utilities.withVersion(options));
    }
}