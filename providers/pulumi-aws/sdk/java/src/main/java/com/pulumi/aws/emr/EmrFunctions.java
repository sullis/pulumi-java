// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
import com.pulumi.aws.emr.inputs.GetReleaseLabelsPlainArgs;
import com.pulumi.aws.emr.outputs.GetReleaseLabelsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EmrFunctions {
    /**
     * Retrieve information about EMR Release Labels.
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
     *         final var example = Output.of(EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFilters.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetReleaseLabelsResult> getReleaseLabels() {
        return getReleaseLabels(GetReleaseLabelsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
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
     *         final var example = Output.of(EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFilters.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> getReleaseLabelsPlain() {
        return getReleaseLabelsPlain(GetReleaseLabelsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
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
     *         final var example = Output.of(EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFilters.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetReleaseLabelsResult> getReleaseLabels(GetReleaseLabelsArgs args) {
        return getReleaseLabels(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
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
     *         final var example = Output.of(EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFilters.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> getReleaseLabelsPlain(GetReleaseLabelsPlainArgs args) {
        return getReleaseLabelsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
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
     *         final var example = Output.of(EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFilters.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetReleaseLabelsResult> getReleaseLabels(GetReleaseLabelsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:emr/getReleaseLabels:getReleaseLabels", TypeShape.of(GetReleaseLabelsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about EMR Release Labels.
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
     *         final var example = Output.of(EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFilters.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> getReleaseLabelsPlain(GetReleaseLabelsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:emr/getReleaseLabels:getReleaseLabels", TypeShape.of(GetReleaseLabelsResult.class), args, Utilities.withVersion(options));
    }
}
