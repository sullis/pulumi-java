// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.FileStorage;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.FileStorage.inputs.GetExportSetsArgs;
import com.pulumi.oci.FileStorage.inputs.GetExportSetsPlainArgs;
import com.pulumi.oci.FileStorage.inputs.GetExportsArgs;
import com.pulumi.oci.FileStorage.inputs.GetExportsPlainArgs;
import com.pulumi.oci.FileStorage.inputs.GetFileSystemsArgs;
import com.pulumi.oci.FileStorage.inputs.GetFileSystemsPlainArgs;
import com.pulumi.oci.FileStorage.inputs.GetMountTargetsArgs;
import com.pulumi.oci.FileStorage.inputs.GetMountTargetsPlainArgs;
import com.pulumi.oci.FileStorage.inputs.GetSnapshotArgs;
import com.pulumi.oci.FileStorage.inputs.GetSnapshotPlainArgs;
import com.pulumi.oci.FileStorage.inputs.GetSnapshotsArgs;
import com.pulumi.oci.FileStorage.inputs.GetSnapshotsPlainArgs;
import com.pulumi.oci.FileStorage.outputs.GetExportSetsResult;
import com.pulumi.oci.FileStorage.outputs.GetExportsResult;
import com.pulumi.oci.FileStorage.outputs.GetFileSystemsResult;
import com.pulumi.oci.FileStorage.outputs.GetMountTargetsResult;
import com.pulumi.oci.FileStorage.outputs.GetSnapshotResult;
import com.pulumi.oci.FileStorage.outputs.GetSnapshotsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class FileStorageFunctions {
    /**
     * This data source provides the list of Export Sets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the export set resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetExportSetsResult> getExportSets(GetExportSetsArgs args) {
        return getExportSets(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Export Sets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the export set resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetExportSetsResult> getExportSetsPlain(GetExportSetsPlainArgs args) {
        return getExportSetsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Export Sets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the export set resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetExportSetsResult> getExportSets(GetExportSetsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:FileStorage/getExportSets:getExportSets", TypeShape.of(GetExportSetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Export Sets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the export set resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetExportSetsResult> getExportSetsPlain(GetExportSetsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:FileStorage/getExportSets:getExportSets", TypeShape.of(GetExportSetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Exports in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists export resources by compartment, file system, or export
     * set. You must specify an export set ID, a file system ID, and
     * / or a compartment ID.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetExportsResult> getExports() {
        return getExports(GetExportsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Exports in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists export resources by compartment, file system, or export
     * set. You must specify an export set ID, a file system ID, and
     * / or a compartment ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetExportsResult> getExportsPlain() {
        return getExportsPlain(GetExportsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Exports in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists export resources by compartment, file system, or export
     * set. You must specify an export set ID, a file system ID, and
     * / or a compartment ID.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetExportsResult> getExports(GetExportsArgs args) {
        return getExports(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Exports in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists export resources by compartment, file system, or export
     * set. You must specify an export set ID, a file system ID, and
     * / or a compartment ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetExportsResult> getExportsPlain(GetExportsPlainArgs args) {
        return getExportsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Exports in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists export resources by compartment, file system, or export
     * set. You must specify an export set ID, a file system ID, and
     * / or a compartment ID.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetExportsResult> getExports(GetExportsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:FileStorage/getExports:getExports", TypeShape.of(GetExportsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Exports in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists export resources by compartment, file system, or export
     * set. You must specify an export set ID, a file system ID, and
     * / or a compartment ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetExportsResult> getExportsPlain(GetExportsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:FileStorage/getExports:getExports", TypeShape.of(GetExportsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of File Systems in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the file system resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetFileSystemsResult> getFileSystems(GetFileSystemsArgs args) {
        return getFileSystems(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of File Systems in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the file system resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFileSystemsResult> getFileSystemsPlain(GetFileSystemsPlainArgs args) {
        return getFileSystemsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of File Systems in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the file system resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetFileSystemsResult> getFileSystems(GetFileSystemsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:FileStorage/getFileSystems:getFileSystems", TypeShape.of(GetFileSystemsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of File Systems in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the file system resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFileSystemsResult> getFileSystemsPlain(GetFileSystemsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:FileStorage/getFileSystems:getFileSystems", TypeShape.of(GetFileSystemsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Mount Targets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the mount target resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetMountTargetsResult> getMountTargets(GetMountTargetsArgs args) {
        return getMountTargets(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Mount Targets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the mount target resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMountTargetsResult> getMountTargetsPlain(GetMountTargetsPlainArgs args) {
        return getMountTargetsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Mount Targets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the mount target resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetMountTargetsResult> getMountTargets(GetMountTargetsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:FileStorage/getMountTargets:getMountTargets", TypeShape.of(GetMountTargetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Mount Targets in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists the mount target resources in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMountTargetsResult> getMountTargetsPlain(GetMountTargetsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:FileStorage/getMountTargets:getMountTargets", TypeShape.of(GetMountTargetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Snapshot resource in Oracle Cloud Infrastructure File Storage service.
     * 
     * Gets the specified snapshot&#39;s information.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetSnapshotResult> getSnapshot(GetSnapshotArgs args) {
        return getSnapshot(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Snapshot resource in Oracle Cloud Infrastructure File Storage service.
     * 
     * Gets the specified snapshot&#39;s information.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshotPlain(GetSnapshotPlainArgs args) {
        return getSnapshotPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Snapshot resource in Oracle Cloud Infrastructure File Storage service.
     * 
     * Gets the specified snapshot&#39;s information.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetSnapshotResult> getSnapshot(GetSnapshotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:FileStorage/getSnapshot:getSnapshot", TypeShape.of(GetSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Snapshot resource in Oracle Cloud Infrastructure File Storage service.
     * 
     * Gets the specified snapshot&#39;s information.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshotPlain(GetSnapshotPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:FileStorage/getSnapshot:getSnapshot", TypeShape.of(GetSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Snapshots in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists snapshots of the specified file system.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetSnapshotsResult> getSnapshots(GetSnapshotsArgs args) {
        return getSnapshots(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Snapshots in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists snapshots of the specified file system.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSnapshotsResult> getSnapshotsPlain(GetSnapshotsPlainArgs args) {
        return getSnapshotsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Snapshots in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists snapshots of the specified file system.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetSnapshotsResult> getSnapshots(GetSnapshotsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:FileStorage/getSnapshots:getSnapshots", TypeShape.of(GetSnapshotsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Snapshots in Oracle Cloud Infrastructure File Storage service.
     * 
     * Lists snapshots of the specified file system.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSnapshotsResult> getSnapshotsPlain(GetSnapshotsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:FileStorage/getSnapshots:getSnapshots", TypeShape.of(GetSnapshotsResult.class), args, Utilities.withVersion(options));
    }
}
