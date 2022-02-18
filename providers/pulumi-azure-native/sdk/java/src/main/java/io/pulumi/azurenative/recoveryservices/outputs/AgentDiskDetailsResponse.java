// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AgentDiskDetailsResponse {
    /**
     * The disk capacity in bytes.
     * 
     */
    private final Double capacityInBytes;
    /**
     * The disk Id.
     * 
     */
    private final String diskId;
    /**
     * The disk name.
     * 
     */
    private final String diskName;
    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    private final String isOSDisk;
    /**
     * The lun of disk.
     * 
     */
    private final Integer lunId;

    @OutputCustomType.Constructor({"capacityInBytes","diskId","diskName","isOSDisk","lunId"})
    private AgentDiskDetailsResponse(
        Double capacityInBytes,
        String diskId,
        String diskName,
        String isOSDisk,
        Integer lunId) {
        this.capacityInBytes = Objects.requireNonNull(capacityInBytes);
        this.diskId = Objects.requireNonNull(diskId);
        this.diskName = Objects.requireNonNull(diskName);
        this.isOSDisk = Objects.requireNonNull(isOSDisk);
        this.lunId = Objects.requireNonNull(lunId);
    }

    /**
     * The disk capacity in bytes.
     * 
     */
    public Double getCapacityInBytes() {
        return this.capacityInBytes;
    }
    /**
     * The disk Id.
     * 
     */
    public String getDiskId() {
        return this.diskId;
    }
    /**
     * The disk name.
     * 
     */
    public String getDiskName() {
        return this.diskName;
    }
    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    public String getIsOSDisk() {
        return this.isOSDisk;
    }
    /**
     * The lun of disk.
     * 
     */
    public Integer getLunId() {
        return this.lunId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double capacityInBytes;
        private String diskId;
        private String diskName;
        private String isOSDisk;
        private Integer lunId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityInBytes = defaults.capacityInBytes;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.isOSDisk = defaults.isOSDisk;
    	      this.lunId = defaults.lunId;
        }

        public Builder setCapacityInBytes(Double capacityInBytes) {
            this.capacityInBytes = Objects.requireNonNull(capacityInBytes);
            return this;
        }

        public Builder setDiskId(String diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setIsOSDisk(String isOSDisk) {
            this.isOSDisk = Objects.requireNonNull(isOSDisk);
            return this;
        }

        public Builder setLunId(Integer lunId) {
            this.lunId = Objects.requireNonNull(lunId);
            return this;
        }

        public AgentDiskDetailsResponse build() {
            return new AgentDiskDetailsResponse(capacityInBytes, diskId, diskName, isOSDisk, lunId);
        }
    }
}
