// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.logicapps.inputs.GetIntegrationAccountArgs;
import com.pulumi.azure.logicapps.inputs.GetStandardArgs;
import com.pulumi.azure.logicapps.inputs.GetWorkflowArgs;
import com.pulumi.azure.logicapps.outputs.GetIntegrationAccountResult;
import com.pulumi.azure.logicapps.outputs.GetStandardResult;
import com.pulumi.azure.logicapps.outputs.GetWorkflowResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LogicappsFunctions {
    /**
     * Use this data source to access information about an existing Logic App Integration Account.
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
     *         final var example = Output.of(LogicappsFunctions.getIntegrationAccount(GetIntegrationAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getIntegrationAccountResult -&gt; getIntegrationAccountResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIntegrationAccountResult> getIntegrationAccount(GetIntegrationAccountArgs args) {
        return getIntegrationAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIntegrationAccountResult> getIntegrationAccount(GetIntegrationAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:logicapps/getIntegrationAccount:getIntegrationAccount", TypeShape.of(GetIntegrationAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Logic App Standard instance.
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
     *         final var example = Output.of(LogicappsFunctions.getStandard(GetStandardArgs.builder()
     *             .name(&#34;logicappstd&#34;)
     *             .resourceGroupName(&#34;example-rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getStandardResult -&gt; getStandardResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStandardResult> getStandard(GetStandardArgs args) {
        return getStandard(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStandardResult> getStandard(GetStandardArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:logicapps/getStandard:getStandard", TypeShape.of(GetStandardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Logic App Workflow.
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
     *         final var example = Output.of(LogicappsFunctions.getWorkflow(GetWorkflowArgs.builder()
     *             .name(&#34;workflow1&#34;)
     *             .resourceGroupName(&#34;my-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;accessEndpoint&#34;, example.apply(getWorkflowResult -&gt; getWorkflowResult.getAccessEndpoint()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkflowResult> getWorkflow(GetWorkflowArgs args) {
        return getWorkflow(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkflowResult> getWorkflow(GetWorkflowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:logicapps/getWorkflow:getWorkflow", TypeShape.of(GetWorkflowResult.class), args, Utilities.withVersion(options));
    }
}
