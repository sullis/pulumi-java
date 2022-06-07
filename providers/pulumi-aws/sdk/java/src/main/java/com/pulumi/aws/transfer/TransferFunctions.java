// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.transfer.inputs.GetServerArgs;
import com.pulumi.aws.transfer.inputs.GetServerPlainArgs;
import com.pulumi.aws.transfer.outputs.GetServerResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class TransferFunctions {
    /**
     * Use this data source to get the ARN of an AWS Transfer Server for use in other
     * resources.
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
     *         final var example = Output.of(TransferFunctions.getServer(GetServerArgs.builder()
     *             .serverId(&#34;s-1234567&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args) {
        return getServer(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the ARN of an AWS Transfer Server for use in other
     * resources.
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
     *         final var example = Output.of(TransferFunctions.getServer(GetServerArgs.builder()
     *             .serverId(&#34;s-1234567&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args) {
        return getServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the ARN of an AWS Transfer Server for use in other
     * resources.
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
     *         final var example = Output.of(TransferFunctions.getServer(GetServerArgs.builder()
     *             .serverId(&#34;s-1234567&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:transfer/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the ARN of an AWS Transfer Server for use in other
     * resources.
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
     *         final var example = Output.of(TransferFunctions.getServer(GetServerArgs.builder()
     *             .serverId(&#34;s-1234567&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:transfer/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
}
