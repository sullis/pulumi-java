// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.advisor;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.advisor.inputs.GetRecommendationsArgs;
import com.pulumi.azure.advisor.outputs.GetRecommendationsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AdvisorFunctions {
    /**
     * Use this data source to access information about an existing Advisor Recommendations.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(AdvisorFunctions.getRecommendations(GetRecommendationsArgs.builder()
     *             .filterByCategories(            
     *                 &#34;security&#34;,
     *                 &#34;cost&#34;)
     *             .filterByResourceGroups(&#34;example-resgroups&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;recommendations&#34;, example.apply(getRecommendationsResult -&gt; getRecommendationsResult.getRecommendations()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRecommendationsResult> getRecommendations() {
        return getRecommendations(GetRecommendationsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRecommendationsResult> getRecommendations(GetRecommendationsArgs args) {
        return getRecommendations(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRecommendationsResult> getRecommendations(GetRecommendationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:advisor/getRecommendations:getRecommendations", TypeShape.of(GetRecommendationsResult.class), args, Utilities.withVersion(options));
    }
}
