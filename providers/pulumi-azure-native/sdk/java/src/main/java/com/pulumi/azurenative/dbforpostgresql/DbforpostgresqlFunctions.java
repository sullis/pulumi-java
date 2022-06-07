// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetConfigurationArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetConfigurationPlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetDatabaseArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetDatabasePlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetFirewallRuleArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetFirewallRulePlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetPrivateEndpointConnectionPlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerAdministratorArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerAdministratorPlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerKeyArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerKeyPlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerPlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerSecurityAlertPolicyArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetServerSecurityAlertPolicyPlainArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetVirtualNetworkRuleArgs;
import com.pulumi.azurenative.dbforpostgresql.inputs.GetVirtualNetworkRulePlainArgs;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetConfigurationResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetDatabaseResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetFirewallRuleResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetServerAdministratorResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetServerKeyResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetServerResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetServerSecurityAlertPolicyResult;
import com.pulumi.azurenative.dbforpostgresql.outputs.GetVirtualNetworkRuleResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DbforpostgresqlFunctions {
    /**
     * Represents a Configuration.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetConfigurationResult> getConfiguration(GetConfigurationArgs args) {
        return getConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Represents a Configuration.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetConfigurationResult> getConfigurationPlain(GetConfigurationPlainArgs args) {
        return getConfigurationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a Configuration.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetConfigurationResult> getConfiguration(GetConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getConfiguration", TypeShape.of(GetConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a Configuration.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetConfigurationResult> getConfigurationPlain(GetConfigurationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getConfiguration", TypeShape.of(GetConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a Database.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args) {
        return getDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Represents a Database.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args) {
        return getDatabasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a Database.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a Database.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a server firewall rule.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetFirewallRuleResult> getFirewallRule(GetFirewallRuleArgs args) {
        return getFirewallRule(args, InvokeOptions.Empty);
    }
    /**
     * Represents a server firewall rule.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetFirewallRuleResult> getFirewallRulePlain(GetFirewallRulePlainArgs args) {
        return getFirewallRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a server firewall rule.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetFirewallRuleResult> getFirewallRule(GetFirewallRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getFirewallRule", TypeShape.of(GetFirewallRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a server firewall rule.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetFirewallRuleResult> getFirewallRulePlain(GetFirewallRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getFirewallRule", TypeShape.of(GetFirewallRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection
     * API Version: 2018-06-01.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * A private endpoint connection
     * API Version: 2018-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args) {
        return getPrivateEndpointConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * A private endpoint connection
     * API Version: 2018-06-01.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection
     * API Version: 2018-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a server.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args) {
        return getServer(args, InvokeOptions.Empty);
    }
    /**
     * Represents a server.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args) {
        return getServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a server.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a server.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a and external administrator to be created.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetServerAdministratorResult> getServerAdministrator(GetServerAdministratorArgs args) {
        return getServerAdministrator(args, InvokeOptions.Empty);
    }
    /**
     * Represents a and external administrator to be created.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetServerAdministratorResult> getServerAdministratorPlain(GetServerAdministratorPlainArgs args) {
        return getServerAdministratorPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a and external administrator to be created.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetServerAdministratorResult> getServerAdministrator(GetServerAdministratorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getServerAdministrator", TypeShape.of(GetServerAdministratorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a and external administrator to be created.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetServerAdministratorResult> getServerAdministratorPlain(GetServerAdministratorPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getServerAdministrator", TypeShape.of(GetServerAdministratorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A PostgreSQL Server key.
     * API Version: 2020-01-01.
     * 
     */
    public static Output<GetServerKeyResult> getServerKey(GetServerKeyArgs args) {
        return getServerKey(args, InvokeOptions.Empty);
    }
    /**
     * A PostgreSQL Server key.
     * API Version: 2020-01-01.
     * 
     */
    public static CompletableFuture<GetServerKeyResult> getServerKeyPlain(GetServerKeyPlainArgs args) {
        return getServerKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * A PostgreSQL Server key.
     * API Version: 2020-01-01.
     * 
     */
    public static Output<GetServerKeyResult> getServerKey(GetServerKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getServerKey", TypeShape.of(GetServerKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A PostgreSQL Server key.
     * API Version: 2020-01-01.
     * 
     */
    public static CompletableFuture<GetServerKeyResult> getServerKeyPlain(GetServerKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getServerKey", TypeShape.of(GetServerKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A server security alert policy.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetServerSecurityAlertPolicyResult> getServerSecurityAlertPolicy(GetServerSecurityAlertPolicyArgs args) {
        return getServerSecurityAlertPolicy(args, InvokeOptions.Empty);
    }
    /**
     * A server security alert policy.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetServerSecurityAlertPolicyResult> getServerSecurityAlertPolicyPlain(GetServerSecurityAlertPolicyPlainArgs args) {
        return getServerSecurityAlertPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * A server security alert policy.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetServerSecurityAlertPolicyResult> getServerSecurityAlertPolicy(GetServerSecurityAlertPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getServerSecurityAlertPolicy", TypeShape.of(GetServerSecurityAlertPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A server security alert policy.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetServerSecurityAlertPolicyResult> getServerSecurityAlertPolicyPlain(GetServerSecurityAlertPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getServerSecurityAlertPolicy", TypeShape.of(GetServerSecurityAlertPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A virtual network rule.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetVirtualNetworkRuleResult> getVirtualNetworkRule(GetVirtualNetworkRuleArgs args) {
        return getVirtualNetworkRule(args, InvokeOptions.Empty);
    }
    /**
     * A virtual network rule.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetVirtualNetworkRuleResult> getVirtualNetworkRulePlain(GetVirtualNetworkRulePlainArgs args) {
        return getVirtualNetworkRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * A virtual network rule.
     * API Version: 2017-12-01.
     * 
     */
    public static Output<GetVirtualNetworkRuleResult> getVirtualNetworkRule(GetVirtualNetworkRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:dbforpostgresql:getVirtualNetworkRule", TypeShape.of(GetVirtualNetworkRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A virtual network rule.
     * API Version: 2017-12-01.
     * 
     */
    public static CompletableFuture<GetVirtualNetworkRuleResult> getVirtualNetworkRulePlain(GetVirtualNetworkRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getVirtualNetworkRule", TypeShape.of(GetVirtualNetworkRuleResult.class), args, Utilities.withVersion(options));
    }
}
