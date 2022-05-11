// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Blockchain;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Blockchain.inputs.GetBlockchainPlatformArgs;
import com.pulumi.oci.Blockchain.inputs.GetBlockchainPlatformPatchesArgs;
import com.pulumi.oci.Blockchain.inputs.GetBlockchainPlatformsArgs;
import com.pulumi.oci.Blockchain.inputs.GetOsnArgs;
import com.pulumi.oci.Blockchain.inputs.GetOsnsArgs;
import com.pulumi.oci.Blockchain.inputs.GetPeerArgs;
import com.pulumi.oci.Blockchain.inputs.GetPeersArgs;
import com.pulumi.oci.Blockchain.outputs.GetBlockchainPlatformPatchesResult;
import com.pulumi.oci.Blockchain.outputs.GetBlockchainPlatformResult;
import com.pulumi.oci.Blockchain.outputs.GetBlockchainPlatformsResult;
import com.pulumi.oci.Blockchain.outputs.GetOsnResult;
import com.pulumi.oci.Blockchain.outputs.GetOsnsResult;
import com.pulumi.oci.Blockchain.outputs.GetPeerResult;
import com.pulumi.oci.Blockchain.outputs.GetPeersResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class BlockchainFunctions {
    /**
     * This data source provides details about a specific Blockchain Platform resource in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Gets information about a Blockchain Platform identified by the specific id
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBlockchainPlatformResult> getBlockchainPlatform(GetBlockchainPlatformArgs args) {
        return getBlockchainPlatform(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Blockchain Platform resource in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Gets information about a Blockchain Platform identified by the specific id
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBlockchainPlatformResult> getBlockchainPlatform(GetBlockchainPlatformArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Blockchain/getBlockchainPlatform:getBlockchainPlatform", TypeShape.of(GetBlockchainPlatformResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Blockchain Platform Patches in Oracle Cloud Infrastructure Blockchain service.
     * 
     * List Blockchain Platform Patches
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBlockchainPlatformPatchesResult> getBlockchainPlatformPatches(GetBlockchainPlatformPatchesArgs args) {
        return getBlockchainPlatformPatches(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Blockchain Platform Patches in Oracle Cloud Infrastructure Blockchain service.
     * 
     * List Blockchain Platform Patches
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBlockchainPlatformPatchesResult> getBlockchainPlatformPatches(GetBlockchainPlatformPatchesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Blockchain/getBlockchainPlatformPatches:getBlockchainPlatformPatches", TypeShape.of(GetBlockchainPlatformPatchesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Blockchain Platforms in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Returns a list Blockchain Platform Instances in a compartment
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBlockchainPlatformsResult> getBlockchainPlatforms(GetBlockchainPlatformsArgs args) {
        return getBlockchainPlatforms(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Blockchain Platforms in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Returns a list Blockchain Platform Instances in a compartment
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBlockchainPlatformsResult> getBlockchainPlatforms(GetBlockchainPlatformsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Blockchain/getBlockchainPlatforms:getBlockchainPlatforms", TypeShape.of(GetBlockchainPlatformsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Osn resource in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Gets information about an OSN identified by the specific id
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOsnResult> getOsn(GetOsnArgs args) {
        return getOsn(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Osn resource in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Gets information about an OSN identified by the specific id
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOsnResult> getOsn(GetOsnArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Blockchain/getOsn:getOsn", TypeShape.of(GetOsnResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Osns in Oracle Cloud Infrastructure Blockchain service.
     * 
     * List Blockchain Platform OSNs
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOsnsResult> getOsns(GetOsnsArgs args) {
        return getOsns(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Osns in Oracle Cloud Infrastructure Blockchain service.
     * 
     * List Blockchain Platform OSNs
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOsnsResult> getOsns(GetOsnsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Blockchain/getOsns:getOsns", TypeShape.of(GetOsnsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Peer resource in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Gets information about a peer identified by the specific id
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPeerResult> getPeer(GetPeerArgs args) {
        return getPeer(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Peer resource in Oracle Cloud Infrastructure Blockchain service.
     * 
     * Gets information about a peer identified by the specific id
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPeerResult> getPeer(GetPeerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Blockchain/getPeer:getPeer", TypeShape.of(GetPeerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Peers in Oracle Cloud Infrastructure Blockchain service.
     * 
     * List Blockchain Platform Peers
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPeersResult> getPeers(GetPeersArgs args) {
        return getPeers(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Peers in Oracle Cloud Infrastructure Blockchain service.
     * 
     * List Blockchain Platform Peers
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPeersResult> getPeers(GetPeersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Blockchain/getPeers:getPeers", TypeShape.of(GetPeersResult.class), args, Utilities.withVersion(options));
    }
}
