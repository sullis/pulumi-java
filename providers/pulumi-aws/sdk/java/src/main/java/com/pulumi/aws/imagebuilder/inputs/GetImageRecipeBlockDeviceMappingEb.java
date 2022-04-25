// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetImageRecipeBlockDeviceMappingEb extends com.pulumi.resources.InvokeArgs {

    public static final GetImageRecipeBlockDeviceMappingEb Empty = new GetImageRecipeBlockDeviceMappingEb();

    /**
     * Whether to delete the volume on termination. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    @Import(name="deleteOnTermination", required=true)
    private Boolean deleteOnTermination;

    /**
     * @return Whether to delete the volume on termination. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    public Boolean deleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    @Import(name="encrypted", required=true)
    private Boolean encrypted;

    /**
     * @return Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }

    /**
     * Number of Input/Output (I/O) operations per second to provision for an `io1` or `io2` volume.
     * 
     */
    @Import(name="iops", required=true)
    private Integer iops;

    /**
     * @return Number of Input/Output (I/O) operations per second to provision for an `io1` or `io2` volume.
     * 
     */
    public Integer iops() {
        return this.iops;
    }

    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
     * 
     */
    @Import(name="kmsKeyId", required=true)
    private String kmsKeyId;

    /**
     * @return Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * Identifier of the EC2 Volume Snapshot.
     * 
     */
    @Import(name="snapshotId", required=true)
    private String snapshotId;

    /**
     * @return Identifier of the EC2 Volume Snapshot.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    /**
     * Size of the volume, in GiB.
     * 
     */
    @Import(name="volumeSize", required=true)
    private Integer volumeSize;

    /**
     * @return Size of the volume, in GiB.
     * 
     */
    public Integer volumeSize() {
        return this.volumeSize;
    }

    /**
     * Type of the volume. For example, `gp2` or `io2`.
     * 
     */
    @Import(name="volumeType", required=true)
    private String volumeType;

    /**
     * @return Type of the volume. For example, `gp2` or `io2`.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    private GetImageRecipeBlockDeviceMappingEb() {}

    private GetImageRecipeBlockDeviceMappingEb(GetImageRecipeBlockDeviceMappingEb $) {
        this.deleteOnTermination = $.deleteOnTermination;
        this.encrypted = $.encrypted;
        this.iops = $.iops;
        this.kmsKeyId = $.kmsKeyId;
        this.snapshotId = $.snapshotId;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageRecipeBlockDeviceMappingEb defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageRecipeBlockDeviceMappingEb $;

        public Builder() {
            $ = new GetImageRecipeBlockDeviceMappingEb();
        }

        public Builder(GetImageRecipeBlockDeviceMappingEb defaults) {
            $ = new GetImageRecipeBlockDeviceMappingEb(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOnTermination Whether to delete the volume on termination. Defaults to unset, which is the value inherited from the parent image.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            $.deleteOnTermination = deleteOnTermination;
            return this;
        }

        /**
         * @param encrypted Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param iops Number of Input/Output (I/O) operations per second to provision for an `io1` or `io2` volume.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param kmsKeyId Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param snapshotId Identifier of the EC2 Volume Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param volumeSize Size of the volume, in GiB.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(Integer volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        /**
         * @param volumeType Type of the volume. For example, `gp2` or `io2`.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        public GetImageRecipeBlockDeviceMappingEb build() {
            $.deleteOnTermination = Objects.requireNonNull($.deleteOnTermination, "expected parameter 'deleteOnTermination' to be non-null");
            $.encrypted = Objects.requireNonNull($.encrypted, "expected parameter 'encrypted' to be non-null");
            $.iops = Objects.requireNonNull($.iops, "expected parameter 'iops' to be non-null");
            $.kmsKeyId = Objects.requireNonNull($.kmsKeyId, "expected parameter 'kmsKeyId' to be non-null");
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            $.volumeSize = Objects.requireNonNull($.volumeSize, "expected parameter 'volumeSize' to be non-null");
            $.volumeType = Objects.requireNonNull($.volumeType, "expected parameter 'volumeType' to be non-null");
            return $;
        }
    }

}
