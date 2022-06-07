// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mixedreality;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mixedreality.inputs.GetSpatialAnchorsAccountArgs;
import com.pulumi.azure.mixedreality.inputs.GetSpatialAnchorsAccountPlainArgs;
import com.pulumi.azure.mixedreality.outputs.GetSpatialAnchorsAccountResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MixedrealityFunctions {
    /**
     * Get information about an Azure Spatial Anchors Account.
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
     *         final var example = Output.of(MixedrealityFunctions.getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         ctx.export(&#34;accountDomain&#34;, data.getAzurerm_spatial_anchors_account().getAccount_domain());
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs args) {
        return getSpatialAnchorsAccount(args, InvokeOptions.Empty);
    }
    /**
     * Get information about an Azure Spatial Anchors Account.
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
     *         final var example = Output.of(MixedrealityFunctions.getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         ctx.export(&#34;accountDomain&#34;, data.getAzurerm_spatial_anchors_account().getAccount_domain());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccountPlain(GetSpatialAnchorsAccountPlainArgs args) {
        return getSpatialAnchorsAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get information about an Azure Spatial Anchors Account.
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
     *         final var example = Output.of(MixedrealityFunctions.getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         ctx.export(&#34;accountDomain&#34;, data.getAzurerm_spatial_anchors_account().getAccount_domain());
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:mixedreality/getSpatialAnchorsAccount:getSpatialAnchorsAccount", TypeShape.of(GetSpatialAnchorsAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information about an Azure Spatial Anchors Account.
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
     *         final var example = Output.of(MixedrealityFunctions.getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         ctx.export(&#34;accountDomain&#34;, data.getAzurerm_spatial_anchors_account().getAccount_domain());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccountPlain(GetSpatialAnchorsAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:mixedreality/getSpatialAnchorsAccount:getSpatialAnchorsAccount", TypeShape.of(GetSpatialAnchorsAccountResult.class), args, Utilities.withVersion(options));
    }
}
