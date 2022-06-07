// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.grafana;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.grafana.inputs.GetWorkspaceArgs;
import com.pulumi.aws.grafana.inputs.GetWorkspacePlainArgs;
import com.pulumi.aws.grafana.outputs.GetWorkspaceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class GrafanaFunctions {
    /**
     * Provides an Amazon Managed Grafana workspace data source.
     * 
     * ## Example Usage
     * ### Basic configuration
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
     *         final var example = Output.of(GrafanaFunctions.getWorkspace(GetWorkspaceArgs.builder()
     *             .workspaceId(&#34;g-2054c75a02&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    /**
     * Provides an Amazon Managed Grafana workspace data source.
     * 
     * ## Example Usage
     * ### Basic configuration
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
     *         final var example = Output.of(GrafanaFunctions.getWorkspace(GetWorkspaceArgs.builder()
     *             .workspaceId(&#34;g-2054c75a02&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspacePlain(GetWorkspacePlainArgs args) {
        return getWorkspacePlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides an Amazon Managed Grafana workspace data source.
     * 
     * ## Example Usage
     * ### Basic configuration
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
     *         final var example = Output.of(GrafanaFunctions.getWorkspace(GetWorkspaceArgs.builder()
     *             .workspaceId(&#34;g-2054c75a02&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:grafana/getWorkspace:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides an Amazon Managed Grafana workspace data source.
     * 
     * ## Example Usage
     * ### Basic configuration
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
     *         final var example = Output.of(GrafanaFunctions.getWorkspace(GetWorkspaceArgs.builder()
     *             .workspaceId(&#34;g-2054c75a02&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspacePlain(GetWorkspacePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:grafana/getWorkspace:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
}
