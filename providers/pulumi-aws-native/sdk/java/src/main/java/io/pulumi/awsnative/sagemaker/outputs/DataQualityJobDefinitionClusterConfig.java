// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataQualityJobDefinitionClusterConfig {
    private final Integer instanceCount;
    private final String instanceType;
    private final @Nullable String volumeKmsKeyId;
    private final Integer volumeSizeInGB;

    @OutputCustomType.Constructor({"instanceCount","instanceType","volumeKmsKeyId","volumeSizeInGB"})
    private DataQualityJobDefinitionClusterConfig(
        Integer instanceCount,
        String instanceType,
        @Nullable String volumeKmsKeyId,
        Integer volumeSizeInGB) {
        this.instanceCount = Objects.requireNonNull(instanceCount);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.volumeKmsKeyId = volumeKmsKeyId;
        this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB);
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }
    public String getInstanceType() {
        return this.instanceType;
    }
    public Optional<String> getVolumeKmsKeyId() {
        return Optional.ofNullable(this.volumeKmsKeyId);
    }
    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instanceCount;
        private String instanceType;
        private @Nullable String volumeKmsKeyId;
        private Integer volumeSizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.volumeKmsKeyId = defaults.volumeKmsKeyId;
    	      this.volumeSizeInGB = defaults.volumeSizeInGB;
        }

        public Builder setInstanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setVolumeKmsKeyId(@Nullable String volumeKmsKeyId) {
            this.volumeKmsKeyId = volumeKmsKeyId;
            return this;
        }

        public Builder setVolumeSizeInGB(Integer volumeSizeInGB) {
            this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB);
            return this;
        }

        public DataQualityJobDefinitionClusterConfig build() {
            return new DataQualityJobDefinitionClusterConfig(instanceCount, instanceType, volumeKmsKeyId, volumeSizeInGB);
        }
    }
}
