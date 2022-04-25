// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceFleetEdgeOutputConfig extends com.pulumi.resources.InvokeArgs {

    public static final DeviceFleetEdgeOutputConfig Empty = new DeviceFleetEdgeOutputConfig();

    /**
     * The KMS key id used for encryption on the S3 bucket
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable String kmsKeyId;

    /**
     * @return The KMS key id used for encryption on the S3 bucket
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The Amazon Simple Storage (S3) bucket URI
     * 
     */
    @Import(name="s3OutputLocation", required=true)
    private String s3OutputLocation;

    /**
     * @return The Amazon Simple Storage (S3) bucket URI
     * 
     */
    public String s3OutputLocation() {
        return this.s3OutputLocation;
    }

    private DeviceFleetEdgeOutputConfig() {}

    private DeviceFleetEdgeOutputConfig(DeviceFleetEdgeOutputConfig $) {
        this.kmsKeyId = $.kmsKeyId;
        this.s3OutputLocation = $.s3OutputLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceFleetEdgeOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceFleetEdgeOutputConfig $;

        public Builder() {
            $ = new DeviceFleetEdgeOutputConfig();
        }

        public Builder(DeviceFleetEdgeOutputConfig defaults) {
            $ = new DeviceFleetEdgeOutputConfig(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyId The KMS key id used for encryption on the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param s3OutputLocation The Amazon Simple Storage (S3) bucket URI
         * 
         * @return builder
         * 
         */
        public Builder s3OutputLocation(String s3OutputLocation) {
            $.s3OutputLocation = s3OutputLocation;
            return this;
        }

        public DeviceFleetEdgeOutputConfig build() {
            $.s3OutputLocation = Objects.requireNonNull($.s3OutputLocation, "expected parameter 's3OutputLocation' to be non-null");
            return $;
        }
    }

}
