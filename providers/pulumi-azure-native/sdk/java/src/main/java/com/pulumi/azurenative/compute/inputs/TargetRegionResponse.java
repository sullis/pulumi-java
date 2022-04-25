// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.EncryptionImagesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the target region information.
 * 
 */
public final class TargetRegionResponse extends com.pulumi.resources.InvokeArgs {

    public static final TargetRegionResponse Empty = new TargetRegionResponse();

    /**
     * Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
     * 
     */
    @Import(name="encryption")
    private @Nullable EncryptionImagesResponse encryption;

    /**
     * @return Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
     * 
     */
    public Optional<EncryptionImagesResponse> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * The name of the region.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the region.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The number of replicas of the Image Version to be created per region. This property is updatable.
     * 
     */
    @Import(name="regionalReplicaCount")
    private @Nullable Integer regionalReplicaCount;

    /**
     * @return The number of replicas of the Image Version to be created per region. This property is updatable.
     * 
     */
    public Optional<Integer> regionalReplicaCount() {
        return Optional.ofNullable(this.regionalReplicaCount);
    }

    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable String storageAccountType;

    /**
     * @return Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    private TargetRegionResponse() {}

    private TargetRegionResponse(TargetRegionResponse $) {
        this.encryption = $.encryption;
        this.name = $.name;
        this.regionalReplicaCount = $.regionalReplicaCount;
        this.storageAccountType = $.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetRegionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetRegionResponse $;

        public Builder() {
            $ = new TargetRegionResponse();
        }

        public Builder(TargetRegionResponse defaults) {
            $ = new TargetRegionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryption Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable EncryptionImagesResponse encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param name The name of the region.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param regionalReplicaCount The number of replicas of the Image Version to be created per region. This property is updatable.
         * 
         * @return builder
         * 
         */
        public Builder regionalReplicaCount(@Nullable Integer regionalReplicaCount) {
            $.regionalReplicaCount = regionalReplicaCount;
            return this;
        }

        /**
         * @param storageAccountType Specifies the storage account type to be used to store the image. This property is not updatable.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(@Nullable String storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public TargetRegionResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
