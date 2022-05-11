// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.netapp.inputs.GetAccountArgs;
import com.pulumi.azure.netapp.inputs.GetPoolArgs;
import com.pulumi.azure.netapp.inputs.GetSnapshotArgs;
import com.pulumi.azure.netapp.inputs.GetSnapshotPolicyArgs;
import com.pulumi.azure.netapp.inputs.GetVolumeArgs;
import com.pulumi.azure.netapp.outputs.GetAccountResult;
import com.pulumi.azure.netapp.outputs.GetPoolResult;
import com.pulumi.azure.netapp.outputs.GetSnapshotPolicyResult;
import com.pulumi.azure.netapp.outputs.GetSnapshotResult;
import com.pulumi.azure.netapp.outputs.GetVolumeResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class NetappFunctions {
    /**
     * Uses this data source to access information about an existing NetApp Account.
     * 
     * ## NetApp Account Usage
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
     *         final var example = Output.of(NetappFunctions.getAccount(GetAccountArgs.builder()
     *             .resourceGroupName(&#34;acctestRG&#34;)
     *             .name(&#34;acctestnetappaccount&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;netappAccountId&#34;, example.apply(getAccountResult -&gt; getAccountResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:netapp/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Uses this data source to access information about an existing NetApp Pool.
     * 
     * ## NetApp Pool Usage
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
     *         final var example = Output.of(NetappFunctions.getPool(GetPoolArgs.builder()
     *             .resourceGroupName(&#34;acctestRG&#34;)
     *             .accountName(&#34;acctestnetappaccount&#34;)
     *             .name(&#34;acctestnetapppool&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;netappPoolId&#34;, example.apply(getPoolResult -&gt; getPoolResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPoolResult> getPool(GetPoolArgs args) {
        return getPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPoolResult> getPool(GetPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:netapp/getPool:getPool", TypeShape.of(GetPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Uses this data source to access information about an existing NetApp Snapshot.
     * 
     * ## NetApp Snapshot Usage
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
     *         final var test = Output.of(NetappFunctions.getSnapshot(GetSnapshotArgs.builder()
     *             .resourceGroupName(&#34;acctestRG&#34;)
     *             .name(&#34;acctestnetappsnapshot&#34;)
     *             .accountName(&#34;acctestnetappaccount&#34;)
     *             .poolName(&#34;acctestnetapppool&#34;)
     *             .volumeName(&#34;acctestnetappvolume&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;netappSnapshotId&#34;, data.getAzurerm_netapp_snapshot().getExample().getId());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshot(GetSnapshotArgs args) {
        return getSnapshot(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSnapshotResult> getSnapshot(GetSnapshotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:netapp/getSnapshot:getSnapshot", TypeShape.of(GetSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Uses this data source to access information about an existing NetApp Snapshot Policy.
     * 
     * ## NetApp Snapshot Policy Usage
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
     *         final var example = Output.of(NetappFunctions.getSnapshotPolicy(GetSnapshotPolicyArgs.builder()
     *             .resourceGroupName(&#34;acctestRG&#34;)
     *             .accountName(&#34;acctestnetappaccount&#34;)
     *             .name(&#34;example-snapshot-policy&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getSnapshotPolicyResult -&gt; getSnapshotPolicyResult.getId()));
     *         ctx.export(&#34;name&#34;, example.apply(getSnapshotPolicyResult -&gt; getSnapshotPolicyResult.getName()));
     *         ctx.export(&#34;enabled&#34;, example.apply(getSnapshotPolicyResult -&gt; getSnapshotPolicyResult.getEnabled()));
     *         ctx.export(&#34;hourlySchedule&#34;, example.apply(getSnapshotPolicyResult -&gt; getSnapshotPolicyResult.getHourlySchedules()));
     *         ctx.export(&#34;dailySchedule&#34;, example.apply(getSnapshotPolicyResult -&gt; getSnapshotPolicyResult.getDailySchedules()));
     *         ctx.export(&#34;weeklySchedule&#34;, example.apply(getSnapshotPolicyResult -&gt; getSnapshotPolicyResult.getWeeklySchedules()));
     *         ctx.export(&#34;monthlySchedule&#34;, example.apply(getSnapshotPolicyResult -&gt; getSnapshotPolicyResult.getMonthlySchedules()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSnapshotPolicyResult> getSnapshotPolicy(GetSnapshotPolicyArgs args) {
        return getSnapshotPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSnapshotPolicyResult> getSnapshotPolicy(GetSnapshotPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:netapp/getSnapshotPolicy:getSnapshotPolicy", TypeShape.of(GetSnapshotPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Uses this data source to access information about an existing NetApp Volume.
     * 
     * ## NetApp Volume Usage
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
     *         final var example = Output.of(NetappFunctions.getVolume(GetVolumeArgs.builder()
     *             .resourceGroupName(&#34;acctestRG&#34;)
     *             .accountName(&#34;acctestnetappaccount&#34;)
     *             .poolName(&#34;acctestnetapppool&#34;)
     *             .name(&#34;example-volume&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;netappVolumeId&#34;, example.apply(getVolumeResult -&gt; getVolumeResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVolumeResult> getVolume(GetVolumeArgs args) {
        return getVolume(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVolumeResult> getVolume(GetVolumeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:netapp/getVolume:getVolume", TypeShape.of(GetVolumeResult.class), args, Utilities.withVersion(options));
    }
}
