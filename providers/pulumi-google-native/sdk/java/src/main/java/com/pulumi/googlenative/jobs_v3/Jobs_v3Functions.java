// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.jobs_v3.inputs.GetCompanyArgs;
import com.pulumi.googlenative.jobs_v3.inputs.GetCompanyPlainArgs;
import com.pulumi.googlenative.jobs_v3.inputs.GetJobArgs;
import com.pulumi.googlenative.jobs_v3.inputs.GetJobPlainArgs;
import com.pulumi.googlenative.jobs_v3.outputs.GetCompanyResult;
import com.pulumi.googlenative.jobs_v3.outputs.GetJobResult;
import java.util.concurrent.CompletableFuture;

public final class Jobs_v3Functions {
    /**
     * Retrieves specified company.
     * 
     */
    public static Output<GetCompanyResult> getCompany(GetCompanyArgs args) {
        return getCompany(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves specified company.
     * 
     */
    public static CompletableFuture<GetCompanyResult> getCompanyPlain(GetCompanyPlainArgs args) {
        return getCompanyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves specified company.
     * 
     */
    public static Output<GetCompanyResult> getCompany(GetCompanyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:jobs/v3:getCompany", TypeShape.of(GetCompanyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves specified company.
     * 
     */
    public static CompletableFuture<GetCompanyResult> getCompanyPlain(GetCompanyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:jobs/v3:getCompany", TypeShape.of(GetCompanyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
     * 
     */
    public static Output<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
     * 
     */
    public static CompletableFuture<GetJobResult> getJobPlain(GetJobPlainArgs args) {
        return getJobPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
     * 
     */
    public static Output<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:jobs/v3:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified job, whose status is OPEN or recently EXPIRED within the last 90 days.
     * 
     */
    public static CompletableFuture<GetJobResult> getJobPlain(GetJobPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:jobs/v3:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
}
