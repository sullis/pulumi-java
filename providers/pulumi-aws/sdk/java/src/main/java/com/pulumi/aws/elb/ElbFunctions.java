// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elb.inputs.GetHostedZoneIdArgs;
import com.pulumi.aws.elb.inputs.GetHostedZoneIdPlainArgs;
import com.pulumi.aws.elb.inputs.GetLoadBalancerArgs;
import com.pulumi.aws.elb.inputs.GetLoadBalancerPlainArgs;
import com.pulumi.aws.elb.inputs.GetServiceAccountArgs;
import com.pulumi.aws.elb.inputs.GetServiceAccountPlainArgs;
import com.pulumi.aws.elb.outputs.GetHostedZoneIdResult;
import com.pulumi.aws.elb.outputs.GetLoadBalancerResult;
import com.pulumi.aws.elb.outputs.GetServiceAccountResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ElbFunctions {
    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     * in a given region for the purpose of using in an AWS Route53 Alias.
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
     *         final var main = Output.of(ElbFunctions.getHostedZoneId());
     * 
     *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
     *             .zoneId(aws_route53_zone.getPrimary().getZone_id())
     *             .name(&#34;example.com&#34;)
     *             .type(&#34;A&#34;)
     *             .aliases(RecordAlias.builder()
     *                 .name(aws_elb.getMain().getDns_name())
     *                 .zoneId(main.apply(getHostedZoneIdResult -&gt; getHostedZoneIdResult.getId()))
     *                 .evaluateTargetHealth(true)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetHostedZoneIdResult> getHostedZoneId() {
        return getHostedZoneId(GetHostedZoneIdArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     * in a given region for the purpose of using in an AWS Route53 Alias.
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
     *         final var main = Output.of(ElbFunctions.getHostedZoneId());
     * 
     *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
     *             .zoneId(aws_route53_zone.getPrimary().getZone_id())
     *             .name(&#34;example.com&#34;)
     *             .type(&#34;A&#34;)
     *             .aliases(RecordAlias.builder()
     *                 .name(aws_elb.getMain().getDns_name())
     *                 .zoneId(main.apply(getHostedZoneIdResult -&gt; getHostedZoneIdResult.getId()))
     *                 .evaluateTargetHealth(true)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetHostedZoneIdResult> getHostedZoneIdPlain() {
        return getHostedZoneIdPlain(GetHostedZoneIdPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     * in a given region for the purpose of using in an AWS Route53 Alias.
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
     *         final var main = Output.of(ElbFunctions.getHostedZoneId());
     * 
     *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
     *             .zoneId(aws_route53_zone.getPrimary().getZone_id())
     *             .name(&#34;example.com&#34;)
     *             .type(&#34;A&#34;)
     *             .aliases(RecordAlias.builder()
     *                 .name(aws_elb.getMain().getDns_name())
     *                 .zoneId(main.apply(getHostedZoneIdResult -&gt; getHostedZoneIdResult.getId()))
     *                 .evaluateTargetHealth(true)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetHostedZoneIdResult> getHostedZoneId(GetHostedZoneIdArgs args) {
        return getHostedZoneId(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     * in a given region for the purpose of using in an AWS Route53 Alias.
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
     *         final var main = Output.of(ElbFunctions.getHostedZoneId());
     * 
     *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
     *             .zoneId(aws_route53_zone.getPrimary().getZone_id())
     *             .name(&#34;example.com&#34;)
     *             .type(&#34;A&#34;)
     *             .aliases(RecordAlias.builder()
     *                 .name(aws_elb.getMain().getDns_name())
     *                 .zoneId(main.apply(getHostedZoneIdResult -&gt; getHostedZoneIdResult.getId()))
     *                 .evaluateTargetHealth(true)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetHostedZoneIdResult> getHostedZoneIdPlain(GetHostedZoneIdPlainArgs args) {
        return getHostedZoneIdPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     * in a given region for the purpose of using in an AWS Route53 Alias.
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
     *         final var main = Output.of(ElbFunctions.getHostedZoneId());
     * 
     *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
     *             .zoneId(aws_route53_zone.getPrimary().getZone_id())
     *             .name(&#34;example.com&#34;)
     *             .type(&#34;A&#34;)
     *             .aliases(RecordAlias.builder()
     *                 .name(aws_elb.getMain().getDns_name())
     *                 .zoneId(main.apply(getHostedZoneIdResult -&gt; getHostedZoneIdResult.getId()))
     *                 .evaluateTargetHealth(true)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetHostedZoneIdResult> getHostedZoneId(GetHostedZoneIdArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:elb/getHostedZoneId:getHostedZoneId", TypeShape.of(GetHostedZoneIdResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     * in a given region for the purpose of using in an AWS Route53 Alias.
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
     *         final var main = Output.of(ElbFunctions.getHostedZoneId());
     * 
     *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
     *             .zoneId(aws_route53_zone.getPrimary().getZone_id())
     *             .name(&#34;example.com&#34;)
     *             .type(&#34;A&#34;)
     *             .aliases(RecordAlias.builder()
     *                 .name(aws_elb.getMain().getDns_name())
     *                 .zoneId(main.apply(getHostedZoneIdResult -&gt; getHostedZoneIdResult.getId()))
     *                 .evaluateTargetHealth(true)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetHostedZoneIdResult> getHostedZoneIdPlain(GetHostedZoneIdPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elb/getHostedZoneId:getHostedZoneId", TypeShape.of(GetHostedZoneIdResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a &#34;classic&#34; Elastic Load Balancer (ELB).
     * See `LB` Data Source if you are looking for &#34;v2&#34;
     * Application Load Balancer (ALB) or Network Load Balancer (NLB).
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
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
     *         final var lbName = config.get(&#34;lbName&#34;).orElse(&#34;&#34;);
     *         final var test = Output.of(ElbFunctions.getLoadBalancer(GetLoadBalancerArgs.builder()
     *             .name(lbName)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetLoadBalancerResult> getLoadBalancer(GetLoadBalancerArgs args) {
        return getLoadBalancer(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a &#34;classic&#34; Elastic Load Balancer (ELB).
     * See `LB` Data Source if you are looking for &#34;v2&#34;
     * Application Load Balancer (ALB) or Network Load Balancer (NLB).
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
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
     *         final var lbName = config.get(&#34;lbName&#34;).orElse(&#34;&#34;);
     *         final var test = Output.of(ElbFunctions.getLoadBalancer(GetLoadBalancerArgs.builder()
     *             .name(lbName)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLoadBalancerResult> getLoadBalancerPlain(GetLoadBalancerPlainArgs args) {
        return getLoadBalancerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a &#34;classic&#34; Elastic Load Balancer (ELB).
     * See `LB` Data Source if you are looking for &#34;v2&#34;
     * Application Load Balancer (ALB) or Network Load Balancer (NLB).
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
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
     *         final var lbName = config.get(&#34;lbName&#34;).orElse(&#34;&#34;);
     *         final var test = Output.of(ElbFunctions.getLoadBalancer(GetLoadBalancerArgs.builder()
     *             .name(lbName)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetLoadBalancerResult> getLoadBalancer(GetLoadBalancerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:elb/getLoadBalancer:getLoadBalancer", TypeShape.of(GetLoadBalancerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a &#34;classic&#34; Elastic Load Balancer (ELB).
     * See `LB` Data Source if you are looking for &#34;v2&#34;
     * Application Load Balancer (ALB) or Network Load Balancer (NLB).
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
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
     *         final var lbName = config.get(&#34;lbName&#34;).orElse(&#34;&#34;);
     *         final var test = Output.of(ElbFunctions.getLoadBalancer(GetLoadBalancerArgs.builder()
     *             .name(lbName)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLoadBalancerResult> getLoadBalancerPlain(GetLoadBalancerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elb/getLoadBalancer:getLoadBalancer", TypeShape.of(GetLoadBalancerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     * in a given region for the purpose of permitting in S3 bucket policy.
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
     *         final var main = Output.of(ElbFunctions.getServiceAccount());
     * 
     *         var elbLogs = new BucketV2(&#34;elbLogs&#34;);
     * 
     *         var elbLogsAcl = new BucketAclV2(&#34;elbLogsAcl&#34;, BucketAclV2Args.builder()        
     *             .bucket(elbLogs.getId())
     *             .acl(&#34;private&#34;)
     *             .build());
     * 
     *         var allowElbLogging = new BucketPolicy(&#34;allowElbLogging&#34;, BucketPolicyArgs.builder()        
     *             .bucket(elbLogs.getId())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Id&#34;: &#34;Policy&#34;,
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Action&#34;: [
     *         &#34;s3:PutObject&#34;
     *       ],
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Resource&#34;: &#34;arn:aws:s3:::my-elb-tf-test-bucket/AWSLogs/*&#34;,
     *       &#34;Principal&#34;: {
     *         &#34;AWS&#34;: [
     *           &#34;%s&#34;
     *         ]
     *       }
     *     }
     *   ]
     * }
     * &#34;, main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn())))
     *             .build());
     * 
     *         var bar = new LoadBalancer(&#34;bar&#34;, LoadBalancerArgs.builder()        
     *             .availabilityZones(&#34;us-west-2a&#34;)
     *             .accessLogs(LoadBalancerAccessLogs.builder()
     *                 .bucket(elbLogs.getBucket())
     *                 .interval(5)
     *                 .build())
     *             .listeners(LoadBalancerListener.builder()
     *                 .instancePort(8000)
     *                 .instanceProtocol(&#34;http&#34;)
     *                 .lbPort(80)
     *                 .lbProtocol(&#34;http&#34;)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetServiceAccountResult> getServiceAccount() {
        return getServiceAccount(GetServiceAccountArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     * in a given region for the purpose of permitting in S3 bucket policy.
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
     *         final var main = Output.of(ElbFunctions.getServiceAccount());
     * 
     *         var elbLogs = new BucketV2(&#34;elbLogs&#34;);
     * 
     *         var elbLogsAcl = new BucketAclV2(&#34;elbLogsAcl&#34;, BucketAclV2Args.builder()        
     *             .bucket(elbLogs.getId())
     *             .acl(&#34;private&#34;)
     *             .build());
     * 
     *         var allowElbLogging = new BucketPolicy(&#34;allowElbLogging&#34;, BucketPolicyArgs.builder()        
     *             .bucket(elbLogs.getId())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Id&#34;: &#34;Policy&#34;,
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Action&#34;: [
     *         &#34;s3:PutObject&#34;
     *       ],
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Resource&#34;: &#34;arn:aws:s3:::my-elb-tf-test-bucket/AWSLogs/*&#34;,
     *       &#34;Principal&#34;: {
     *         &#34;AWS&#34;: [
     *           &#34;%s&#34;
     *         ]
     *       }
     *     }
     *   ]
     * }
     * &#34;, main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn())))
     *             .build());
     * 
     *         var bar = new LoadBalancer(&#34;bar&#34;, LoadBalancerArgs.builder()        
     *             .availabilityZones(&#34;us-west-2a&#34;)
     *             .accessLogs(LoadBalancerAccessLogs.builder()
     *                 .bucket(elbLogs.getBucket())
     *                 .interval(5)
     *                 .build())
     *             .listeners(LoadBalancerListener.builder()
     *                 .instancePort(8000)
     *                 .instanceProtocol(&#34;http&#34;)
     *                 .lbPort(80)
     *                 .lbProtocol(&#34;http&#34;)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> getServiceAccountPlain() {
        return getServiceAccountPlain(GetServiceAccountPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     * in a given region for the purpose of permitting in S3 bucket policy.
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
     *         final var main = Output.of(ElbFunctions.getServiceAccount());
     * 
     *         var elbLogs = new BucketV2(&#34;elbLogs&#34;);
     * 
     *         var elbLogsAcl = new BucketAclV2(&#34;elbLogsAcl&#34;, BucketAclV2Args.builder()        
     *             .bucket(elbLogs.getId())
     *             .acl(&#34;private&#34;)
     *             .build());
     * 
     *         var allowElbLogging = new BucketPolicy(&#34;allowElbLogging&#34;, BucketPolicyArgs.builder()        
     *             .bucket(elbLogs.getId())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Id&#34;: &#34;Policy&#34;,
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Action&#34;: [
     *         &#34;s3:PutObject&#34;
     *       ],
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Resource&#34;: &#34;arn:aws:s3:::my-elb-tf-test-bucket/AWSLogs/*&#34;,
     *       &#34;Principal&#34;: {
     *         &#34;AWS&#34;: [
     *           &#34;%s&#34;
     *         ]
     *       }
     *     }
     *   ]
     * }
     * &#34;, main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn())))
     *             .build());
     * 
     *         var bar = new LoadBalancer(&#34;bar&#34;, LoadBalancerArgs.builder()        
     *             .availabilityZones(&#34;us-west-2a&#34;)
     *             .accessLogs(LoadBalancerAccessLogs.builder()
     *                 .bucket(elbLogs.getBucket())
     *                 .interval(5)
     *                 .build())
     *             .listeners(LoadBalancerListener.builder()
     *                 .instancePort(8000)
     *                 .instanceProtocol(&#34;http&#34;)
     *                 .lbPort(80)
     *                 .lbProtocol(&#34;http&#34;)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args) {
        return getServiceAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     * in a given region for the purpose of permitting in S3 bucket policy.
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
     *         final var main = Output.of(ElbFunctions.getServiceAccount());
     * 
     *         var elbLogs = new BucketV2(&#34;elbLogs&#34;);
     * 
     *         var elbLogsAcl = new BucketAclV2(&#34;elbLogsAcl&#34;, BucketAclV2Args.builder()        
     *             .bucket(elbLogs.getId())
     *             .acl(&#34;private&#34;)
     *             .build());
     * 
     *         var allowElbLogging = new BucketPolicy(&#34;allowElbLogging&#34;, BucketPolicyArgs.builder()        
     *             .bucket(elbLogs.getId())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Id&#34;: &#34;Policy&#34;,
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Action&#34;: [
     *         &#34;s3:PutObject&#34;
     *       ],
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Resource&#34;: &#34;arn:aws:s3:::my-elb-tf-test-bucket/AWSLogs/*&#34;,
     *       &#34;Principal&#34;: {
     *         &#34;AWS&#34;: [
     *           &#34;%s&#34;
     *         ]
     *       }
     *     }
     *   ]
     * }
     * &#34;, main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn())))
     *             .build());
     * 
     *         var bar = new LoadBalancer(&#34;bar&#34;, LoadBalancerArgs.builder()        
     *             .availabilityZones(&#34;us-west-2a&#34;)
     *             .accessLogs(LoadBalancerAccessLogs.builder()
     *                 .bucket(elbLogs.getBucket())
     *                 .interval(5)
     *                 .build())
     *             .listeners(LoadBalancerListener.builder()
     *                 .instancePort(8000)
     *                 .instanceProtocol(&#34;http&#34;)
     *                 .lbPort(80)
     *                 .lbProtocol(&#34;http&#34;)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> getServiceAccountPlain(GetServiceAccountPlainArgs args) {
        return getServiceAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     * in a given region for the purpose of permitting in S3 bucket policy.
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
     *         final var main = Output.of(ElbFunctions.getServiceAccount());
     * 
     *         var elbLogs = new BucketV2(&#34;elbLogs&#34;);
     * 
     *         var elbLogsAcl = new BucketAclV2(&#34;elbLogsAcl&#34;, BucketAclV2Args.builder()        
     *             .bucket(elbLogs.getId())
     *             .acl(&#34;private&#34;)
     *             .build());
     * 
     *         var allowElbLogging = new BucketPolicy(&#34;allowElbLogging&#34;, BucketPolicyArgs.builder()        
     *             .bucket(elbLogs.getId())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Id&#34;: &#34;Policy&#34;,
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Action&#34;: [
     *         &#34;s3:PutObject&#34;
     *       ],
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Resource&#34;: &#34;arn:aws:s3:::my-elb-tf-test-bucket/AWSLogs/*&#34;,
     *       &#34;Principal&#34;: {
     *         &#34;AWS&#34;: [
     *           &#34;%s&#34;
     *         ]
     *       }
     *     }
     *   ]
     * }
     * &#34;, main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn())))
     *             .build());
     * 
     *         var bar = new LoadBalancer(&#34;bar&#34;, LoadBalancerArgs.builder()        
     *             .availabilityZones(&#34;us-west-2a&#34;)
     *             .accessLogs(LoadBalancerAccessLogs.builder()
     *                 .bucket(elbLogs.getBucket())
     *                 .interval(5)
     *                 .build())
     *             .listeners(LoadBalancerListener.builder()
     *                 .instancePort(8000)
     *                 .instanceProtocol(&#34;http&#34;)
     *                 .lbPort(80)
     *                 .lbProtocol(&#34;http&#34;)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:elb/getServiceAccount:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     * in a given region for the purpose of permitting in S3 bucket policy.
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
     *         final var main = Output.of(ElbFunctions.getServiceAccount());
     * 
     *         var elbLogs = new BucketV2(&#34;elbLogs&#34;);
     * 
     *         var elbLogsAcl = new BucketAclV2(&#34;elbLogsAcl&#34;, BucketAclV2Args.builder()        
     *             .bucket(elbLogs.getId())
     *             .acl(&#34;private&#34;)
     *             .build());
     * 
     *         var allowElbLogging = new BucketPolicy(&#34;allowElbLogging&#34;, BucketPolicyArgs.builder()        
     *             .bucket(elbLogs.getId())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Id&#34;: &#34;Policy&#34;,
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Action&#34;: [
     *         &#34;s3:PutObject&#34;
     *       ],
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Resource&#34;: &#34;arn:aws:s3:::my-elb-tf-test-bucket/AWSLogs/*&#34;,
     *       &#34;Principal&#34;: {
     *         &#34;AWS&#34;: [
     *           &#34;%s&#34;
     *         ]
     *       }
     *     }
     *   ]
     * }
     * &#34;, main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn())))
     *             .build());
     * 
     *         var bar = new LoadBalancer(&#34;bar&#34;, LoadBalancerArgs.builder()        
     *             .availabilityZones(&#34;us-west-2a&#34;)
     *             .accessLogs(LoadBalancerAccessLogs.builder()
     *                 .bucket(elbLogs.getBucket())
     *                 .interval(5)
     *                 .build())
     *             .listeners(LoadBalancerListener.builder()
     *                 .instancePort(8000)
     *                 .instanceProtocol(&#34;http&#34;)
     *                 .lbPort(80)
     *                 .lbProtocol(&#34;http&#34;)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> getServiceAccountPlain(GetServiceAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elb/getServiceAccount:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args, Utilities.withVersion(options));
    }
}
