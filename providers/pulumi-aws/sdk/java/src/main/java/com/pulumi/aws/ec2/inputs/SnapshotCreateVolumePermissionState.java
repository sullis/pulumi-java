// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotCreateVolumePermissionState extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotCreateVolumePermissionState Empty = new SnapshotCreateVolumePermissionState();

    /**
     * An AWS Account ID to add create volume permissions
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return An AWS Account ID to add create volume permissions
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A snapshot ID
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return A snapshot ID
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    private SnapshotCreateVolumePermissionState() {}

    private SnapshotCreateVolumePermissionState(SnapshotCreateVolumePermissionState $) {
        this.accountId = $.accountId;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotCreateVolumePermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotCreateVolumePermissionState $;

        public Builder() {
            $ = new SnapshotCreateVolumePermissionState();
        }

        public Builder(SnapshotCreateVolumePermissionState defaults) {
            $ = new SnapshotCreateVolumePermissionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId An AWS Account ID to add create volume permissions
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId An AWS Account ID to add create volume permissions
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param snapshotId A snapshot ID
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId A snapshot ID
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public SnapshotCreateVolumePermissionState build() {
            return $;
        }
    }

}
