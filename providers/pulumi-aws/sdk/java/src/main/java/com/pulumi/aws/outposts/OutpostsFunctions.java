// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.outposts.inputs.GetOutpostArgs;
import com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypeArgs;
import com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypePlainArgs;
import com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypesArgs;
import com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypesPlainArgs;
import com.pulumi.aws.outposts.inputs.GetOutpostPlainArgs;
import com.pulumi.aws.outposts.inputs.GetOutpostsArgs;
import com.pulumi.aws.outposts.inputs.GetOutpostsPlainArgs;
import com.pulumi.aws.outposts.inputs.GetSiteArgs;
import com.pulumi.aws.outposts.inputs.GetSitePlainArgs;
import com.pulumi.aws.outposts.outputs.GetOutpostInstanceTypeResult;
import com.pulumi.aws.outposts.outputs.GetOutpostInstanceTypesResult;
import com.pulumi.aws.outposts.outputs.GetOutpostResult;
import com.pulumi.aws.outposts.outputs.GetOutpostsResult;
import com.pulumi.aws.outposts.outputs.GetSiteResult;
import com.pulumi.aws.outposts.outputs.GetSitesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class OutpostsFunctions {
    /**
     * Provides details about an Outposts Outpost.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpost(GetOutpostArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostResult> getOutpost() {
        return getOutpost(GetOutpostArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Outpost.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpost(GetOutpostArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostResult> getOutpostPlain() {
        return getOutpostPlain(GetOutpostPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Outpost.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpost(GetOutpostArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostResult> getOutpost(GetOutpostArgs args) {
        return getOutpost(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Outpost.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpost(GetOutpostArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostResult> getOutpostPlain(GetOutpostPlainArgs args) {
        return getOutpostPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Outpost.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpost(GetOutpostArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostResult> getOutpost(GetOutpostArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:outposts/getOutpost:getOutpost", TypeShape.of(GetOutpostResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about an Outposts Outpost.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpost(GetOutpostArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostResult> getOutpostPlain(GetOutpostPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getOutpost:getOutpost", TypeShape.of(GetOutpostResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about single Outpost Instance Type.
     * 
     */
    public static Output<GetOutpostInstanceTypeResult> getOutpostInstanceType(GetOutpostInstanceTypeArgs args) {
        return getOutpostInstanceType(args, InvokeOptions.Empty);
    }
    /**
     * Information about single Outpost Instance Type.
     * 
     */
    public static CompletableFuture<GetOutpostInstanceTypeResult> getOutpostInstanceTypePlain(GetOutpostInstanceTypePlainArgs args) {
        return getOutpostInstanceTypePlain(args, InvokeOptions.Empty);
    }
    /**
     * Information about single Outpost Instance Type.
     * 
     */
    public static Output<GetOutpostInstanceTypeResult> getOutpostInstanceType(GetOutpostInstanceTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:outposts/getOutpostInstanceType:getOutpostInstanceType", TypeShape.of(GetOutpostInstanceTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about single Outpost Instance Type.
     * 
     */
    public static CompletableFuture<GetOutpostInstanceTypeResult> getOutpostInstanceTypePlain(GetOutpostInstanceTypePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getOutpostInstanceType:getOutpostInstanceType", TypeShape.of(GetOutpostInstanceTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about Outposts Instance Types.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpostInstanceTypes(GetOutpostInstanceTypesArgs.builder()
     *             .arn(data.getAws_outposts_outpost().getExample().getArn())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostInstanceTypesResult> getOutpostInstanceTypes(GetOutpostInstanceTypesArgs args) {
        return getOutpostInstanceTypes(args, InvokeOptions.Empty);
    }
    /**
     * Information about Outposts Instance Types.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpostInstanceTypes(GetOutpostInstanceTypesArgs.builder()
     *             .arn(data.getAws_outposts_outpost().getExample().getArn())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostInstanceTypesResult> getOutpostInstanceTypesPlain(GetOutpostInstanceTypesPlainArgs args) {
        return getOutpostInstanceTypesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Information about Outposts Instance Types.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpostInstanceTypes(GetOutpostInstanceTypesArgs.builder()
     *             .arn(data.getAws_outposts_outpost().getExample().getArn())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostInstanceTypesResult> getOutpostInstanceTypes(GetOutpostInstanceTypesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:outposts/getOutpostInstanceTypes:getOutpostInstanceTypes", TypeShape.of(GetOutpostInstanceTypesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about Outposts Instance Types.
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
     *         final var example = Output.of(OutpostsFunctions.getOutpostInstanceTypes(GetOutpostInstanceTypesArgs.builder()
     *             .arn(data.getAws_outposts_outpost().getExample().getArn())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostInstanceTypesResult> getOutpostInstanceTypesPlain(GetOutpostInstanceTypesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getOutpostInstanceTypes:getOutpostInstanceTypes", TypeShape.of(GetOutpostInstanceTypesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about multiple Outposts.
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
     *         final var example = Output.of(OutpostsFunctions.getOutposts(GetOutpostsArgs.builder()
     *             .siteId(data.getAws_outposts_site().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostsResult> getOutposts() {
        return getOutposts(GetOutpostsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts.
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
     *         final var example = Output.of(OutpostsFunctions.getOutposts(GetOutpostsArgs.builder()
     *             .siteId(data.getAws_outposts_site().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostsResult> getOutpostsPlain() {
        return getOutpostsPlain(GetOutpostsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts.
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
     *         final var example = Output.of(OutpostsFunctions.getOutposts(GetOutpostsArgs.builder()
     *             .siteId(data.getAws_outposts_site().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostsResult> getOutposts(GetOutpostsArgs args) {
        return getOutposts(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts.
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
     *         final var example = Output.of(OutpostsFunctions.getOutposts(GetOutpostsArgs.builder()
     *             .siteId(data.getAws_outposts_site().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostsResult> getOutpostsPlain(GetOutpostsPlainArgs args) {
        return getOutpostsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts.
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
     *         final var example = Output.of(OutpostsFunctions.getOutposts(GetOutpostsArgs.builder()
     *             .siteId(data.getAws_outposts_site().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetOutpostsResult> getOutposts(GetOutpostsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:outposts/getOutposts:getOutposts", TypeShape.of(GetOutpostsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about multiple Outposts.
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
     *         final var example = Output.of(OutpostsFunctions.getOutposts(GetOutpostsArgs.builder()
     *             .siteId(data.getAws_outposts_site().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOutpostsResult> getOutpostsPlain(GetOutpostsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getOutposts:getOutposts", TypeShape.of(GetOutpostsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about an Outposts Site.
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
     *         final var example = Output.of(OutpostsFunctions.getSite(GetSiteArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSiteResult> getSite() {
        return getSite(GetSiteArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Site.
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
     *         final var example = Output.of(OutpostsFunctions.getSite(GetSiteArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSiteResult> getSitePlain() {
        return getSitePlain(GetSitePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Site.
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
     *         final var example = Output.of(OutpostsFunctions.getSite(GetSiteArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSiteResult> getSite(GetSiteArgs args) {
        return getSite(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Site.
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
     *         final var example = Output.of(OutpostsFunctions.getSite(GetSiteArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSiteResult> getSitePlain(GetSitePlainArgs args) {
        return getSitePlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about an Outposts Site.
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
     *         final var example = Output.of(OutpostsFunctions.getSite(GetSiteArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSiteResult> getSite(GetSiteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:outposts/getSite:getSite", TypeShape.of(GetSiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about an Outposts Site.
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
     *         final var example = Output.of(OutpostsFunctions.getSite(GetSiteArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSiteResult> getSitePlain(GetSitePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getSite:getSite", TypeShape.of(GetSiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about multiple Outposts Sites.
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
     *         final var all = Output.of(OutpostsFunctions.getSites());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSitesResult> getSites() {
        return getSites(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts Sites.
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
     *         final var all = Output.of(OutpostsFunctions.getSites());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSitesResult> getSitesPlain() {
        return getSitesPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts Sites.
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
     *         final var all = Output.of(OutpostsFunctions.getSites());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSitesResult> getSites(InvokeArgs args) {
        return getSites(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts Sites.
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
     *         final var all = Output.of(OutpostsFunctions.getSites());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSitesResult> getSitesPlain(InvokeArgs args) {
        return getSitesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about multiple Outposts Sites.
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
     *         final var all = Output.of(OutpostsFunctions.getSites());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetSitesResult> getSites(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:outposts/getSites:getSites", TypeShape.of(GetSitesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about multiple Outposts Sites.
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
     *         final var all = Output.of(OutpostsFunctions.getSites());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSitesResult> getSitesPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:outposts/getSites:getSites", TypeShape.of(GetSitesResult.class), args, Utilities.withVersion(options));
    }
}
