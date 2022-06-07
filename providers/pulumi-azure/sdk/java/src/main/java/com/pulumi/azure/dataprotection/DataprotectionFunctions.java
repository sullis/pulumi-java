// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.dataprotection.inputs.GetBackupVaultArgs;
import com.pulumi.azure.dataprotection.inputs.GetBackupVaultPlainArgs;
import com.pulumi.azure.dataprotection.outputs.GetBackupVaultResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DataprotectionFunctions {
    /**
     * Use this data source to access information about an existing Backup Vault.
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
     *         final var example = Output.of(DataprotectionFunctions.getBackupVault(GetBackupVaultArgs.builder()
     *             .name(&#34;existing-backup-vault&#34;)
     *             .resourceGroupName(&#34;existing-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;azurermDataProtectionBackupVaultId&#34;, data.getAzurerm_vpn_gateway().getExample().getId());
     *         ctx.export(&#34;azurermDataProtectionBackupVaultPrincipalId&#34;, example.apply(getBackupVaultResult -&gt; getBackupVaultResult.getIdentities()[0].getPrincipalId()));
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetBackupVaultResult> getBackupVault(GetBackupVaultArgs args) {
        return getBackupVault(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Backup Vault.
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
     *         final var example = Output.of(DataprotectionFunctions.getBackupVault(GetBackupVaultArgs.builder()
     *             .name(&#34;existing-backup-vault&#34;)
     *             .resourceGroupName(&#34;existing-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;azurermDataProtectionBackupVaultId&#34;, data.getAzurerm_vpn_gateway().getExample().getId());
     *         ctx.export(&#34;azurermDataProtectionBackupVaultPrincipalId&#34;, example.apply(getBackupVaultResult -&gt; getBackupVaultResult.getIdentities()[0].getPrincipalId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBackupVaultResult> getBackupVaultPlain(GetBackupVaultPlainArgs args) {
        return getBackupVaultPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Backup Vault.
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
     *         final var example = Output.of(DataprotectionFunctions.getBackupVault(GetBackupVaultArgs.builder()
     *             .name(&#34;existing-backup-vault&#34;)
     *             .resourceGroupName(&#34;existing-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;azurermDataProtectionBackupVaultId&#34;, data.getAzurerm_vpn_gateway().getExample().getId());
     *         ctx.export(&#34;azurermDataProtectionBackupVaultPrincipalId&#34;, example.apply(getBackupVaultResult -&gt; getBackupVaultResult.getIdentities()[0].getPrincipalId()));
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetBackupVaultResult> getBackupVault(GetBackupVaultArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:dataprotection/getBackupVault:getBackupVault", TypeShape.of(GetBackupVaultResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Backup Vault.
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
     *         final var example = Output.of(DataprotectionFunctions.getBackupVault(GetBackupVaultArgs.builder()
     *             .name(&#34;existing-backup-vault&#34;)
     *             .resourceGroupName(&#34;existing-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;azurermDataProtectionBackupVaultId&#34;, data.getAzurerm_vpn_gateway().getExample().getId());
     *         ctx.export(&#34;azurermDataProtectionBackupVaultPrincipalId&#34;, example.apply(getBackupVaultResult -&gt; getBackupVaultResult.getIdentities()[0].getPrincipalId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBackupVaultResult> getBackupVaultPlain(GetBackupVaultPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:dataprotection/getBackupVault:getBackupVault", TypeShape.of(GetBackupVaultResult.class), args, Utilities.withVersion(options));
    }
}
