// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStorageAccountCredentialResult {
    /**
     * The details of the storage account password.
     * 
     */
    private final @Nullable AsymmetricEncryptedSecretResponse accessKey;
    /**
     * The storage endpoint
     * 
     */
    private final String endPoint;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    private final @Nullable String kind;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * Signifies whether SSL needs to be enabled or not.
     * 
     */
    private final String sslStatus;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * The count of volumes using this storage account credential.
     * 
     */
    private final Integer volumesCount;

    @OutputCustomType.Constructor({"accessKey","endPoint","id","kind","name","sslStatus","type","volumesCount"})
    private GetStorageAccountCredentialResult(
        @Nullable AsymmetricEncryptedSecretResponse accessKey,
        String endPoint,
        String id,
        @Nullable String kind,
        String name,
        String sslStatus,
        String type,
        Integer volumesCount) {
        this.accessKey = accessKey;
        this.endPoint = Objects.requireNonNull(endPoint);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.sslStatus = Objects.requireNonNull(sslStatus);
        this.type = Objects.requireNonNull(type);
        this.volumesCount = Objects.requireNonNull(volumesCount);
    }

    /**
     * The details of the storage account password.
     * 
     */
    public Optional<AsymmetricEncryptedSecretResponse> getAccessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * The storage endpoint
     * 
     */
    public String getEndPoint() {
        return this.endPoint;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The name of the object.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Signifies whether SSL needs to be enabled or not.
     * 
     */
    public String getSslStatus() {
        return this.sslStatus;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The count of volumes using this storage account credential.
     * 
     */
    public Integer getVolumesCount() {
        return this.volumesCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageAccountCredentialResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AsymmetricEncryptedSecretResponse accessKey;
        private String endPoint;
        private String id;
        private @Nullable String kind;
        private String name;
        private String sslStatus;
        private String type;
        private Integer volumesCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageAccountCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.endPoint = defaults.endPoint;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.sslStatus = defaults.sslStatus;
    	      this.type = defaults.type;
    	      this.volumesCount = defaults.volumesCount;
        }

        public Builder setAccessKey(@Nullable AsymmetricEncryptedSecretResponse accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setEndPoint(String endPoint) {
            this.endPoint = Objects.requireNonNull(endPoint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSslStatus(String sslStatus) {
            this.sslStatus = Objects.requireNonNull(sslStatus);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVolumesCount(Integer volumesCount) {
            this.volumesCount = Objects.requireNonNull(volumesCount);
            return this;
        }

        public GetStorageAccountCredentialResult build() {
            return new GetStorageAccountCredentialResult(accessKey, endPoint, id, kind, name, sslStatus, type, volumesCount);
        }
    }
}
