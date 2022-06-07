// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeguruprofiler;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.codeguruprofiler.inputs.GetProfilingGroupArgs;
import com.pulumi.awsnative.codeguruprofiler.inputs.GetProfilingGroupPlainArgs;
import com.pulumi.awsnative.codeguruprofiler.outputs.GetProfilingGroupResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CodeguruprofilerFunctions {
    /**
     * This resource schema represents the Profiling Group resource in the Amazon CodeGuru Profiler service.
     * 
     */
    public static Output<GetProfilingGroupResult> getProfilingGroup(GetProfilingGroupArgs args) {
        return getProfilingGroup(args, InvokeOptions.Empty);
    }
    /**
     * This resource schema represents the Profiling Group resource in the Amazon CodeGuru Profiler service.
     * 
     */
    public static CompletableFuture<GetProfilingGroupResult> getProfilingGroupPlain(GetProfilingGroupPlainArgs args) {
        return getProfilingGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * This resource schema represents the Profiling Group resource in the Amazon CodeGuru Profiler service.
     * 
     */
    public static Output<GetProfilingGroupResult> getProfilingGroup(GetProfilingGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:codeguruprofiler:getProfilingGroup", TypeShape.of(GetProfilingGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This resource schema represents the Profiling Group resource in the Amazon CodeGuru Profiler service.
     * 
     */
    public static CompletableFuture<GetProfilingGroupResult> getProfilingGroupPlain(GetProfilingGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:codeguruprofiler:getProfilingGroup", TypeShape.of(GetProfilingGroupResult.class), args, Utilities.withVersion(options));
    }
}
