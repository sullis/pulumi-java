// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.efs.inputs.GetAccessPointArgs;
import com.pulumi.aws.efs.inputs.GetAccessPointPlainArgs;
import com.pulumi.aws.efs.inputs.GetAccessPointsArgs;
import com.pulumi.aws.efs.inputs.GetAccessPointsPlainArgs;
import com.pulumi.aws.efs.inputs.GetFileSystemArgs;
import com.pulumi.aws.efs.inputs.GetFileSystemPlainArgs;
import com.pulumi.aws.efs.inputs.GetMountTargetArgs;
import com.pulumi.aws.efs.inputs.GetMountTargetPlainArgs;
import com.pulumi.aws.efs.outputs.GetAccessPointResult;
import com.pulumi.aws.efs.outputs.GetAccessPointsResult;
import com.pulumi.aws.efs.outputs.GetFileSystemResult;
import com.pulumi.aws.efs.outputs.GetMountTargetResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EfsFunctions {
    /**
     * Provides information about an Elastic File System (EFS) Access Point.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoint(GetAccessPointArgs.builder()
     *             .accessPointId(&#34;fsap-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetAccessPointResult> getAccessPoint(GetAccessPointArgs args) {
        return getAccessPoint(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System (EFS) Access Point.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoint(GetAccessPointArgs.builder()
     *             .accessPointId(&#34;fsap-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccessPointResult> getAccessPointPlain(GetAccessPointPlainArgs args) {
        return getAccessPointPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System (EFS) Access Point.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoint(GetAccessPointArgs.builder()
     *             .accessPointId(&#34;fsap-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetAccessPointResult> getAccessPoint(GetAccessPointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:efs/getAccessPoint:getAccessPoint", TypeShape.of(GetAccessPointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about an Elastic File System (EFS) Access Point.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoint(GetAccessPointArgs.builder()
     *             .accessPointId(&#34;fsap-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccessPointResult> getAccessPointPlain(GetAccessPointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getAccessPoint:getAccessPoint", TypeShape.of(GetAccessPointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about multiple Elastic File System (EFS) Access Points.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoints(GetAccessPointsArgs.builder()
     *             .fileSystemId(&#34;fs-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetAccessPointsResult> getAccessPoints(GetAccessPointsArgs args) {
        return getAccessPoints(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about multiple Elastic File System (EFS) Access Points.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoints(GetAccessPointsArgs.builder()
     *             .fileSystemId(&#34;fs-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccessPointsResult> getAccessPointsPlain(GetAccessPointsPlainArgs args) {
        return getAccessPointsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about multiple Elastic File System (EFS) Access Points.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoints(GetAccessPointsArgs.builder()
     *             .fileSystemId(&#34;fs-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetAccessPointsResult> getAccessPoints(GetAccessPointsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:efs/getAccessPoints:getAccessPoints", TypeShape.of(GetAccessPointsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about multiple Elastic File System (EFS) Access Points.
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
     *         final var test = Output.of(EfsFunctions.getAccessPoints(GetAccessPointsArgs.builder()
     *             .fileSystemId(&#34;fs-12345678&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccessPointsResult> getAccessPointsPlain(GetAccessPointsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getAccessPoints:getAccessPoints", TypeShape.of(GetAccessPointsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about an Elastic File System (EFS) File System.
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
     *         final var config = Config.of();
     *         final var fileSystemId = config.get(&#34;fileSystemId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .fileSystemId(fileSystemId)
     *             .build()));
     * 
     *         final var byTag = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .tags(Map.of(&#34;Environment&#34;, &#34;dev&#34;))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetFileSystemResult> getFileSystem() {
        return getFileSystem(GetFileSystemArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System (EFS) File System.
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
     *         final var config = Config.of();
     *         final var fileSystemId = config.get(&#34;fileSystemId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .fileSystemId(fileSystemId)
     *             .build()));
     * 
     *         final var byTag = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .tags(Map.of(&#34;Environment&#34;, &#34;dev&#34;))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFileSystemResult> getFileSystemPlain() {
        return getFileSystemPlain(GetFileSystemPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System (EFS) File System.
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
     *         final var config = Config.of();
     *         final var fileSystemId = config.get(&#34;fileSystemId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .fileSystemId(fileSystemId)
     *             .build()));
     * 
     *         final var byTag = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .tags(Map.of(&#34;Environment&#34;, &#34;dev&#34;))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetFileSystemResult> getFileSystem(GetFileSystemArgs args) {
        return getFileSystem(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System (EFS) File System.
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
     *         final var config = Config.of();
     *         final var fileSystemId = config.get(&#34;fileSystemId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .fileSystemId(fileSystemId)
     *             .build()));
     * 
     *         final var byTag = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .tags(Map.of(&#34;Environment&#34;, &#34;dev&#34;))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFileSystemResult> getFileSystemPlain(GetFileSystemPlainArgs args) {
        return getFileSystemPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System (EFS) File System.
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
     *         final var config = Config.of();
     *         final var fileSystemId = config.get(&#34;fileSystemId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .fileSystemId(fileSystemId)
     *             .build()));
     * 
     *         final var byTag = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .tags(Map.of(&#34;Environment&#34;, &#34;dev&#34;))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetFileSystemResult> getFileSystem(GetFileSystemArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:efs/getFileSystem:getFileSystem", TypeShape.of(GetFileSystemResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about an Elastic File System (EFS) File System.
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
     *         final var config = Config.of();
     *         final var fileSystemId = config.get(&#34;fileSystemId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .fileSystemId(fileSystemId)
     *             .build()));
     * 
     *         final var byTag = Output.of(EfsFunctions.getFileSystem(GetFileSystemArgs.builder()
     *             .tags(Map.of(&#34;Environment&#34;, &#34;dev&#34;))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFileSystemResult> getFileSystemPlain(GetFileSystemPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getFileSystem:getFileSystem", TypeShape.of(GetFileSystemResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about an Elastic File System Mount Target (EFS).
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
     *         final var config = Config.of();
     *         final var mountTargetId = config.get(&#34;mountTargetId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getMountTarget(GetMountTargetArgs.builder()
     *             .mountTargetId(mountTargetId)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetMountTargetResult> getMountTarget() {
        return getMountTarget(GetMountTargetArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System Mount Target (EFS).
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
     *         final var config = Config.of();
     *         final var mountTargetId = config.get(&#34;mountTargetId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getMountTarget(GetMountTargetArgs.builder()
     *             .mountTargetId(mountTargetId)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMountTargetResult> getMountTargetPlain() {
        return getMountTargetPlain(GetMountTargetPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System Mount Target (EFS).
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
     *         final var config = Config.of();
     *         final var mountTargetId = config.get(&#34;mountTargetId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getMountTarget(GetMountTargetArgs.builder()
     *             .mountTargetId(mountTargetId)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetMountTargetResult> getMountTarget(GetMountTargetArgs args) {
        return getMountTarget(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System Mount Target (EFS).
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
     *         final var config = Config.of();
     *         final var mountTargetId = config.get(&#34;mountTargetId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getMountTarget(GetMountTargetArgs.builder()
     *             .mountTargetId(mountTargetId)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMountTargetResult> getMountTargetPlain(GetMountTargetPlainArgs args) {
        return getMountTargetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about an Elastic File System Mount Target (EFS).
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
     *         final var config = Config.of();
     *         final var mountTargetId = config.get(&#34;mountTargetId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getMountTarget(GetMountTargetArgs.builder()
     *             .mountTargetId(mountTargetId)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetMountTargetResult> getMountTarget(GetMountTargetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:efs/getMountTarget:getMountTarget", TypeShape.of(GetMountTargetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about an Elastic File System Mount Target (EFS).
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
     *         final var config = Config.of();
     *         final var mountTargetId = config.get(&#34;mountTargetId&#34;).orElse(&#34;&#34;);
     *         final var byId = Output.of(EfsFunctions.getMountTarget(GetMountTargetArgs.builder()
     *             .mountTargetId(mountTargetId)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMountTargetResult> getMountTargetPlain(GetMountTargetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getMountTarget:getMountTarget", TypeShape.of(GetMountTargetResult.class), args, Utilities.withVersion(options));
    }
}
