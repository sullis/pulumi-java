// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.netapp.inputs.GetAccountArgs;
import com.pulumi.azurenative.netapp.inputs.GetAccountPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetBackupArgs;
import com.pulumi.azurenative.netapp.inputs.GetBackupPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetBackupPolicyArgs;
import com.pulumi.azurenative.netapp.inputs.GetBackupPolicyPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetPoolArgs;
import com.pulumi.azurenative.netapp.inputs.GetPoolPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetSnapshotArgs;
import com.pulumi.azurenative.netapp.inputs.GetSnapshotPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetSnapshotPolicyArgs;
import com.pulumi.azurenative.netapp.inputs.GetSnapshotPolicyPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetSubvolumeArgs;
import com.pulumi.azurenative.netapp.inputs.GetSubvolumeMetadataArgs;
import com.pulumi.azurenative.netapp.inputs.GetSubvolumeMetadataPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetSubvolumePlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetVolumeArgs;
import com.pulumi.azurenative.netapp.inputs.GetVolumeGroupArgs;
import com.pulumi.azurenative.netapp.inputs.GetVolumeGroupPlainArgs;
import com.pulumi.azurenative.netapp.inputs.GetVolumePlainArgs;
import com.pulumi.azurenative.netapp.outputs.GetAccountResult;
import com.pulumi.azurenative.netapp.outputs.GetBackupPolicyResult;
import com.pulumi.azurenative.netapp.outputs.GetBackupResult;
import com.pulumi.azurenative.netapp.outputs.GetPoolResult;
import com.pulumi.azurenative.netapp.outputs.GetSnapshotPolicyResult;
import com.pulumi.azurenative.netapp.outputs.GetSnapshotResult;
import com.pulumi.azurenative.netapp.outputs.GetSubvolumeMetadataResult;
import com.pulumi.azurenative.netapp.outputs.GetSubvolumeResult;
import com.pulumi.azurenative.netapp.outputs.GetVolumeGroupResult;
import com.pulumi.azurenative.netapp.outputs.GetVolumeResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class NetappFunctions {
    /**
     * NetApp account resource
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * NetApp account resource
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * NetApp account resource
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NetApp account resource
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Backup of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args) {
        return getBackup(args, InvokeOptions.Empty);
    }
    /**
     * Backup of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args) {
        return getBackupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Backup of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Backup of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Backup policy information
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetBackupPolicyResult> getBackupPolicy(GetBackupPolicyArgs args) {
        return getBackupPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Backup policy information
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetBackupPolicyResult> getBackupPolicyPlain(GetBackupPolicyPlainArgs args) {
        return getBackupPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Backup policy information
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetBackupPolicyResult> getBackupPolicy(GetBackupPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getBackupPolicy", TypeShape.of(GetBackupPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Backup policy information
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetBackupPolicyResult> getBackupPolicyPlain(GetBackupPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getBackupPolicy", TypeShape.of(GetBackupPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Capacity pool resource
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetPoolResult> getPool(GetPoolArgs args) {
        return getPool(args, InvokeOptions.Empty);
    }
    /**
     * Capacity pool resource
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetPoolResult> getPoolPlain(GetPoolPlainArgs args) {
        return getPoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Capacity pool resource
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetPoolResult> getPool(GetPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getPool", TypeShape.of(GetPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Capacity pool resource
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetPoolResult> getPoolPlain(GetPoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getPool", TypeShape.of(GetPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Snapshot of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetSnapshotResult> getSnapshot(GetSnapshotArgs args) {
        return getSnapshot(args, InvokeOptions.Empty);
    }
    /**
     * Snapshot of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshotPlain(GetSnapshotPlainArgs args) {
        return getSnapshotPlain(args, InvokeOptions.Empty);
    }
    /**
     * Snapshot of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetSnapshotResult> getSnapshot(GetSnapshotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getSnapshot", TypeShape.of(GetSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Snapshot of a Volume
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshotPlain(GetSnapshotPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getSnapshot", TypeShape.of(GetSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Snapshot policy information
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetSnapshotPolicyResult> getSnapshotPolicy(GetSnapshotPolicyArgs args) {
        return getSnapshotPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Snapshot policy information
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSnapshotPolicyResult> getSnapshotPolicyPlain(GetSnapshotPolicyPlainArgs args) {
        return getSnapshotPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Snapshot policy information
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetSnapshotPolicyResult> getSnapshotPolicy(GetSnapshotPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getSnapshotPolicy", TypeShape.of(GetSnapshotPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Snapshot policy information
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSnapshotPolicyResult> getSnapshotPolicyPlain(GetSnapshotPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getSnapshotPolicy", TypeShape.of(GetSnapshotPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Subvolume Information properties
     * API Version: 2021-10-01.
     * 
     */
    public static Output<GetSubvolumeResult> getSubvolume(GetSubvolumeArgs args) {
        return getSubvolume(args, InvokeOptions.Empty);
    }
    /**
     * Subvolume Information properties
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetSubvolumeResult> getSubvolumePlain(GetSubvolumePlainArgs args) {
        return getSubvolumePlain(args, InvokeOptions.Empty);
    }
    /**
     * Subvolume Information properties
     * API Version: 2021-10-01.
     * 
     */
    public static Output<GetSubvolumeResult> getSubvolume(GetSubvolumeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getSubvolume", TypeShape.of(GetSubvolumeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Subvolume Information properties
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetSubvolumeResult> getSubvolumePlain(GetSubvolumePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getSubvolume", TypeShape.of(GetSubvolumeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the post subvolume and action is to get metadata of the subvolume.
     * API Version: 2021-10-01.
     * 
     */
    public static Output<GetSubvolumeMetadataResult> getSubvolumeMetadata(GetSubvolumeMetadataArgs args) {
        return getSubvolumeMetadata(args, InvokeOptions.Empty);
    }
    /**
     * Result of the post subvolume and action is to get metadata of the subvolume.
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetSubvolumeMetadataResult> getSubvolumeMetadataPlain(GetSubvolumeMetadataPlainArgs args) {
        return getSubvolumeMetadataPlain(args, InvokeOptions.Empty);
    }
    /**
     * Result of the post subvolume and action is to get metadata of the subvolume.
     * API Version: 2021-10-01.
     * 
     */
    public static Output<GetSubvolumeMetadataResult> getSubvolumeMetadata(GetSubvolumeMetadataArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getSubvolumeMetadata", TypeShape.of(GetSubvolumeMetadataResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the post subvolume and action is to get metadata of the subvolume.
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetSubvolumeMetadataResult> getSubvolumeMetadataPlain(GetSubvolumeMetadataPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getSubvolumeMetadata", TypeShape.of(GetSubvolumeMetadataResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Volume resource
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetVolumeResult> getVolume(GetVolumeArgs args) {
        return getVolume(args, InvokeOptions.Empty);
    }
    /**
     * Volume resource
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetVolumeResult> getVolumePlain(GetVolumePlainArgs args) {
        return getVolumePlain(args, InvokeOptions.Empty);
    }
    /**
     * Volume resource
     * API Version: 2020-12-01.
     * 
     */
    public static Output<GetVolumeResult> getVolume(GetVolumeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getVolume", TypeShape.of(GetVolumeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Volume resource
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetVolumeResult> getVolumePlain(GetVolumePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getVolume", TypeShape.of(GetVolumeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Volume group resource for create
     * API Version: 2021-10-01.
     * 
     */
    public static Output<GetVolumeGroupResult> getVolumeGroup(GetVolumeGroupArgs args) {
        return getVolumeGroup(args, InvokeOptions.Empty);
    }
    /**
     * Volume group resource for create
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetVolumeGroupResult> getVolumeGroupPlain(GetVolumeGroupPlainArgs args) {
        return getVolumeGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Volume group resource for create
     * API Version: 2021-10-01.
     * 
     */
    public static Output<GetVolumeGroupResult> getVolumeGroup(GetVolumeGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:netapp:getVolumeGroup", TypeShape.of(GetVolumeGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Volume group resource for create
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetVolumeGroupResult> getVolumeGroupPlain(GetVolumeGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getVolumeGroup", TypeShape.of(GetVolumeGroupResult.class), args, Utilities.withVersion(options));
    }
}
