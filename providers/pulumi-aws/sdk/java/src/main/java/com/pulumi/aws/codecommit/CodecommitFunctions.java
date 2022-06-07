// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplateArgs;
import com.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplatePlainArgs;
import com.pulumi.aws.codecommit.inputs.GetRepositoryArgs;
import com.pulumi.aws.codecommit.inputs.GetRepositoryPlainArgs;
import com.pulumi.aws.codecommit.outputs.GetApprovalRuleTemplateResult;
import com.pulumi.aws.codecommit.outputs.GetRepositoryResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CodecommitFunctions {
    /**
     * Provides details about a specific CodeCommit Approval Rule Template.
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
     *         final var example = Output.of(CodecommitFunctions.getApprovalRuleTemplate(GetApprovalRuleTemplateArgs.builder()
     *             .name(&#34;MyExampleApprovalRuleTemplate&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetApprovalRuleTemplateResult> getApprovalRuleTemplate(GetApprovalRuleTemplateArgs args) {
        return getApprovalRuleTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a specific CodeCommit Approval Rule Template.
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
     *         final var example = Output.of(CodecommitFunctions.getApprovalRuleTemplate(GetApprovalRuleTemplateArgs.builder()
     *             .name(&#34;MyExampleApprovalRuleTemplate&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApprovalRuleTemplateResult> getApprovalRuleTemplatePlain(GetApprovalRuleTemplatePlainArgs args) {
        return getApprovalRuleTemplatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a specific CodeCommit Approval Rule Template.
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
     *         final var example = Output.of(CodecommitFunctions.getApprovalRuleTemplate(GetApprovalRuleTemplateArgs.builder()
     *             .name(&#34;MyExampleApprovalRuleTemplate&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetApprovalRuleTemplateResult> getApprovalRuleTemplate(GetApprovalRuleTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:codecommit/getApprovalRuleTemplate:getApprovalRuleTemplate", TypeShape.of(GetApprovalRuleTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific CodeCommit Approval Rule Template.
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
     *         final var example = Output.of(CodecommitFunctions.getApprovalRuleTemplate(GetApprovalRuleTemplateArgs.builder()
     *             .name(&#34;MyExampleApprovalRuleTemplate&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApprovalRuleTemplateResult> getApprovalRuleTemplatePlain(GetApprovalRuleTemplatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:codecommit/getApprovalRuleTemplate:getApprovalRuleTemplate", TypeShape.of(GetApprovalRuleTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository.
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
     *         final var test = Output.of(CodecommitFunctions.getRepository(GetRepositoryArgs.builder()
     *             .repositoryName(&#34;MyTestRepository&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args) {
        return getRepository(args, InvokeOptions.Empty);
    }
    /**
     * The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository.
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
     *         final var test = Output.of(CodecommitFunctions.getRepository(GetRepositoryArgs.builder()
     *             .repositoryName(&#34;MyTestRepository&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args) {
        return getRepositoryPlain(args, InvokeOptions.Empty);
    }
    /**
     * The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository.
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
     *         final var test = Output.of(CodecommitFunctions.getRepository(GetRepositoryArgs.builder()
     *             .repositoryName(&#34;MyTestRepository&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:codecommit/getRepository:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository.
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
     *         final var test = Output.of(CodecommitFunctions.getRepository(GetRepositoryArgs.builder()
     *             .repositoryName(&#34;MyTestRepository&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:codecommit/getRepository:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
}
