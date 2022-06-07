// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.streamanalytics.inputs.GetClusterArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetClusterPlainArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetFunctionArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetFunctionPlainArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetInputArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetInputPlainArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetOutputArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetOutputPlainArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetPrivateEndpointArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetPrivateEndpointPlainArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetStreamingJobArgs;
import com.pulumi.azurenative.streamanalytics.inputs.GetStreamingJobPlainArgs;
import com.pulumi.azurenative.streamanalytics.inputs.ListClusterStreamingJobsArgs;
import com.pulumi.azurenative.streamanalytics.inputs.ListClusterStreamingJobsPlainArgs;
import com.pulumi.azurenative.streamanalytics.outputs.GetClusterResult;
import com.pulumi.azurenative.streamanalytics.outputs.GetFunctionResult;
import com.pulumi.azurenative.streamanalytics.outputs.GetInputResult;
import com.pulumi.azurenative.streamanalytics.outputs.GetOutputResult;
import com.pulumi.azurenative.streamanalytics.outputs.GetPrivateEndpointResult;
import com.pulumi.azurenative.streamanalytics.outputs.GetStreamingJobResult;
import com.pulumi.azurenative.streamanalytics.outputs.ListClusterStreamingJobsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class StreamanalyticsFunctions {
    /**
     * A Stream Analytics Cluster object
     * API Version: 2020-03-01-preview.
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * A Stream Analytics Cluster object
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args) {
        return getClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * A Stream Analytics Cluster object
     * API Version: 2020-03-01-preview.
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:streamanalytics:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Stream Analytics Cluster object
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A function object, containing all information associated with the named function. All functions are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetFunctionResult> getFunction(GetFunctionArgs args) {
        return getFunction(args, InvokeOptions.Empty);
    }
    /**
     * A function object, containing all information associated with the named function. All functions are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunctionPlain(GetFunctionPlainArgs args) {
        return getFunctionPlain(args, InvokeOptions.Empty);
    }
    /**
     * A function object, containing all information associated with the named function. All functions are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetFunctionResult> getFunction(GetFunctionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:streamanalytics:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A function object, containing all information associated with the named function. All functions are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunctionPlain(GetFunctionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetInputResult> getInput(GetInputArgs args) {
        return getInput(args, InvokeOptions.Empty);
    }
    /**
     * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetInputResult> getInputPlain(GetInputPlainArgs args) {
        return getInputPlain(args, InvokeOptions.Empty);
    }
    /**
     * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetInputResult> getInput(GetInputArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:streamanalytics:getInput", TypeShape.of(GetInputResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetInputResult> getInputPlain(GetInputPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getInput", TypeShape.of(GetInputResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetOutputResult> getOutput(GetOutputArgs args) {
        return getOutput(args, InvokeOptions.Empty);
    }
    /**
     * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetOutputResult> getOutputPlain(GetOutputPlainArgs args) {
        return getOutputPlain(args, InvokeOptions.Empty);
    }
    /**
     * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetOutputResult> getOutput(GetOutputArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:streamanalytics:getOutput", TypeShape.of(GetOutputResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetOutputResult> getOutputPlain(GetOutputPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getOutput", TypeShape.of(GetOutputResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Complete information about the private endpoint.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static Output<GetPrivateEndpointResult> getPrivateEndpoint(GetPrivateEndpointArgs args) {
        return getPrivateEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Complete information about the private endpoint.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointResult> getPrivateEndpointPlain(GetPrivateEndpointPlainArgs args) {
        return getPrivateEndpointPlain(args, InvokeOptions.Empty);
    }
    /**
     * Complete information about the private endpoint.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static Output<GetPrivateEndpointResult> getPrivateEndpoint(GetPrivateEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:streamanalytics:getPrivateEndpoint", TypeShape.of(GetPrivateEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Complete information about the private endpoint.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointResult> getPrivateEndpointPlain(GetPrivateEndpointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getPrivateEndpoint", TypeShape.of(GetPrivateEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A streaming job object, containing all information associated with the named streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetStreamingJobResult> getStreamingJob(GetStreamingJobArgs args) {
        return getStreamingJob(args, InvokeOptions.Empty);
    }
    /**
     * A streaming job object, containing all information associated with the named streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetStreamingJobResult> getStreamingJobPlain(GetStreamingJobPlainArgs args) {
        return getStreamingJobPlain(args, InvokeOptions.Empty);
    }
    /**
     * A streaming job object, containing all information associated with the named streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static Output<GetStreamingJobResult> getStreamingJob(GetStreamingJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:streamanalytics:getStreamingJob", TypeShape.of(GetStreamingJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A streaming job object, containing all information associated with the named streaming job.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetStreamingJobResult> getStreamingJobPlain(GetStreamingJobPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getStreamingJob", TypeShape.of(GetStreamingJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A list of streaming jobs. Populated by a List operation.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static Output<ListClusterStreamingJobsResult> listClusterStreamingJobs(ListClusterStreamingJobsArgs args) {
        return listClusterStreamingJobs(args, InvokeOptions.Empty);
    }
    /**
     * A list of streaming jobs. Populated by a List operation.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<ListClusterStreamingJobsResult> listClusterStreamingJobsPlain(ListClusterStreamingJobsPlainArgs args) {
        return listClusterStreamingJobsPlain(args, InvokeOptions.Empty);
    }
    /**
     * A list of streaming jobs. Populated by a List operation.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static Output<ListClusterStreamingJobsResult> listClusterStreamingJobs(ListClusterStreamingJobsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:streamanalytics:listClusterStreamingJobs", TypeShape.of(ListClusterStreamingJobsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A list of streaming jobs. Populated by a List operation.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<ListClusterStreamingJobsResult> listClusterStreamingJobsPlain(ListClusterStreamingJobsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:listClusterStreamingJobs", TypeShape.of(ListClusterStreamingJobsResult.class), args, Utilities.withVersion(options));
    }
}
