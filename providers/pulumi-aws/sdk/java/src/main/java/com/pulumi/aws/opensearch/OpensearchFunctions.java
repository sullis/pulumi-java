// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.inputs.GetDomainArgs;
import com.pulumi.aws.opensearch.inputs.GetDomainPlainArgs;
import com.pulumi.aws.opensearch.outputs.GetDomainResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OpensearchFunctions {
    /**
     * Use this data source to get information about an OpenSearch Domain
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
     *         final var myDomain = Output.of(OpensearchFunctions.getDomain(GetDomainArgs.builder()
     *             .domainName(&#34;my-domain-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about an OpenSearch Domain
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
     *         final var myDomain = Output.of(OpensearchFunctions.getDomain(GetDomainArgs.builder()
     *             .domainName(&#34;my-domain-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args) {
        return getDomainPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about an OpenSearch Domain
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
     *         final var myDomain = Output.of(OpensearchFunctions.getDomain(GetDomainArgs.builder()
     *             .domainName(&#34;my-domain-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:opensearch/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about an OpenSearch Domain
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
     *         final var myDomain = Output.of(OpensearchFunctions.getDomain(GetDomainArgs.builder()
     *             .domainName(&#34;my-domain-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:opensearch/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
}
